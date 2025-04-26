package org.function_examples;

import java.util.Objects;
import java.util.function.Function;

public class FunctionAndThenComposeExamples {

    public static void main(String[] args) {

//            --- andThen() examples ---
//        Input ➡️  [Function 1] ➡️ Intermediate Result ➡️ [Function 2] ➡️ Final Output

//    1. String length the multiply by 2
        Function<String, Integer> strLength = String::length;
        Function<Integer, Integer> multiplyByTwo = n -> n*2;
        Function<String, Integer> lengthTimesTwo = strLength.andThen(multiplyByTwo);
        System.out.println(lengthTimesTwo.apply("Java"));

//        2. Parse integer then square it
        Function<String, Integer> parseInt = Integer::parseInt;
        Function<Integer, Integer> sqrt = s -> s*s;
        Function<String, Integer> parseIntSquareRoot = parseInt.andThen(sqrt);
        System.out.println(parseIntSquareRoot.apply("8"));

//        3.Trim String then convert it to upepercase
        Function<String , String> trim = String::trim;
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String>  trimAndUpperCase = trim.andThen(toUpperCase);
        System.out.println(trimAndUpperCase.apply(" kunja "));

//        4. Get first character after trim
        Function<String, Character> trimGetFirstChar = trim.andThen(s->s.charAt(0));
        System.out.println(trimGetFirstChar.apply(" function "));

//        5. Double a number then convert to String
        Function<Integer, Integer> doubleNumber = n -> n * 2;
        Function<Integer, String> parseSting = Objects::toString;
        Function<Integer, String> doubleAndParseString = doubleNumber.andThen(parseSting);
        System.out.println(doubleAndParseString.apply(125)+1);

//                   --- andThen() examples ---
//      Input ➡️  [Function 2] ➡️ Intermediate Result ➡️ [Function 1] ➡️ Final Output
//        6. Uppercase then get length
        Function<String, String> upperCase = String::toUpperCase;
        Function<String, Integer> length = String::length;
        Function<String, Integer> lengthAndUpperCase = length.compose(upperCase);
        System.out.println(lengthAndUpperCase.apply("compose"));

//       7. Add prefix then get hashcode
        Function<String , String> addPrefix = s->"Prefix "+s;
        Function<String, Integer> getHashcode = String::hashCode;
        Function<String, Integer> prefixAndHashCode = getHashcode.compose(addPrefix);
        System.out.println(prefixAndHashCode.apply("Test"));

//       8. Multiply number then square
        Function<Integer, Integer> multiple = n -> n*3;
        Function<Integer, Integer> square = s-> s*s;
        Function<Integer, Integer> multiAndSquare = square.compose(multiple);
        System.out.println(multiAndSquare.apply(5));

//         9. Parse string to int, then double it
        Function<String, Integer> parseToInt = Integer::parseInt;
        Function<Integer, Integer> doubleValue = n -> n*2;
        Function<String, Integer> parseToIntDouble = doubleValue.compose(parseToInt);
        System.out.println(parseToIntDouble.apply("25"));

//        10. Remove spaces then reverse
        Function<String, String> removeSpace = String::trim;
        Function<String, String> reverse = s-> new StringBuilder(s).reverse().toString();
        Function<String, String> removeSpaceReverse = reverse.compose(removeSpace);
        System.out.println(removeSpaceReverse.apply(" compose "));
        Function<String, String> removeSpaceInMid = s->s.replaceAll(" ", "");
        Function<String, String> removeSpaceInMidRev = reverse.compose(removeSpaceInMid);
        System.out.println(removeSpaceInMidRev.apply("F u n c t i o n a l"));
    }
}
