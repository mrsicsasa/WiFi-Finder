//
//  ComposeView.swift
//  iosApp
//
//  Created by Sasa Mrsic on 5.9.23..
//  Copyright © 2023 orgName. All rights reserved.
//

import Foundation
import SwiftUI
import shared
struct ComposeView:UIViewControllerRepresentable{
    let wifiFinder: WifiFinder // Definirajte wifiFinder ovdje i inicijalizirajte ga

     init() {
         self.wifiFinder = WifiFinder(/* Dodajte odgovarajuće parametre za inicijalizaciju wifiFinder-a */)
     }
  
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
    }
    func makeUIViewController(context: Context) -> some UIViewController {
        return AppKt.MainViewController(wifiFinder:wifiFinder)
    }
}
