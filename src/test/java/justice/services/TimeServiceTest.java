package justice.services;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import javax.ws.rs.WebApplicationException;

import justice.models.Time;
import justice.services.TimeService;

import org.junit.Test;

public class TimeServiceTest {

    @Test
    public void japan() {
        TimeService service = new TimeService();
        Time actual = service.getCountry("japan");
        assertThat(actual.getTimezone(), is("Japan Standard Time"));
    }

    @Test(expected = WebApplicationException.class)
    public void hoge() {
        TimeService service = new TimeService();
        service.getCountry("hoge");
    }

}
