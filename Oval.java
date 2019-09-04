
/**
 * Oval의 반지름과 면적을 출력해주는 클래스입니다.
 * 
 * @author (20183150013 최세원,2018315059 이와사키 메구미,) 
 * @version (2019.09.02)
 */
public class Oval implements Shape{
    private double x,y;
    public Oval(double x , double y)
    {
        this.x = x;
        this.y = y;
    }

    public void draw()
    {
        System.out.println( this.x + "x" + this.y +"에 내접하는 타원입니다.");
    }

    public double getArea()
    {
        return  PI * this.x*this.y;
    }
}
