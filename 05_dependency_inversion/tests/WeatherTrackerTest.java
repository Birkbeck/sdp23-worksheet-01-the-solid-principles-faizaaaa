import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WeatherTrackerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void testReturnsCurrentWeather() {
        Phone p = new Phone();
        Emailer e = new Emailer();
        WeatherTracker tracker = new WeatherTracker(p,e);
        tracker.setCurrentConditions("rainy");

        assertEquals("rainy", tracker.currentConditions);
    }

    @Test
    public void testAlertsPhoneUsersWhenRaining() {
        Phone p = new Phone();
        Emailer e = new Emailer();
        WeatherTracker tracker = new WeatherTracker(p,e);
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("rainy");

        assertEquals("It is rainy", outContent.toString());
    }

    @Test
    public void testAlertsViaEmailWhenSunny() {
        Phone p = new Phone();
        Emailer e = new Emailer();
        WeatherTracker tracker = new WeatherTracker(p,e);
        System.setOut(new PrintStream(outContent));
        tracker.setCurrentConditions("sunny");

        assertEquals("It is sunny", outContent.toString());
    }
}
