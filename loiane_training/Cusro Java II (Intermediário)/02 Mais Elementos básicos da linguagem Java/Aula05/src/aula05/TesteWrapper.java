package aula05;

/**
 *
 * @author code36u4r60
 */
public class TesteWrapper {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        byte by = Byte.MAX_VALUE;
        short sh = Short.MAX_VALUE;
        int i = Integer.MAX_VALUE;
        long l = Long.MAX_VALUE; 
        float f = Float.MAX_VALUE;
        double d = Double.MAX_VALUE;
        boolean b = true;
        char ch = 'a';
        
        
        Byte cby = new Byte(by);
        Short csh = new Short(sh);
        Integer ci = new Integer(i);
        Long cl = new Long(l);
        Float cf = new Float(f);
        Double cd = new Double(d);
        Boolean cb = new Boolean(b);
        Character cch = new Character(ch);
        
        Integer num1 = new Integer("1000");
        
        System.out.println(num1.intValue());
        System.out.println(num1.longValue());
        
        double num2 = num1.doubleValue();
        
        double num3 =  Double.parseDouble("123.43");
        System.out.println(num3);
        
        Integer num4 = Integer.valueOf(1345);
        System.out.println(num4);
        
        System.out.println(num1.equals(num4));
        
        
    }

}
