/*
 *

 */
#pragma once
#include <jni.h>
#ifdef __cplusplus
extern "C" {
#endif
JNIEXPORT jboolean JNICALL
Java_com_example_smoke_EquatableClass_equals(JNIEnv* _jenv, jobject _jinstance, jobject jrhs);
JNIEXPORT jint JNICALL
Java_com_example_smoke_EquatableClass_hashCode(JNIEnv* _jenv, jobject _jinstance);
#ifdef __cplusplus
}
#endif