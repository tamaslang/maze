package excelian.maze.explorer;

import excelian.maze.model.MazeCoordinate;
import excelian.maze.model.MazeStructure;

import java.util.List;
import java.util.Optional;

public interface Explorer {

    void moveForward();

    default void moveForward(int nrOfFields) {
        for (int i = 0; i < nrOfFields; i++) moveForward();
    }

    void turnLeft();

    void turnRight();

    void turnTo(ClockWiseDirection direction);

    default void moveTo(ClockWiseDirection direction) {
        turnTo(direction);
        moveForward();
    }

    List<ClockWiseDirection> getPossibleDirections();

    Optional<MazeStructure> whatsInFront();

    MazeStructure whatsAtMyLocation();

    List<MazeCoordinate> getMovement();

    ExplorerPosition getPosition();


}
