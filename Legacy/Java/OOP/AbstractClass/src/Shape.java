abstract class Shape{
    double length;
    double breadth;

    Shape(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    abstract void area();

    public void greet(){
        System.out.print("Hello");
    }

}