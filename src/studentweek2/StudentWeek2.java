
package studentweek2;

/**
 *
 * @author moeissa
 */
public class StudentWeek2 {
   private String studentid;
   private String studentname;
   private String studentAddress;

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public StudentWeek2(String studentid, String studentname) {
        this.studentid = studentid;
        this.studentname = studentname;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }
   
}
