//Patika.dev linkim --> https://app.patika.dev/ailker
public class Main {
    static boolean isPalindrom(int num) {
        int lastNum, temp = num, reverseNum = 0;
        while (temp != 0) {
            lastNum = temp % 10;
            reverseNum = (reverseNum * 10) + lastNum;
            temp /= 10;
        }
        System.out.println(reverseNum);
        if (reverseNum == num) {
            return true;
        } else {
            return false;
        }
    }

    static public void main(String[] args) {
        System.out.println(isPalindrom(36363));
    }
}
