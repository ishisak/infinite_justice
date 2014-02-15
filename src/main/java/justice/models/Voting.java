package justice.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Voting {
    private int voterId;
    private int candidateId;

    public Voting(int voterId, int candidateId) {
        this.voterId = voterId;
        this.candidateId = candidateId;
    }

    public int getVoterId() {
        return voterId;
    }

    public void setVoterId(int voterId) {
        this.voterId = voterId;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void setCandidateId(int candidateId) {
        this.candidateId = candidateId;
    }
}
