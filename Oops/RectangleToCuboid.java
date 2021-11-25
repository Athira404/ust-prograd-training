class Rectangle {
    public double breadth, length;
    public double area(){
        return length * breadth;
    }
}
class Cuboid extends Rectangle{
    public double height;
    public double volume(){
        return area()*height;
    }
}
class RectangleToCuboid{
    public static void main(String[] args) {
        Cuboid cuboid = new Cuboid();
        cuboid.breadth = 4;
        cuboid.length = 5;
        cuboid.height = 2;
        System.out.println(cuboid.volume());
    }
}
