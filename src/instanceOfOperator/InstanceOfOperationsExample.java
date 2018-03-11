package instanceOfOperator;

class InstanceOfOperationExample1 {
}

public class InstanceOfOperationsExample extends InstanceOfOperationExample1 {
	public static void main(String args[]) {

		InstanceOfOperationExample1 a = new InstanceOfOperationsExample();
		boolean result = a instanceof InstanceOfOperationsExample;
		System.out.println(result);
	}

}
