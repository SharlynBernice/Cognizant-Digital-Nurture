import java.util.ArrayList;
import java.util.List;

// Concrete Subject
public class OnlineCourse implements Course {

    private List<Student> students;
    private String latestLesson;

    public OnlineCourse() {
        students = new ArrayList<>();
    }

    @Override
    public void subscribe(Student student) {
        students.add(student);
        System.out.println("Student subscribed successfully.");
    }

    @Override
    public void unsubscribe(Student student) {
        students.remove(student);
        System.out.println("Student unsubscribed successfully.");
    }

    @Override
    public void notifySubscribers() {

        for (Student student : students) {
            student.update(latestLesson);
        }

    }

    @Override
    public void uploadNewLesson(String lessonName) {

        latestLesson = lessonName;

        System.out.println("\nNew Lesson Uploaded: " + lessonName);

        notifySubscribers();
    }
}