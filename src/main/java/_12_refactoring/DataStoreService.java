package _12_refactoring;

import java.util.concurrent.Callable;

public interface DataStoreService {
    <E> E runInTransaction(Callable<E> consumer);
}
