package oop_basics;

public class Rectangle {

    private int height;
    private int width;

    public void printArea(){
        System.out.println(height * width);
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
