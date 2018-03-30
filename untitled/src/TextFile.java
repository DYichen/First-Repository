import java.io.*;

public class TextFile {
    public static String read(String filepath){
        StringBuilder str=new StringBuilder();
        BufferedReader in=null;

        try {
            in=new BufferedReader(new InputStreamReader(new FileInputStream(filepath),"UTF-8"));
            String s;
            try {
                while((s = in.readLine())!= null){
                    str.append(s+"\n");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return str.toString();
    }
}
