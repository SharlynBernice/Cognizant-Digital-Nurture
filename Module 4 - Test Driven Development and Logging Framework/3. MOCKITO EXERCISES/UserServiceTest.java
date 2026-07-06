import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    void testFetchUserName() {

        // Create mock object
        UserRepository repository = mock(UserRepository.class);

        // Define mock behaviour
        when(repository.getUserName(101))
                .thenReturn("Sharlyn");

        // Inject mock into service
        UserService service = new UserService(repository);

        // Verify result
        assertEquals("Sharlyn", service.fetchUserName(101));

        // Verify method call
        verify(repository).getUserName(101);

    }

}