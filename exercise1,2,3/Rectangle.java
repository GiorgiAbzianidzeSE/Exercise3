//პაკეტი:
package ge.ufc.exercises;

public class Rectangle {

    private float height;
    private float weight;

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return this.height;
    }

    public void setWeight(float weight){
        this.weight = weight;
    }

    public float getWeight(){
        return this.weight;
    }

    //final ვინაიდან ამ მეთოდის იერარქიულობა შეიზღუდოს და მხოლოდ პაკეტში ჩანდეს( კარგი ხერხია რომ ჩავანაცვლოთ default წვდომის მოდიფიკატორი)
    protected final double perimeterCalculator(){
        return (this.weight + this.height) * 2;
    }

    protected final double areaCalculator(){
        return this.height * this.weight;
    }

    public int compareTo(Rectangle rectangle){
        if(rectangle.areaCalculator() == this.areaCalculator() || rectangle == this) return 0;
        return rectangle.areaCalculator() > this.areaCalculator() ? 1 : -1;
    }
}
