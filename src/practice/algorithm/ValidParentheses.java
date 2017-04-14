package practice.algorithm;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * Created by lirui on 2017/4/14.
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 * The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
 * 给定一个仅包含字符'（'，'）'，'{'，'}'，'['和']'的字符串，确定输入字符串是否有效。
 * 括号必须以正确的顺序关闭，“（）”和“（）[] {}”都是有效的，但“（]”和“（[）]”不是。
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (map.keySet().contains(curr)) {
                stack.push(curr);
            } else if (map.values().contains(curr)) {
                if (!stack.empty() && map.get(stack.peek()) == curr) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

}
