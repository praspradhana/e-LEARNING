public class induk { // ini adalah  class induk
	int a = 8; //ini variabel a dengan tipe data integer
	public void info (){
		System.out.println("Ini Class Induk"); // ini print dari class induk
	}
}

class anak extends induk { // ini class turunan dari class induk
	int a = 16; // ini variabel a dengan tipe data integer di class turunan
	public void info () {
	System.out.println("Ini Class Anak"); 
	}
}
 class cek { // ini clas untuk mebuat program utama
	public static void main(String args[]){  // ini program utama 
	induk cek = new anak(); // ini adalah pembuatan objek cek dari class induk  yang pemanggilan nya dari class anak
	System.out.println("Nilai a = " +cek.a); //ini adalah untuk menampilkan variabel yang ada di class induk
	cek.info();
	}
}