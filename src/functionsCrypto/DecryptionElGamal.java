package functionsCrypto;

import java.math.BigInteger;

public class DecryptionElGamal {
	
	private BigInteger q;
	private BigInteger kd;
	private BigInteger c1;
	private BigInteger c2;
	
	private String m;
	
	public DecryptionElGamal(BigInteger q,BigInteger c1, BigInteger c2, BigInteger kd){
		this.q = q;
		this.kd = kd;
		this.c1 = c1;
		this.c2 = c2;						
	}
	
	
	public void decrypter(){
		BigInteger mq = c2.divide(c1.modPow(kd, q)).mod(q);
		m = new String(mq.toByteArray());		
	}

	
	public String getM() {
		return m;
	}


}
