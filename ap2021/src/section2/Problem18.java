package section2;

import java.util.ArrayList;

public class Problem18 {

	public static void main(String[] args) {
		Screen s = new Screen(6,4);
		s.pixelOn(0, 0);
		s.pixelOn(0, 1);
		s.pixelOn(0, 2);
		s.pixelOn(1, 0);
		s.pixelOn(1, 1);
		s.pixelOn(1, 2);
		System.out.println(s);
		System.out.println(s.pixelAt(1, 1));
		System.out.println(s.pixelAt(2, 1));
	}

}

class Pixel {
	private int row;
	private int col;

	public Pixel(int r, int c) {
		row = r;
		col = c;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

	@Override
	public String toString() {
		return "Pixel(" + row + ", " + col + ")";
	}
	
	
}

class Screen
{
    private ArrayList<Pixel> data[];
	private int numCols, numRows;

    // postcondition: data is created with height elements;  
    // numColsis set to width 
    public Screen (int width, int height) 
    {/* to be implemented in part (a)*/ 
    	numCols= width;
    	numRows = height;
    	data = new ArrayList[height];
    	for (int k =0; k< height; k++) 
    		data[k] =new ArrayList<Pixel>(); 
    }

    // precondition: 0 <= row <= data.length-1; 
    // 0<= col c= numCols-1
    // postcondition: returns the pixel at the given row and col 
    // if it exists (black) or null if the pixel doesn’t exist (white) 
    public Pixel pixelAt (int row, int col) 
    { /* to be implemented in part (t>) */
    	ArrayList<Pixel> theRow = data [row];
    	for (Pixel p: theRow)
    	{
    		if(p.getCol() == col)
    			return p; 
    	}
    	return null;
    } 

    // precondition: 0 <= row<= data, length-1; 0 <= col numCols-1; 
    // the pixel at row,col does not exist in this Screen 
    // postcondition: adds the pixel at the given row and col so that pixels in a 
    // given row of data are in increasing column order 
    public void pixelOn (int row, int col)
    {/*to be implemented in part (c) */
    	Pixel newPxl = new Pixel (row, col);
    	ArrayList<Pixel> theRow = data [row];
    	int index = 0;
    	for (Pixel p: theRow)
    	{
    		if(col>p.getCol())
    			index++; 
    	}
    	data[row].add(index, newPxl);
    }

	@Override
	public String toString() {
		String result = "";
		for(int row=0; row<numRows;row++) {
			result += data[row] + "\n";
		}
		
		return result;
	}  

    // ... constructors, other methods, 
    // and other private data not shown 
    
} 
