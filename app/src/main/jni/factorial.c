#include<stdio.h> 
#include<sys/time.h>

long getCurrentTimetoMillisecond();
struct timeval te;

long checkFactorialFunctionTime(int _inputNum) {	
	int sum = 0;
	int inputNum = _inputNum;
        
	long startTime = getCurrentTimetoMillisecond(&te);
	printf("startTime : %ld \n",startTime);
	for(int i=1; i<=inputNum; i++) {
		sum += i;
	}

	long endTime = getCurrentTimetoMillisecond(&te);
	printf("endTime : %ld \n",endTime);
	printf("time : %ld \n", endTime-startTime);
	printf("sum : %d ",sum);
}

long getCurrentTimetoMillisecond() {
	long currentTime = 0;
	gettimeofday(&te,NULL);
	currentTime = te.tv_sec*1000LL+te.tv_usec/1000;
	return currentTime;
}
