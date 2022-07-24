package fieldTypes;

public class LocalVsInstance {
    public int a=10;

    public void showDifference (){
        int a =5;
        System.out.println(a);
    }

    public static void main(String[] args) {
        LocalVsInstance obj = new LocalVsInstance();
        obj.showDifference();

        System.out.println(obj.a);
    }

}
