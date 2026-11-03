import java.io.*;

class Task5 {
    public static void main(String arg[]) throws Exception {

        OutputStream out = new FileOutputStream("f.txt");
        int mas[] = {10, 30, 25, 40, 5, 26, 100, 7, 25, 50};
        for (int cnt = 0; cnt < 10; cnt++) {
            out.write((mas[cnt] + "\n").getBytes("UTF-8"));
        }
        out.close();

        InputStream in = new FileInputStream("f.txt");
        int iosize = in.available();
        byte arr[] = new byte[iosize];
        in.read(arr);
        in.close();

        String all = new String(arr, 0, arr.length, "UTF-8");
        int count = 0;
        String cur = "";
        for (int i = 0; i < all.length(); i++) {
            char ch = all.charAt(i);
            if (ch != '\n') {
                cur = cur + ch;
            } else {
                if (cur.length() > 0) {
                    int x = Integer.parseInt(cur);
                    if (x > 25) {
                        count++;
                    }
                    cur = "";
                }
            }
        }
        if (cur.length() > 0) {
            int x = Integer.parseInt(cur);
            if (x > 25) {
                count++;
            }
        }
        System.out.println("Количество чисел, больших 25: " + count);
    }
}