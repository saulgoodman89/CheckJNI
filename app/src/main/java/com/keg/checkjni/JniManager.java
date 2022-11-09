package com.keg.checkjni;

public class JniManager {
    public final static String FACTORIAL_JNI = "factorialjni";
    static {
        System.loadLibrary(FACTORIAL_JNI);
    }
    public static native long checkFactorialFunctionTime(int _inputNum);
}
