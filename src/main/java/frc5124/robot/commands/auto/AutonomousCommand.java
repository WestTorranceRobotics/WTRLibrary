package frc5124.robot.commands.auto;

import java.util.Set;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Subsystem;
import frc5124.robot.subsystems.CanDriveTrain;

public class AutonomousCommand implements Command {

    private final CanDriveTrain driveTrain;

    public AutonomousCommand(CanDriveTrain subsystem) {
        driveTrain = subsystem;
    }

    // Called just before this Command runs the first time
    @Override
    public void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    @Override
    public void execute() {
        // driveTrain.noDrive();
    }

    // Make this return true when this Command no longer needs to run execute()
    @Override
    public boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    @Override
    public void end(boolean interrupted) {
    }

    @Override
    public Set<Subsystem> getRequirements() {
        return Set.of();
    }
}
