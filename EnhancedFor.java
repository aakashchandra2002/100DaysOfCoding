class Students { // another class
    int rollNo;
    String name;
    int marks;
}

public class EnhancedFor {
    public static void main(String[] args) {
        Students st = new Students();
        st.rollNo = 423;
        st.name = "Aakash";
        st.marks = 98;

        Students st1 = new Students();
        st1.rollNo = 419;
        st1.name = "Harsha";
        st1.marks = 90;

        Students st2 = new Students();
        st2.rollNo = 422;
        st2.name = "Mahesh";
        st2.marks = 91;

        Students infoStudents[] = new Students[3];
        infoStudents[0] = st;
        infoStudents[1] = st1;
        infoStudents[2] = st2;

        for (int i = 0; i < infoStudents.length; i++) {
            System.out.println(
                    infoStudents[i].name + " : " + infoStudents[i].marks + ", " +
                            infoStudents[i].rollNo);
        }

        for (Students stud : infoStudents) { // Enhanced for loop
            System.out.println(stud.name);
        }
    }
}
