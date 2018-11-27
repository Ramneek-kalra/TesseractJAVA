import java.io.*;

public class TesseractJAVA {
    public static void main(String[] args) throws Exception {
        for(int i=0; i<=99; i++){
            ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", "/c", "cd \"C:\\Users\\kalra\\Desktop\\UDS3463834\" && tesseract UAE0b505"+i+".gif "+i);
            builder.redirectErrorStream(true);    
            Process p = builder.start();
            BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String line;
            while (true) {
                line = r.readLine();
                if (line == null) { break; }
                System.out.println(line);
            }
        }
    }
}