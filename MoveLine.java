public class MoveLine {

    public static <T extends Point2D> void movePointStart(Line<T> line) {
        T start = line.getStart();
        start.setX(start.getX() + 10);
        line.setStart(start);
    }
}
