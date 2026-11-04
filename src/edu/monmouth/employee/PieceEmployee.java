package edu.monmouth.employee;

public class PieceEmployee implements Employee{
	private int ratePerPiece;
	private int piecesMade;
	
	public PieceEmployee(int ratePerPiece)
	{
		this.ratePerPiece = ratePerPiece;
	}
	
	public int getMonthlyPay()
	{
		return ratePerPiece * piecesMade;
	}
	
	public void setPiecesMade(int c)
	{
		piecesMade = c;
	}
	
	@Override
	public boolean equals(Object o)
	{
		if(this == o)
		{
			return true;
		}
		if(o == null || getClass() != o.getClass())
		{
		return false;
		}
		PieceEmployee e = (PieceEmployee) o;
		 return ratePerPiece == e.ratePerPiece && piecesMade == e.piecesMade;
		}

	@Override
	public String toString() 
	{
	    return "Rate Per Piece: " + ratePerPiece + " Pieces Made: " + piecesMade + "";
	}
}
