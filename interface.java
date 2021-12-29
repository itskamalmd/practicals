interface Area {
    double pie = 3.14;
    
    public double computeArea(int x);
}

class Circle implements Area{
    public double computeArea(int x){
        return pie*x*x;
    }
}
class Square implements Area {
    public double computeArea(int x){
        return x*x;
    }
}

class interfaces{
    public static void main(String [] args){
        Circle circle = new Circle();
        Square square = new Square();

        System.out.println("The area of the Square : " + square.computeArea(10));
        System.out.println("the area of the circle : " + circle.computeArea(10));        
    }
}

