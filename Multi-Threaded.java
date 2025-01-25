import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadedFileSearch {
    private static final int THREAD_COUNT = 5;

    public static void main(String[] args) {
        File directory = new File("path/to/directory");
        String keyword = "searchKeyword";

        ExecutorService executor = Executors.newFixedThreadPool(THREAD_COUNT);
        for (File file : directory.listFiles()) {
            if (file.isFile()) {
                executor.submit(() -> searchKeywordInFile(file, keyword));
            }
        }
        executor.shutdown();
    }

    private static void searchKeywordInFile(File file, String keyword) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains(keyword)) {
                    System.out.println("Keyword found in file: " + file.getName());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
