/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exercise4;

/**
 *
 * @author ferolinma_cis21035
 */
import java.lang.Math;

public class Circle {
    private double radius;
    public Circle(){
        
    }
    public void Circle (double radius){
        this.setRadius(radius);
    }
    public double getRadius (){
        return radius;
    }
    public void setRadius (double radius){
        this.radius = radius;
    }
    public double getArea (){
        double area;
        area = Math.PI* Math.pow(this.getRadius(), 2);
        return area;
    }
    public double getCircumference(){
        double circum;
        circum = Math.PI * this.getRadius()*2;
        return circum;
    }
    public String toString(){
        return "Circle[radius = "+this.getRadius()+"]";
    }
}
