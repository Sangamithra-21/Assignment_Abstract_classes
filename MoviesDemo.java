package Assignment_13_Abstraction;
abstract class Movie {
    String moviename;
    String hero;
    String type;

    Movie(String name, String hero, String type) {
        this.moviename = name;
        this.hero = hero;
        this.type = type;
    }

    abstract void play();

    abstract void stop();
    abstract void display();

    void printDetails()
    {
        System.out.println("Movie Name        : "+moviename);
        System.out.println("Hero              : "+hero);
        System.out.println("Type of the Movie : "+type);
    }



}
class Thriller extends Movie{
    Thriller(String name,String hero,String type)
    {
        super(name,hero,type);
    }

    @Override
    void play() {
        System.out.println("Thriller Movie "+moviename+" is playing..!");
    }

    @Override
    void stop() {
        System.out.println("Thriller Movie "+moviename+" was stopped..!");
    }

   void display()
    {
        super.printDetails();

    }


}

class Action extends Movie{
    Action(String name,String hero,String type)
    {
        super(name,hero,type);
    }

    @Override
    void play() {
        System.out.println("Action Movie "+moviename+" is playing..!");
    }

    @Override
    void stop() {
        System.out.println("Action Movie "+moviename+" was stopped..!");
    }
    void display()
    {
        super.printDetails();

    }
}
public class MoviesDemo{
    public static void main(String[] args) {
        Movie m1=new Thriller("Ratchasan","Vishnu","Thriller");
        m1.display();
        m1.play();
        m1.stop();
        System.out.println("-------------------------------------------------------------------------------------------");
        Movie m2=new Action("Thupakki","vijay","Action");
        m2.display();
        m2.play();
        m2.stop();
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}