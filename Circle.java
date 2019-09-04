
/**
 * Circle의 반지름과 면적을 출력해주는 클래스입니다
 * 
 * @author (20183150013 최세원,2018315059 이와사키 메구미,2017315056 이토 아야카) 
 * @version (2019.09.04)
 */
public class Circle implements Shape{
    int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double getArea(){
        return PI * radius * radius; 
    }
    public void draw(){
        System.out.println("반지름이" + radius + "인" + "원입니다.");
    }
}
