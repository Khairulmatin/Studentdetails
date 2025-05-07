public class Course {
    int sem;
    int marks;
    String sub;

    Course(int sem, int marks, String sub){
        this.sem=sem;
        this.marks=marks;
        this.sub=sub;
    }

    void display(){
        System.out.println("sem:"+sem);
        System.out.println("marks:"+marks);
        System.out.println("sub:"+sub);
    }

    public static void main(String[] args) {
        Course c = new Course(1,65 , "Maths");
        c.display();
    }
    
}
