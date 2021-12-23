package java_progs.oops;

class Music {

    Music() {
        System.out.println("Music::Initializing song...");
    }

    public void play() {
        System.out.println("Music:: Playing music...");
    }
}

class Sony extends Music {

    Sony() {
        System.out.println("Sony operations...");
    }

    @Override
    public void play() {
        System.out.println("Sony:: Playing music... ");
    }

}

class Panasonic extends Music {

    Panasonic() {
        System.out.println("Panasonic operations...");
    }
}

public class MethodOverrideEx {
    public static void main(String[] args) {
        Sony s = new Sony();
        s.play();
        System.out.println();
        Panasonic p = new Panasonic();
        p.play();
    }
}
