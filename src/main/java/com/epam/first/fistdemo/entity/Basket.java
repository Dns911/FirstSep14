package com.epam.first.fistdemo.entity;

public class Basket {
    private Ball[] balls = null;

    public Basket() {
        super();
    }

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public Ball[] getBalls() {
        return balls;
    }
    public Ball getBall(int index){
        return balls[index];
    }
    public void setBalls(Ball[] balls) {
        this.balls = balls;
    }
    public int sizeBasket(){
        return balls.length;
    }
}
