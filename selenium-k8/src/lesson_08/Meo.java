package lesson_08;

public class Meo {

    private int id;

    public Meo(){
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Meo mewmew = new Meo();
        Meo lili = new Meo();
        lili.setId(2);

        System.out.println(mewmew.getId());
        System.out.println(lili.getId());
    }
}
