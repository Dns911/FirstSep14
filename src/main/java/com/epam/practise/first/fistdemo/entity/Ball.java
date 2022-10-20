package com.epam.practise.first.fistdemo.entity;

import java.util.Objects;

public class Ball {
    private int weight;
    private String color;

    public Ball() {
        super();
    }

    public Ball(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public int getWeight(){
        return weight;
    }

    public void setWeight(int weight){
        if (weight > 0){
            this.weight = weight;
        } else {
            this.weight = 1;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ball ball)) return false;

        if (weight != ball.weight) return false;
        return Objects.equals(color, ball.color);
    }

    @Override
    public int hashCode() {
        int result = weight;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }
}
