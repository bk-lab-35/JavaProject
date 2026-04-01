package firstPackage;

public class MobileMain {

	public static void main(String[] args) {
		
		//Instantiating a Class
		MobilePhone iPhone = new MobilePhone();
		
		//Assigning values to the variables
		iPhone.brandName= "iPhone";
		iPhone.modelNumber = 12;
		iPhone.screenSizeInInches = 6.1;
		iPhone.isCameraPresent = true;
		
		//Calling the method or invoking the method
		iPhone.makeCalls();
		iPhone.sendTextMessage();
		iPhone.takePicture();
		
		System.out.println("*******************************");
		
		//Instantiating a Class
		MobilePhone samsung = new MobilePhone();
		samsung.brandName = "Samsung";
		samsung.modelNumber = 22;
		
		samsung.makeCalls();
		samsung.sendTextMessage();
		samsung.takePicture();
		
	}

}
