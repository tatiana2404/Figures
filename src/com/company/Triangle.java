package com.company;

public class Triangle extends Shape{
    private Point a;
    private Point b;
    private Point c;
    public Triangle(){}
    public Triangle(Point a, Point b, Point c){
        this.a=a;
        this.b=b;
        this.c=c;
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

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    @Override
    public double getPerimetr() {
        double perimetr=Point.lengthLine(a,b)+Point.lengthLine(b,c)+Point.lengthLine(c,a);
        return perimetr;
    }

    @Override
    public double getArea() {
        double p=getPerimetr()/2;
        double area=Math.sqrt(p*(p-Point.lengthLine(a,b))*(p-Point.lengthLine(b,c))*(p-Point.lengthLine(c,a)));
        return area;
    }

    @Override
    public String toString() {
        return "Тругольник со сторонами(" +
                "a=" + Point.lengthLine(a,b)+
                ", b=" +Point.lengthLine(b,c)+
                ", c=" + Point.lengthLine(c,a) +
                ')';
    }
}
