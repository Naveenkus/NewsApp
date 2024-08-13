# NewsApp

NewsApp is an Android application built using Kotlin and Jetpack Compose. It follows Clean Architecture principles and implements MVVM and MVI patterns. The app provides live news data and supports both light and dark modes.

## Features

- **Live Data**: Get the latest news updates in real-time.
- **Light and Dark Mode**: Switch between light and dark themes.
- **Paging 3**: Efficiently load and display large sets of data.
- **Retrofit**: Network requests and API integration.
- **Room**: Local database for offline storage.
- **Data Store Preferences**: Manage user preferences.
- **Dagger Hilt**: Dependency injection for better modularity and testability.

## Screenshots

<div style="display: flex; flex-wrap: wrap; justify-content: space-between;">
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240721_223618.png" width="30%" />
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240721_223737.png" width="30%" />
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240721_223750.png" width="30%" />
</div>

<div style="display: flex; flex-wrap: wrap; justify-content: space-between;">
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240814_000152.png" width="30%" />
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240721_223818.png" width="30%" />
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240813_232221.png" width="30%" />
</div>

<div style="display: flex; flex-wrap: wrap; justify-content: space-between;">
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240813_232133.png" width="30%" />
  <img src="https://github.com/Naveenkus/NewsApp/blob/main/Screenshots/Screenshot_20240813_232250.png" width="30%" />
</div>


## Architecture

The app is structured following Clean Architecture principles, ensuring separation of concerns and making the codebase more maintainable and testable.

### Layers

1. **Presentation Layer**: Contains UI components built with Jetpack Compose.
2. **Domain Layer**: Contains business logic and use cases.
3. **Data Layer**: Manages data sources, including network and local database.

### Design Patterns

- **MVVM (Model-View-ViewModel)**: Separates UI logic from business logic.
- **MVI (Model-View-Intent)**: Manages state and events in a unidirectional data flow.

## Libraries and Tools

- **Kotlin**: Programming language.
- **Jetpack Compose**: Modern toolkit for building native Android UI.
- **Paging 3**: Library for loading and displaying paginated data.
- **Retrofit**: Type-safe HTTP client for Android.
- **Room**: SQLite object mapping library.
- **Data Store Preferences**: Jetpack library for managing application preferences.
- **Dagger Hilt**: Dependency injection library.

