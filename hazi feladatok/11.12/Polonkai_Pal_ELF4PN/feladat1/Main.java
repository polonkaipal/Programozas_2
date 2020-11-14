public class Main {
    public static void main(String[] args) {
        Path f1 = new Path("/home/pisti/text/cucc.txt");
        Path d1 = new Path("/usr/bin/");

        // hívás elvárt kimenet
        // ----- --------------
        System.out.println(f1); // /home/pisti/text/cucc.txt
        System.out.println(d1); // /usr/bin/
        System.out.println(f1.isFile()); // true
        System.out.println(f1.isDir()); // false
        System.out.println(d1.isFile()); // false
        System.out.println(d1.isDir()); // true
        System.out.println(f1.fileName()); // cucc.txt
        System.out.println(d1.fileName()); // (üres sztring)
        System.out.println(f1.fileExt()); // .txt
        System.out.println(d1.fileExt()); // (üres sztring)

    }
}
