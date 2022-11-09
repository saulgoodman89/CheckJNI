LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE := factorial_jni
LOCAL_SRC_FILES := factorial.c
LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)
