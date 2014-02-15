package justice.models;

import justice.services.db.MongoDB;

public class Voting {
    private int voterId;
    private int candidateId;

    public Voting(int voterId, int candidateId) {
        this.voterId = voterId;
        this.candidateId = candidateId;
        MongoDB db = new MongoDB();
        try {
            db.insert(voterId, candidateId);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
