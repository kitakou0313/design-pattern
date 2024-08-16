package Prototype.shapes;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle() {
    }

    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Rectangle) || !super.equals(object)){
            return false;
        }
        Rectangle targetShape = (Rectangle) object;
        return targetShape.width == width && targetShape.height == height;
    }
}
