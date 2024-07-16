
public class SwitchEx {

	public static void main(String[] args) {
		int num = 1;
		
		switch (num) {
		case 1:
			System.out.println("1입니다.");
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("디폴트입니다.");
			System.out.println("디폴트입니다.");
		}
		
		int season = 10;
		
		switch(season){
		case 3,4,5:
			System.out.println("봄");
			break;
		case 6,7,8:
			System.out.println("여름");
			break;
		case 9,10,11:
			System.out.println("가을");
			break;
		case 12,1,2:
			System.out.println("겨울");
			break;
		default:
			System.out.println("1~12에서 벗어난 수 입니다.");
		}
		
		int month = 8;
        
        if(month == 3 || month == 4 || month == 5){
        	System.out.println("봄");
        }else if(month == 6 || month == 7 || month == 8){
        	System.out.println("여름");
        }else if(month == 9 || month == 10 || month == 11){
        	System.out.println("가을");
        }else if(month == 12 || month == 1 || month == 2){
        	System.out.println("겨울");
        }else{
        	System.out.println("1~12에서 벗어난 수 입니다.");
        }
	}

}
