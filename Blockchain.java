import java.security.*;
import java.util.*;

class Block {
    String previousHash, data, hash;

    public Block(String data, String previousHash) {
        this.data = data;
        this.previousHash = previousHash;
        this.hash = calculateHash();
    }

    public String calculateHash() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            return Base64.getEncoder().encodeToString(digest.digest((data + previousHash).getBytes()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}

public class BlockchainVoting {
    public static void main(String[] args) {
        List<Block> blockchain = new ArrayList<>();
        blockchain.add(new Block("Voter1: CandidateA", "0"));
        blockchain.add(new Block("Voter2: CandidateB", blockchain.get(0).hash));
        System.out.println("Blockchain: " + blockchain.get(1).hash);
    }
}
