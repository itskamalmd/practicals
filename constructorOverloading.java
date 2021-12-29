class Student{
    private String name;
    private int ID;
    private int age;
    
    // non parameterized default constructor 
    public Student(){
        this.name = "";
        this.ID = 0;
        this.age = 0;
    }
    // parameterized constructor 
    public Student (String Name,int id,int Age){
        this.name = Name;
        this.ID = id;
        this.age = Age;
    }
    public void displayDetails(){
        System.out.println("The name of the student : " + (!this.name.isEmpty() ? this.name : "not set yet"));
        System.out.println("The ID of the student : " + (this.ID != 0 ? this.ID : "not set yet"));
        System.out.println("The Age of the student : " + (this.age != 0 ? this.age : "not set yet"));
    }
    public static void main(String[] args){
        Student student1 = new Student("kamal",8209,18);
        Student student2 = new Student();

        student1.displayDetails();
        student2.displayDetails();
    }
}
