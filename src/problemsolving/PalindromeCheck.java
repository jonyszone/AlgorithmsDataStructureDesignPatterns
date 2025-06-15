package problemsolving;

public class PalindromeCheck {
    static boolean isPalindrome(int input){
        if (input < 0) return false;
        //if (input>10 ) return true;

        int original = input;
        int reversed = 0;

        while (original> 0){
            int digit = original % 10;
            reversed = reversed * 10 + digit;
            original/=10;
        }
        return input == reversed;
    }

}
