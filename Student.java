public class Student{
    String name;
    int age;
    String dob;

    Student(String name,int age,String dob){
        this.name=name;
        this.age=age;
        this.dob=dob;

    }
    void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("dob:"+dob);
    }

    public static void main(String[] args){
        Student s= new Student ("bob", 19, "10-06-2005");
        s.display();

    }
    
}