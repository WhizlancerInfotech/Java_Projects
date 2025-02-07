import java.util.*;
import java.util.regex.*;

class Lexer {
    private static final Pattern TOKEN_PATTERN = Pattern.compile("\\s*(=>|==|<=|>=|\\w+|\\d+|\\S)\\s*");
    
    public static List<String> tokenize(String code) {
        List<String> tokens = new ArrayList<>();
        Matcher matcher = TOKEN_PATTERN.matcher(code);
        while (matcher.find()) {
            tokens.add(matcher.group().trim());
        }
        return tokens;
    }
}

public class Compiler {
    public static void main(String[] args) {
        String code = "if x == 10 { print(y); }";
        System.out.println("Tokens: " + Lexer.tokenize(code));
    }
}
