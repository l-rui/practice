package practice.algorithm;

/**
 * Created by lirui on 2017/3/29.
 * Given a roman numeral, convert it to an integer.Input is guaranteed to be within the range from 1 to 3999.
 * 给定一个罗马数字，将其转换为整数。输入保证在1到3999之间。
 *
 */
public class Roman2Integer {

    public static void main(String[] args) throws Exception {
        String s = "DCXXI";
        Roman2Integer ri = new Roman2Integer();
        System.out.println(ri.romanToInt(s));
    }

    public int romanToInt(String s) {
        int stack = 0;
        int lastInt = 0;
        for(int i =0;i<s.length();i++){
            int thisInt = getIntFromRoman(s.charAt(i));
            if(thisInt>lastInt){
                stack = stack-(lastInt<<1);
            }
            stack = stack+thisInt;
            lastInt = thisInt;
        }
        return stack;
    }

    private static int getIntFromRoman(char roman) {
        int a = 0;
        switch (roman) {
            case 'I':
                a = 1;
                break;
            case 'V':
                a = 5;
                break;
            case 'X':
                a = 10;
                break;
            case 'L':
                a = 50;
                break;
            case 'C':
                a = 100;
                break;
            case 'D':
                a = 500;
                break;
            case 'M':
                a = 1000;
                break;
            default:
                a = -1;
        }
        return a;
    }

}
