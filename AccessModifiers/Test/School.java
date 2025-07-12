// IN THIS WE WANT THAT TO CREATE ONLY ONE OBJ OF THIS CLASS
public class School{

    private static School instance;

    private School(){

    }

    public static School getInstance(){
        if(instance == null){
            instance = new School();
        }
        return instance;
    }
}

class Color{
    // THIS IS DEFAULT CLASS IT IS ACCESSABLE IN THE SAME PACKAGE BUT NOT ACCESSABLE IN THE DIFFRENT PACKAGE
}