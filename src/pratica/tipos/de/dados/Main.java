package pratica.tipos.de.dados;

// aula 2: Tipo de Dados

public class Main {
    public static void  main(String[] args) {

        byte b1 = 13;
        byte b2 = 14;

        short s1 = 2000;
        //short s2 = 33000; o valor maximo é 32767

        int I1 = 3;
        int I2 = 9876663;

        long l1 = 82700000000000L;
        long l2 = -167170970000000L;

        //float f1 = 4.5; quando coloca somente o numero, interpreta como double automaticamente
        float f2 = 25.3F;

        double d1 = 87.34;
        double d2 = 99.098D;

        char c1 = 'R';
        //char c2 = 'ta'; char é somente 1 caractere
        char c3 = '\u0879';

        String st1 = "maressa";
        String st2 = "alves";
        String st3 = "está estudando Java: no GFT star woman Java da DIO";
        //String st4 = "19/12/1990" nao se usa data em dado String

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(s1);
        System.out.println(I1);
        System.out.println(I2);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(c1);
        System.out.println(c3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
        System.out.println(bo1);
        System.out.println(bo2);
    }
}
