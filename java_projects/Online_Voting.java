import java.util.*;

class VotingSystem {
    private static Map<String, Integer> candidates = new HashMap<>();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        candidates.put("Alice", 0);
        candidates.put("Bob", 0);
        
        System.out.println("Enter your vote (Alice/Bob): ");
        String vote = sc.nextLine();
        
        if (candidates.containsKey(vote)) {
            candidates.put(vote, candidates.get(vote) + 1);
            System.out.println("Vote casted successfully!");
        } else {
            System.out.println("Invalid candidate!");
        }
        
        System.out.println("Current Votes: " + candidates);
        sc.close();
    }
}
