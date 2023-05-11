

plugins {
    id("com.android.application") version "8.0.1" apply false
    id ("com.android.library") version "8.0.1" apply false
    id ("org.jetbrains.kotlin.android") version "1.6.21" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.7.0" apply false
    id ("com.google.dagger.hilt.android") version "2.44" apply false
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}