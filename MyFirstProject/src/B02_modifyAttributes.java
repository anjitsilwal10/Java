public class B02_modifyAttributes {
    int x;
    int y = 10;

    public static void main(String [] args){
        B01_attributes as10 = new B01_attributes();
        B01_attributes as11 = new B01_attributes();
        as10.x = 40;
//        as11.y = 30;

        System.out.print(as10.x + "\n");
        System.out.print((as11.y));
    }
}
