public class Rich17{

	public static int tensToCount(int n){
		if (n==0) return 0;
		if (n<10) return digitToCount(n);
		if (n==10) return 10;
		if (n==11|n==12) return 6; //eleven
		if (n==13) return 9;
		if (n==14) return 8;
		if (n==15) return 7;
		if (n==16) return 7;
		if (n==17) return 9;
		if (n==18) return 8;
		if (n==19) return 8;
		int ten = (n-n%10)/10;
		if (ten==2) return digitToCount(n%10) + 6;
		if (ten==3) return digitToCount(n%10) + 6;
		if (ten==4) return digitToCount(n%10) + 5;
		if (ten==5) return digitToCount(n%10) + 5;
		if (ten==6) return digitToCount(n%10) + 5;
		if (ten==7) return digitToCount(n%10) + 7;
		if (ten==8) return digitToCount(n%10) + 6;
		if (ten==9) return digitToCount(n%10) + 6;
		return -1;

	}

	public static int digitToCount(int n){
		if(n==1) return 3;
		if(n==2) return 3;
		if(n==3) return 5;
		if(n==4) return 4;
		if(n==5) return 4;
		if(n==6) return 3;
		if(n==7) return 5;
		if(n==8) return 8;
		if(n==9) return 4;
		return -1;
	}

	public static void main(String[] args) {
		int count=0;
		for (int i=1;i<=1000;i++){
			int curr = i;
			int tensAndOnes = curr%100;
			int hundreds = (curr%1000-curr%100)/100;
			int thousands = (curr%10000-curr%1000)/1000;
		}
	}
}