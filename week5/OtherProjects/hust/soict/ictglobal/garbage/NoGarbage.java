package week5.OtherProjects.hust.soict.ictglobal.garbage;

import java.io.File;
import java.io.FileReader;

public class NoGarbage {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader(new File("garbage.txt"));
        int i = 0;
        long cnt = 0;
        String result = "";
        long start = System.currentTimeMillis();
        StringBuffer sb = new StringBuffer();
        while((i = fr.read()) != -1) {
            sb.append((char)i);
            cnt ++;
        }
        result = sb.toString();
        System.out.println(System.currentTimeMillis() - start);
        System.out.println("Total " + cnt + " words");
    }
}
