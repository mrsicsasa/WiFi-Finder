import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun App(wifiFinder: WifiFinder?) {
    val results = wifiFinder?.findNamesofWifis()
    println("radi rezul"+results)
    if(results!=null){
        println("radi "+results)
        LazyColumn {
            items(results){
                    item->
                println("radid"+item)
                        Text(
                            text = item,
                        )
            }
            }
        }
    else{
        println("greska")
        Text("prazno")
    }
    }
