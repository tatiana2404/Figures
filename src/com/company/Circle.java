package com.company;

public class Circle extends Shape{
    private Point a;
    private Point b;
    public Circle(){}
    public Circle(Point a, Point b){
        this.a=a;
        this.b=b;
    }
    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    @Override
    public double getPerimetr() {
        double perimetr=(Point.lengthLine(a,b))*2*Math.PI;
        return perimetr;
    }

    @Override
    public double getArea() {
        double area=Math.PI*Math.pow(Point.lengthLine(a,b), 2);
        return area;
    }

    @Override
    public String toString() {
        return "Круг с радиусом(" +
                Point.lengthLine(a,b)+')';
    }
}
