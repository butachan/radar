package objetsGraphics2D;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GrilleAvancée extends JFrame {
	
	  public GrilleAvancée(){
		    
		  	MonVehicule Moi = new MonVehicule();
		  	this.setTitle("detecteur");
		    this.setSize(1300, 1160);
		    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   
		    this.setLocationRelativeTo(null);
		    
		    
//		    PointerInfo pinfo = MouseInfo.getPointerInfo();
//		    java.awt.Point p = pinfo.getLocation();
		    
		    	//Invoked when the mouse exits a component.
		    //On crée nos différents conteneurs de couleur différente
		    JPanel cell1 = new JPanel();
		    cell1.setBackground(Color.YELLOW);
		    cell1.setPreferredSize(new Dimension(200, 240));		
		    JPanel cell2 = new JPanel();
		    cell2.setBackground(Color.red);
		    cell2.setPreferredSize(new Dimension(200, 240));
		    JPanel cell3 = new JPanel();
		    cell3.setBackground(Color.green);
		    cell3.setPreferredSize(new Dimension(200, 240));
		    JPanel cell4 = new JPanel();
		    cell4.setBackground(Color.black);
		    cell4.setPreferredSize(new Dimension(200, 240));
		    JPanel cell5 = new JPanel();
		    cell5.setBackground(Color.MAGENTA);
		    //ajout d'un rectangle dans 
		    //cell5.add(new MonVehicule());
		    cell5.setPreferredSize(new Dimension(200, 240));
		    JPanel cell6 = new JPanel();
		    cell6.setBackground(Color.BLUE);
		    cell6.setPreferredSize(new Dimension(200, 240));
		    JPanel cell7 = new JPanel();
		    cell7.setBackground(Color.orange);
		    cell7.setPreferredSize(new Dimension(200, 240));
		    JPanel cell8 = new JPanel();
		    cell8.setBackground(Color.DARK_GRAY);
		    cell8.setPreferredSize(new Dimension(200, 240));
		    JPanel cell9 = new JPanel();
		    cell9.setBackground(Color.PINK);
		    cell9.setPreferredSize(new Dimension(200, 240));
		    
		    JPanel content2 = new JPanel();
		    content2.setPreferredSize(new Dimension(1300, 1120));
				
		    //Le conteneur principal
		    JPanel content = new JPanel();
		    content.setPreferredSize(new Dimension(1300, 1120));
		    content.setBackground(Color.WHITE);
		    //On définit le layout manager
		    content.setLayout(new GridBagLayout());
				
		    //L'objet servant à positionner les composants
		    GridBagConstraints gbc = new GridBagConstraints();
			
		    
		    //On positionne la case de départ du composant
		    gbc.gridx = 0;
		    gbc.gridy = 0;
		    gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell1, gbc);
		    
		    //---------------------------------------------
		    gbc.gridx = 1;
		    content.add(cell2, gbc);
		    //---------------------------------------------
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    gbc.gridx = 2;
		    content.add(cell3, gbc);	
		    //---------------------------------------------		 	
		    gbc.gridx = 0;
		    gbc.gridy = 1;
		    gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell4, gbc);
		    
		    //---------------------------------------------
		   
		/*
		 * //Celle-ci indique que la cellule se réplique de façon verticale gbc.fill =
		 * GridBagConstraints.VERTICAL;
		 */	gbc.gridx = 1;
		 	gbc.gridy = 1;
		 	gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell5, gbc);
		    content.add(Moi, gbc);
		    //---------------------------------------------
		    gbc.gridwidth = GridBagConstraints.REMAINDER;
		    gbc.gridx = 2;
		    content.add(cell6, gbc);
		    //---------------------------------------------
		    gbc.gridx = 0;
		 	gbc.gridy = 2;
		 	gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell7, gbc);
		    //---------------------------------------------
		    gbc.gridx = 1;
		 	gbc.gridy = 2;
		    gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell8, gbc);
		    //---------------------------------------------
		    gbc.gridx = 2;
		 	gbc.gridy = 2;
		    gbc.gridheight = 1;
		    gbc.gridwidth = 1;
		    content.add(cell9,gbc);
		    
		    //On ajoute le conteneur
		    
		    this.setContentPane(content);
		  
		    this.setVisible(true);		
		    
		   // System.out.println(p);
		  }
	  
	  public class clicSouris implements MouseListener{

			@Override
			public void mouseClicked(MouseEvent evt) {
				int x = (int) (evt.getX()+evt.getComponent().getLocation().getX());
				int y = (int) (evt.getX()+evt.getComponent().getLocation().getY());
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			  
		  }
}
