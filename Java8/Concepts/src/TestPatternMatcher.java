import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestPatternMatcher {

    /*
    or we can say regex-regular expression
    First, the pattern is created using the Pattern.compile() method.
    The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that the search should be case-insensitive.
    The second parameter is optional.

    The matcher() method is used to search for the pattern in a string. It returns a Matcher object which contains information about the search that was performed.

    The find() method returns true if the pattern was found in the string and false if it was not found.

     */


    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("shubham", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("My name is Shubham Seth");
        boolean matchFound = matcher.find();
        System.out.println(matcher.appendReplacement(new StringBuilder("shubham"),"Ranjan"));
        System.out.println(matcher.find());
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        System.out.println("Matches use");

        System.out.println(Pattern.matches("abcd*ef", "abcdef"));// in this line it will find word tarting with abcd and end with ef

        System.out.println(Pattern.matches("abcdef*", "abcdef"));// in this line it will match word starting with abcdef

//searching particular pattern

        Pattern pat=Pattern.compile(".com");

        Matcher m1=pat.matcher("mgavalemgavale@gmail.com");
//^[a-zA-Z0-9+_,.-]+@[a-zA-Z0-9.-]
//^matching the starting of sentence
//[a-zA-Z0-9.-]matches one character from alphabets,digits,+_,.- before @ symbol
//+ indicates above set for one or more times
//@matches itself
//[a-zA-Z0-9.-] matches one character from the English alphabet  digits, . and -after @ symbol


        while(m1.find())
        {
            System.out.println(m1.start() );
            System.out.println(m1.end()-1 );

        }

    }
}
