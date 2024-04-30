package iterator.browseHistory;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        return urls[--count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    public class ArrayIterator implements Iterator {
        private BrowseHistory history;
        private int index;

        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public Boolean hasNext() {
            return (index < history.urls.length);
        }

        @Override
        public Object current() {
            return history.urls[index];
        }

        @Override
        public int next() {
            return index++;
        }
    }

//    private List<String> urls = new ArrayList<>();
//
//    public void push(String url) {
//        urls.add(url);
//    }
//
//    public Iterator createIterator() {
//        return new ListIterator(this);
//    }
//    public class ListIterator implements Iterator {
//        private BrowseHistory history;
//        private int index;
//
//        public ListIterator(BrowseHistory history) {
//            this.history = history;
//        }
//
//        @Override
//        public Boolean hasNext() {
//            return (index < history.urls.size());
//        }
//
//        @Override
//        public Object current() {
//            return history.urls.get(index);
//        }
//
//        @Override
//        public int next() {
//            return index++;
//        }
//    }
}