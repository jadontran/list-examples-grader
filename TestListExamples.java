import static org.junit.Assert.*;
import org.junit.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class TestListExamples {
  // Write your grading tests here!

  class Checker implements StringChecker {
 	 boolean checkString(String s) { 
	 	if ((s.contains("A")) || (s.contains("a"))) {
			return true;
		}
		else {
			return false;
		}
  } 
  @Test
  public void filterTest() {
    List<String> test = new ArrayList<>();

  }

  @Test
  public void mergeTest() {
    List<String> test = Arrays.asList();


  }

}
}
