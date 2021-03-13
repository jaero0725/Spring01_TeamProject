package test;

interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);
    default int exec(int i, int j){      //default�� ���������� �޼ҵ带 ������ �� �ִ�.
        return i + j;
    }
}

//Calculator�������̽��� ������ MyCalculatorŬ����
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