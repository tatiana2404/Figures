package com.company;

import java.util.Arrays;

public class Board {
    private Shape[] figures=new Shape[4];
    public Board(){  }
    public void addShape(Shape fig,int n){
        if(n>=0 && n<=3){
            if(figures[n]==null) {
                figures[n] = fig;
                System.out.println("Фигура успешно добавлена");
            }
            else {
                System.out.println("Место "+n+" уже занято");
            }
        }
        else {
                System.out.println("Введите коректный номер");
        }
    }
    public void deleteShape(int n){
        if(n>=0 && n<=3) {
            if (figures[n] != null) {
                figures[n] = null;
                System.out.println("Фигура успешно удалена");
            } else {
                System.out.println("Это место и так пусто");
            }
        }
        else {
            System.out.println("Введите корректый номер");
        }
    }
    public double areaFigures(){
        double areas=0;
        for (int i=0;i<figures.length;i++) {
            if(figures[i]!=null)
            areas += figures[i].getArea();
        }
        return areas;
    }

    @Override
    public String toString() {
        return "Доска:" +
                "фигуры=" + Arrays.toString(figures);
    }
}
