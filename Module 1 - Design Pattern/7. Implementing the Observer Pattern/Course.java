// Subject Interface
public interface Course {

    void subscribe(Student student);

    void unsubscribe(Student student);

    void notifySubscribers();

    void uploadNewLesson(String lessonName);
}