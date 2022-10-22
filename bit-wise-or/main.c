#include <stdio.h>
// brute force
int main() {
    unsigned int n, l, r;
    scanf("%u %u %u", &n, &l, &r);

    unsigned int res = 0;
    unsigned int tmp;
    for(int i = 31; i >= 0; i--) {
        tmp = 1 << i;
        if(  ((res+tmp <= r) && !(n & (1<<i)) ) || ( ((res+tmp-1) < l) && (l & (1<<i)) )  ) {
            res += tmp;
        }
    }

    printf("%u\n", res);
}