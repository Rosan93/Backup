#include <stdio.h>

int main(){

    int *p;

    int a[5]={10,20,30,40,50};

    p = &a[2];

    *p = 10;
    *(p+1) = 60;

    printf("%d \n",*p);
    printf("%d",*(p+1));


return 0;
}
