package strategy.filter;

public class BlackAndWhiteFilter implements Filter{
    @Override
    public void apply() {
        System.out.println("Applying B&W filter");
    }
}
