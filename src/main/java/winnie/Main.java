package winnie;

import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.Arrays;

/**\
    *@author Ksenia Kamyshanskaia
    *@version 1.0
*/
public class Main{
    public static void main(String [] args) throws IOException, ParseException {
        UserHandler userHandler = new UserHandler();
       // Arrays.asList("df,dfd,f,df,d,fd,f,".split(",")).forEach(a-> System.out.println(a));
        //String PATH = "../resources/file.csv";
        userHandler.handler();
    }
}
