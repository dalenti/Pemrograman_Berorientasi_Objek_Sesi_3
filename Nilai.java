
public class Nilai {
     String nama, nim, grade;
    int nilai;

    Nilai(String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
        setGrade();

    }


    public void setGrade(){
        if(getNilai() >= 80 && getNilai() <= 100){
            SetGrade("A");
        }

        else if(getNilai() >= 70 && getNilai() < 80){
            SetGrade("B");
        }

        else if((getNilai() >= 60 && getNilai() < 70)){
            SetGrade("C");
        }

        else if((getNilai() >= 50 && getNilai() < 60)){
            SetGrade("D");
        }
        else if((getNilai() < 50)){
            SetGrade("E");
        }
        else{
            SetGrade("Input nilai anda salah");
        }
    }

    public void SetGrade(String grade){
        this.grade = grade;
    }

    public String getGrade(){
        return this.grade;
    }


    public void DataMahasiswa(){
        System.out.println("NIM     : " + getNIM());
        System.out.println("NAMA    : " + getNama());
        System.out.println("NILAI   : " + getNilai());
        System.out.println("GRADE   : " + getGrade());
        System.out.println("========================================");
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return nim;
    }

    public int getNilai() {
        return nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIM(String nim) {
        this.nim = nim;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
}
