package Week4.people;

public class Student extends Person{
    private int credits;
    public Student(String name, String adress){
        super(name, adress);
        this.credits=0;
    }

    public int credits(){
        return this.credits;
    }

    public void study(){
        this.credits++;
    }

    @Override
    public String toString(){
        return super.toString() + "\nStudy credits: " + this.credits;
    }
}

