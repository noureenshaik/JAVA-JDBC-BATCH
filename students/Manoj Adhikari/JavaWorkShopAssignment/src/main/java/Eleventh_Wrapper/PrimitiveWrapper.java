package Eleventh_Wrapper;

public class PrimitiveWrapper {
    public static void main(String[] args) {

       //Warpper obj and vice versa
        byte b = 1;
        short c =20;
        int d =  30;
        long e = 30;
        float f = 50.4f;
        double g =60d;
        char h = 'a';
        boolean l = true;

        //Autoboxing : converting primitive into obj
        Byte byteojj =b;
        Short shortobj = c;
        Integer intobj =d;
        Long longobj = e;
        Float floatobj = f;
        Double doubleobj = g;
        Character charobj = h;
        Boolean boolobj= l;

        // Printing obj
        System.out.println("Printing Object Values:::");
        System.out.println(" Object: "+ byteojj);
        System.out.println(" Object: "+ shortobj);
        System.out.println(" Object: "+ intobj);
        System.out.println(" Object: "+ longobj);
        System.out.println(" Object: "+ floatobj);
        System.out.println(" Object: "+ doubleobj);
        System.out.println(" Object: "+ charobj);
        System.out.println(" Object: "+ boolobj);
// unboxing : converting obj to primite

        byte bytevalue = byteojj;
        short shortvalue= shortobj;
        int intvalue = intobj;
        long longvalue = longobj;
        float floatvlue = floatobj;
        double doublevalue= doubleobj;
        char charvlue= charobj;
        boolean boolvlue = boolobj;

        // Printing primitive
        System.out.println("Printing privitive valuess");
        System.out.println(" value"+ byteojj);
        System.out.println(" value"+ shortvalue);
        System.out.println(" value"+ intvalue);
        System.out.println(" value"+ longvalue);
        System.out.println(" value"+ floatvlue);
        System.out.println(" value"+ doublevalue);
        System.out.println(" value"+ charvlue);
        System.out.println(" value"+boolvlue);

    }
}
