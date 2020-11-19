package com.company;

public class Main {

    public static void main(String[] args) {
	    Point a=new Point(2,3);
        Point b=new Point(7,3);
        Point c=new Point(7,1);
        Point d=new Point(2,1);

        Triangle tr=new Triangle(a,b,c);
        Circle cr=new Circle(a,b);
        Quadrangle r=new Quadrangle(a,b,c,d);
        System.out.println(tr+"  Периметр = "+tr.getPerimetr()+"  Площадь = "+tr.getArea());
        System.out.println(cr+"  Периметр = "+cr.getPerimetr()+"  Площадь = "+cr.getArea());
        System.out.println(r+"  Периметр = "+r.getPerimetr()+"  Площадь = "+r.getArea());
        Board board=new Board();
        board.addShape(r,2);
        board.addShape(cr,2);
        board.addShape(cr,0);
        board.addShape(tr,4);
        board.deleteShape(3);
        double areas=board.areaFigures();
        System.out.println("Площадь фигур на доске = "+areas);
        System.out.println(board);
    }
}
