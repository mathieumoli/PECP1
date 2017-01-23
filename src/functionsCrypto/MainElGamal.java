package functionsCrypto;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.Random;

import org.antlr.v4.parse.ANTLRParser.sync_return;

public class MainElGamal {
    public static void main(String[] args) {
    	
    	String plainText = "hello world";
    	System.out.println(plainText);
        Random rnd = new SecureRandom();
        BigInteger q = BigInteger.probablePrime(64, rnd);
        BigInteger g = new BigInteger("3");
        GenerationCles gcle = new GenerationCles(q, g);
        gcle.generation_cles();
        PublicKey pk = gcle.getPk();
        SecretKey sk = gcle.getSk();
        EncryptionElGamal encrypt = new EncryptionElGamal(pk, plainText);
        encrypt.encrypter();
        BigInteger c1 = encrypt.getC1();
        BigInteger c2 = encrypt.getC2();
        DecryptionElGamal decrypt = new DecryptionElGamal(q, c1, c2, sk.getKd());
        decrypt.decrypter();
        System.out.println(decrypt.getM());



    }
	
	

}
