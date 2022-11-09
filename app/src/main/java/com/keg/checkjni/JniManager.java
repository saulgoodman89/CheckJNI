package com.keg.checkjni;

public class JniManager {
    public final static String FACTORIAL_JNI = "factorial_jni";
    static {
        System.loadLibrary(FACTORIAL_JNI);
    }
    public static native long checkFactorialFunctionTime(int _inputNum);
}
