public class B04_staticVspublic {
    static void as10(){
        System.out.print("hello this is static method. \n");

    }

    public void as11(){
        System.out.print("Hello! this is public method.");
    }

    public static void main(String[] args){
        as10();

        B04_staticVspublic obj = new B04_staticVspublic();
        obj.as11();

    }
}
