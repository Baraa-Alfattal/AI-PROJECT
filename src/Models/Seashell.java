package Models;

public class Seashell {
    private boolean seashell1;
    private boolean seashell2;
    private boolean seashell3;
    private boolean seashell4;
    private boolean seashell5;
    private boolean seashell6;


    public Seashell(){}

    public Seashell(boolean seashell1, boolean seashell2, boolean seashell3, boolean seashell4, boolean seashell5, boolean seashell6) {
        this.seashell1 = seashell1;
        this.seashell2 = seashell2;
        this.seashell3 = seashell3;
        this.seashell4 = seashell4;
        this.seashell5 = seashell5;
        this.seashell6 = seashell6;
    }

    public void setSeashell1(boolean seashell1) {
        this.seashell1 = seashell1;
    }

    public void setSeashell2(boolean seashell2) {
        this.seashell2 = seashell2;
    }

    public void setSeashell3(boolean seashell3) {
        this.seashell3 = seashell3;
    }

    public void setSeashell4(boolean seashell4) {
        this.seashell4 = seashell4;
    }

    public void setSeashell5(boolean seashell5) {
        this.seashell5 = seashell5;
    }

    public void setSeashell6(boolean seashell6) {
        this.seashell6 = seashell6;
    }

    public boolean isSeashell1() {
        return seashell1;
    }

    public boolean isSeashell2() {
        return seashell2;
    }

    public boolean isSeashell3() {
        return seashell3;
    }

    public boolean isSeashell4() {
        return seashell4;
    }

    public boolean isSeashell5() {
        return seashell5;
    }

    public boolean isSeashell6() {
        return seashell6;
    }

    public Seashell getSeashell() {
        return this;
    }
}


