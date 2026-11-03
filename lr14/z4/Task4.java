import java.io.*;

class Task4 {
    public static void main(String arg[]) throws Exception {

        OutputStream out = new FileOutputStream("water.txt");
        System.out.println("Введите 12 значений температуры воды:");
        for (int cnt = 0; cnt < 12; cnt++) {
            String s = "";
            int c;
            while ((c = System.in.read()) != '\n') {
                if (c != '\r') s = s + (char) c;
            }
            out.write((s + "\n").getBytes("UTF-8"));
        }
        out.close();

        InputStream in = new FileInputStream("water.txt");
        int iosize = in.available();
        byte arr[] = new byte[iosize];
        in.read(arr);
        in.close();

        String all = new String(arr, 0, arr.length, "UTF-8");
        double sum = 0;
        int count = 0;
        String cur = "";
        for (int i = 0; i < all.length(); i++) {
            char ch = all.charAt(i);
            if (ch != '\n') {
                cur = cur + ch;
            } else {
                if (cur.length() > 0) {
                    sum = sum + Double.parseDouble(cur);
                    count++;
                    cur = "";
                }
            }
        }
        if (cur.length() > 0) {
            sum = sum + Double.parseDouble(cur);
            count++;
        }
        System.out.println("Средняя температура воды: " + (sum / count));
    }
}