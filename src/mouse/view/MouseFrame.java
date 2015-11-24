package mouse.view;

import mouse.controller.MouseController;
import javax.swing.JFrame;

public class MouseFrame extends JFrame
{
	private MousePanel basePanel;
	
	public MouseFrame(MouseController baseController)
	{
		basePanel = new MousePanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setTitle("Mouse App");
		this.setSize(500,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setContentPane(basePanel);
		this.setVisible(true);
	}

}
