import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class tee extends JFrame{
	
	private JButton leftButton;
	private JButton centerButton;
	private JButton rightButton;
	private FlowLayout myLayout;
	private Container myContainer;
	
	public tee(){
		super("Flowlayout Program");
		myLayout = new FlowLayout();
		myContainer = getContentPane();
		setLayout(myLayout);
		
		//left stuff in here
		leftButton = new JButton("left");
		add(leftButton);
		leftButton.addActionListener(
			new ActionListener(){
				public void actionPerformed(ActionEvent event){
				myLayout.setAlignment(FlowLayout.LEFT);
				myLayout.layoutContainer(myContainer);
				
				}
			}
		);		
		                                                                                                        
		//center stuff in here
				centerButton = new JButton("center");
				add(centerButton);
				centerButton.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent event){
						myLayout.setAlignment(FlowLayout.CENTER);
						myLayout.layoutContainer(myContainer);
						
						}
					}
				);
				
				//right stuff in here
				rightButton = new JButton("right");
				add(rightButton);
				rightButton.addActionListener(
					new ActionListener(){
						public void actionPerformed(ActionEvent event){
						myLayout.setAlignment(FlowLayout.RIGHT);
						myLayout.layoutContainer(myContainer);
						
						}
					}
				);	
		
		
	setSize(300,100);
	setVisible(true);
	}
	}
