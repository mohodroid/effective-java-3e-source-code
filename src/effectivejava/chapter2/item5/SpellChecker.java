package effectivejava.chapter2.item5;

/**
 * Assumes there is one dictionary worth using, but we have so many dictionaries!!!
 */
public class SpellChecker {

    //solution 1 ->  make dictionary non-final.
    //change it every time to change dictionary with setter
    // awkward, error-prone, and unworkable in a concurrent setting
    //utility static class and singleton are inappropriate for class whose behavior is
    // parameterized by an underlying resource.

    //we want multiply instances of spellchecker, each of which use resource desirable by the client
    //solution 2 -> DI
    //Dependency injection is equally applicable to constructors, static factories (Item 1), and builders (Item 2).
    final Dictionary dictionary;

    public SpellChecker(Dictionary.Type type) {
        dictionary = Dictionaries.getDic(type);
        System.out.println(dictionary);
    }

}
