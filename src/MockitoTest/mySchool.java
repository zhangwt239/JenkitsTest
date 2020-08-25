package MockitoTest;

public class mySchool {
	private School school;
	
	public mySchool(School name){
		this.school = name;
	}
	
	public String testMehtod(){
		return school.returnSchool();
	}
}
