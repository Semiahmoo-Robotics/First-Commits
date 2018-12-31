/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 Zhan-Zhan's version of acrade driving
 */
public class Robot extends TimedRobot {
  private DifferentialDrive m_myRobot;
  private Joystick m_xSpeed;
  private Joystick m_zRotation;

  @Override
  public void robotInit() {
    m_myRobot = new DifferentialDrive(new Spark(0), new Spark(1));
    m_xSpeed = new Joystick(0);
    m_zRotation = new Joystick(1);
  }

  @Override
  public void teleopPeriodic() {
    m_myRobot.arcadeDrive(m_xSpeed.getY(), m_zRotation.getX());
  }
}
