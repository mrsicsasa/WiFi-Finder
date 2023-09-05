import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.wifi.WifiManager
import java.util.concurrent.Executor

actual class WifiFinder constructor(private val context: Context){
    private val wifiScanReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
          //  println("radi on")
            if (intent.action == WifiManager.SCAN_RESULTS_AVAILABLE_ACTION) {
                val wifiNames = findNamesofWifis()
              //  println("radi ds"+wifiNames)
            }
        }
    }
    init {
        println("radi init")
        val wifiManager = context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        context.registerReceiver(
            wifiScanReceiver,
            IntentFilter(WifiManager.SCAN_RESULTS_AVAILABLE_ACTION)
        )
    }

    @SuppressLint("MissingPermission")
    actual fun findNamesofWifis(): List<String> {

       // println("radi funkcija")
        val wifiManager=context.getSystemService(Context.WIFI_SERVICE) as WifiManager
        wifiManager.startScan()
        val scanResults=wifiManager.scanResults
      //  println("radi rezultati"+scanResults)
        return scanResults.map {it.SSID}
    }

}

