
public class L3e1_CalcSerie {

	public static void main(String[] args) {
		float x = 1, s = 1;

		for (x = 2; x < 11; x++){
			
			if(x%2 == 0){
				s -= (x / (x*x));
			}else{
				s += (x / (x*x));
			}
		}
		
		System.out.println(s);

	}

}
