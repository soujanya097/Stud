public class StudCourse {
    String semester1[] = { "c#", "Applied Statiscs", "Java" };
    int marks1[] = { 70, 100, 30 };
    String semester2[] = { "c", "DMS", "DSA" };
    int marks2[] = { 80, 76, 80 };

    public void DisplayMarks() {
        System.out.println("Marks obtained for the semester1");
        for (int i = 0; i < 3; i++) {
            System.out.println("semester1: " + semester1[i] + "marks: " + marks1[i]);
        }
    }

    public void DisplayMarkses() {
        System.out.println("Marks obtained for the semester2");
        for (int i = 0; i < 3; i++) {
            System.out.println("semester2: " + semester2[i] + "marks: " + marks2[i]);
        }
    }

}