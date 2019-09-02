
/**
 * Write a description of interface Shape here.
 *
 * @author (20183150013 최세원)
 * @version (2019.09.02)
 */
public interface Shape
{
    final double PL = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("___ 다시 그립니다. ");
        draw();
    }
}
