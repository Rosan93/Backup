#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>
#define NUM_THREADS 5

 char *mess[NUM_THREADS];

void *PrintHello(void *message){
    int id;
   id = (int) message;
//    int tid = (int)threadid;
    printf("Hello World!It's me,in outer thread #%d : %s \n",mess[id]);
    pthread_exit(NULL);

}

int main(int argc,char *argv[]){
    pthread_t threads[NUM_THREADS];
    int rc,t;

    mess[0]= "Hi";
    mess[1]= "Hi1";
    mess[2]= "Hi2";
    mess[3]= "Hi3";
    mess[4]= "Hi4";
    mess[5]= "Hi5";

    for(t=0;t<NUM_THREADS;t++){
        printf("In main: creating thread %d\n",t);
        rc = pthread_create(&threads[t],NULL,PrintHello,(void *)t);

        if(rc){
            printf("ERROR;return code from pthread_create() is %d\n",rc);
            exit(-1);

        }

    }

    pthread_exit(NULL);

    return 0;

}

