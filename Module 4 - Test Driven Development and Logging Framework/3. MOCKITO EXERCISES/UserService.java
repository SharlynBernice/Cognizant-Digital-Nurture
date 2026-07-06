public class UserService {

    private UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public String fetchUserName(int userId) {
        return repository.getUserName(userId);
    }

}