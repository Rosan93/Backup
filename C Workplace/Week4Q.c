#include <stdio.h>
#include <malloc.h>

typedef struct{
    int roll;
    char name[50];
    char college[50];

}student;

int main(){

    int i;
    int z;

    printf("Enter the length of details: ");
    scanf("%d",&z);

    student *std = (student *)malloc(z * sizeof(student));


    for(i=0;i<z;i++){
        printf("Enter the details of %d students",i);
        printf("\nEnter the roll ");
        scanf("%d",&std[i].roll);

        printf("\nEnter the name ");
        scanf("%s",std[i].name);

        printf("\nEnter the college ");
        scanf("%s",std[i].college);

        printf("\n");
    }

    printf("The details are \n");

    for(i=0;i<z;i++){
//        printf("The details of %d students",i);
        printf("\nStudent's Roll: %d",std[i].roll);

        printf("\nName: %s ",std[i].name);

        printf("\nCollege: %s ",std[i].college);

        printf("\n");


    }

    free(z);


    return 0;

}
