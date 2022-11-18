public class Calc {

    private double N1;
    private double N2;

    public void setNumbers(double n1, double n2) {
        this.N1 = n1;
        this.N2 = n2;
    }

    public double getN1() {
        return N1;
    }

    public void setN1(int n1) {
        N1 = n1;
    }

    public double getN2() {
        return N2;
    }

    public void setN2(int n2) {
        N2 = n2;
    }

    public double soma(){
        return getN1() + getN2();
    }

    public double subs(){
        return getN1() - getN2();
    }

    public double mult(){
        return getN1() * getN2();
    }

    public double div(){
        return getN1() / getN2();
    }
}
