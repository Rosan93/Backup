#include <stdio.h>

struct student{
    unsigned int roll;
    char *name;
    char *college;

};

int main(){

 struct student a;


 a.roll=20;
 a.name = "Roshan";
 a.college ="Herald";

 printf("The details are: %d %s %s",a.roll,a.name,a.college);
 return 0;
}
