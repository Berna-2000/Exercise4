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
public class Exercise4 {

    public static void main(String[] args) {
        Rectangle shape = new Rectangle (1.0f, 1.0f);
        shape.setLength(1.0f);
        shape.setWidth(1.0f);
        System.out.println("RECTANGLE\n");
        System.out.println(shape.toString());
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.print("\n");
        Circle shape1 = new Circle(1.0f);
        shape.setLength(1.0f);
        shape.setWidth(1.0f);
        System.out.println("CIRCLE\n");
        System.out.println(shape1.toString());
        System.out.println("Area: " + shape1.getArea());
        System.out.println("Circumference: " + shape1.getCircumference());
    }
    
}

