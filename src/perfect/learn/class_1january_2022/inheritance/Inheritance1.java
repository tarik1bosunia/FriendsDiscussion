package perfect.learn.class_1january_2022.inheritance;

public class Inheritance1 {

    public static void main(String[] args) {

    }
}


class A{
    protected int x =10;///jabe
    public int y = 20;///jabe
    private int z = 30;//jabe na

    public void func1(){
        System.out.println("func1 from A");
    }
    protected void func2(){
        System.out.println("func2 from A");
    }
    private void func3(){
        System.out.println("func3 from A");
    }

}

class B extends A{


    public static void main(String[] args) {
        B b = new B();
//        b.func1();
//        b.func2();
//        b.func3();

//        System.out.println("x: " +  b.x );
//        System.out.println("y: " +  b.y );
//        System.out.println("z: " + b.z);



    }
}



