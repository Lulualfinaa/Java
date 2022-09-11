public class PegawaiTetap extends Pegawai{
	int tambahan = 250000;
	PegawaiTetap(){
		super();
		setGajiPokok();
		
	}
	
	PegawaiTetap(String NIP, String nama, 
			String alamat, char jenisKelamin, 
			int umur){
		super(NIP, nama, alamat, jenisKelamin, umur);
		setGajiPokok();
      	
	}
	
	PegawaiTetap(String NIP, String nama, 
			String alamat, char jenisKelamin, 
			int umur, String kodeAgama, 
			float gajiPokok, float tunjangan, 
			String [] namaAnggotaKeluarga){
		super(NIP, nama, alamat, jenisKelamin, 
			umur, kodeAgama, gajiPokok, 
			tunjangan, namaAnggotaKeluarga);
		setGajiPokok();
		
	}
	
	void setGajiPokok() {
		//Pegawai tetap mendapatkan gaji pokok 3000000
		this.gajiPokok = 3000000;
	}
	
	
}
