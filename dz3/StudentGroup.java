
public class StudentGroup implements Comparable<StudentGroup> {
    private String studentGroupName;
    private int number;

    public StudentGroup(String studentGroupName, int number){
        this.studentGroupName = studentGroupName;
        this.number = number;
    }

    public String getStudentGroupName(){
        return studentGroupName;
    }

    public void setStudentGroupName(String studentGroupName){
        this.studentGroupName = studentGroupName;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "StudentGroup{" + "studentGroupName=" + studentGroupName + ", number=" + number +  "}";
    }

    @Override
    public int compareTo(StudentGroup o) {
        if(o.getNumber() > number){
            return -1;
        }
        if(o.getNumber() < number){
            return 1;
        }
        return 0;
    }
}