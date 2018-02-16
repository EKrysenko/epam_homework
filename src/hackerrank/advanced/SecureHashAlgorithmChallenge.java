package hackerrank.advanced;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SecureHashAlgorithmChallenge {

    public static void main(String[] args) throws NoSuchAlgorithmException {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        MessageDigest md = MessageDigest.getInstance("SHA-256");
        md.update(str.getBytes());
        byte[] digest = md.digest();

        for (byte bt : digest) {
            System.out.format("%02x", bt);
        }
    }
}
