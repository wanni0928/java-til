package homework.day07;
import java.util.Arrays;

/**
 * 아래 테스트 코드가 정상 동작하도록 클래스들을 완성하시오.
 *
 * getArea(): 사각형의 넓이를 반환한다.
 * getCenterOfMass(): 사각형의 질량중심을 반환한다.
 * GetAllPoints(): 사각형의 네 점을 배열로 반환한다.
 * rot90(): Pivot을 기준으로 사각형을 90도 회전시킨다.
 */

class Vector2D {
    public float x, y;

    public Vector2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        // write codes here
        return "(" + this.x + ", " + this.y +")";
    }
}

class RectCore {
    protected Vector2D pos;
    protected float w, h;

    public RectCore(float x, float y, float w, float h) {
        this.pos = new Vector2D(x, y);
        this.w = w;
        this.h = h;
    }

    public String toString() {
        // write codes here
        return "RECTCORE";
    }
}

public class Rect extends RectCore {
    public Rect(float x, float y, float w, float h) {
        super(x, y, w, h);
    }

    public float getArea() {
        return this.w * this.h;
    }

    public Vector2D getCenterOfMass() {
        return new Vector2D( this.w/2 + this.pos.x, this.h/2 + this.pos.y);
    }

    public Vector2D [] getAllPoints() {
        return new Vector2D[]{
            new Vector2D(super.pos.x, super.pos.y),
            new Vector2D(super.pos.x + super.w, super.pos.y),
            new Vector2D(super.pos.x + super.w, super.pos.y + super.h),
            new Vector2D(super.pos.x, super.pos.y + super.h)

        };
    }

    /**
     * @param pivot : 회전의 기준점 baseX, baseY
     *  | cos90 -sin90 | |x - baseX|    |baseX|
     *  |              | |         | +  |     |
     *  | sin90  cos90 | |y - baseY|    |baseY|
     *
     *  x -> cos90 * (x - baseX) + (-sin90 * (y - baaseY)) +base X
     *  y -> sin90 * (x - baseX) + (cons90 * (y - baseY)) + baseY
     */

    public void rot90(Vector2D pivot) {
        this.pos.x = (float) (Math.cos(Math.PI / 2) * (this.pos.x - pivot.x)  + (-Math.sin(Math.PI / 2) * (this.pos.y - pivot.y)) + pivot.x);
        this.pos.y = (float) (Math.sin(Math.PI / 2) * (this.pos.x - pivot.x) + Math.cos(Math.PI / 2) * (this.pos.y - pivot.y) + pivot.y);
        float temp = this.w;
        this.w = this.h;
        this.h = temp;
    }

    public String toString() {
        return String.format("(%f, %f) w : %f, h: %f", this.pos.x, this.pos.y, this.w, this.h);
    }
}

class RectTest {
    public static void main(String[] args) {
        Rect rect = new Rect(0.5f, 0.7f, 1.5f, 2.3f);
        System.out.println("Area: " + rect.getArea());
        System.out.println("CoM: " + rect.getCenterOfMass());
        System.out.println("All Points: " + Arrays.toString(rect.getAllPoints()));

        rect.rot90(new Vector2D(0.4f, 0.2f));
        System.out.println("Rotated rect: " + rect);
        System.out.println(Arrays.toString(rect.getAllPoints()));
        System.out.println("Area: " + rect.getArea());
        // test after rotate
//        System.out.println("Area: " + rect.getArea());
//        System.out.println("CoM: " + rect.getCenterOfMass());
//        System.out.println("All Points: " + Arrays.toString(rect.getAllPoints()));
    }
}
