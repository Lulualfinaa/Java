public class PegawaiTest {
	public static void main(String[] args) {
		PegawaiTetap peg1 = new PegawaiTetap("00315", "Andri", "Jl. Batu 2, Jakarta", 'L', 43, "1", 3000000, 400000, new String[] {"Bella"});
		PegawaiHonorer peg2 = new PegawaiHonorer("01027", "Dewi", "Jl. Mangga 4, Bandung", 'P', 31, "2", 2000000, 500000, new String[] {"Leni", "Adi", "Novi"});
		PegawaiTetap peg3 = new PegawaiTetap("00310", "Lulu", "Jl. Suka-suka, Jakarta", 'P', 19, "1", 3000000, 500000, new String[] {"Yungyung", "Clay"});		

		//Tampilkan atribut peg1
		System.out.println("Pegawai 1 :");
		System.out.println("NIP : " + peg1.getNIP());
		System.out.println("Nama : " + peg1.getNama());
		System.out.println("Alamat : " + peg1.getAlamat());
		if(peg1.getJenisKelamin() == 'L')
         		System.out.println("Jenis Kelamin : Lak-laki");
		else if(peg1.getJenisKelamin() == 'P')
			System.out.println("Jenis Kelamin : Perempuan");
		else
			System.out.println("Jenis Kelamin : -");
		System.out.println("Umur : " + peg1.getUmur());
		System.out.println("Gaji Pokok : " + peg1.getGajiPokok());
		System.out.println("Tunjangan : " + peg1.getTunjangan());
		System.out.println("Total Gaji : " + (peg1.getGajiPokok() + peg1.getTunjangan()));
		System.out.println("Nama Anggota Keluarga : ");
		for(int i = 0; i < peg1.getNamaAnggotaKeluarga().length; i++)
			System.out.println((i + 1) + ". " + peg1.getNamaAnggotaKeluarga()[i]);
		
		//Tampilkan atribut peg2
		System.out.println("\n\nPegawai 2 :");
		System.out.println("NIP : " + peg2.getNIP());
		System.out.println("Nama : " + peg2.getNama());
		System.out.println("Alamat : " + peg2.getAlamat());
		if(peg2.getJenisKelamin() == 'L')
			System.out.println("Jenis Kelamin : Lak-laki");
		else if(peg2.getJenisKelamin() == 'P')
			System.out.println("Jenis Kelamin : Perempuan");
		else
			System.out.println("Jenis Kelamin : -");
		System.out.println("Umur : " + peg2.getUmur());
		System.out.println("Gaji Pokok : " + peg2.getGajiPokok());
		System.out.println("Tunjangan : " + peg2.getTunjangan());
		System.out.println("Total Gaji : " + (peg2.getGajiPokok() + peg2.getTunjangan()));
		System.out.println("Nama Anggota Keluarga : ");
		for(int i = 0; i < peg2.getNamaAnggotaKeluarga().length; i++)
			System.out.println((i + 1) + ". " + peg2.getNamaAnggotaKeluarga()[i]);
		
		//Tampilkan atribut peg3
		System.out.println("\n\nPegawai 3 :");
		System.out.println("NIP : " + peg3.getNIP());
		System.out.println("Nama : " + peg3.getNama());
		System.out.println("Alamat : " + peg3.getAlamat());
		if(peg3.getJenisKelamin() == 'L')
			System.out.println("Jenis Kelamin : Lak-laki");
		else if(peg3.getJenisKelamin() == 'P')
			System.out.println("Jenis Kelamin : Perempuan");
		else
			System.out.println("Jenis Kelamin : -");
		System.out.println("Umur : " + peg3.getUmur());
		System.out.println("Gaji Pokok : " + peg3.getGajiPokok());
		System.out.println("Tunjangan : " + peg3.getTunjangan());
		System.out.println("Total Gaji : " + (peg3.getGajiPokok() + peg3.getTunjangan()));
		System.out.println("Nama Anggota Keluarga : ");
		for(int i = 0; i < peg3.getNamaAnggotaKeluarga().length; i++)
			System.out.println((i + 1) + ". " + peg3.getNamaAnggotaKeluarga()[i]);
	}
}
