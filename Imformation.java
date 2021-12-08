package mypack.student;

import mypack.Data;

class Information {
    private static Object Data;
    String Name;
    String RollNo;
    String Dept;
    String UniversityName;
    int age;
    String year;
   Information(){
       System.out.println("Welcome To Student Data");
   }
    public static void main(String []args){
    Information Obj1 =new Information();
    //imformation store to the given variable
        Obj1.Name="Johan";
        Obj1.age=20;
        Obj1.Dept="Computer System Engineering";
        Obj1.RollNo="xxCSXx";   // xx show the batch and Seat Number;
        Obj1.UniversityName="X Name Of University Of Engineering";
        Obj1.year="2nd Year";
        System.out.println("Name "+Obj1.Name);
        System.out.println("Age "+Obj1.age);
        System.out.println("Dept "+Obj1.Dept);
        System.out.println("Roll Number "+Obj1.RollNo);
        System.out.println("University Name "+Obj1.UniversityName);
        System.out.println("Year "+Obj1.year);
        System.out.println(Obj1.Data);
    }
}