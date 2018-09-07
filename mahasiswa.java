class Mahasiswa{
	private int NPM;
	private String nama;
	
	public Mahasiswa(int nPM, String nama) {
		super();
		NPM = nPM;
		this.nama = nama;
	}
	
	public int getNPM() {
		return NPM;
	}
	
	public void setNPM(int nPM) {
		NPM = nPM;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
}