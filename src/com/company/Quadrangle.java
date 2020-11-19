package com.company;

public class Quadrangle extends Shape{
    private Point a;
    private Point b;
    private Point c;
    private Point d;

    public Quadrangle(){}
    public Quadrangle(Point a, Point b, Point c, Point d){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
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

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public double getPerimetr() {
        double perimetr = Point.lengthLine(a, b) + Point.lengthLine(b, c)+Point.lengthLine(c,d)+Point.lengthLine(d,a);
        return perimetr;

    }

    @Override
    public double getArea() {
        double p=getPerimetr()/2;
        double area=Math.sqrt((p-Point.lengthLine(a,b))*(p-Point.lengthLine(b,c))*(p-Point.lengthLine(c,d))*(p-Point.lengthLine(d,a)));
        return area;
    }

    @Override
    public String toString() {
        return "Четырёхугольник со сторонами(" +
                "a=" + Point.lengthLine(a,b) +
                ", b=" + Point.lengthLine(b,c) +
                ", c=" + Point.lengthLine(c,d) +
                ", d=" + Point.lengthLine(d,a) +
                ')';
    }
}
