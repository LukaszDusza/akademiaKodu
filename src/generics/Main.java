package generics;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Main {

    public static void main(String[] args) {
        FruitBox fruitBox = new FruitBox(new Orange());
        Orange fruit1 = (Orange) fruitBox.getFruit();


        // typ generyczny. po stworzeniu klasy BoxOnSteroids tworzymy instancję klasy generycznej.
        BoxOnSteroids<Apple> appleBox = new BoxOnSteroids<>(new Apple());
        BoxOnSteroids<Orange> orangeBox = new BoxOnSteroids<>(new Orange());

        Orange fruit = orangeBox.getFruit();


        Pair<BoxOnSteroids<Orange>, BoxOnSteroids<Apple>> pairOfBoxes =
                new Pair<>(new BoxOnSteroids<>(new Orange()),
                           new BoxOnSteroids<>(new Apple()));

        BoxOnSteroids boxWitoutType = new BoxOnSteroids(new Apple());
        BoxOnSteroids boxWithApple = boxWitoutType;
        BoxOnSteroids boxWithOrange = boxWitoutType;



        //extends - ograniczenie w dół.
        BoxOfFigures<Circle> circleBox = new BoxOfFigures<>(new Circle());
        // BoxOfFigures<Apple> boxofAppple;

        //Rectangle rectangle = new Square();


        //fancy box



     //   Apple apple = boxWithApple.getFruit();
     //   Orange orange = boxWithOrange.getFruit();


        //ogranicznie z góry
        FancyBox<String> box = new FancyBox<>("something");
        box.saySomethingFancy();

        method2(new FancyBox<>(new Square()));
        method2(new FancyBox<>(new Circle()));

    }



    //wildcard
    private static void method1(FancyBox<?> box) {
       Object object = box.object;
    }


    private static void method2(FancyBox<? extends Figure> box) {
        Figure figure = box.object;
        System.out.println(figure);
    }


    private static void method3(FancyBox<Figure> box) {
        Figure figure = box.object;
    }

    private void method4(FancyBox<? super Rectangle> box) {
     //   box.object = new Square();
    }


    private static void lowerBoundWildcard() {

    }

}
