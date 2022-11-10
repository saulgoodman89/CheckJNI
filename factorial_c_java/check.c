#include<stdio.h>
#include<sys/time.h>


long getCurrentTimetoMillisecond();
struct timeval te;

int main() {
	long sum = 0;
	int inputNum = 500000000;
        
	long startTime = getCurrentTimetoMillisecond();
  //  LOGE("KEG C startTime : %ld\n ",startTime);
  printf("KEG C start");
	for(int i=1; i<=inputNum; i++) {
		sum += i;
	}
    printf("KEG C sum : %ld \n",sum);
	long endTime = getCurrentTimetoMillisecond();
    printf("KEG C endTime : %ld\n",endTime);
    printf("KEG C endTime - startTime  : %ld \n",endTime-startTime);

}

long getCurrentTimetoMillisecond() {
	long currentTime = 0;
	gettimeofday(&te,NULL);
	currentTime = te.tv_sec*1000LL+te.tv_usec/1000;
	return currentTime;
}
