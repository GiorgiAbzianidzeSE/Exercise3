package name.space;



public class Main {
    public static void main(String[] args) {
        ge.ufc.exercises.Rectangle rectangle = new ge.ufc.exercises.Rectangle();
        rectangle.setHeight(10);
        rectangle.setWeight(5);

        tbc.course.tasks.Rectangle rectangle1 = new tbc.course.tasks.Rectangle();
        rectangle1.setHeight(12);
        rectangle1.setWeight(7);

        ge.ufc.exercises.Rectangle rectangle2 = new ge.ufc.exercises.Rectangle();
        rectangle2.setWeight(10);
        rectangle2.setHeight(5);

        tbc.course.tasks.Rectangle rectangle3 = new tbc.course.tasks.Rectangle();
        rectangle3.setHeight(12);
        rectangle3.setWeight(7);

        System.out.println(rectangle.compareTo(rectangle2));// print 0
        System.out.println(rectangle1.compareArea(rectangle1 , rectangle3));// print 0
    }
}
