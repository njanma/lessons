package _13_refactoring;

public interface TeamParticipantDao {

    void save(DataStoreService datastore, TeamParticipants teamParticipants);

    TeamParticipants get(DataStoreService datastore, Long teamId);

    void delete(DataStoreService datastore, Long teamId);
}
