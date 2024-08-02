package org.example.salesmanagement_T2208e.utils.encryption;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class ShaEncryptionUtils {
    public static String sha256(String data) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedHash = digest.digest(data.getBytes());
        return Base64.getEncoder().encodeToString(encodedHash);
    }
}
