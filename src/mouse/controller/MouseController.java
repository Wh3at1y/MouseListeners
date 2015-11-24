package mouse.controller;

import mouse.view.MouseFrame;

public class MouseController
{
	private MouseFrame baseFrame;
	
	public MouseController()
	{
		baseFrame = new MouseFrame(this);
	}
	
	public void start(){}
	
	public MouseFrame getBaseFrame()
	{
		return baseFrame;
	}
}
