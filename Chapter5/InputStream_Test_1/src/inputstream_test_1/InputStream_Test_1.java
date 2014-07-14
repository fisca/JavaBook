package inputstream_test_1;

import java.io.*;

public class InputStream_Test_1 {

    public static void main(String[] args) throws IOException {
        String input;
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ป้อนข้อความที่นี่ >>> ");
        input = stdin.readLine();
        System.out.println("ข้อความของท่านคือ " + input);
    }

}
