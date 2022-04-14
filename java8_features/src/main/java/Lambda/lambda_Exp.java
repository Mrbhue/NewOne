package main.java.Lambda;

public class lambda_Exp {
    public static void main(String[] args) {
        System.out.println("Are u listening ?");
//========================================================================
        ///this is by creating separate class and implement the interface
//========================================================================
//        DemoInterface demoInterface= new lambda_exp_impl();
//        demoInterface.show();
//============================================================
        //by using anonymous class for implementing interface
//=============================================================
//        DemoInterface demo = new DemoInterface() {
//            @Override
//            public void show() {
//                System.out.println("This is first anonymous class");
//            }
//        };
//        DemoInterface demo1= new DemoInterface() {
//            @Override
//            public void show() {
//                System.out.println("this is second anonymous class");
//            }
//        };
//        demo.show();;
//        demo1.show();
// ===========================================================================
        //Implements interface with the help of lambda
//============================================================================

//        DemoInterface  i=()-> {
//            System.out.println("first time lambda use");
//        };
        //By using rule 2 of lambda remove braces
        DemoInterface  i=()->
            System.out.println("first time lambda use");
        ;
        i.show();

        //By creating a separate class
//        SumInterface sumInterface= new SumInterface() {
//            @Override
//            public int sum(int a, int b) {
//                return a + b;
//            }
//        };
//        System.out.println(sumInterface.sum(2,5));
//        System.out.println(sumInterface.sum(4,6));
      //by using Lambda
        SumInterface sumInterface=(a, b) -> a+b;

        System.out.println(sumInterface.sum(2,5));
        System.out.println(sumInterface.sum(4,6));



        ///Write another Lamda to return length
        LengthInter lengthInter=str -> str.length();
        System.out.println("Length of the String "+lengthInter.getLength("Manish"));
    }
}
