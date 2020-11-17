public class Path {
    private String p;

    @Override
    public String toString() {
        return p;
    }

    public boolean isFile() {
        return !this.isDir();
    }

    public boolean isDir() {
        if (this.p.endsWith("/")) {
            return true;
        }
        return false;
    }

    public String fileName() {
        if (this.isDir()) {
            return "";
        }
        String[] reszek = this.p.split("/");
        return reszek[reszek.length - 1];
    }

    public String fileExt() {
        if (this.isDir()) {
            return "";
        }
        String[] reszek = this.p.split("/");
        String[] tmp = reszek[reszek.length - 1].split("\\.");
        return "." + tmp[tmp.length - 1];
    }

    public Path(String path) {
        this.p = path;
    }
}
