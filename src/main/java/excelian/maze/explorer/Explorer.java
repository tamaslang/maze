package excelian.maze.explorer;

import excelian.maze.model.MazeCoordinate;
import excelian.maze.model.MazeStructure;

import java.util.List;
import java.util.Optional;

public interface Explorer {

	void moveForward();

	void turnLeft();

	void turnRight();

	List<ClockWiseDirection> getPossibleDirections();

    Optional<MazeStructure> whatsInFront();

    MazeStructure whereAmI();

	List<MazeCoordinate> getMovement();

    ExplorerLocation getLocation();


}