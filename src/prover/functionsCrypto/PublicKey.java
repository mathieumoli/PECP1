package prover.functionsCrypto;

import java.math.BigInteger;

public class PublicKey {
    private BigInteger q;
    private BigInteger ke;
    private BigInteger g;
    
    public PublicKey(BigInteger q,BigInteger ke,BigInteger g){
        this.q= q;
        this.ke=ke;
        this.g=g;
      }

       
       public BigInteger getq() {
           return q;
       }

      
       public BigInteger getke() {
           return ke;
       }

       
       public BigInteger getg() {
           return g;
       }
}
