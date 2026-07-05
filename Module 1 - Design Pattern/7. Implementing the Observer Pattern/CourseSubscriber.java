// Concrete Observer
public class CourseSubscriber implements Student {

    private String studentName;

    public CourseSubscriber(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void update(String lessonName) {
        System.out.println(studentName +
                " received notification: New lesson uploaded - " +
                lessonName);
    }
}