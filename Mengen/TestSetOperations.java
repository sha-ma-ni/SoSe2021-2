package Mengen;

public class TestSetOperations {

		public static void main(String[] args) {
			SetOperations sOperations = new SetOperations();
			sOperations.fill();
			
			sOperations.fillBothUnion();
			sOperations.print();
			sOperations.fillBothIntersection();
			sOperations.print();
			sOperations.fillBothDifference();
			sOperations.print();
	}
}
