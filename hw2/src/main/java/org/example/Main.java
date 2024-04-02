package org.example;


import models.Cube;
import models.IShape;
import models.Rectangle;
import models.Shape;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("введите размер массива:");
        int size = input.nextInt();
        Shape[] shapes = new Shape[size];

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("введите тип фигуры 1-Rectangle/2-Cube:");
            int type = input.nextInt();
            switch (type) {
                case 1:
                    System.out.println("введите ширину и высоту:");
                    shapes[i] = new Rectangle(input.nextDouble(), input.nextDouble());
                    break;
                case 2:
                    System.out.println("введите 1 сторону:");
                    shapes[i] = new Cube(input.nextDouble());
                    break;
                default:
                    System.out.println("error");
            }
/*            if (type == 1) {
                System.out.println("введите ширину и высоту:");
                shapes[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            }
            if (type == 2) {
                System.out.println("введите 1 сторону:");
                shapes[i] = new Cube(input.nextDouble());
            }*/
        }

       /* IShape[] shapes = new IShape[size];

        for (int i = 0; i < shapes.length; i++) {
            int type = input.nextInt();
            if (type == 1) {
                shapes[i] = new Rectangle(input.nextDouble(), input.nextDouble());
            }
            if (type == 2) {
                shapes[i] = new Cube(input.nextDouble());
            }
        }

        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] instanceof Rectangle rectangle) {
                shapes[i].computeSquare();
            }
            if (shapes[i] instanceof Cube cube) {
                System.out.print(cube.computeSquare() + " ");
            }

        }*/
        System.out.println(shapes.length);
    }

}