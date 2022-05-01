package Eleventh_Wrapper;

public class CustomWrapperEx {
    public CustomWrapperEx(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    private int i;

    @Override
    public String toString(){
        return Integer.toString(i);

    }

    public static void main(String[] args) {
        CustomWrapperEx cw = new CustomWrapperEx(100);
        System.out.println(cw);
    }
}
