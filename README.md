
---

# WiFi Finder

This project is a **proof of concept** for a WiFi Finder application built using **Kotlin Multiplatform**. The application lists currently available WiFi networks and demonstrates Kotlin's ability to share business logic across multiple platforms.

## Features

- **WiFi Network Scanning**: Lists all WiFi networks currently available.
- **Cross-Platform Support**: Utilizes Kotlin Multiplatform to share core functionality across Android and iOS.

## Technologies Used

- **Kotlin Multiplatform (KMM)**: For sharing business logic across platforms.
- **Compose Multiplatform**: To create UI components (for Android and desktop, if applicable).
- **Platform-specific APIs**: To scan available WiFi networks.

## Setup and Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/mrsicsasa/WiFi-Finder.git
   ```

2. Open the project in your preferred IDE (e.g., Android Studio or IntelliJ IDEA).

3. Build and run the project on your target platform:
   - **Android**: Run the app on an emulator or physical device.
   - **iOS**: Set up the iOS project using Xcode and run it on a simulator or physical device.

## Challenges and Learnings

- **Platform API Differences**: Leveraging native APIs for WiFi scanning on Android and iOS required understanding platform-specific implementations.
- **KMM Integration**: Successfully shared business logic while maintaining platform-specific functionality.

## Future Enhancements

- **UI Improvements**: Enhance the visual design and responsiveness of the app.
- **Network Details**: Display additional details like signal strength, frequency, and security type.
- **Connectivity Options**: Add the ability to connect to a selected WiFi network.
- **Platform Expansion**: Extend support to additional platforms such as desktop and web.

## License

This project is licensed under the MIT License. See the `LICENSE` file for details.

---

Feel free to explore and contribute to this project! 🎉 
