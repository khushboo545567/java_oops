// interface is the blue print of the class
public interface Animal{
    int MAX_AGE = 150;
    void eat();
    void sleep();

    // static method is used to tell the information about the interface what kind of the interface it is IT IS USEFUL WHEN THERE IS MULTIPLE INTERFACE
    // STATIC METHOD
    static void info(){
        System.out.println("this is the interface of the animal");
    }

    // DEFAULT METHOD  it is called by the instance of the child ||if there is so many child of this Animal class then we dont have to implement in all of the classes this run method we can implement whenever we want 
    
    default void run (){
        System.out.println("the animal is running");
    } 
}