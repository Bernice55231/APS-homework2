#include <stdio.h>
// brute force
int main() {
    long n, l, r;
    scanf("%ld %ld %ld", &n, &l, &r);
    long max = n;
    long min = l;
    
    for(long i = l; i <= r; i++) {
        if((n | i) > max) {
            max = n | i;
            min = i;
        }
            
    }
    printf("%ld\n", min);
    return 0;
}