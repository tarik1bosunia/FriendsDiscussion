package perfect.learn.usingObjects;



public class UsingObjects {

    void func1(){

    }

    // constructor
    UsingObjects(){

    }


    public static void main(String[] args) {
        UsingObjects tarik = new  UsingObjects();
        UsingObjects rabetry = new  UsingObjects();

    }
}

class CSE{
    String studentName;
    int studentRoll;

    // default constructor
    CSE(){
        System.out.println("default constructor");
    }
    //parameterised constructor
    CSE(String studentName, int studentRoll){
        this.studentName = studentName;
        this.studentRoll = studentRoll;

        System.out.println("parameterised constructor");

    }


    //getter and setter
    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentRoll() {
        return studentRoll;
    }

    public void setStudentRoll(int studentRoll) {
        this.studentRoll = studentRoll;
    }




    //main function
    public static void main(String[] args) {
        CSE esha = new CSE();
 //       CSE tarik = new CSE();
//        CSE rabitry = new CSE("Rabitry Hasda",56);
//        System.out.println(rabitry.getStudentName());

        esha.setStudentName("Nusrat Esha");
        esha.setStudentRoll(45);

        System.out.println(esha.getStudentName());
        System.out.println(esha.getStudentRoll());

    }

}

class Cricket{
    private int run;
    private int wicket;
    private int over;
    private int ball;

    Cricket(){
        this.run = 0;
        this.wicket = 0;
        this.over = 20;
        this.ball = 6;
    }




    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getWicket() {
        return wicket;
    }

    public void setWicket(int wicket) {
        this.wicket = wicket;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getBall() {
        return ball;
    }

    public void setBall(int ball) {
        this.ball = ball;
    }




    public void updateRun(int increaseRun){
        this.setRun(this.getRun() + increaseRun);
    }
    public void updateWicket(){
        this.setWicket(this.getWicket() + 1);
    }


    public void update(){

    }
    public void render(){
        System.out.println("Run: " + this.getRun());
        System.out.println("Over: " + this.getOver() + "." + this.ball);
        System.out.println("wicket: " + this.getWicket());

    }

    public static void main(String[] args) {
        Cricket bpl = new Cricket();

        while (true){
            bpl.update();
            bpl.render();
        }

    }
}


abstract class  Student{

    public void playing(){
        System.out.println("Playing");
    }

    public abstract void studying();
}

abstract class FirstYear extends Student{

    public void func(){

    }

    public static void main(String[] args) {
        FirstYear f = new FirstYear() {
            @Override
            public void studying() {

            }
        };
    }
}
class Tarik extends FirstYear{

    @Override
    public void studying() {

    }
}





