plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "com.example.recipeapp"
    compileSdk {
        version = release(36) {
            minorApiLevel = 1
        }
    }
viewBinding.enable = true
    defaultConfig {
        applicationId = "com.example.recipeapp"
        minSdk = 25
        targetSdk = 36
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            optimization {
                enable = false
            }
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {
    implementation(libs.androidx.activity.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(libs.androidx.junit)
    implementation (libs.gson)
    implementation (libs.retrofit)
    implementation (libs.converter.gson)
}