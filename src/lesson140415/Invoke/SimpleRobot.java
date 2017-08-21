package lesson140415.Invoke;

public class SimpleRobot implements Robot {
    @Override
    public void up() {
        System.out.println("up");
    }

    @Override
    public void down() {
        System.out.println("down");
    }

    @Override
    public void left() {
        System.out.println("left");
    }

    @Override
    public void right() {
        System.out.println("right");
    }

    @Override
    public void stop() {
        System.out.println("stop");
    }
}
