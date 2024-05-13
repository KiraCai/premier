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

robot.turnRight();

robot.stepForward();

robot.stepForward();

robot.stepForward();

Требования:

1. должен быть метод public static void moveRobot(Robot robot, int toX, int toY)

2. метод moveRobot должен переместить робота в позицию int toX, int toY
 */
public class task218 {

    public static void main(String[] args) {
        int toX = 3;
        int toY = 0;
        task218 robo = new task218();
        task218.moveRobot(robo, toX, toY);
        robo.getX();
        robo.getY();
        robo.getDirection();

    }

    public static void moveRobot(task218 robot, int toX, int toY) {
        int deltaX = toX - robot.getX();
        int deltaY = toY - robot.getY();
        if (deltaX > 0){
            robot.stepForward();
            // идем по этому направлению
        }
        if (deltaY > 0) {
            robot.stepForward();
            // идем по этому направлению
        }

    }

    public enum Direction {
        UP,
        DOWN,
        LEFT,
        RIGHT
    }

    public Direction getDirection() {
           var nowDir = Direction.UP;
           return nowDir;
        }

    public int getX() {
         int x = 0;
         return x;
            // текущая координата X
        }

        public int getY() {
         int y = 0;
         return y;
            // текущая координата Y
        }

        public void turnLeft() {
            // повернуться на 90 градусов против часовой стрелки
        }
        public void turnRight() {
            // повернуться на 90 градусов по часовой стрелке
        }

    public void stepForward() {
        // шаг в направлении взгляда
        // за один шаг робот изменяет одну свою координату на единицу
    }

}
