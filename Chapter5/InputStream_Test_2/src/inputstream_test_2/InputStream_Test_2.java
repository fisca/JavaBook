package inputstream_test_2;

import java.io.*;

public class InputStream_Test_2 {

    public static void main(String[] args) throws IOException {
        String input;
        try {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("ป้อนข้อความที่นี่ >>> ");
            input = stdin.readLine();
            System.out.println("ข้อความของท่านคือ " + input);
        } catch (IOException e) {
            System.out.print(e);
        }
    }

}
