package iterator;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
//    private List<String> urls = new ArrayList<>();
    private String[] urls = new String[10];

//    public void push(String url) {
//        urls.add(url);
//    }

//    public String pop() {
//        var lastIndex = urls.size() - 1;
//        var lastUrl = urls.get(lastIndex);
//        urls.remove(lastUrl);
//        return lastUrl;
//    }

    public String[] getUrls() {
        return urls;
    }
}