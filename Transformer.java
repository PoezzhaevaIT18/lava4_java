import java.util.*;
import java.util.function.Function;

public class Transformer
{
    public static <T, R> List<R> transform(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T item : list) {
            R newValue = function.apply(item);
            result.add(newValue);
        }
        return result;
    }
}
