package justice.services;

import java.util.TimeZone;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;

import justice.models.Time;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    @GET
    @Path("{country}")
    public Time getCountry(@PathParam("country") String country) {
        if (country.equals("japan")) {
            return new Time(TimeZone.getTimeZone("Asia/Tokyo"));
        } else if (country.equals("malaysia")) {
            return new Time(TimeZone.getTimeZone("Asia/Kuala_Lumpur"));
        }
        throw new WebApplicationException(404);
    }
}
