public class Test{
    public static void main(String[]args){
        Child c1 = new Child();
        c1.setName("khushboo");
        System.out.println(c1.getName());
    }
}

// When a child object is created,
// first the grandparent's constructor is called, then the parent's, and finally the child's.
// This ensures that the initialization of the grandparent is done first,
// allowing the parent to inherit its properties properly,
// and then the child can inherit from both.
