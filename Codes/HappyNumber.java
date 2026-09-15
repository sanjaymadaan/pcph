package com.company.number;

public class HappyNumber {
int getNext(int n){
    int sum  = 0;
    while( n != 0){
        int digit = n % 10;
        sum = sum + (int)Math.pow(digit, 2);
        n = n / 10;
    }
    return sum;
}
 public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        while(fast != 1 && slow != fast){
            slow = getNext(slow);
            fast = getNext(getNext(fast));
        }
        return fast == 1;
    }
}