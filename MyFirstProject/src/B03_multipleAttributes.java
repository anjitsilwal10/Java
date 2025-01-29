public class B03_multipleAttributes {
    String fname = "John";
    String lname = "Doe";
    int age = 19;

    public static void main(String[] args){
        B03_multipleAttributes myObj = new B03_multipleAttributes();

        System.out.print("Name: " + myObj.fname + " " + myObj.lname + "\n");
        System.out.print("The Age is: " + myObj.age);
    }
}
