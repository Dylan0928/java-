package com.example;

public class PetMain {
    
    public static void playWithAnimal(Animal a) {
        if(a instanceof Spider)
            System.out.println("小心，這不是寵物！");
        else
            
    }
    
    public static void main(String[] args) {
        System.out.println("=====測試 eat()/walk()=====");
        Animal a;
        //test a spider with an animal reference
        a = new Spider();
        
        Animal a2 = new Cat("小花");
        
        Animal a3 = new Fish();
        
        System.out.println("=====測試 play()=====");
        playWithAnimal(a);
        playWithAnimal(a2);
        playWithAnimal(a3);
    }
    
}

