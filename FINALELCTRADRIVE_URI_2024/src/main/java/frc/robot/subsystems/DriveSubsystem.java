// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DriveSubsystem extends SubsystemBase {
  TalonFX bl,br,fl,fr;
  MotorControllerGroup g1;
  MotorControllerGroup g2;
  DifferentialDrive dd;

  /** Creates a new DriveSubsystem. */
  public DriveSubsystem() {
    bl = new TalonFX(1,"rio");
    br = new TalonFX(3,"rio");
    fl = new TalonFX(2,"rio");
    fr = new TalonFX(4,"rio");
    g1 = new MotorControllerGroup(bl,fl);
    g2= new MotorControllerGroup(br,fr);
    dd = new DifferentialDrive(g1, g2);
  }

    public void DiffDrive(double speed,double rotation){
      dd.arcadeDrive(speed,rotation,true);
    }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
