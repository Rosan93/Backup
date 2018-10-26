#include<stdio.h>

int main()
{
    int a = 5, b = 6, c=7;
    int numberHowBig;
    /*
    printf("How big is number? \n",numberHowBig);
    scanf("%d",&numberHowBig);*/

    //printf("Is a>b:%d \n",a>b);

    /*if(c>a && c>b){
        printf("%d is greater than %d \n\n",c,b);
    }
     else{
        printf("%d is greater than %d \n\n",b,a);
    }*/

    /*printf("A char takes up %d bytes \n\n",sizeof(char));
    printf("A int takes up %d bytes \n\n",sizeof(int));
    printf("A long takes up %d bytes \n\n",sizeof(long));
    printf("A float takes up %d bytes \n\n",sizeof(float));
    printf("A double takes up %d bytes \n\n",sizeof(double));*/

    /*int myIncreamentor = 1,myMultipler = 1, finalValue = 1;

    while(myIncreamentor<numberHowBig){
        myMultipler*=2;
        finalValue = finalValue+myMultipler;
        myIncreamentor++;

    }
    if((numberHowBig==0)||(numberHowBig==1)){
        printf("Top Value:%d\n",numberHowBig);
    }
    else{
        printf("Top value:%d \n\n",finalValue);
    }*/

    /*int secretNumber = 10,numberGuessed=0;

    while(1)
    {
        printf("Guess my Secret Number? ");
        scanf("%d",&numberGuessed);

        if(numberGuessed==secretNumber)
        {
            printf("You got it.");
            break;
        }
    } */

    /*char toppings;
    do{
        printf("What toppings do you want(C,V,S)?");
        scanf("%c",&toppings);
    }
    while(toppings!='C' && toppings!='V' && toppings!='S');*/

    for(int i =0;i<20;i++){
        if((i%2)!=0) continue;
        printf("%d \n",i);
    }




    return 0;
}
