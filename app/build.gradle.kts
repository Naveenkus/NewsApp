plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id ("com.google.dagger.hilt.android")
    id ("kotlin-parcelize")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.loc.newsapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.newsapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.13"
    }
    packaging {
        resources {
            excludes += "/META-INF/{AL2.0,LGPL2.1}"
        }
    }
}

dependencies {
    val kotlin_version = "1.9.23"

    implementation("org.jetbrains.kotlin:kotlin-stdlib:$kotlin_version")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.1")
    implementation("androidx.activity:activity-compose:1.9.0")
    implementation(platform("androidx.compose:compose-bom:2023.08.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-graphics")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")
    implementation("junit:junit:4.12")
    implementation("androidx.test:monitor:1.6.1")
    implementation("androidx.test.ext:junit-ktx:1.1.5")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    androidTestImplementation(platform("androidx.compose:compose-bom:2023.08.00"))
    androidTestImplementation("androidx.compose.ui:ui-test-junit4")
    debugImplementation("androidx.compose.ui:ui-tooling")
    debugImplementation("androidx.compose.ui:ui-test-manifest")

    // Kotlin serialization
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.5.1")

    //Splash Api
    implementation ("androidx.core:core-splashscreen:1.0.0")

    //Compose Navigation
    val nav_version = "2.7.7"
    implementation ("androidx.navigation:navigation-compose:$nav_version")


    //Dagger Hilt
    val hilt = "2.50"
    implementation("com.google.dagger:hilt-android:$hilt")
    implementation("androidx.hilt:hilt-navigation-compose:1.0.0")
    ksp("com.google.dagger:hilt-android-compiler:$hilt")
    ksp("com.google.dagger:hilt-compiler:$hilt")


    //Retrofit
    implementation( "com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    //Coil
    implementation(platform("androidx.compose:compose-bom:2024.05.00"))
    implementation("io.coil-kt:coil-compose:2.6.0")

    //Datastore
    implementation ("androidx.datastore:datastore-preferences:1.1.1")

    //Compose Foundation
    implementation ("androidx.compose.foundation:foundation:1.6.7")

    //Accompanist -- not latest till room
    implementation ("com.google.accompanist:accompanist-systemuicontroller:0.31.4-beta")

    //Paging 3
    val paging_version = "3.1.1"
    implementation ("androidx.paging:paging-runtime:$paging_version")
    implementation ("androidx.paging:paging-compose:3.2.0-rc01")

    //Room
    val room_version = "2.6.1"
    implementation ("androidx.room:room-runtime:$room_version")
    annotationProcessor("androidx.room:room-compiler:$room_version")
    ksp("androidx.room:room-compiler:$room_version")
    implementation ("androidx.room:room-ktx:$room_version")
}
