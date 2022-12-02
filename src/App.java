import data.Biodata;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello,This is My First Java Programs");
        System.out.println("++++++++++++++++++++++++++++++++++++");

        // Memanggil method bioData dengan atribut public
        Biodata biodata = new Biodata();
        biodata.bioData(args);

        // Memanggil method dengan atribut static tanpa harus membuat object baru
        data.Array.arr(args);
        data.Sorting.srt(args);

    }
}
