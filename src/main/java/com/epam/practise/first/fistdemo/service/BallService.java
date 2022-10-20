package com.epam.practise.first.fistdemo.service;

import com.epam.practise.first.fistdemo.entity.Ball;
import com.epam.practise.first.fistdemo.entity.Basket;

public class BallService {
    public int sumWeightBall(Basket basket){
        Ball[]  current = basket.getBalls();
        int sum = 0;
        for (Ball ball: current) {
            sum += ball.getWeight();
        }
        return sum;
    }
    public int sumWeightBallIndex(Basket basket){
        int sum = 0;
        for (int i = 0; i < basket.sizeBasket(); i++){
            sum += basket.getBall(i).getWeight();
        }
        return sum;
    }
    public int countColorBalls(Basket basket, String color){
        Ball[]  current = basket.getBalls();
        int counter = 0;
        for (Ball ball: current) {
            if (ball.getColor().equals(color)){
                counter++;
            }
        }
        return counter;
    }
}
