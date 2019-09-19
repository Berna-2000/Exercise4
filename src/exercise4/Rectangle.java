package exercise4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ferolinma_cis21035
 */
public class Rectangle {
    private float length;
    private float width;
    public Rectangle (){
        
    }
    public Rectangle (float length, float width){
        this.length = length;
        this.width = width;
    }
    public float getLength (){
        return length;
    }
    public void setLength (float length){
        this.length = length;
    }
    public float getWidth (){
        return width;
    }
    public void setWidth (float width){
        this.width = width;
    }
    public double getArea (){
        double area;
        area = this.getWidth()*this.getLength(); 
        return area;
    }
    public double getPerimeter (){
        double perimeter = 2*this.length + 2*this.width;
        return perimeter;
    }
    public String toString(){
        return "Rectangle[length = "+this.getLength()+", width = "+this.getWidth()+"]";
    }
    
}
