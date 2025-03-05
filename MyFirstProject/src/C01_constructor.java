public class C01_constructor {
    int x; //create a class attribute

    public C01_constructor() {
        x = 5;  // set initial value for the class attribue x
    }

    public static void main(String [] args){
        C01_constructor myObjcons = new C01_constructor();
        System.out.print(myObjcons.x);

    }

}
