#include<stdio.h>
#include<stdlib.h>

void inc(int* w, int* c){
    *w = *w + *c;
}

int main(){
    int x = 123;
    int z = 34;
    int* d;
    d =&z;

    int* y;
    y = &x;
    inc(y,d);
    printf("Value of x: %d \n",x);
    printf("Value of x after function: %d \n",*y);
    printf("Value of z: %d",*d);
    return EXIT_SUCCESS;
}
