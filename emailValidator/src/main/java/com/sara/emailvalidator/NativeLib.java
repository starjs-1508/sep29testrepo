package com.sara.emailvalidator;

public class NativeLib {

    // Used to load the 'emailvalidator' library on application startup.
    static {
        System.loadLibrary("emailvalidator");
    }

    /**
     * A native method that is implemented by the 'emailvalidator' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}