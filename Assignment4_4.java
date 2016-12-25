package com.myjava.constructors;
 
public class Assignment4_4 {
     
    public Assignment4_4(){
        System.out.println("In default constructor...");
    }
    public Assignment4_4(int i){
        this();
        System.out.println("In single parameter constructor...");
    }
    public Assignment4_4(int i,int j){
        this(j);
        System.out.println("In double parameter constructor...");
    }
     
    public static void main(String a[]){
        Assignment4_4 ch = new Assignment4_4(10,20);
    }
}
