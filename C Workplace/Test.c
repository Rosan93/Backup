#include<stdio.h>
#include<string.h>
int main()
{
    int age = 8;
    long int superBigNum = -3333222222;
    float piValue = 3.14159;
    double reallyBig = 3.141414141414;
    printf("Hello World");
    printf("\nMy age is : %d",age);

    char myName[] = "Rosan";
    printf("\nMy name is: %c",myName);

    char realName;

    printf("What is your name?\n");
    scanf("%c",&realName);

    printf("\nMy name is : %c",realName);

    printf("\nCasting : %f",(float)age);

    return 0;
}
