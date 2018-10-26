#include <stdio.h>

int main(){
    int i;
    char *student;

    for (i=0;i<5;i++){
        printf("Enter the name of student: ");
        scanf("%s",&student[i]);

    }

    for (i=0;i<5;i++){
        printf("The name of students are: %s",student[i]);
    }

    return 0;

}
