public class Square extends Shape {
    double a=0;

    Square(double a){
        this.a=a;
    }

    @Override 
    double area(){
        return a*a;
    }
    
}
