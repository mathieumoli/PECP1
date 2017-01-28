package prover.functionsCrypto;

import java.math.BigInteger;

public class SecretKey {
	
	private BigInteger kd;
	
	   
	   public SecretKey(BigInteger kd){
	     this.kd=kd;
	     
	   }

	   
	    public BigInteger getKd() {
	        return kd;
	    }


}
