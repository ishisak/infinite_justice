package justice.models;

import static org.junit.Assert.assertEquals;

import java.util.TimeZone;

import justice.models.Time;

import org.junit.Test;

public class TimeTest {

    @Test
    public void testDefaultTimezone() throws Exception {
        final Time time = new Time();
        assertEquals(TimeZone.getDefault().getDisplayName(), time.getTimezone());
    }

    @Test
    public void testSpecifiedTimezone() throws Exception {
        final TimeZone est = TimeZone.getTimeZone("EST");
        final Time time = new Time(est);
        assertEquals(est.getDisplayName(), time.getTimezone());
    }
}
