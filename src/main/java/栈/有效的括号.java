package 栈;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 * 示例 1：
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * 输入：s = "(]"
 * 输出：false
 * */
public class 有效的括号 {

    public boolean isValid(String s){
        if(s == null || s.length()==0){
            return false;
        }
        int n = s.length();
        Stack stack = new Stack();
        for(int i=0; i< n; i++){
            char c = s.charAt(i);
            if(c == '('){
                stack.push(')');
            }else if(c == '{'){
                stack.push('}');
            }else if(c == '['){
                stack.push(']');
            }else{
                if(stack.isEmpty() || (Character)stack.peek() != c){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
