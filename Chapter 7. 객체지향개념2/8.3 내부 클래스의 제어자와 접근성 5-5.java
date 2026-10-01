class Outer{
    int value = 10; // Outer.this.value

    class Inner{
        int value = 20; // this.value
        void method(){
            int value = 30; // local variable
            System.out.println("           value : " + value); // refers to local variable
            System.out.println("      this.value : " + this.value); // refers to Inner.this.value
            System.out.println("Outer.this.value : " + Outer.this.value); // refers to Outer.this.value
        }
    } // Inner class ends
} // Outer class ends

class InnerEx5{
    public static void main(String args[]){
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.method();
    }
} // InnerEx5 class ends