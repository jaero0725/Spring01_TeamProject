package test;

interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);
    default int exec(int i, int j){      //default로 선언함으로 메소드를 구현할 수 있다.
        return i + j;
    }
}

//Calculator인터페이스를 구현한 MyCalculator클래스
class MyCalculator implements Calculator {

    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiple(int i, int j) {
        return i * j;
    }
}

public class MyCalculatorExam {
    public static void main(String[] args){
        Calculator cal = new MyCalculator();
        int value = cal.exec(5, 10);
        System.out.println(value);
    }
}