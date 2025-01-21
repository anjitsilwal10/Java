public class A05_MethodOverloading {
    static int methodInt(int x , int y){
      return x + y;
    };

    static double methodDouble(double x, double y){
        return x + y ;
    }
    /* Instead of defining two methods that should do the same thing, it is better to overload one.

       In the example below, we overload the plusMethod method to work for both int and double:*/

    public static void main(String[] args){
        int myNum1 = methodInt(4,5);
        double myNum2 = methodDouble(4.45,5.6);
        System.out.print("Int: " + myNum1);
        System.out.print("\nDouble: " + myNum2);
    }
}
