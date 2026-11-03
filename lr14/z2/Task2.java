import java.io.*;

class Task2 {
    public static void main(String arg[]) throws Exception {

        OutputStream out = new FileOutputStream("f.txt");
        System.out.println("Введите 10 целых чисел:");
        for (int cnt = 0; cnt < 10; cnt++) {
            String s = "";
            int c;
            while ((c = System.in.read()) != '\n') {
                if (c != '\r') s = s + (char) c;
            }
            out.write((s + "\n").getBytes("UTF-8"));
        }
        out.close();

        InputStream in = new FileInputStream("f.txt");
        int iosize = in.available();
        byte arr[] = new byte[iosize];
        in.read(arr);
        in.close();

        String all = new String(arr, 0, arr.length, "UTF-8");
        System.out.println("--- Числа из файла ---");
        String cur = "";
        int count = 0;
        for (int i = 0; i < all.length(); i++) {
            char ch = all.charAt(i);
            if (ch != '\n') {
                cur = cur + ch;
            } else {
                if (cur.length() > 0) {
                    System.out.println(cur);
                    if (cur.indexOf('7') != -1) {
                        count++;
                    }
                    cur = "";
                }
            }
        }
        if (cur.length() > 0) {
            System.out.println(cur);
            if (cur.indexOf('7') != -1) {
                count++;
            }
        }
        System.out.println("Количество чисел, содержащих цифру 7: " + count);
    }
}