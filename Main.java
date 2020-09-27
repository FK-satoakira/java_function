package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntToDoubleFunction;

abstract class Chara{
	private String name;
	private int age;
	public Chara(String n, int a) {this.name=n;	this.age=a;	}
	public abstract void sleep();
	public String getName(){return name;}
	public void setName(String name) {this.name = name;}
	public int getAge() {return age;}
	public void setAge(int age) {this.age = age;}
}
class Dad extends Chara{public Dad(String n, int a){super(n,a);}
	@Override	public void sleep(){System.out.println("Dad is sleeping");}}
class Mam extends Chara{public Mam(String n, int a){super(n,a);}
	@Override	public void sleep(){System.out.println("Mam is sleeping");}}
class San extends Chara{public San(String n, int a){super(n,a);}
	@Override	public void sleep() {System.out.println("San is sleeping");}}


public class Main {

    public static void main(String[] args) {
    	List<Chara> family = new ArrayList<>();

    	Chara m = new Mam("Mam",30); Chara d = new Dad("Dad",33); Chara s = new San("San",3);

    	Chara[] cs = {m,d,s};/*new Chara[3]*/;


//		Chara[] cha = { d }; /*この記述をすると「Chara d = new Chara("Dad");」がエラーになる。なぜ？*/ A.Main内で定義してたから。

    	System.out.println("---");

    	for (int i = 0; i < 3; i++) {
			family.add(cs[i]);
		}
    	for(Chara c : family) {
    		c.sleep();
    	}
    	int i = 1000;
		IntToDoubleFunction dt = x -> x * x * i; /*省略時も変数アクセス可能*/
    	System.out.println(dt.applyAsDouble(3));


    	family.stream().forEach(q -> q.sleep());
//    	[family.stream()]のfamilyで、もうfamilyリストの一つ一つという意味が分かっているのだろう。
//    	(Charaということが)。よって、foreach()内の変数はqじゃなくても、何でもいいと思われる。
	}

}