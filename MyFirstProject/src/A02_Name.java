public class A02_Name {
        static void myMethod(String fname){
            System.out.print(fname +" " + "As10" + "\n");
        }

        static void add(int a, int b){
            int c = a +b;
            System.out.print(c + "\n");
        }

        static void information(String name, String Address, int Age){
            System.out.print("Your Name is: " + name + "\n");
            System.out.print("Your Age is: " + Age + "\n");
            System.out.print("Your Address is: " + Address + "\n");
        }
        public static void main(String[] args){
            myMethod("Anjit");
            myMethod("Anamol");
            myMethod("Samip");
            myMethod("Anuj");
            myMethod("Ridesh");

            add(34,32);

            information("Anjit Silwal","Godawari-2, Lalitpur", 26);

        };



}
