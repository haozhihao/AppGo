object Dep {
    object Version {
        const val kotlin = "1.3.11"
        const val constraintLayout = "1.1.3"
        const val appcompat = "28.0.0"
        // library (test)
        const val junit = "4.12"
    }

    val kotlinStdlibJdk7 = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"
    val appcompat = "com.android.support:appcompat-v7:${Version.appcompat}"
    val constraintLayout = "com.android.support.constraint:constraint-layout:${Version.constraintLayout}"


    //test
    val junit = "junit:junit:${Version.junit}"
}