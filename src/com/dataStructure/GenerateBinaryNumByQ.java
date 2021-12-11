package com.dataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenerateBinaryNumByQ {
    public  void generate(int n){
        String[] result =new String[n];
        Queue<String> q=new LinkedList<>();
        q.offer("1");
        for(int i=0;i<n;i++){
            result[i]=q.poll();
            String s1=result[i]+"0";
            String s2=result[i]+"1";
            q.offer(s1);
            q.offer(s2);
        }
        for (String s:result) {
            System.out.print(s+" ");
        }

    }
    public static void main(String[] args) {
        GenerateBinaryNumByQ gb=new GenerateBinaryNumByQ();
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of array : ");
        int size= sc.nextInt();

        gb.generate(size);

    }
}
