package _12_refactoring;

import io.vavr.API;

public class ServiceFactory {

    static DataStoreService getTransactionalDatastoreService(){
        return API.TODO();
    }
}
