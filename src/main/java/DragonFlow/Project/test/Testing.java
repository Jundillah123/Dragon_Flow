package DragonFlow.Project.test;

import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;

public class Testing {
    public static void main(String[] args) {
        String name = "jundi";
        String test = new StringBuilder(name).reverse().toString();
        System.out.println(test);
//        int nomber = 23400000;
        String type = "Ini Type Data double Di Convert ke int : ";
        double co = 23.0000;
        int testt = (int) co;
        System.out.println( type + testt);
        System.out.println( co);





    }
}
