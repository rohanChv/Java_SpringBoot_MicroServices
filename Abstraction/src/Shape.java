abstract class Shape{

    abstract double area();

    public void displayInfo(){
        System.out.printf("The Area of %s  ",getClass().getSimpleName()+" is  "+area());
    }

}