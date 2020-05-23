package CollegeFaculty;

public class StudentInfo extends AbstractData {
        private int roll_no;
        private String section;

        StudentInfo(int roll_no,String section){
            super();
            this.roll_no=roll_no;
            this.section=section;
            }
            public int getRoll_no() {
                return roll_no;
            }
            public String getSection() {
                return section="A";
            }

}
