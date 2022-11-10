//
// Created by keg on 11/10/22.
//

#include<jni.h>
#include <factorial.h>

JNIEXPORT jlong JNICALL Java_com_keg_checkjni_JniManager_checkFactorialFunctionTime(JNIEnv *env, jobject thiz, jint num) {
   return checkFactorialFunctionTime(num);
}

