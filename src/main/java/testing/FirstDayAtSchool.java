package testing;

import java.util.Arrays;

public class FirstDayAtSchool {

	public String[] prepareMyBag(){
		String[] schoolBag ={"Books", "Notebooks", "Pens" };
		System.out.println("My school bag contains: " + Arrays.toString(schoolBag));
		return schoolBag;
	}

	public String[] addPencils(){
		String[] schoolBag = {"Books", "Notebooks", "Pens", "Pencils"};
		System.out.println("Now my school bag contains: " + Arrays.toString(schoolBag));
		
		return schoolBag;
	}
}