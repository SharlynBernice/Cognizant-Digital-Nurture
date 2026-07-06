import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class NotificationServiceTest {

    @Mock
    private EmailService emailService;

    @InjectMocks
    private NotificationService notificationService;

    @BeforeEach
    void setUp() {

        MockitoAnnotations.openMocks(this);

    }

    @Test
    void testNotificationSuccess() {

        when(emailService.sendEmail(
                "sharlyn@gmail.com",
                "Welcome"))
                .thenReturn(true);

        String result = notificationService.sendNotification(
                "sharlyn@gmail.com",
                "Welcome");

        assertEquals("Notification Sent Successfully", result);

        verify(emailService).sendEmail(
                "sharlyn@gmail.com",
                "Welcome");

    }

    @Test
    void testNotificationFailure() {

        when(emailService.sendEmail(
                "sharlyn@gmail.com",
                "Welcome"))
                .thenReturn(false);

        String result = notificationService.sendNotification(
                "sharlyn@gmail.com",
                "Welcome");

        assertEquals("Notification Failed", result);

    }

}