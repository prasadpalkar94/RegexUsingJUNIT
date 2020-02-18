import org.junit.Assert;
import org.junit.Test;

public class TestDemo {
    @Test
    public void whenGiven_Value_of_FirstName_should_Return_True() {
        boolean result = UserRegistration.checkFirstName("Prasad");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_FirstName_should_Return_False() {
        boolean b=UserRegistration.checkFirstName("pRa@123");
        Assert.assertFalse(b);
    }

}
