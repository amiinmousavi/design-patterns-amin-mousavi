package iterator.browseHistory;

public interface Iterator<T> {
    Boolean hasNext();
    T current();
    int next();
}
