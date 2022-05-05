package com.example.demoProject.Polymorphism.ForLoops;

class Pattern {
    public void display(){
        for (int i = 0; i < 10; i++);
        System.out.println("@");
    }
    public void display(char symbol){
        for (int i = 0; i < 10; i++);
        System.out.println(symbol);
    }

    public static void main(String[] args) {
        Pattern pattern = new Pattern();
        pattern.display();
        pattern.display('!');
    }
}
