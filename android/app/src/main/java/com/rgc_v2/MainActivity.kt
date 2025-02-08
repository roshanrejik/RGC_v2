package com.rgc_v2

import android.os.Bundle
import com.facebook.react.ReactActivity
import com.facebook.react.ReactActivityDelegate
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint.fabricEnabled
import com.facebook.react.defaults.DefaultReactActivityDelegate
import org.devio.rn.splashscreen.SplashScreen  // Import the SplashScreen class

class MainActivity : ReactActivity() {

    /**
     * Lifecycle method that gets called when the activity is created.
     * We initialize the splash screen here.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(null)  // Call the superclass implementation
        SplashScreen.show(this)  // Show the splash screen when the activity starts
    }

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    override fun getMainComponentName(): String = "RGC_v2"

    /**
     * Returns the instance of the ReactActivityDelegate.
     * We use DefaultReactActivityDelegate which allows you to enable New Architecture with a single boolean flag [fabricEnabled].
     */
    override fun createReactActivityDelegate(): ReactActivityDelegate =
        DefaultReactActivityDelegate(this, mainComponentName, fabricEnabled)
}
