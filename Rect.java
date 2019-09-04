
/**
 * Rect의 반지름과 면적을 출력해주는 클래스입니다.
 * 
 * @author (20183150013 최세원,2018315059 이와사키 메구미,2017315056 이토 아야카) 
 * @version (2019.09.04)
 */
public class Rect implements Shape{
    private int x,y;
    public Rect(int x, int y)
    {
        this.x=x;
        this.y=y;
    }

    public void draw()
    {
        System.out.println(this.x+","+this.y+"크기의 사각형입니다.");
    }

    public double getArea()
    {
        return this.x*this.y;
    }
}
