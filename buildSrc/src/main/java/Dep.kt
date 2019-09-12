object Dep {
    object Version {
        const val kotlin = "1.3.11"
        const val constraintLayout = "2.0.0-alpha2"
        const val androidX = "1.0.0"
        // library (test)
        const val junit = "4.12"
        const val buildGradle = "3.5.0"

        const val lifecycle= "2.1.0"
    }

    val buildGradle = "com.android.tools.build:gradle:${Version.buildGradle}"
    val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.kotlin}"

    val kotlinStdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val appcompat = "androidx.appcompat:appcompat:${Version.androidX}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"



    //test
    val junit = "junit:junit:${Version.junit}"
}