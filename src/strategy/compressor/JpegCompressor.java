package strategy.compressor;

public class JpegCompressor implements Compressor{
    @Override
    public void compress() {
        System.out.println("Compressing using JPEG");
    }
}
