package ZadaniaZjourney.OOP.Zadanie1;

public class Point3D extends Point2D{

    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }


    public float[] getXYZ(){
        float[] coordinates3d = new float[]{super.getX(),super.getY(),this.z};
        return coordinates3d;
    }

    public void setXYZ(float x, float y, float z){
        this.setXY(x,y);
        this.z=z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x=" + super.getX() +
                "y=" + super.getY() +
                "z=" + z +
                '}';
    }
}
