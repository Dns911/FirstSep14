package com.epam.first.fistdemo.main;

import com.epam.first.fistdemo.entity.Ball;
import com.epam.first.fistdemo.entity.Basket;
import com.epam.first.fistdemo.service.BallService;

public class ProjectMain {
    public ProjectMain() {
        super();
    }

    public static void main(String[] args){
        Ball ball = new Ball();
        Ball ball1 = new Ball(10, "white");
        System.out.println(ball1);
        ball.setWeight(5);
        ball.setColor("red");
        Ball[] arrBalls = {ball, ball1};
        Basket basket = new Basket(arrBalls);
        BallService service = new BallService();
        int sumWeight = service.sumWeightBallIndex(basket);
        int countColor = service.countColorBalls(basket, "red");
        System.out.println(sumWeight + " " + countColor);
    }
}
