public class Vector{
    double Vx;
    double Vy;
    double Vz;
    public Vector(double x,double y,double z){
        Vx = x;
        Vy = y;
        Vz = z;
    }
    public double X(){
        return Vx;
    }
    public double Y(){
        return Vy;
    }
    public double Z(){
        return Vz;
    }

    public String toString() {
        return"<" + Vx + ", " + Vy + ", " + Vz + ">";

    }

    //Vector Methods:

    //Cross Product
    public static Vector CrossProduct(Vector v, Vector w){
        double Px,Py,Pz;
        Px = (v.Y() * w.Z())-(v.Z() * w.Y());
        Py = -1*( (v.X() * w.Z())-(v.Z() * w.X()) );
        Pz = (v.X() * w.Y())-(v.Y() * w.X());

        Vector retVec = new Vector(Px,Py,Pz);
        return retVec;
    }



}