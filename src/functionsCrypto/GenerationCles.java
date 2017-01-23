package functionsCrypto;

import java.math.BigInteger;
import java.util.Random;

public class GenerationCles {
	private BigInteger q;
	private BigInteger g;
	
	private PublicKey pk;
	private SecretKey sk;
	
	public GenerationCles(BigInteger q, BigInteger g){
		this.q = q;
		this.g = g;
	}
	
	public void generation_cles(){
		
		BigInteger valeurMax = q.subtract(BigInteger.ONE);
		BigInteger kd = randomBigInteger(valeurMax);
		sk = new SecretKey(kd);
		BigInteger ke = g.modPow(kd, q);
		pk = new PublicKey(q,ke,g);
		
	}
	
	public static BigInteger randomBigInteger(BigInteger maxNum){
		 	Random rnd = new Random();
		    int maxNumBitLength = maxNum.bitLength();
		    BigInteger rndNum;
		    do {
		        rndNum = new BigInteger(maxNumBitLength, rnd);
		    } while(rndNum.compareTo(maxNum) >= 0);
		    return rndNum;
	}

	public PublicKey getPk() {
		return pk;
	}

	public SecretKey getSk() {
		return sk;
	}

		
	

}
