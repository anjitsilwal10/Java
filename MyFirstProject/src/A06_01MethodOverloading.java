public class A06_01MethodOverloading {
    static int plusMethod(int x, int y){
        return x + y;
    };

    static int plusMethod(int x, int y, int z){
        return x + y + z;
    };
    /* Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.*/

    static double plusMethod(double x , double y){
        return x + y;
    }

    public static void main(String[] args){
        int myNum1 = plusMethod(4,5);
        double myNum2 = plusMethod(6.55,7.99);
        int myNum3 = plusMethod(45,23,56);

        System.out.print("The int is: " + myNum1 + "\n");
        System.out.print("The double is: " + myNum2 + "\n");
        System.out.print("The int is: " + myNum3 + "\n");


    }
}
