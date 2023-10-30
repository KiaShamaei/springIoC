package org.example;

/**
 * ramin 104
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CarGo cargo ;
        //car method go stop --- model benz bmw
//        car = new Car() {
//            @Override
//            public void go() {
//                System.out.println("bmw run...");
//            }
//
//            @Override
//            public void stop() {
//                System.out.println("bmw stop ...");
//            }
//        };
//        car.go();
        cargo = ()-> System.out.println("bmw run");

        //exception -----
        //reflection ----
        //java component ----
        // java thread ---- synchoronized- volatile - lock
        cargo.go();
        System.out.println( "Hello World!" );
    }


}
