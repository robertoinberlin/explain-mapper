package code.bucket.mapper.reader;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Kay Bucksch
 * @copyright safetynet Ltd.
 * @since 25.01.13
 */
public abstract class PropertyReader<T> {

    private String key;

    public abstract T convert(String value);

    public PropertyReader(String key, Class<T> definition) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}
