//Given a positive integer num, write a function which returns True if num is a perfect square else False.

//Follow up: Do not use any built-in library function such as sqrt.

public class Solution {
    public static boolean isPerfectSquare(int num) {

        if (num == 1) return true;

        boolean isItPerfect = false;

        for (int i = 2; i < num; i++) {
            if (i * i == num) {
                isItPerfect = true;
                break;
            }
        }

        return isItPerfect;
    }
}


