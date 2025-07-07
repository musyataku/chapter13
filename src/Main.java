public class Main {
    public static void main(String[] args) {
        Hero h = new Hero("ミナト", 40);
        King k = new King();
        Inn i = new Inn();
        Matango m = new Matango();
        //h.setName("ミナト");
        k.talk(h);
        i.checkIn(h);
        h.sleep();
        h.attack(m);
    }
}
/*public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.setName("ミナト");

        King k = new King();
        k.talk(h);
    }
}*/
/*public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.hp = 40;
        h.name = "ミナト";
        System.out.println(h.name + "の現在のHP: " + h.hp);

        Inn i = new Inn();
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.name + "の現在のHP: " + h.hp);

        King k = new King();
        k.talk(h);
    }
}
public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();

        //h.hp = 100;// エラーが出る
        h.name = "ミナト";

        h.sleep();
        h.seppuku();//seppukuメソッドを通じてdieを呼び出せる
    }
}*/