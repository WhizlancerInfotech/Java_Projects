import java.util.*;

class Quiz {
    private String question;
    private String answer;

    Quiz(String q, String a) {
        this.question = q;
        this.answer = a;
    }

    boolean ask() {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        String userAns = sc.nextLine();
        return userAns.equalsIgnoreCase(answer);
    }
}

public class QuizSystem {
    public static void main(String[] args) {
        Quiz[] quizzes = {
            new Quiz("What is the capital of France?", "Paris"),
            new Quiz("What is 5+7?", "12")
        };

        int score = 0;
        for (Quiz q : quizzes) {
            if (q.ask()) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong answer.");
            }
        }
        System.out.println("Final Score: " + score);
    }
}
