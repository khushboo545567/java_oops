public class Exception{
    // EXAMPLE OF TRY, CATCH, FINALLY

    public static void main(String[]args){
        try{
            int a = 10/0;
        }
        catch(ArithmeticException e){
            System.out.println("can not devide by zero");
        }
        finally{
            System.out.println("this block is always executed");
        }
    }

// EXAMPLE OF THROW == used to manually throws an exception 

    // public static void main(String[] args) {
    //     int age = 16;
    //     if (age < 18) {
    //         throw new ArithmeticException("You are not eligible to vote.");
    //     } else {
    //         System.out.println("You can vote.");
    //     }
    // }

    // EXAMPLE OF THROWS == used to declare an exception may occurs
    // a method is declare throws to tell that it may throw an exception when it is called so this exception is handled by where this function is called

    // Method declares it might throw an IOException
    // public static void readFile() throws IOException {
    //     FileReader file = new FileReader("data.txt");
    //     BufferedReader br = new BufferedReader(file);
    //     System.out.println(br.readLine());
    // }

    // public static void main(String[] args) {
    //     try {
    //         readFile(); // method that might throw
    //     } catch (IOException e) {
    //         System.out.println("File not found or can't read the file.");
    //     }
    // }


}