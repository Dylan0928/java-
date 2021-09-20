package com.example;

public class Fish extends Animal implements Pet{

    public Fish() {
        super(0);
    }
    
    @Override
    public void eat(){
        System.out.println("魚吃藻類！");
    }
    
    @Override
    public void play(){
        System.out.println("觀賞魚游泳！");
    }

}
