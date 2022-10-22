#include <stdio.h>

int main()
{
    int x, y;
    scanf("%d", &x);
    y = x;
    char *p = (char *)&x; //p contains the address of x
    char tmp = p[0];
    p[0] = p[3];
    p[3] = tmp;
    tmp = p[1];
    p[1] = p[2];
    p[2] = tmp;
    printf("%d converts to %d", y, x);
}