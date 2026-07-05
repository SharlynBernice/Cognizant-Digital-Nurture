// Client
public class ObserverPatternTest {

    public static void main(String[] args) {

        OnlineCourse javaCourse = new OnlineCourse();

        Student student1 = new CourseSubscriber("Sharlyn");
        Student student2 = new CourseSubscriber("Rahul");
        Student student3 = new CourseSubscriber("Ananya");

        javaCourse.subscribe(student1);
        javaCourse.subscribe(student2);
        javaCourse.subscribe(student3);

        javaCourse.uploadNewLesson("Observer Design Pattern");

        System.out.println();

        javaCourse.unsubscribe(student2);

        javaCourse.uploadNewLesson("Factory Design Pattern");
    }
}