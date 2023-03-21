public class listingStudentsQ14 {

    private String student_degree, student_fullname , student_ID;

    public Q14Student (String student_fullname, String ID, String student_degree){
        this.Student_degree=student_degree;
        this.student_fullname=student_fullname;
        this.Student_ID=student_ID;
    }

    public String toString(){
        return ("["+student_fullname+", ID: "+Student_ID+", "+student_degree+"]");
    }
}
