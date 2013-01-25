package code.bucket.mapper.reader;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Kay Bucksch
 * @copyright safetynet Ltd.
 * @since 25.01.13
 */
public class LongPropertyReader extends PropertyReader<Long> {

    public LongPropertyReader(String key) {
        super(key, Long.class);
    }

    @Override
    public Long convert(String value) {
        return Long.parseLong(value);
    }
}
