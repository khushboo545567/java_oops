public class KindsOfStrings{
    public static void main(String[]args){
        // STRING 

        // == IMMUTALBE , WHEN STRING IS CHANGED THE NEW OBJECT IS CREATED
        String s = "hellow"; // THIS STRING WILL NEVER CHANGE BUT IT WILL WE GARVAGE COLLECTED IF UNUSED S POINTS OB1
        System.out.println(s+="world"); // WHEN STRING IS CHANGED THE NEW OBJECT IS CREATED AND THEN S POINTS TO OBJ2
        System.out.println(s);
        s= s+" sye";
        System.out.println(s);

        // STRING BULDER 

        // IT IS MUTABLE , THREAD UNSAFE, FAST, USEFUL FOR SINGLE THREADED APP
        System.out.println("//////////////////////////////////");
        StringBuilder sb = new StringBuilder();
        sb.append("hellow");
        System.out.println(sb);

        // STRING BUFFER

        // MUTABLE, THREAD SAFE(synchronized methods), USED FOR MULTITHREADED APP, SLIGHTLY SLOWER THAN STRING BUILDER

        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World");
        System.out.println(sb);  // Hello World
        
 
    }
}