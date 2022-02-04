package com.dataStructure;

public class Array {
    public static void main(String[] args) {
        Array array =new Array();
        array.createArray();



    }

    public void createArray() {

        int myArray[] = new int[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 34;
        myArray[3] = 3;
        myArray[4] = 50;
        myArray[3] = 0;

        System.out.print("Array: {");
        printArray(myArray);
        printArray(removeEvenInteger(myArray));
        printArray(reverse(myArray));
        System.out.println("Min Element: "+minElement(myArray));
        System.out.println("Second Min Element: "+secondMin(myArray));
        moveZeros(myArray);
        printArray(myArray);
        printArray(resizeArray(myArray,10));
    }
    public void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            if(i< arr.length-1) {
                System.out.print(arr[i] + ",");
            }else{
                System.out.print(arr[i]+"}");
            }
        }
        System.out.println();
    }
    public int[] removeEvenInteger(int arr[]){
        System.out.print("Array without even element: {");
        int oddInteger=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddInteger++;
            }
        }
        int oddArray[] = new int[oddInteger];
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                oddArray[j]=arr[i];
                j++;
            }
        }
        return oddArray;
    }
    public int[] reverse(int arr[]){
        System.out.print("Array in reverse: {");
        int length=0;
        for(int x:arr) {
          length++;
        }
        int reverseArray[]=new int[length];
        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            reverseArray[j]=arr[i];
            j++;
        }
        return reverseArray;
    }
    int min;
    public int minElement(int arr[]){
         min=arr[0];
        for(int i=1;i<arr.length;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public int secondMin(int arr[]){
        int secondMin=arr[arr.length-1];
        for (int i=arr.length-2;i>=0;i--){
            if(arr[i]!=min&&arr[i]<secondMin){
                secondMin=arr[i];
            }
        }

        return secondMin;
    }
    public void moveZeros(int arr[]){
        System.out.print("Move zerros:{");
        int i=0;
        int j=arr.length-1;
        int temp=0;
       while(i<j&&j>i){
           if(arr[i]==0&&arr[j]!=0){
               temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
           }
           if(arr[j]==0){
               j--;
           }
           if(arr[i]!=0){
               i++;
           }

       }
    }
    public int[] resizeArray(int arr[], int capacity){
        System.out.print("Resized Array: {");
        int tempArray[]=new int[capacity];
        for(int i = 0;i<arr.length;i++){
           tempArray[i]=arr[i];
        }
        arr=tempArray;
        return arr;
    }

}
