package com.example.domain;

import static java.lang.Math.round;
import java.util.Random;

public interface RegularStaff {
    String[] gifts = new String[]{"蘋果電腦", "十萬元禮券", "豪華渡假村", "冰箱", "腳踏車", "銘謝惠顧"};
    
    public static String getLuckyDraw(){
        int i = new Random().nextInt(gifts.length);
        return gifts[i];
    }
    
    public default double calcPerMultiplier(){
        return round(Math.random()*5);
    }
    
    public abstract double getBonus();
}
