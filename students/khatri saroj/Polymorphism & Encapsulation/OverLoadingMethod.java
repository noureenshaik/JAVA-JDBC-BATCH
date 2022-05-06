package com.example.demoProject.Polymorphism;

class OverLoadingMethod {

    public static int add(int a, int b){
        return a + b;
    }
    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(OverLoadingMethod.add(7 , 8));
        System.out.println(OverLoadingMethod.add(7 , 8 , 5));
    }
}

