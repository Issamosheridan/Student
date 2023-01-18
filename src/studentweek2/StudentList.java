
package studentweek2;

public class StudentList {
    public static void main (String[] args){
        StudentWeek2 s1 = new StudentWeek2("s1", "Moe");
        StudentWeek2[] studentlist= new StudentWeek2[3];
        studentlist[0]= new StudentWeek2("s1", "Moe");
        studentlist[1]= new StudentWeek2("s2", "Chris");
        studentlist[2]= new StudentWeek2("s3", "ronak");
        
        for (int i = 0; i <studentlist.length; i++){
            System.out.println(studentlist[i].getStudentname());
        }
        
        
    }//end of main
}//end of class 
