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

    @Test
    public void whenGiven_Value_of_LastName_should_Return_True() {
        boolean result = UserRegistration.checkLastName("Palkar");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_LastName_should_Return_False() {
        boolean b=UserRegistration.checkLastName("pAlkar");
        Assert.assertFalse(b);
    }


    @Test
    public void whenGiven_Value_of_Email_should_Return_True() {
        boolean result = UserRegistration.checkEmail("abc-100@yahoo.com");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_Email_should_Return_False() {
        boolean b=UserRegistration.checkEmail("abc@%*.com");
        Assert.assertFalse(b);
    }

    @Test
    public void whenGiven_Value_of_ContactNo_should_Return_True() {
        boolean result = UserRegistration.checkContactNo("91 9123545670");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_ContactNo_should_Return_False() {
        boolean b=UserRegistration.checkContactNo("12 3156*789215");
        Assert.assertFalse(b);
    }

    @Test
    public void whenGiven_Value_of_Password1_should_Return_True() {
        boolean result = UserRegistration.checkPassword("prasad@123");
        Assert.assertTrue(result);
    }

    @Test
    public void whenGiven_Value_of_Password1_should_Return_False() {
        boolean b=UserRegistration.checkPassword("prasad@");
        Assert.assertFalse(b);
    }



}
