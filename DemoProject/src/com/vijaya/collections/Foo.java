package com.vijaya.collections;

public class Foo {
    Integer id;
    String whatevs;

    Foo(Integer id, String whatevs) {
        this.id = id;
        this.whatevs = whatevs;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Foo) {
            return ((Foo)other).id.equals(this.id);   
        }
		return false;
    }

      @Override
    public int hashCode() {
        return this.id;
    }
    
   
    public static void main(String[] args) {
    	 Foo f1 = new Foo(1,"prasad");
    	    Foo f2 = new Foo(2,"prasad");
    	    Foo f3 = new Foo(1,"abc");
    	    System.out.println(f1.equals(f3));
    	    System.out.println(f1.equals(f2));
    }
}