package J07053_XetTuyen;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class J07053 {
 public static void main(String[] args) throws FileNotFoundException, ParseException {
	Scanner sc = new Scanner(new File("XETTUYEN.in"));
	int test = Integer.parseInt(sc.nextLine());
	ArrayList<ThiSinh> arr = new ArrayList<ThiSinh>();
	while(test-- > 0) {
		String name = sc.nextLine();
		String dateOfBirth = sc.nextLine();
		double theory = Double.parseDouble(sc.nextLine());
		double practice = Double.parseDouble(sc.nextLine());
		ThiSinh ts = new ThiSinh(name, dateOfBirth, theory, practice);
		arr.add(ts);
	}
	
	for(ThiSinh ts : arr) {
		System.out.println(ts);
	}
}
}