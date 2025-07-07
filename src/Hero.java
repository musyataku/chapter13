public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    public Hero(String name, int hp) {
        this.setName(name);
        this.hp = hp;
        showstatus(getName(),getHp());
    }

    public String getName() {
        return this.name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    void bye() {
        System.out.println("勇者は別れを告げた");
    }
    private void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public void sleep() {
        this.hp = 100;
        showstatus(this.name,this.hp);
        System.out.println(this.name + "は、眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.suffix + "から100ポイントの反撃を受けた");
        this.hp -= 100;
        if (this.hp <= 0) {
            this.die();
        }
    }
    public void showstatus(String name, int hp){
        System.out.println(this.name + "の現在のHP：" + this.hp);
    }
}
/* public class Hero {
    private int hp;
    String name;
    Sword sword;

    public String getName() {// 追加
        return this.name;
    }//getterは読み取り専用
    public void setName(String name) {// 追加
        this.name = name;
    }//setterは書き換え専用。書き換える必要がないなら用意しなければ書き換わることがなくなる

    public void bye() {
        System.out.println("勇者は別れを告げた");
    }
    public void die() {
        System.out.println(this.name + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    public void seppuku() {
        System.out.println(this.name + "は切腹した！");
        this.die();
    }
    public void sleep() {
        this.hp = 100;
        System.out.println(this.name + "は眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.name + "の攻撃！");
        System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0 ) {
            this.die();
        }
    }
}*/