package Bai27;

public class GiangVien {
	private String maGV;
	private String tenGV;
	private double gc;
	
	public GiangVien(String maGV, String tenGV) {
		this.maGV = maGV;
		this.tenGV = tenGV;
		this.gc = 0;
	}
	
	public void congGc(double gc) {
		this.gc += gc;
	}
	
	
	
	@Override
	public String toString() {
		return tenGV + " " + String.format("%.2f", gc);
	}

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public void setTenGV(String tenGV) {
        this.tenGV = tenGV;
    }
	
	
	
	
}
