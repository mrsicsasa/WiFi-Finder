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
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {
    }
    func makeUIViewController(context: Context) -> some UIViewController {
        AppKt.MainViewController()
    }
}
