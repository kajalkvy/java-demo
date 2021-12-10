package com.dataStructure;

import java.util.Stack;

public class NextGreaterEleByStack {
    static  int[] array={4,7,3,4,8,1};
    static int[] resultA=new int[array.length];
    public static void main(String[] args) {
        NextGreaterEleByStack a=new NextGreaterEleByStack();

        a.nextGreaterEle(array);
        a.print(resultA);

    }
    int[] nextGreaterEle(int[] arr){
        Stack<Integer> stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                resultA[i]=-1;
            }
            else{
                resultA[i]=stack.peek();
            }
            stack.push(arr[i]);
        }
        return resultA;
    }
    void print(int[] arr){
        for(int i=0;i<= arr.length-1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
