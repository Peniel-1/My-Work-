package com.techelevator;

public class SquareWall extends RectangleWall {

    private int sideLength;

    public SquareWall(String name, String color, int sideLength) {
        super(name, color);
        this.sideLength = sideLength;
    }
    public SquareWall(String name, String color) {
        super(name, color);
    }
    public SquareWall(String name, String color, int length, int height) {
        super(name, color, length, height);

    }
    public int getArea() {
        return sideLength * sideLength;
    }

        public String toString() {
            return super.getName() +" ("+ sideLength + "x" + sideLength + ") square";
        }

     }

