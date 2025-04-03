package T2_233040022.Latihan;

public class StudentMain {
    public static void main(String[] args) {
        Student x = new Student();
        Student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println(x.getNrp()); // Output: 02

        Student z = new Student();
        z.setNrp("03");
        x = z;
        System.out.println(x.getNrp()); // Output: 03
        System.out.println(y.getNrp()); // Output: 02

        // Menyimpan objek Student menggunakan Persistence
        Persistence p = new Persistence();
        p.save(x);
        p.save(y);
    }
}
