package IntroductionPOO;

public class Student {
    public String name;
    public double note1;
    public double note2;
    public double note3;

    public double finalGrade(){
        return this.note1 + this.note2 + this.note3;
    }

    public String studentStatus(){
        if(this.finalGrade() >= 60){
            return "PASS";
        } else {
            return "FAILED";
        }
    }

    public double missingPoints(){
        if(this.finalGrade() >= 60){
            return 0;
        } else {
            return 60 - this.finalGrade();
        }
    }
}
