package effectivejava.chapter2.item5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import static effectivejava.chapter2.item5.Dictionary.Type.GOOGLE;
import static effectivejava.chapter2.item5.Dictionary.Type.LEXICON;

public class Dictionaries {
    private static final Map<Dictionary.Type, Supplier<? extends Dictionary>> dicMap = new HashMap<>();
    private static final Supplier<Dictionary> google = new GoogleSup();
    private static final Supplier<Dictionary>  lexicon = new LexiconSup();
    static {
        dicMap.put(GOOGLE, google);
        dicMap.put(LEXICON, lexicon);
    }

    static Dictionary getDic(Dictionary.Type type) {
       return dicMap.get(type).get();
    }

    static class GoogleSup implements Supplier<Dictionary>{

        @Override
        public googleTranslate get() {
            return new googleTranslate();
        }
    }

    static class LexiconSup implements Supplier<Dictionary> {
        @Override
        public Lexicon get() {
            return new Lexicon();
        }
    }
}
