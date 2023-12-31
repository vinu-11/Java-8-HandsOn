package Lambda;

interface Shape{
    void draw();
}

/* Code is in polymorfic form down here 
class Rectangle implements Lambda.Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle Class : Draw() method");
        
    }
}
class Square implements Lambda.Shape{
     @Override
     public void draw() {
         System.out.println("Square Class : Draw() method");
         
     }
}
class Circle implements Lambda.Shape{
     @Override
     public void draw() {
         System.out.println("Circle Class : Draw() method");
         
     }
} */

public class LambdaExamples {

   public static void main(String[] args) {
      
    //Lambda.Shape rectangle = () -> System.out.println("Rectangle Class : Draw() method");
    //rectangle.draw();

    //Lambda.Shape square = () -> System.out.println("Sqaure Class : draw() method");
    //square.draw();

    //Lambda.Shape circle = () -> System.out.println("Circle Class : draw() method");
    //circle.draw();

    print(() -> System.out.println("Rectangle Class : Draw() method"));   /* Whole Expression passed inside the method  */
    print(() -> System.out.println("Sqaure Class : draw() method"));
    print(() -> System.out.println("Circle Class : draw() method"));

   }

   private static void print(Shape shape){
    shape.draw();
   }
    
}
