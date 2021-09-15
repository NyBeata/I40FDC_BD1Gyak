#include <stdio.h>
#include <stdlib.h>
void masol();

int main()
{
    masol();
    return 0;
}

void masol(){
    FILE *fp1, *fp2;
    char ch;
    char fnev1[50], fnev2[50];

    printf("Filenev: ");
    scanf("%s", fnev1);
    fp1 = fopen(fnev1, "w");
    printf("Mit irjak bele?\n");
    while( ch=getchar() != '#' ){
        putc(ch, fp1);
    }
    fclose(fp1);

    printf("Melyik fileba masoljak?\n");
    scanf("%s", fnev2);
    fp1 = fopen(fnev1, "r");
    fp2 = fopen(fnev2, "w");
    while( (ch=fgetc(fp1)) != EOF ){
        fputc(ch, fp2);
    }
    fclose(fp1);
    fclose(fp2);

    printf("Atmasolva!");

    return 0;
}
