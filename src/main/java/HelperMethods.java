
public class HelperMethods {

	public static void main(String[] args) {
		  String str1 = "Jammu and Kashmir";
		  String str2 = "Jammu & Kashmir";
		  String[] ignore = {" and "," & "};
          System.out.println(compareString(str1, str2, ignore));
          
          System.out.println("================================");
          double d1 = 10.325640;
          System.out.println(getStrNmbrWithNDigitAfterDecimal(d1,3));
          double d2 = 10;
          System.out.println(getStrNmbrWithNDigitAfterDecimal(d2,3));
	}
	public static boolean compareString(String st1,String st2, String[] ignore){
		for(String s: ignore){
			st1 = st1.replaceAll(s," ");
			st2 = st2.replaceAll(s," ");
		}
	System.out.println("String1 = "+st1+"\nString2 = "+st2);	
	return st1.equals(st2);
	}
	  public static String getStrNmbrWithNDigitAfterDecimal(double number, int digitAfterDecimal){
	        String num = String.valueOf(number);
	        if(!num.contains(".")){
	            num = num+".";
	        }
	        int decimalIndex = num.indexOf('.') +1;
	        int d = num.length() - decimalIndex;
	        for(int i=1;i<=digitAfterDecimal-d;i++){
	            num= num+"0";
	        }
	        return num.substring(0,decimalIndex+digitAfterDecimal);
	    }
	
}
