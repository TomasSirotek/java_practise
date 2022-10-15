package oop_basics;

public class Rectangle {

    private int height;
    private int width;

    // Constructor
    public Rectangle(int height,int width){
        setHeight(height);
        setWidth(width);
    }

    public void printArea(){
        System.out.println(height * width);
    }
    public void setHeight(int height) {
        if(height > 0){
            this.height = height;
        }
    }
    public void setWidth(int width) {
        if(height > 0)
            this.width = width;
    }
    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
       return this.width;
    }

    public int getArea(){
        return height * width;
    }
    public int getPerimeter(){
        return (2 * height) + (2 * width);
    }
}
