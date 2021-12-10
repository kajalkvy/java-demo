package com.dataStructure;

import java.util.Stack;

public class ValidParenthesisProblem {
    String str1="[{()}]";
    String str2="{[})";
    String str3=" ";
    String str4="()}{";
    String str5="[{){}]";
    public static void main(String[] args) {
        ValidParenthesisProblem vp=new ValidParenthesisProblem();
        System.out.println(vp.validParenthesis(vp.str1));

    }
    boolean validParenthesis(String str){
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<=str.length()-1;i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            }
            else if(stack.isEmpty()){
                return false;

            }else {
                char top=stack.peek();
                if(str.charAt(i)==')'&&top=='('||str.charAt(i)=='}'&&top=='{'||str.charAt(i)==']'&&top=='['){
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }
}
