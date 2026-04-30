class Animal {
    void eat(){
        System.out.println("Animals eat");
    }
}

class Dogs extends Animal{
    void barks(){
        System.out.println("Dogs Barks");

    }
}

class SingleInheritence {
    public static void main(String[] args) {
        Dogs d1 = new Dogs();
        d1.barks(); //own
        d1.eat();// inherited
    }
}


// One child inherits from one parent.