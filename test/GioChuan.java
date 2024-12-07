package Bai27;

public class GioChuan {
	private String maGV;
	private String maMon;
	private double gio;
	
	public GioChuan() {
		this.maGV = "";
		this.maMon = "";
		this.gio = 0;
	}
	
	public GioChuan(String maGV, String maMon, double gio) {
		
		this.maGV = maGV;
		this.maMon = maMon;
		this.gio = gio;
		
	}
	
	public double getGio() {
		return this.gio;
	}
	
	
	
	
	
}
