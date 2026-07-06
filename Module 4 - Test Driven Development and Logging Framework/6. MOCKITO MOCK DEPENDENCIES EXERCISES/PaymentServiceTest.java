import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class PaymentServiceTest {

    @Test
    void testSuccessfulPayment() {

        PaymentGateway gateway = mock(PaymentGateway.class);

        when(gateway.processPayment(1000))
                .thenReturn(true);

        PaymentService service = new PaymentService(gateway);

        assertEquals("Payment Successful",
                service.makePayment(1000));

        verify(gateway).processPayment(1000);

    }

    @Test
    void testFailedPayment() {

        PaymentGateway gateway = mock(PaymentGateway.class);

        when(gateway.processPayment(500))
                .thenReturn(false);

        PaymentService service = new PaymentService(gateway);

        assertEquals("Payment Failed",
                service.makePayment(500));

        verify(gateway).processPayment(500);

    }

}