import java.io.*;

class Task3 {
    public static void main(String arg[]) throws Exception {

        OutputStream f = new FileOutputStream("f.txt");
        for (int cnt = 0; cnt < 20; cnt++) {
            int x = (int) (Math.random() * 100);
            f.write((x + "\n").getBytes("UTF-8"));
        }
        f.close();

        InputStream in = new FileInputStream("f.txt");
        int iosize = in.available();
        byte arr[] = new byte[iosize];
        in.read(arr);
        in.close();

        String all = new String(arr, 0, arr.length, "UTF-8");
        OutputStream g = new FileOutputStream("g.txt");
        OutputStream h = new FileOutputStream("h.txt");

        String cur = "";
        for (int i = 0; i < all.length(); i++) {
            char ch = all.charAt(i);
            if (ch != '\n') {
                cur = cur + ch;
            } else {
                if (cur.length() > 0) {
                    int x = Integer.parseInt(cur);
                    if (x % 2 == 0 && x % 3 == 0) {
                        g.write((cur + "\n").getBytes("UTF-8"));
                    } else {
                        h.write((cur + "\n").getBytes("UTF-8"));
                    }
                    cur = "";
                }
            }
        }
        if (cur.length() > 0) {
            int x = Integer.parseInt(cur);
            if (x % 2 == 0 && x % 3 == 0) {
                g.write((cur + "\n").getBytes("UTF-8"));
            } else {
                h.write((cur + "\n").getBytes("UTF-8"));
            }
        }
        g.close();
        h.close();
        System.out.println("Готово");
    }
}