import jdk.nashorn.internal.runtime.regexp.joni.Matcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Pattern;


class Test {
    public static void main(String[] args) throws IOException {
        StringsTest test = new StringsTest();
        test.init();
        try{
            test.test();
            test.delete();
        }
        catch (AssertionError e){
            System.out.println("Testing error");
            test.delete();
            return;
        }
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Уведіть вхідну стрічку");
        String s = bf.readLine();
        ArrayList<String> masout = new ArrayList<String>();
        System.out.println(s);

        Strings strings = new Strings(s);


        for (int i = 1; i <= strings.getMas2().length; i++) {
            String out = "" ;

            for (int j = 0; j < strings.getMas2().length -i+1 ; j++) {
                if (j == strings.getMas2().length - i ) {
                    out += strings.getMas2()[j];
                } else {
                    out += strings.getMas2()[j] + strings.getSep();
                }

            }
            masout.add(out);
        }
        System.out.println("Результат роботи:");
        System.out.println(masout);
    }
}