package calculatorTests;

import fit.ColumnFixture;

public class Addition extends ColumnFixture{

	    int num1;
		int num2;
		int result;
		public int getNum1() {
			return num1;
		}
		public void setNum1(int num1) {
			this.num1 = num1;
		}
		public int getNum2() {
			return num2;
		}
		public void setNum2(int num2) {
			this.num2 = num2;
		}
		public int getResult() {
			return result;
		}
		public void setResult(int result) {
			this.result = result;
		}
		

		public int add() {
			
			result=num1+num2;
			return result;
		}
		
		
		
	}


