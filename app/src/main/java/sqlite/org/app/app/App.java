/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sqlite.org.app.app;

import sqlite.org.app.list.LinkedList;

import static sqlite.org.app.utilities.StringUtils.join;
import static sqlite.org.app.utilities.StringUtils.split;
import static sqlite.org.app.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
