public class TampilkanWaktu{
	public static void main(String[] args){
		int detik, menit, jam, sisa1,sisa2;
		detik = 6000;
	
		jam = detik/3600;
		sisa1 = detik%3600;
		
		menit = (int) sisa1/60;
		sisa2 = sisa1%60;
		
		System.out.println(+ detik + " Detik = " + jam + " Jam : " + menit + " Menit : " + sisa2 + " Detik");
	}
}