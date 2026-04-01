package firstPackage;

public class MobilePhone {
	
	String brandName;
	int modelNumber;
	double screenSizeInInches;
	int storageCapacity;
	String operatingSystem;
	boolean isCameraPresent;
	
	
	void makeCalls () {
		System.out.println("Making Calls from " + brandName+ " "+modelNumber);
	}
	void sendTextMessage() {
		System.out.println("Sending Text Message "+ brandName+" "+modelNumber);
		
	}
	void takePicture() {
		System.out.println("Taking Pictures "+ brandName+" "+modelNumber);
	}

}
