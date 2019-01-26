/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // Scale Factors
  public static double DRIVE_SCALE_FACTOR = 1.0;
  public static double TURN_SCALE_FACTOR = 1.0;

  // CAN Motor Controller Ports (Drivetrain)
	public static int leftFront = 2;
	public static int leftBack = 1;
	public static int rightFront = 3;
  public static int rightBack = 4;
  
  // also for Drivetrain
  public static boolean orientForward = false;

  // PWM Ports
  public static int elevatorPort = 0; // temporary
  public static int hatchSystemPort = 1; // temporary
  public static int pistonIn = 2; // temporary
  public static int pistonOut = 3; // temporary
  public static int stiltsPort = 4; // temporary
}
