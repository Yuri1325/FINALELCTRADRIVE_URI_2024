// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticHub;
import edu.wpi.first.wpilibj.PneumaticsControlModule;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsytem extends SubsystemBase {

  PneumaticHub pneumaticHub;
  DoubleSolenoid topSolenoid;
  DoubleSolenoid bottSolenoid;
  TalonFX intakeMotor;
  
  /** Creates a new IntakeSubsytem. */
  public IntakeSubsytem() {
    pneumaticHub = new PneumaticHub();
    pneumaticHub.enableCompressorAnalog(90,100);
    topSolenoid = pneumaticHub.makeDoubleSolenoid(2, 3);
    intakeMotor = new TalonFX(10,"rio");
  
    
  }
  public void setPistionsOut(){
    topSolenoid.set(Value.kReverse);
  }
  public void setIntakeMotor(double speed){
    intakeMotor.set(speed);
    
  }
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
