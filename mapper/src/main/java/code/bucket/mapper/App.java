package code.bucket.mapper;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        PropertyReader.add(Properties.MY_FIRST_LONG_PROPERTY.getKey(), "21");

        Long myResult = PropertyReader.getParam(Properties.MY_FIRST_LONG_PROPERTY);

        System.out.println(myResult);
    }
}
