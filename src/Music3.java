/**
 * @author Terry.W
 * @date 2018-12-14 17:19
 **/

import java.util.*;

//乐器
class Instrument3 {
    public void play() {
        System.out.println("Instrument3.play()");
    }
    public String what() {
        return "Instrument3";
    }
    public void adjust() {}
}

//管乐
class Wind3 extends Instrument3 {
    @Override
    public void play() {
        System.out.println("Wind3.play()");
    }
    @Override
    public String what() { return "Wind3"; }
    @Override
    public void adjust() {}
}
//打击乐器
class Percussion3 extends Instrument3 {
    public void play() {
        System.out.println("Percussion3.play()");
    }
    public String what() { return "Percussion3"; }
    public void adjust() {}
}
//弦乐器
class Stringed3 extends Instrument3 {
    public void play() {
        System.out.println("Stringed3.play()");
    }
    public String what() { return "Stringed3"; }
    public void adjust() {}
}
//铜管乐器
class Brass3 extends Wind3 {
    public void play() {
        System.out.println("Brass3.play()");
    }
    public void adjust() {
        System.out.println("Brass3.adjust()");
    }
}
//木管乐器
class Woodwind3 extends Wind3 {
    public void play() {
        System.out.println("Woodwind3.play()");
    }
    public String what() { return "Woodwind3"; }
}

public class Music3 {
// Doesn't care about type, so new types
// added to the system still work right:
    static void tune(Instrument3 i) {
// ...
        i.play();
    }
    static void tuneAll(Instrument3[] e) {
        for(int i = 0; i < e.length; i++)
            tune(e[i]);
    }
    public static void main(String[] args) {
        Instrument3[] orchestra = new Instrument3[5];
        int i = 0;
// Upcasting during addition to the array:
        orchestra[i++] = new Wind3();
        orchestra[i++] = new Percussion3();
        orchestra[i++] = new Stringed3();
        orchestra[i++] = new Brass3();
        orchestra[i++] = new Woodwind3();
        tuneAll(orchestra);
    }
} ///:
