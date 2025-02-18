public class B042_staticVspublic {
    static void as12() {
        System.out.print("This is the static method.");
    };

    public void as10(){
        System.out.print("This is the public method.");
    };

    public static void main(String [] args){
        as12();
        B042_staticVspublic obj01 = new B042_staticVspublic();
        obj01.as10();
    }
}
