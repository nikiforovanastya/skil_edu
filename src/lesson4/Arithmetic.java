package lesson4;

public class Arithmetic {
    int a = 0;
    int b = 0;
    public Arithmetic(int a, int b){
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return a + b;
    }

    public int mult() {
        return a * b;
    }

    public int max() {
        if (a >= b) {
            return a;
        }
        else {
            return b;
        }
    }

    public int min() {
        if (a <= b) {
            return a;
        }
        else {
            return b;
        }
    }
}
