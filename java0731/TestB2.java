import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class TestA {
 		public void methodA() throws IOException {
 		// 做某些事
 		}
 }
class TestB1 extends TestA {
 		public void methodA() throws FileNotFoundException {
		 //做某些事
 		}
 }
 public class TestB2 extends TestA {
	 public void methodA()  {
 		// 做某些事
 		}
 }
