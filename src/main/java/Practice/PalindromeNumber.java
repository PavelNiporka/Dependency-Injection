package Practice;

public class PalindromeNumber {
    public static void main(String[] args) {

        System.out.println(isPalindrome(131));


    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) { // 131 < 0 || (131/10---> 13,1---->0,1*10--->1 && 131 !=0)
            return false;
        }

        int revertNumber = 0;
        while (x > revertNumber) {
            revertNumber = revertNumber * 10 + x % 10;
            x /= 10;

        }
        return x == revertNumber || x == revertNumber / 10;
//        String str = String.valueOf(x);
//        int start = 0;
//        int end = str.length() - 1;
//        while (start < end) {
//            if (str.charAt(start++) != str.charAt(end--)) return false;
//        }
//        return true;

    }


}
