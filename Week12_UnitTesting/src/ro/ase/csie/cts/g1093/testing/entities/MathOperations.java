package ro.ase.csie.cts.g1093.testing.entities;

import ro.ase.csie.cts.g1093.testing.exceptions.DivisionByZeroException;

public class MathOperations {
	public static int add(int x, int y)
	{
		return x + y;
	}
	
	public static int divide(int x, int y) throws DivisionByZeroException
	{
		if (y == 0)
		{
			throw new DivisionByZeroException();
		}
		
		return x / y;
	}
}
