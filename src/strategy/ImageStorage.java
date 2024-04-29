package strategy;

import strategy.compressor.Compressor;
import strategy.filter.Filter;

public class ImageStorage {
//    private Compressor compressor;
//    private Filter filter;
//
//    public ImageStorage(Compressor compressor, Filter filter) {
//        this.compressor = compressor;
//        this.filter = filter;
//    }

    public void store(String fileName, Compressor compressor, Filter filter) {
        // JPEG, PNG, ...
        compressor.compress();

        // B&W, High Contrast, ...
        filter.apply();
    }
}
