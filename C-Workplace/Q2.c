#include <stdio.h>

typedef struct{
    unsigned int roll;
    char *name;
    char *college;

}student;

int main(){

 student a;


 a.roll=20;
 a.name = "Roshan";
 a.college ="Herald";

 printf("The details are: %d %s %s",a.roll,a.name,a.college);
 return 0;
}
