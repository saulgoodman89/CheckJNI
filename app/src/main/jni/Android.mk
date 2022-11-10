LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)   #CLEAR_VARS : LOCAL_XXX 변수를 자동으로 삭제하는 GNU Makefile을 의미 *LOCAL_PATH는 예외

LOCAL_MODULE := factorialjni    #라이브러리 이름
LOCAL_SRC_FILES := factorialjni.c , factorial.c #빌드할 파일들
LOCAL_LDLIBS := -llog
#LOCAL_PATH:=$(call my-dir)  개발트리에 있는 소스 파일의 위치 /  my-dir : Android mk 파일이 있는 디렉토리 경로

include $(BUILD_SHARED_LIBRARY) #가장 최근의 include 이후의 LOCAL 변수들를 모두 수집하는 GNU Makefile을 가르킨다.

#include $(BUILD_STATIC_LIBRARYT) #STATIC 라이브 러리를 빌드
#include $(BUILD_EXECUTABLE) # LOCAL 변수에서 제공하는 GNU MakeFile을 가르키고 실행 파일을 빌드
#include $(PREBUILT_SHARED_LIBRARY) 미리 빌드된 공유 라이브러리 파일을 지정.
#include $(PREBUILT_STATIC_LIBRARY) 미리 빌드된 ㅅ정적 라이브러리 파일 지정

#TARGET_ARCH : 빌드 시스템의 CPU. arm , arm64 , x86 , x86_64 중 하나
#TARGET_PLATFORM : Android.mk 파일을 파싱 할 때 타겟팅 하는 API 레벨 번호.
#TARGET_ARCH_ABI : Android.mk을 파싱 할 타겟 ABI