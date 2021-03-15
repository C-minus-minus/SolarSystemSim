import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;

import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SolarSystem {

    //private PShape stars;

    private PShape stars;
    private Satellite sun;

    public SolarSystem(PApplet app){

        //  load solar system from file specification
        loadFromFile(app);

        //  set up star background
        this.stars = app.createShape(app.SPHERE,20000);
        this.stars.setStroke(false);
        try{
            PImage img = app.loadImage("res/stars.jpg");
            img.resize(img.width/2,img.height/2);
            this.stars.setTexture(img);
        }catch (Exception e){}

        //  set up star background
        /*this.stars = app.createShape(app.SPHERE,20000);
        try{
            this.stars.setTexture(app.loadImage("res/stars.jpg"));
        }catch (Exception e){}*/

    }

    private void loadFromFile(PApplet app){

        try{
            Map<String,Satellite> map = new HashMap<>();
            Scanner scanner = new Scanner(new FileInputStream("res/planets.txt"));
            while(scanner.hasNext()){

                String name = scanner.next().trim();
                float radius = Float.parseFloat(scanner.next());
                float speed = Float.parseFloat(scanner.next());
                float distance = Float.parseFloat(scanner.next());
                String parent = scanner.next().trim();

                Satellite satellite = new Satellite(app,radius,distance,speed);
                PImage img = app.loadImage("res/"+name+".jpg");
                img.resize(img.height/2,img.width/2);
                satellite.setTexture(img);

                if(parent.equals("NULL")){
                    this.sun = satellite;
                }else {
                    map.get(parent).children.add(satellite);
                }
                map.put(name,satellite);
            }
        }catch (Exception e){ }
    }

    public void draw(PApplet app){

        //  draw our solar system
        sun.draw(app);
        app.shape(stars);
        //app.shape(stars);
    }

    public void toggleRunning(){
        this.sun.toggleRunning();
    }

}
