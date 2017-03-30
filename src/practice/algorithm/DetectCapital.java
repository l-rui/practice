package practice.algorithm;

/**
 * Created by lirui on 2017/3/30.
 * Given a word, you need to judge whether the usage of capitals in it is right or not.
 * 判断一个字母是否大小写正确：要么全是大写，要么全是小写，或者首字母大写
 */
public class DetectCapital {

    public boolean detectCapitalUse(String word) {
        if (null == word) {
            return false;
        }
        if (word.length() <= 1) {
            return true;
        }

        boolean firstIsLower = false;
        boolean secendIsLower = false;
        if (Character.isLowerCase(word.charAt(0))) {
            firstIsLower = true;
        }
        if (Character.isLowerCase(word.charAt(1))) {
            secendIsLower = true;
        }
        if (firstIsLower && !secendIsLower) {
            return false;
        }
        for (int i = 2; i < word.length(); i++) {
            boolean charIsLower = Character.isLowerCase(word.charAt(i));
            if (firstIsLower && secendIsLower) {
                //首字母是小写，所有字母都必须是小写
                if (!charIsLower) {
                    return false;
                }
            } else if (!firstIsLower && secendIsLower) {
                // 首字母是大写，第二个字母小写，后面都必须是小写
                if (!charIsLower) {
                    return false;
                }
            } else if (!firstIsLower && !secendIsLower) {
                if (charIsLower) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        DetectCapital dc = new DetectCapital();
        dc.detectCapitalUse(":");
    }

}
