public class Rectangle {
    int l;
    int w;
    public void show(){
        int c = 2*(l+w);
        System.out.println("area = " + l * w +" , Perimeter = " + c);
    }

    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.l =2;
        re.w = 4;
        re.show();


    }
}
