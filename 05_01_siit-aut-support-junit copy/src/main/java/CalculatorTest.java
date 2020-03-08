import org.junit.Assert;

import org.junit.Test;


public class CalculatorTest {

	    
	    	 
	         @Test
	    	 public void testAdditionInteger() {
	    		 
	    		 Calculator calc = new Calculator ();
	    		 
	    		 double result = calc.compute(4 , 5 , "+");
	    				 
	    		 Assert.assertEquals("The integers were not added correctly", 9, result, 0);	
	         
	         }
	         
	                 
	    		@Test
		    	 public void testAdditionOfPozitiveAndNegativeNumbers() {
		    		 
		    		 Calculator calc = new Calculator ();
	    		
	    		     double result = calc.compute(-6 , 0 , "+");
	    		
	    		     Assert.assertEquals("The integers were not added correctly", -6 , result, 0);	
	    		}
	    		    
	    		   
	    		@Test
		    	 public void testAdditionOfPozitiveAndNegativeDoubleNumbers() {
		    		 
		    		 Calculator calc = new Calculator ();
		    		 
                     double result = calc.compute(-10.32 , 2 , "+");
	    		 
	    		     Assert.assertEquals("The integers were not added correctly", -8.32, result, 0);	
	    		 
	    	 }
	    		@Test
		    	 public void testDividePozitiveNumbers() {
		    		 
		    		 Calculator calc = new Calculator ();
		    		 
                    double result = calc.compute(56 , 2 , "/");
	    		
	    		    Assert.assertEquals("The integers were not divided correctly", 28, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testDivideNegativeNumbers() {
		    		 
		    	   Calculator calc = new Calculator ();
		    		 
                   double result = calc.compute(-60 , -2 , "/");
	    		
	    		   Assert.assertEquals("The integers were not divided correctly", 30, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testDividePozitiveDoubleNumbers() {
		    		 
		    		 Calculator calc = new Calculator ();
		    		 
                   double result = calc.compute(56.8 , 2.3 , "/");
	    		
	    		    Assert.assertEquals("The integers were not divided correctly", 24.69, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testDivideNegativeDoubleNumbers() {
		    		 
		    		 Calculator calc = new Calculator ();
		    		 
                  double result = calc.compute(-56.8 , -2 , "/");
	    		
	    		    Assert.assertEquals("The integers were not divided correctly", 28.4, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testMultiplicationInteger() {
		    		 
		    	   Calculator calc = new Calculator ();
		    		 
                  double result = calc.compute(455 , 2 , "*");
	    		
	    		   Assert.assertEquals("The integers were not multiplied correctly", 910, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testMultiplicationDouble() {
		    		 
		    	   Calculator calc = new Calculator ();
		    		 
                 double result = calc.compute(45.55 , 2 , "*");
	    		
	    		   Assert.assertEquals("The integers were not multiplied correctly", 91.1, result, 0);
	    		
	    		}
	    		
	    		@Test(expected = IllegalArgumentException.class)
		    	 public void testInvalidOperator() {
		    		 
		    	   Calculator calc = new Calculator ();
		    		 
                double result = calc.compute(45.55 , 2 , "#");
	    		
	    		   Assert.assertEquals("The integers were not multiplied correctly", 91.1, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testDividedByZero() {
		    		 
		    	   Calculator calc = new Calculator ();
		    		 
               double result = calc.compute(45.55 , 0 , "/");
	    		
	    		   Assert.assertEquals("The integers were not divided correctly", 91.1, result, 0);
	    		
	    		}
	    		
	    		@Test
		    	 public void testSquareRoot() {
		    		 
		    	   		    		 
              double result = Math.sqrt(9);
	    		
	    		   Assert.assertEquals("The integer was not extracted correctly", 3, result, 0);
	    		}
	    		   
	    		   @Test
			    	 public void testSquareRoot2() {
			    		 
			         double result = Math.sqrt(56);
		    		
		    		   Assert.assertEquals("The integer was not extracted correctly", 25, result, 0);
	    		
	    		}
	     }

