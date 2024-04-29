package strategy;

import strategy.compressor.PngCompressor;
import strategy.filter.BlackAndWhiteFilter;

public class Main {
    public static void main(String[] args) {
//        var imageStorage = new ImageStorage(new PngCompressor(), new BlackAndWhiteFilter());
//        imageStorage.store("IMG-0001");

        var imageStorage = new ImageStorage();
        imageStorage.store("IMG-0001", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
