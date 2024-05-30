package src.main.java.Core.OOP_et_packages;

/*
На игровом поле находится робот. Позиция робота на поле описывается двумя целочисленным координатами: X и Y.
Ось X смотрит слева направо, ось Y — снизу вверх. Вспомни, как рисовал графики функций в школе.

В начальный момент робот находится в некоторой позиции на поле. Также известно, куда робот смотрит: вверх, вниз,
направо или налево. Ваша задача — привести робота в заданную точку игрового поля.

Робот описывается классом Robot. Вы можете пользоваться следующими его методами (реализация тебе неизвестна):

Пример:

В метод передано: toX == 3, toY == 0; начальное состояние робота такое: robot.getX() == 0, robot.getY() == 0,
robot.getDirection() == Direction.UP

Чтобы привести робота в указанную точку (3, 0), метод должен вызвать у робота следующие методы:
robot.turnRight()
robot.stepForward();
robot.stepForward();
robot.stepForward();

Требования:

1. должен быть метод public static void moveRobot(Robot robot, int toX, int toY)

2. метод moveRobot должен переместить робота в позицию int toX, int toY
 */
public class task218 {

    public static void main(String[] args) {
        int toX = 8;
        int toY = 5;
        task218 robo = new task218();
        robo.moveRobot(robo, toX, toY);
        System.out.println("");
        System.out.println("другой робот");
        int toX1 = 2;
        int toY1 = 1;
        task218 robo1 = new task218();
        robo.moveRobot(robo1, toX1, toY1);

    }

    public static void moveRobot(task218 robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();
        var nowDir = Direction.UP;
        if (deltaX < 0) { // движение влево
            if (nowDir == Direction.UP) {   // один поворот робота
                robot.turnLeft();
                nowDir = Direction.LEFT;
            } else if (nowDir == Direction.DOWN) {
                robot.turnRight();
                nowDir = Direction.LEFT;
            }

            for (int i = 0; i > deltaX; i -= 1) {
                robot.stepForward();
            }
        } else if (deltaX > 0) { // движение вправо
            if (nowDir == Direction.UP) {   // один поворот робота
                robot.turnRight();
                nowDir = Direction.RIGHT;
            } else if (nowDir == Direction.DOWN) {
                robot.turnLeft();
                nowDir = Direction.RIGHT;
            }
            for (int i = 0; i < deltaX; i += 1) {
                robot.stepForward();
            }
        }

        if (deltaY < 0) { // движение вниз
            if (nowDir == Direction.LEFT) {   // один поворот робота
                robot.turnLeft();
                nowDir = Direction.DOWN;
            } else if (nowDir == Direction.RIGHT) {
                robot.turnRight();
                nowDir = Direction.DOWN;
            }

            for (int i = 0; i > deltaY; i -= 1) {
                robot.stepForward();
            }
        } else if (deltaY > 0) { // движение вверх
            if (nowDir == Direction.LEFT) {   // один поворот робота
                robot.turnRight();
                nowDir = Direction.UP;
            } else if (nowDir == Direction.RIGHT) {
                robot.turnLeft();
                nowDir = Direction.UP;
            }
            for (int i = 0; i < deltaY; i += 1) {
                robot.stepForward();
            }
        }

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection(Object direc) {
        return direc;
    }

    public int getX() {
        int x = 5;
        return x;
        // текущая координата X
    }

    public int getY() {
        int y = 5;
        return y;
        // текущая координата Y
    }

    public void turnLeft() {
        System.out.println("повернуться на 90 градусов против часовой стрелки");
    }

    public void turnRight() {
        System.out.println("повернуться на 90 градусов по часовой стрелке");
    }

    public void stepForward() {
        System.out.println("шаг в направлении взгляда");
    }

}
