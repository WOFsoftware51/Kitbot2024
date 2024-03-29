// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Amp;

public class AmpPlatformBackwardsCommand extends Command {
  /** Creates a new AmpPlatformCommand. */
  public Amp m_amp;
  public AmpPlatformBackwardsCommand(Amp amp) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.m_amp = amp;
    addRequirements(m_amp);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_amp.platformBackwards();
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    m_amp.platformOff();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
