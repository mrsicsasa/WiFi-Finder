package rs.vegait.mrsicsasa.wififinder

import App
import WifiFinder
import androidx.compose.ui.window.ComposeUIViewController
import platform.darwin.NSObject

fun MainViewController(wifiFinder: WifiFinder)= ComposeUIViewController { App(wifiFinder) }


