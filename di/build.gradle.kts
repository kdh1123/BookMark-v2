plugins {
    id("com.android.library")
    id("kotlin-android")
    id("com.google.dagger.hilt.android")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

kotlin {
    jvmToolchain(11)
}

android {
    namespace = "com.bookmark.di"
    compileSdk = 33

    defaultConfig {
        minSdk = 31

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":domain"))
    implementation(project(":data"))

    implementation(Libraries.common)
    implementation(Libraries.data)

    testImplementation(Libraries.test)
    androidTestImplementation(Libraries.androidTest)
    kapt(Libraries.hiltCompiler)

}

kapt {
    correctErrorTypes = true
}