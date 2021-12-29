class Circle {
    double radius;
    double area;
    double circumference;
    double pie = 3.14;

    public Circle (double Radius){
        this.radius = Radius;
    }

    public void calculateValues(){
        this.area = pie * radius * radius;
        this.circumference = 2 * pie * radius; 
    }

    public void displayValues(){
        System.out.println(String.format("The area of the circle is %f", this.area));
        System.out.println(String.format("The Circumference of the circle is %f",this.circumference));
    }
    
    public static void main(String[] args){
        Circle circleA = new Circle(10);
        Circle circleB = new Circle(12);
        
        circleA.calculateValues();
        circleB.calculateValues();

        circleA.displayValues();
        circleB.displayValues();
    }
    
}
