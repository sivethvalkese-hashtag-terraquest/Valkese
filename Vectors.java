public class Vectors {
    //this is the third achievement per ingame programmer, yes i scan ingame computercraft code. achieve all 3 and be gifted a badge, second is deep storage third is raytrace and this one is cos and sin
    public double X,Y,Z;
    public Vectors(double x,double y,double z) {
        X=x;Y=y;Z=z;
    }
    public Vectors[] variable;
    public void genLight(Vectors[] vecs) {
        variable= new Vectors[3];
        double var;
        vecs[1].subtract(vecs[0]);vecs[2].subtract(vecs[0]);
        var= vecs[0].angle(true,false,false);
        System.out.println(Double.toString(var));
        var= vecs[1].angle(true,false,false);
        System.out.println(Double.toString(var));
        var= vecs[2].angle(true,false,false);
        System.out.println(Double.toString(var));
    }
    public void subtract(Vectors vec) {
        X-=vec.X;Y-=vec.Y;Z-=vec.Z;
    }
    public double angle(boolean xy,boolean yz,boolean xz) {
        if(xy) {return Math.toDegrees(Math.atan2(Y,X));}
        if(yz) {return Math.toDegrees(Math.atan2(Z,X));}
        if(xz) {return Math.toDegrees(Math.atan2(Z,Y));}
        return Double.MIN_VALUE;//this is an error value
    }




    public double getRelationship() {
        double j= X,k= Y,l= Z;
        double valueX= j-X,valueY= k-Y,valueZ= l-Z,value=0;
        double variableX= Math.abs(valueX),variableY= Math.abs(valueY),variableZ= Math.abs(valueZ);
        boolean ex=(valueX>0),why=valueY>0,ze=valueZ>0;
        if(valueX>valueY&&valueX>valueZ) {value= valueX;}
        if(valueY>valueX&&valueY>valueZ) {value= valueY;}
        if(valueZ>valueY&&valueZ>valueX) {value= valueZ;}
        return value/1d;
    }
    public double getRelationship(Vectors comparison) {
        double j= comparison.X,k= comparison.Y,l= comparison.Z;
        double valueX= j-X,valueY= k-Y,valueZ= l-Z,value=0;
        double variableX= Math.abs(valueX),variableY= Math.abs(valueY),variableZ= Math.abs(valueZ);
        boolean ex=(valueX>0),why=valueY>0,ze=valueZ>0;
        if(valueX>valueY&&valueX>valueZ) {value= valueX;}
        if(valueY>valueX&&valueY>valueZ) {value= valueY;}
        if(valueZ>valueY&&valueZ>valueX) {value= valueZ;}
        double result=0;
        if(ex) {result= value/1d;}else {}
        if(why) {result= value/1d;}else {}
        if(ze) {result= value/1d;}else {}
        return result;
    }
    public Vectors getUnit() {
        double size= 1d/(Math.abs(X)+Math.abs(Y)+Math.abs(Z));
        return new Vectors(X * size, Y * size, Z * size);
    }
}
