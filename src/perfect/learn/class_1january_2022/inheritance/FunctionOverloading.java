package perfect.learn.class_1january_2022.inheritance;

public class FunctionOverloading {
    void average(int a, int b){

        System.out.println("2 parameter");
    }
    void average(int a, int b,int c, int d){

        System.out.println("4 parameter");

    }
    void average(int a, int b,int c, int d,int e){

        System.out.println("5 parameter");

    }

    public static void main(String[] args) {
        FunctionOverloading fo = new FunctionOverloading();

       fo.average(10,20);
        fo.average(10,20,10,30);
    }

}
