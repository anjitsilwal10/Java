public class A03_IfElse {
    static void checkAge(int Age){
        if(Age < 18){
            System.out.print("Access Denied - You are not old enough. \n");
        }else{
            System.out.print("Access Granted - You are old enough \n");
        }
    }

    public static void main(String[] args){
        checkAge(34);
        checkAge(15);
    }
}
