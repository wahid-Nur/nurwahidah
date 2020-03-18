public class Data{
    public String Nama, Nim, Jurusan, Fakultas;

  Data(){
	Nama     = "Nurwahidah";
	Nim      = "13020180108";
	Jurusan  = "Teknik Informatika";
	Fakultas = "Fakultas Ilmu Komputer";
    }

    public static void main(String[] kalimat) {
        Data Mahasiswa = new Data();
        System.out.println("Nama 	: " + Mahasiswa.Nama);
        System.out.println("Stambuk 	: " + Mahasiswa.Nim);
	System.out.println("Jurusan 	: " + Mahasiswa.Jurusan);
	System.out.println("Fakultas 	: " + Mahasiswa.Fakultas);
    }
}
