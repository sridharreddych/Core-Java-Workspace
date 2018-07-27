public  class Student {
  final int rollNumber = 90;
 public  void setRollNumber() {
    //this.rollNumber=50;
}

static int age =20;
public static void main(String[] args){
 Student s =new Student();
 System.out.println(s.age);
 Student a = new Student();
 s.age=30;
 System.out.println(s.age+ " "+a.age);
}
} 