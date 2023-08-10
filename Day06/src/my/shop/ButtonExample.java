package my.shop;

public class ButtonExample {

	public static void main(String[] args) {
		
		// Button 객체 생성
		Button btnOK = new Button();
		
		class OKListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
			
		}
		
		btnOK.setClickListener(new OKListener());
		btnOK.click();
		
		Button btncancel = new Button();
		
		class CencelListener implements Button.ClickListener {

			@Override
			public void onClick() {
				System.out.println("Cencel 버튼을 클릭했습니다.");
			}
			
		}
		
		btncancel.setClickListener(new CencelListener());
		btncancel.click();

	}

}
