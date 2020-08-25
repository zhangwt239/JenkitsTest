package MockitoTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

public class schoolTest {
 
	private School mockSchool;
	private mySchool nuaa;
	@Before
	public void setUp() throws Exception {
		mockSchool = mock(School.class);
		String change = "welcome!";
	    when(mockSchool.returnSchool()).thenReturn(change);
	    nuaa = new mySchool(mockSchool);
	}
	
	@Test
	public void returnSchoolNuaa(){
		assertEquals("Hello world", nuaa.testMehtod());
	}
}