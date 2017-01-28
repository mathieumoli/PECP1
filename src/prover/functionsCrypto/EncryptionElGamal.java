package prover.functionsCrypto;

import java.math.BigInteger;

public class EncryptionElGamal {
	private PublicKey pk;
	private String m;
	
	private BigInteger c1;
	private BigInteger c2;
	
	public EncryptionElGamal(PublicKey pk, String ptext){
		this.pk = pk;
		m = ptext;
	}
	
	public void encrypter(){
		BigInteger g = pk.getg();
		BigInteger q = pk.getq();
		BigInteger ke = pk.getke();
		BigInteger mq = new BigInteger(m.getBytes());
		//System.out.println(mq.toString());
		BigInteger r = GenerationCles.randomBigInteger(q.subtract(BigInteger.ONE));
		c1 = g.modPow(r, q);
		c2 = mq.multiply(ke.modPow(r, q)).mod(q);		
		
	}

	public BigInteger getC1() {
		return c1;
	}


	public BigInteger getC2() {
		return c2;
	}


	
	

}
