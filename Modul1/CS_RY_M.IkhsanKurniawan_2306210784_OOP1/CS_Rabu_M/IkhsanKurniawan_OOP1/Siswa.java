package CS_Rabu_M.IkhsanKurniawan_OOP1;


public class Siswa
{
    public String nama;
    public int id;
    public String status;
    public float totalNilai;
    public MataPelajaran mataPelajaran;
    
    public Siswa(String nama,int id, MataPelajaran mataPelajaran){
        this.nama = nama;
        this.id = id;
        this.mataPelajaran = mataPelajaran;
    }
    
    public void totalNilai(){
        this.totalNilai = ((40 * mataPelajaran.nilaiUTS)/100) + ((60 * mataPelajaran.nilaiUTS)/100);
        if(totalNilai >= 75){
            status = "LULUS";
        }else{
            status = "TIDAK LULUS";
        }
    }
    
    public void showDetail(){
        System.out.println("Nama Siswa: " + nama);
        System.out.println("ID: " + id);
        System.out.println("Mata Pelajaran: " + mataPelajaran);
        System.out.println("Total Nilai: " + totalNilai);
        System.out.println("Status: " + status);
    }
}
