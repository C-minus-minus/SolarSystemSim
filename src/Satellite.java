import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

import java.util.ArrayList;

public class Satellite {

    float radius;
    float speed;
    boolean running;

    float angle, distance;

    PShape shape;

    ArrayList<Satellite> children;

    public Satellite(PApplet app,float radius,float distance,float speed){

        this.running = true;
        this.radius = radius;
        this.speed = speed;
        angle = 0;
        this.distance = distance;

        // set up our geometry
        this.shape = app.createShape(app.SPHERE,radius);
        this.shape.setStroke(false);

        children = new ArrayList<>();
    }

    public void toggleRunning(){
        this.running = !this.running;
        for(Satellite child:children){
            child.toggleRunning();
        }
    }

    public void setTexture(PImage img){
        this.shape.setTexture(img);
    }

    public void draw(PApplet app){

        if(running){
            angle += speed;
        }

        app.pushMatrix();

        app.rotateY(angle);
        app.translate(0,0,distance);

        //  draw all children
        for(Satellite child:children){
            child.draw(app);
        }

        app.shape(shape);

        app.popMatrix();
    }
}