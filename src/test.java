import java.security.Provider;
import java.security.Security;
import javax.crypto.*;
import java.security.Key;
//import javax.xml.bind.DatatypeConverter;
public class test {
    public static void main(String[] args) {
        /*String text = "secret!!secret!!secret!!secret!!";
        // Generate new key
        KeyGenerator keygen = KeyGenerator.getInstance("AES");
        keygen.init(256);
        Key key = keygen.generateKey();
        // Encrypt with key
        String transformation = "AES/ECB/PKCS5Padding";
        Cipher cipher = Cipher.getInstance(transformation);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encrypted = cipher.doFinal(text.getBytes());
        System.out.println(DatatypeConverter.printHexBinary(encrypted));
        // Decrypt with key
        cipher.init(Cipher.DECRYPT_MODE, key);
        String result = new String(cipher.doFinal(encrypted));
        System.out.println(result);*/
    }
}