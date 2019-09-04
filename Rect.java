
/**
 * 여기에 Rec 클래스 설명을 작성하십시오.
 * 
 * @author (20183150013 최세원,2018315059 이와사키 메구미,) 
 * @version (2019.09.02)
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
