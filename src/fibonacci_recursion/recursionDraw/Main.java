package fibonacci_recursion.recursionDraw;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        //set up a JFrame to hold the canvas
        JFrame frame = new JFrame();
        frame.setTitle("Fractals");
        frame.setSize(800,800);
        frame.setLocation(100,100);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //add the canvas to the frame as a content panel
        MyCanvas canvas1 = new MyCanvas();
        frame.getContentPane().add(canvas1);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setBackground(Color.BLACK);
    }
    static class MyCanvas extends Canvas {
        public MyCanvas() {
        } //end MyCanvas() constructor

        //this method will draw the initial circle and invisible line
        public void paint(Graphics graphics) {
            //draw  line
            graphics.setColor(Color.WHITE);
            //graphics.drawLine(0, 250, 500, 250);
//            int x1, x2, y1, y2; //future x and y coordinates
//            int radius = 125; //radius of first circle
            int xMid = 250, yMid = 250; //center point (x,y) of circle
            int height = 800;
            int width = 800;
            // Finding the End Point of the Vector(line) to draw it

            //run fractal algorithm to draw 2 circles to the left and right
           //  drawTree(graphics, xMid, yMid, radius);
            // g,IMG_WIDTH/2,IMG_HEIGHT,0,-1,IMG_HEIGHT/3,0
            drawTree(graphics,width / 2,height,0,-1,(float)height/3,0);

        }

//        void drawCircles(Graphics graphics, int xMid, int yMid, int radius) {
//            //used to position left and right circles
//            if(radius < 5)
//                return;
//
//            // Draw circle
//            graphics.drawOval(xMid - radius, yMid - radius, radius * 2, radius * 2);
//
//            // start recursion
//            //left
//            drawCircles(graphics, xMid-radius, yMid, radius / 2);
//            //right
//            drawCircles(graphics, xMid+radius, yMid, radius / 2);
//        }

        void drawTree(Graphics g,int pointX, int pointY,double directionX,double directionY, float size, int recursion_number){
            int x2 = (int)(pointX + directionX*size), y2 = (int)(pointY + directionY*size);
            // Setting the Colour of the line
            // Setting the Colour of the line
            java.util.Random random = new java.util.Random();
            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
            g.setColor(randomColor);
            // Drawing the line from initial to final point
            g.drawLine(pointX,pointY,x2,y2);
            // If the maximum recursions are reached we need to stop
            int MAX_RECURSIONS = 10;
            if(recursion_number>= MAX_RECURSIONS)
                return;
            // Finding the size of next branch by shrinking the current branch
            float SHRINK_FACTOR = 1.5f;
            float new_branch_size = size/ SHRINK_FACTOR;
            // Finding the Direction Vector of the next branch
            double ANGLE = Math.PI / 2;
            double directionX2  =  Math.sin(ANGLE) * directionY + Math.cos(ANGLE) * directionX;
            double directionY2 = -(Math.sin(ANGLE) * directionX) +  Math.cos(ANGLE) * directionY;
            // Incrementing the recursion_number by 1
            int n2 = recursion_number+1;
            // Drawing the branch
            drawTree(g,x2,y2,directionX2,directionY2,new_branch_size,n2);
            // Finding the Direction Vector of the corresponding branch on the other side i.e. with angle = -ANGLE
            directionX2  = Math.cos(-ANGLE) * directionX + Math.sin(-ANGLE) * directionY;
            directionY2 = -Math.sin(-ANGLE) * directionX + Math.cos(-ANGLE) * directionY;
            // Drawing the twin branch
            drawTree(g,x2,y2,directionX2,directionY2,new_branch_size,n2);
        }
    }
}
