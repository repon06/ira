package org.example;


import models.Cube;
import models.IShape;
import models.Rectangle;

import java.util.Locale;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        System.out.println("введите размер массива:");
        int size = input.nextInt();
        IShape[] shapes = new IShape[size];
        //1 2.4 4.5

        for (int i = 0; i < shapes.length; i++) {
            System.out.printf("введите тип %s фигуры 1-Rectangle/2-Cube и длины сторон:", i + 1);
            int type = input.nextInt();
            switch (type) {
                case 1:
                    shapes[i] = new Rectangle(input.nextDouble(), input.nextDouble());
                    break;
                case 2:
                    shapes[i] = new Cube(input.nextDouble());
                    break;
                default:
                    System.out.println("error");
            }
        }

        int index = IntStream.range(0, shapes.length).filter(i -> shapes[i] instanceof Rectangle).findFirst().orElse(0);

        boolean noRect = true;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle rectangle) {
                if (rectangle.computeSquare() > shapes[index].computeSquare()) {
                    index = i;
                }
                noRect = false;
            }
        }
        if (noRect) {
            System.out.println("ERROR");
        } else {
            System.out.println("Прямоугольник сторона 1 = " + ((Rectangle) shapes[index]).getDim1() + "," + " сторона 2 = " + ((Rectangle) shapes[index]).getDim2() + " Площадь = " + shapes[index].computeSquare());
        }

        System.out.println(shapes[0].computeSquare());
    }
}