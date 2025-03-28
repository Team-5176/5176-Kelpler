/*
// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import com.revrobotics.spark.SparkBase;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.AlgaeSubsystem;
// import frc.robot.subsystems.testArm;
import frc.robot.subsystems.ElevatorSubsystem;


// You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands
public class SetAlgaeAngle extends Command {
  // Creates a new SetCoralAngle.
  private AlgaeSubsystem algae;
  private double algaeAngle;

  //public SetAlgaeAngle() {
    // Use addRequirements() here to declare subsystem dependencies.
  //}
  
  public SetAlgaeAngle(AlgaeSubsystem algaeSubsystem, double algaeAngle) {
    this.algae = algaeSubsystem;
    this.algaeAngle = algaeAngle;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(algae);
  }
    
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    algae.angleController.setReference(algaeAngle, SparkBase.ControlType.kPosition);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
*/