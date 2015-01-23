package org.usfirst.frc.team1923.robot;

import org.usfirst.frc.team1923.robot.commands.*;

import org.usfirst.frc.team1923.util.XboxController;

import edu.wpi.first.wpilibj.Joystick;
//import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public Joystick leftStick;
    public Joystick rightStick;
    public JoystickButton start;
    public JoystickButton a;
    public JoystickButton b;
    public JoystickButton x;
    public JoystickButton y;
    public JoystickButton lB;
    public JoystickButton rB;
    public JoystickButton back;
    public JoystickButton leftClick;
    public JoystickButton rightClick;
    public Joystick xboxController;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        rightStick = new Joystick(2);
        leftStick = new Joystick(1);
        xboxController = new XboxController(3);
        
        //Components.robotDrive.drive(Components.leftStick.getCoalescedY(), Components.rightStick.getCoalescedY());
        // Create XBOX buttons
        rightClick = new JoystickButton(xboxController, 10);
        
        leftClick = new JoystickButton(xboxController, 9);
        
        back = new JoystickButton(xboxController, 7);
        
        rB = new JoystickButton(xboxController, 6);
        
        lB = new JoystickButton(xboxController, 5);
        
        
        x = new JoystickButton(xboxController, 3);
        
        b = new JoystickButton(xboxController, 2);
        
        a = new JoystickButton(xboxController, 1);
        
        start = new JoystickButton(xboxController, 8);
        
        // Assign commands to buttons
	    //a.whileHeld(new ElevatorUpCommand());
        //b.whileHeld(new ElevatorDownCommand());
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getleftStick() {
        return leftStick;
    }

    public Joystick getrightStick() {
        return rightStick;
    }

    public Joystick getXboxController() {
        return xboxController;
    }
}

