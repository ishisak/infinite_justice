package justice.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import justice.models.Voting;

@Path("/voting")
@Produces(MediaType.APPLICATION_JSON)
public class VotingService {

    @GET
    @Path("{voterId}-{candidateId}")
    public Voting getCountry(@PathParam("voterId") int voterId,
            @PathParam("candidateId") int candidateId) {
        return new Voting(voterId, candidateId);
    }
}
