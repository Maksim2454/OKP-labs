import java.io.*;

class Task1 {
    public static void main(String arg[]) throws Exception {

        OutputStream out = new FileOutputStream("season.txt");
        String text = "Моё любимое время года - лето.";
        byte b[] = text.getBytes("UTF-8");
        out.write(b);
        out.close();

        File fileobj = new File("season.txt");
        System.out.println("Name of file: " + fileobj.getName());
        System.out.println("Size of file: " + fileobj.length() + " Bytes");
        System.out.println("Last modified: " + fileobj.lastModified());
        System.out.println("Parent: " + fileobj.getParent());
        System.out.println("Path: " + fileobj.getPath());
        System.out.println("Abs Path: " + fileobj.getAbsolutePath());

        if (fileobj.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not exist");
        }

        if (fileobj.canRead()) {
            System.out.println("can read");
        } else {
            System.out.println("can't read");
        }

        if (fileobj.canWrite()) {
            System.out.println("can write");
        } else {
            System.out.println("can't write");
        }

        if (fileobj.isDirectory()) {
            System.out.println("This is directory");
        } else {
            System.out.println("This is not directory");
        }

        if (fileobj.isFile()) {
            System.out.println("This is normal file");
        } else {
            System.out.println("This is a named pipe");
        }

        InputStream in = new FileInputStream("season.txt");
        int iosize = in.available();
        System.out.println("Available Bytes: " + iosize);
        byte all[] = new byte[iosize];
        in.read(all);
        System.out.print(new String(all, "UTF-8"));
        System.out.println();
        in.close();
    }
}