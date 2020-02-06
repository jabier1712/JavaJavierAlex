
package doblepresicion2alex;

import java.math.BigInteger;

/**
 *
 * @author Quijano
 */
public class DoblePresicion2Alex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double dnexp = 12345678.00; 
        System.out.println("dexp: "+dnexp);//java transforma automatico un numero grande en notacion cientifica de doble precicion
        
        double dexp = 12345678; 
        System.out.printf("dexp: %f\n", dexp);

    }
    
}
