package com.vijaya.interfaces;
 
public class CustomClass implements CustomInterface {
 
    @Override
    public void method1() {
        System.out.println("abstract method");
    }
     
    /**
     * @param args
     */
    public static void main(String[] args){
        CustomInterface instance = new CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }
}