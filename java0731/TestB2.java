import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class TestA {
 		public void methodA() throws IOException {
 		// ���Y�Ǩ�
 		}
 }
class TestB1 extends TestA {
 		public void methodA() throws FileNotFoundException {
		 //���Y�Ǩ�
 		}
 }
 public class TestB2 extends TestA {
	 public void methodA()  {
 		// ���Y�Ǩ�
 		}
 }
