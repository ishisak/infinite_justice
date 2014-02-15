package justice.services.db;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.Mongo;
import com.mongodb.MongoURI;

public class MongoDB {

    @SuppressWarnings("deprecation")
    private DB getDB() throws Exception {
        MongoURI uri = new MongoURI("mongodb://localhost");
        Mongo mongo = new Mongo(uri);
        DB db = mongo.getDB("vote");
        return db;
    }

    public void insert(int voterId, int candidateId) throws Exception {
        DB db = getDB();
        DBCollection col = db.getCollection("vote");
        DBObject dbObject = new BasicDBObject();
        dbObject.put("voterId", voterId);
        dbObject.put("condidateId", candidateId);
        col.insert(dbObject);
    }
}
