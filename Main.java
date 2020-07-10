package brickBreaker;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame ob = new JFrame();
		ob.setBounds(350, 80, 700, 600); 
		ob.setTitle("Break Out Ball");
		ob.setResizable(false);
		ob.setVisible(true);
		ob.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Gameplay game = new Gameplay ();
		ob.add(game);
		

	}

}
                                