package code.bucket.mapper;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @author Kay Bucksch
 * @copyright safetynet Ltd.
 * @since 25.01.13
 */
public class PropertyReader {

    private static final Map<String, String> properties = new HashMap<String, String>();

    public static <T> T getParam(code.bucket.mapper.reader.PropertyReader<T> propertyReader) {
        return propertyReader.convert(properties.get(propertyReader.getKey()));
    }

    public static void add(String key, String value) {
        properties.put(key, value);
    }
}
