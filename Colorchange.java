package peyotesim;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Colorchange {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SwingUtilities.invokeLater(() -> {
	            JFrame frame = new JFrame("Peyote stitch design");
	            // this just makes a button that does whatever is in the action
             	//performed method
	            
             	//this is where all of the button stuff is
             	//between these 2 blocks of comments
	            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	            frame.add(new JPanel() {
	                public String coloryouwant;

					@Override
	                protected void paintComponent(Graphics g) {
	                    // Draw a rectangle using Rectangle2D class
	                    Graphics2D g2 = (Graphics2D) g;
	                    
	   
//	                    double x = 0;
//	                    double y = 0;
//	                    double width = 10;
//	                    double height = 10;
//	                    
//	                    
//	                    int z = -5;
//	                    int a = 10;
//	                    
	                    
	                    // this is a button for black, literally just copying this format for every
	                    //color and adjusting the frame is your next step
	                    JButton colorchoicebutton = new JButton("");
                     	colorchoicebutton.setBounds(500,0, 30,30); 
                     	colorchoicebutton.setBackground(Color.black);
                     
                     	colorchoicebutton.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "black";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                     	String yourcolor = coloryouwant;
                    	frame.add(colorchoicebutton); 
                    	//
                    	
                    	
                    	//this is a button for blue
                    	  JButton colorchoicebutton2 = new JButton("");
                       	colorchoicebutton2.setBounds(500,30, 30,30); 
                       	colorchoicebutton2.setBackground(Color.blue);
                     	colorchoicebutton2.setForeground(Color.blue);
                       
                       	colorchoicebutton2.addActionListener(new ActionListener() {

  							@Override
  							public void actionPerformed(ActionEvent e) {
  								// TODO Auto-generated method stub
  								 coloryouwant = "blue";
  								// coloryouwant is a field, meaning it can be used anywhere
  							}});
                      
                      	frame.add(colorchoicebutton2); 
                      	
                      //this is a button for red
                  	  JButton colorchoicebutton3 = new JButton("");
                     	colorchoicebutton3.setBounds(500,60, 30,30); 
                     	colorchoicebutton3.setBackground(Color.red);
                     
                     	colorchoicebutton3.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "red";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton3); 
                    	
                    	//this is a button for green
                  	  JButton colorchoicebutton4 = new JButton("");
                     	colorchoicebutton4.setBounds(500,90, 30,30); 
                     	colorchoicebutton4.setBackground(Color.green);
                     
                     	colorchoicebutton4.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "green";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton4); 
                    	//this is a button for yellow
                  	  JButton colorchoicebutton5 = new JButton("");
                     	colorchoicebutton5.setBounds(500,120, 30,30); 
                     	colorchoicebutton5.setBackground(Color.yellow);
                     
                     	colorchoicebutton5.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "yellow";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton5); 
                    	//this is a button for blue
                  	  JButton colorchoicebutton6 = new JButton("");
                     	colorchoicebutton6.setBounds(500,150, 30,30); 
                     	colorchoicebutton6.setBackground(Color.orange);
                     
                     	colorchoicebutton6.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "orange";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton6); 
                    	//this is a button for blue
                  	  JButton colorchoicebutton7 = new JButton("");
                     	colorchoicebutton7.setBounds(500,180, 30,30); 
                     	colorchoicebutton7.setBackground(Color.pink);
                     
                     	colorchoicebutton7.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "pink";
								// coloryouwant is a feild, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton7); 
                    	//this is a button for blue
                  	  JButton colorchoicebutton8 = new JButton("");
                     	colorchoicebutton8.setBounds(500,210, 30,30); 
                     	colorchoicebutton8.setBackground(Color.gray);
                     
                     	colorchoicebutton8.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "gray";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton8); 
                    	//this is a button for blue
                  	  JButton colorchoicebutton9 = new JButton("");
                     	colorchoicebutton9.setBounds(500,240, 30,30); 
                     	colorchoicebutton9.setBackground(Color.lightGray);
                     
                     	colorchoicebutton9.addActionListener(new ActionListener() {

							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 coloryouwant = "light_gray";
								// coloryouwant is a field, meaning it can be used anywhere
							}});
                    
                    	frame.add(colorchoicebutton9); 
                    	
                    	 JButton colorchoicebutton10 = new JButton("");
                      	colorchoicebutton10.setBounds(500,270, 30,30); 
                      	colorchoicebutton10.setBackground(Color.MAGENTA);
                      
                      	colorchoicebutton10.addActionListener(new ActionListener() {

 							@Override
 							public void actionPerformed(ActionEvent e) {
 								// TODO Auto-generated method stub
 								 coloryouwant = "magenta";
 								// coloryouwant is a feild, meaning it can be used anywhere
 							}});
                     
                     	frame.add(colorchoicebutton10); 
                     	
                     	 JButton colorchoicebutton11 = new JButton("");
                       	colorchoicebutton11.setBounds(500,300, 30,30); 
                       	colorchoicebutton11.setBackground(Color.cyan);
                       
                       	colorchoicebutton11.addActionListener(new ActionListener() {

  							@Override
  							public void actionPerformed(ActionEvent e) {
  								// TODO Auto-generated method stub
  								 coloryouwant = "cyan";
  								// coloryouwant is a feild, meaning it can be used anywhere
  							}});
                      
                      	frame.add(colorchoicebutton11); 
                      	
                      	 JButton colorchoicebutton12 = new JButton("");
                       	colorchoicebutton12.setBounds(500,330, 30,40); 
                       	colorchoicebutton12.setBackground(Color.white);
                       
                       	colorchoicebutton12.addActionListener(new ActionListener() {

  							@Override
  							public void actionPerformed(ActionEvent e) {
  								// TODO Auto-generated method stub
  								 coloryouwant = "white";
  								// coloryouwant is a feild, meaning it can be used anywhere
  							}});
                      
                      	frame.add(colorchoicebutton12); 
                      	
                      	//lets make a close button
                      	JButton closebutton = new JButton("save finished image to png file");
                     	closebutton.setBounds(0,0, 500,20); 
                     	closebutton.setBackground(Color.white);
                     	
                     
                     	closebutton.addActionListener(new ActionListener() {
//https://stackoverflow.com/questions/30335787/take-snapshot-of-full-jframe-and-jframe-only for reference to saving
							@Override
							public void actionPerformed(ActionEvent e) {
								// TODO Auto-generated method stub
								 BufferedImage image = new BufferedImage(540,400,  BufferedImage.TYPE_INT_RGB);
								 //creates an image out of the canvas
								frame.paint(image.getGraphics());
								//paints the actual file out of the image created
								File outputfile = null;
								
								JFileChooser fileChooser= new JFileChooser();
								
								int returnVal = fileChooser.showOpenDialog(frame);
								//shows the file path selecter
									    if ( returnVal == JFileChooser.APPROVE_OPTION) {
									    	outputfile = fileChooser.getSelectedFile();
									    	//selects the image file that we wanna save to and saves it to outputfile
									        try {
												 ImageIO.write(image, "png", outputfile);
												 //saves that file to wherever
												JOptionPane.showMessageDialog(null, "PNG Saved");
												//pops up a nice message in a frame
											} catch (IOException e1) {
												System.out.println("it didnt save");
											}
									    }
							
							}});
                     	// This is literally all you have to do to choose where to save a file
                     	frame.add(closebutton);

//                      	
               //just add more colors and fix the overlapping graphics now, probably add saving too,
                    	//other than that you should be good
	       
//	                for(y = 0; y<400; y =y +20)  { 
//	                   for(x = -5; x < 500; x = x +10) {
//	                    g2.draw(new Rectangle2D.Double(x, y, width, height));
//	                	
//	                   }
//	                }
	                {
		            	 
	    	            for(int y1 = 0;y1<400; y1 =y1 +20) {
	    	                   for(int x1 = -5; x1<500; x1 = x1 +10) {
	    	                  
	    	                  JButton button = new JButton("");
	    	                  
	    	                   	 
	    	                 
	    	                    	button.setContentAreaFilled(true);
	    	                    	button.setOpaque(true);
	    	                    	button.setBorderPainted(true);
	    	                    	
	    	                    	button.setBounds(x1, y1, 10, 10);
	    	                    	
	    	                    	//starting point
	    	                    	
	    	                    	button.addActionListener(new ActionListener() {
	    	                            @Override
	    	                            public void actionPerformed(ActionEvent e) {
	    	                            	
	    	                            	
	    	                         
//	    	                          
	    	                            	
	    	                            	
//	    	                              Scanner scanner = new Scanner(System.in);
//	    	                              System.out.println("what color do you want");
//	    	                              String enteredtext = scanner.nextLine();
	    	                              if(coloryouwant.equals(null))
	    	                              {
	    	                            	  System.out.println("enter a color");
	    	                              }
	    	                             if(coloryouwant.equals("blue")) {
	    	                            	
	    	                            	button.setBackground(Color.BLUE);  
	    	                            	button.setForeground(Color.BLUE);
	    	                            	System.out.println("success");
	    	                             }
	    	                             if(coloryouwant.equals("red")) {
		    	                            	
		    	                            	button.setBackground(Color.RED);  
		    	                            	button.setForeground(Color.RED);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("green")) {
		    	                            	
		    	                            	button.setBackground(Color.GREEN);  
		    	                            	button.setForeground(Color.GREEN);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("yellow")) {
		    	                            	
		    	                            	button.setBackground(Color.YELLOW);  
		    	                            	button.setForeground(Color.YELLOW);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("black")) {
		    	                            	
		    	                            	button.setBackground(Color.BLACK);  
		    	                            	button.setForeground(Color.BLACK);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("cyan")) {
		    	                            	
		    	                            	button.setBackground(Color.cyan);  
		    	                            	button.setForeground(Color.cyan);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("orange")) {
		    	                            	
		    	                            	button.setBackground(Color.ORANGE);  
		    	                            	button.setForeground(Color.ORANGE);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("pink")) {
		    	                            	
		    	                            	button.setBackground(Color.PINK);  
		    	                            	button.setForeground(Color.PINK);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("gray")) {
		    	                            	
		    	                            	button.setBackground(Color.GRAY);  
		    	                            	button.setForeground(Color.GRAY);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("light_gray")) {
		    	                            	
		    	                            	button.setBackground(Color.LIGHT_GRAY);  
		    	                            	button.setForeground(Color.LIGHT_GRAY);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("magenta")) {
		    	                            	
		    	                            	button.setBackground(Color.MAGENTA);  
		    	                            	button.setForeground(Color.MAGENTA);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("white")) {
		    	                            	
		    	                            	button.setBackground(Color.white);  
		    	                            	button.setForeground(Color.white);
		    	                            	System.out.println("success");
		    	                             }
	    	                            }
	    	                    	
	    	                        });
	    	                    	
	    	                    	frame.add(button);
	    	                    	
	    	                   
	    	                   }
	    	                }
	    	            }
	                
	                
//	                for(a = 10; a<400; a =a +20) {
//	                   for(z = 0; z<500; z = z +10) {
//	                   g2.draw(new Rectangle2D.Double(z, a, width, height));
//	                   }
//	                }
////	                 
	                {
		            	 
	    	            for(int a1 = 10; a1<400; a1 =a1 +20) {
	    	                   for(int z1 = 0; z1<500; z1 = z1 +10) {
	    	                  
	    	                  JButton button = new JButton("");
	    	                   	 
	    	                 
	    	                    	button.setContentAreaFilled(true);
	    	                    	button.setOpaque(true);
	    	                    	button.setBorderPainted(true);
	    	                    	
	    	                    	
	    	                    	button.setBounds(z1, a1, 10, 10);
	    	                    	//starting point
	    	                    	
	    	                    	button.addActionListener(new ActionListener() {
	    	                            @Override
	    	                            public void actionPerformed(ActionEvent e) {
	    	                            	
//	    	                              Scanner scanner = new Scanner(System.in);
//	    	                              System.out.println("what color do you want");
//	    	                              String enteredtext = scanner.nextLine();
	    	                             if(coloryouwant.equals(null)) {
	    	                            	 System.out.println("enter a color");
	    	                             }
	    	                              
	    	                             if(coloryouwant.equals("blue")) {
	    	                            	
	    	                            	button.setBackground(Color.BLUE);  
	    	                            	button.setForeground(Color.BLUE);
	    	                            	System.out.println("success");	    	                            		    	                           
	    	                             }
	    	                             if(coloryouwant.equals("red")) {
		    	                            	
		    	                            	button.setBackground(Color.RED);  
		    	                            	button.setForeground(Color.RED);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("green")) {
		    	                            	
		    	                            	button.setBackground(Color.GREEN);  
		    	                            	button.setForeground(Color.GREEN);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("yellow")) {
		    	                            	
		    	                            	button.setBackground(Color.YELLOW);  
		    	                            	button.setForeground(Color.YELLOW);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("white")) {
		    	                            	
		    	                            	button.setBackground(Color.white);  
		    	                            	button.setForeground(Color.white);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("cyan")) {
		    	                            	
		    	                            	button.setBackground(Color.cyan);  
		    	                            	button.setForeground(Color.cyan);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("magenta")) {
		    	                            	
		    	                            	button.setBackground(Color.MAGENTA);  
		    	                            	button.setForeground(Color.MAGENTA);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("black")) {
		    	                            	
		    	                            	button.setBackground(Color.BLACK);  
		    	                            	button.setForeground(Color.BLACK);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("orange")) {
		    	                            	
		    	                            	button.setBackground(Color.ORANGE);  
		    	                            	button.setForeground(Color.ORANGE);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("pink")) {
		    	                            	
		    	                            	button.setBackground(Color.PINK);  
		    	                            	button.setForeground(Color.PINK);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("gray")) {
		    	                            	
		    	                            	button.setBackground(Color.GRAY);  
		    	                            	button.setForeground(Color.GRAY);
		    	                            	System.out.println("success");
		    	                             }
	    	                             if(coloryouwant.equals("light_gray")) {
		    	                            	
		    	                            	button.setBackground(Color.LIGHT_GRAY);  
		    	                            	button.setForeground(Color.LIGHT_GRAY);
		    	                            	System.out.println("success");
		    	                             }
	    	                            
	    	                            }
	    	                    	
	    	                        });
	    	                    	
	    	                    	frame.add(button);
	    	                    	
	    	                   
	    	                   }
	    	                }
	    	            }
	                }
	            }, BorderLayout.CENTER);

	            frame.pack();
	            frame.setSize(new Dimension(540, 400));
	            frame.setVisible(true);
	            
	            
	            
	        
	    
		 });
		 
	}
	

}
//class Tile {
//    private int x, y, width, height;
//    private Color color;
//
//    public Tile(int x, int y, int width, int height, Color color) {
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//        this.color = color;
//    }
//
//    public void paint(Graphics g) {
//       g.setColor(color);
//        g.fillRect(x, y, width, height);
//    }
//}



