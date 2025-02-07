import opennlp.tools.tokenize.*;
import opennlp.tools.sentdetect.*;

public class Chatbot {
    public static void main(String[] args) throws Exception {
        String text = "Hello! How are you? I am Chatbot.";
        SentenceDetectorME sentenceDetector = new SentenceDetectorME(new SentenceModel(Chatbot.class.getResourceAsStream("/en-sent.bin")));
        Tokenizer tokenizer = new TokenizerME(new TokenizerModel(Chatbot.class.getResourceAsStream("/en-token.bin")));

        for (String sentence : sentenceDetector.sentDetect(text)) {
            System.out.println("Tokens: " + Arrays.toString(tokenizer.tokenize(sentence)));
        }
    }
}
