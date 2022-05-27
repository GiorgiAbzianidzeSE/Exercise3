package tbc.course.tasks;

public class Rectangle {

    private float height;
    private float weight;

    public void setHeight(float height){
        this.height = height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    protected double perimeterCalculator(){
        return (this.weight + this.height) * 2;
    }

    public int compareArea(Rectangle rectangle1 , Rectangle rectangle2){
        if(rectangle1.perimeterCalculator() == rectangle2.perimeterCalculator()) return 0;
        return rectangle1.perimeterCalculator() > rectangle2.perimeterCalculator() ? 1 : -1;
    }
}
