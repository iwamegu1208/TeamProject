
/**
 * 인터페이스입니다.
 *
 * @author (20183150013 최세원,2018315059 이와사키 메구미,)
 * @version (2019.09.02)
 */
public interface Shape
{
    final double PI = 3.14;
    void draw();
    double getArea();
    default public void redraw(){
        System.out.print("___ 다시 그립니다. ");
        draw();
    }
}
