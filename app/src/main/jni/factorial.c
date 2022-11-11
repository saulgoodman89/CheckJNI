#include<sys/time.h>
#include "log.h"

long getCurrentTimetoMillisecond();
struct timeval te;

long checkFactorialFunctionTime(int _inputNum) {	
	 long sum = 1;
	int inputNum = _inputNum;
        
	long startTime = getCurrentTimetoMillisecond();
  //  LOGE("KEG C startTime : %ld",startTime);
  LOGE("KEG C start");
  /*
	for(int i=1; i<=inputNum; i++) {
		sum += i;
		//LOGE("KEG C count : %ld   Value : %ld",i,sum);
	}*/
  	int count=0;
	  /*
	for ( int  i = 0 ; i < 100000000 ; i++) {
		count ++;
	}*/
	for (int i = 0; i<10000000 ; i++) {
		count = count*2/3+5-1;
	}

	long sum1 = 0;
    LOGE("KEG C sum : %ld",sum);
	long endTime = getCurrentTimetoMillisecond();
    LOGE("KEG C endTime : %ld",endTime);
    LOGE("KEG C endTime - startTime  : %ld",endTime-startTime);
	return endTime - startTime;

}

long getCurrentTimetoMillisecond() {
	long currentTime = 0;
	gettimeofday(&te,NULL);
	currentTime = te.tv_sec*1000LL+te.tv_usec/1000;
	return currentTime;
}
