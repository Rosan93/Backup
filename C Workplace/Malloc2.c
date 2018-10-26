#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>

int n = 10;

int main(){
    int i,n;
    int *x;

    printf("Enter the no. of int:");
    scanf("%d",&n);
    x= malloc(sizeof(int)*n);

    printf("%1d \n",sizeof(x));
    printf("%1d \n",sizeof(*x));

    for(i=0;i<n;i++){
        x[i]=2*i;
    }

    for(i=0;i<n;i++){
        printf("%d,%d\n",i,x[i]);
    }

    free(x);
    return EXIT_SUCCESS;
}
