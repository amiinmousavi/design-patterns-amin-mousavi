package strategy.compressor;

public class PngCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("Compressing using PNG");
    }
}
