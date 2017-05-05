package practice.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Demo001 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String context = scan.nextLine();
        String[] strs = context.split(" ");
        String special = "[\\.\\$\\(\\)\\*\\+\\[\\{\\]\\}\\?\\|\\^~`!@#%&_\\-=;:'\"/>,<]";
        List<Double> nums = new ArrayList<Double>();
        Pattern p1 = Pattern.compile("-?([1-9]\\d*.\\d*|0.\\d*[1-9]\\d*)");
        Pattern p2 = Pattern.compile("-?[1-9]\\d*");

        for (String str : strs) {
            Matcher m1 = p1.matcher(str);
            if (m1.find()) {
                nums.add(Double.valueOf(m1.group(1).replaceAll(special, "")));
            } else {
                Matcher m2 = p2.matcher(str);
                if (m2.find()) {
                    nums.add(Double.valueOf(m1.group(1).replaceAll(special, "")));
                }
            }
        }
        Double sum = 0.0;
        for (Double num : nums) {
            sum += num;
        }
        System.out.println(sum.intValue());
    }

}
