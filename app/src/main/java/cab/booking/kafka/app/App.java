/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package cab.booking.kafka.app;

import cab.booking.kafka.list.LinkedList;

import static cab.booking.kafka.utilities.StringUtils.join;
import static cab.booking.kafka.utilities.StringUtils.split;
import static cab.booking.kafka.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
