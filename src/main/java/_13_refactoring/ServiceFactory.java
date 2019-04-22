package _13_refactoring;

import lombok.experimental.UtilityClass;

import static io.vavr.API.TODO;

@UtilityClass
public class ServiceFactory {

    public static DataStoreService getTransactionalDatastoreService() {
        return TODO();
    }
}
