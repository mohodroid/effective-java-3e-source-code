package effectivejava.chapter2.item5;

import static effectivejava.chapter2.item5.Dictionary.Type.GOOGLE;

public class Test<T> {

    public static void main(String[] args) {
        SpellChecker spellChecker = new SpellChecker(GOOGLE);
    }
}
