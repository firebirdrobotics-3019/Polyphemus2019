/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.*;
import frc.robot.*;

public class ElevatorSystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

    static Talon elevator;

    public ElevatorSystem(){

        elevator = new Talon(RobotMap.elevatorPort);    
    
    }

    @Override
    public void initDefaultCommand() {
        setDefaultCommand(new MoveElevator());
    }
}

