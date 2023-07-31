

interface Shape{
    void draw();
}

/* Code is in polymorfic form down here 
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Rectangle Class : Draw() method");
        
    }
}
class Square implements Shape{
     @Override
     public void draw() {
         System.out.println("Square Class : Draw() method");
         
     }
}
class Circle implements Shape{
     @Override
     public void draw() {
         System.out.println("Circle Class : Draw() method");
         
     }
} */

public class LambdaExamples {

   public static void main(String[] args) {
      
    Shape rectangle = () -> System.out.println("Rectangle Class : Draw() method");
    //rectangle.draw();

    Shape square = () -> System.out.println("Sqaure Class : draw() method");
    //square.draw();

    Shape circle = () -> System.out.println("Circle Class : draw() method");
    //circle.draw();

    print(rectangle);
    print(square);
    print(circle);

   }

   private static void print(Shape shape){
    shape.draw();
   }
    
}
