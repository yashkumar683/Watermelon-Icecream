interface Kerei {
    void pretty();
}

class Fax implements Kerei {
    public void pretty(){
        System.out.println("This is a pretty picture.");
    }

    public static void main(String[] args){
        Kerei kerei = new Fax();
        kerei.pretty();
    }
}
