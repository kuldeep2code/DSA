package practicequestion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class URs {

     URL showWebsite(URL url){
        String[] web = url.toString().split("[.]",3);
        System.out.println(web[1]);
        return url;
    }

    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {

        URs  read = new URs();

        File file = new File("files/urls");
        Scanner sc = new Scanner(new FileReader(file));

        String textUrl = sc.nextLine();
        URL url = new URL("https://" + textUrl);
        System.out.println(url);
//        String st =textUrl.replace("www.","");
//        String st1 = st.replace(".com","");
//        System.out.println(st1);

        read.showWebsite(url);


    }
}
