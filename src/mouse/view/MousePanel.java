package mouse.view;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

import mouse.controller.MouseController;

public class MousePanel extends JPanel
{
	private MouseController baseController;
	private MouseFrame baseFrame;
	private SpringLayout baseLayout;
	private JButton sizeSmall;
	private JButton sizeMedium;
	private JButton sizeReset;
	private JTextField text1;
	
	public MousePanel(MouseController baseController)
	{
		this.baseController = baseController;
		
		baseLayout = new SpringLayout();
		
		text1 = new JTextField("A lot of words are entered in here.");
		
		
		sizeSmall = new JButton("400, 300");
		
		
		sizeMedium = new JButton("600, 500");
		
		

		sizeReset = new JButton("Default Size");
		
		

		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setSize(500, 300);
		this.add(text1);
		this.add(sizeSmall);
		this.add(sizeMedium);
		this.add(sizeReset);
	}

	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.SOUTH, sizeReset, -6, SpringLayout.NORTH, sizeMedium);
		baseLayout.putConstraint(SpringLayout.WEST, sizeReset, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, sizeMedium, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sizeMedium, -6, SpringLayout.NORTH, sizeSmall);
		baseLayout.putConstraint(SpringLayout.WEST, sizeSmall, 10, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, sizeSmall, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.NORTH, text1, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, text1, -10, SpringLayout.EAST, this);
	}
	
	private void setupListeners()
	{
		sizeSmall.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseFrame = baseController.getBaseFrame();
				baseFrame.setSize(400, 300);
			}
		});
		
		sizeMedium.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseFrame = baseController.getBaseFrame();
				baseFrame.setSize(600, 500);
				
			}
		});
		
		sizeReset.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				baseFrame = baseController.getBaseFrame();
				baseFrame.setSize(500, 300);
			}
		});
	}
}
