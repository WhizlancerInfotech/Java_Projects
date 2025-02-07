import java.util.*;

class TimetableScheduler {
    public static void main(String[] args) {
        String[] subjects = {"Math", "Science", "English", "History"};
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        Random random = new Random();
        for (String day : days) {
            System.out.println(day + ": " + subjects[random.nextInt(subjects.length)]);
        }
    }
}
