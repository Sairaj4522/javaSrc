package jcookb;

public class CheckForSwing{

	public static void main(String[] args){
		try{
			Class.forName("javax.swing.JButton");
			System.out.println("It worked!");
		} catch(ClassNotFoundException e){
			String failure = "Sorry, but this version MyApp needs \n"+
							 "a Java Runtime with JFC/Swing components\n" +
							 "having the final names (javax.swing.*)";

			//Better to make something appear in the GUI. Either a
			// JOptionPane, or: myPanel.add(new Label(failure));
			System.err.println(failure);
		}
		// No need to print anything here - the GUI should work...
	}	
}