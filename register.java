 abstract class register{

abstract void test();
  
}

class Test extends register{

    @Override
    void test() {
        System.out.println("This is implimented class of abstrct method");
        
    }
    public static void main(String[] args) {
        Test tst = new Test();
        tst.test();
    }
}
