#include <stdio.h>
#include <stdlib.h>

int main(){
 int i;
 for(i=0;i<5;i++){
    printf("%d,",i);
 }
 printf("\n");

 while(i<10){
    printf("%d,",i);
    i++;
 }
 printf("\n");
 do{
    printf("%d,",i);
    i++;
 }while(i<15);
 printf("\n");

 if(i>13){
    printf("custard \n");
 }else{
 printf("gravy\n");
 }
 return EXIT_SUCCESS;
}
