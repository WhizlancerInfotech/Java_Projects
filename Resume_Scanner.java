import org.apache.tika.Tika;
import java.io.*;

public class ResumeScanner {
    public static void main(String[] args) throws Exception {
        Tika tika = new Tika();
        String resumeText = tika.parseToString(new File("resume.pdf"));
        if (resumeText.contains("Java") && resumeText.contains("Spring")) {
            System.out.println("Candidate is eligible for Java Developer role.");
        }
    }
}
