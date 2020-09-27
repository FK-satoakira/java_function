package practice;

import java.util.Date;

public class Main {

	interface MyFunc{
		public abstract int myfunc(int a, int b);
	}
	interface MyFunc2{
		public abstract long myfunc2(MyFunc mf, int a,int b);
	}
	interface Herofunc{
		public abstract String hf(Hero h);
	}
	interface Datefunc{
		public abstract long df(Date d);
	}


    public static void main(String[] args) {
    	int a = 7;
//    	int b = 10;
    	MyFunc i = (x,y) -> {return x*y;};
    	MyFunc2 i2 = (mf,  x,  y) -> {return mf.myfunc(x, y)*mf.myfunc(x, y)/x;};
    	System.out.println("i "+i.myfunc(a, a));
    	System.out.println("i2 "+i2.myfunc2(i, a, a));
    	Hero hh = new Hero();
    	String str = "hello";
    	Herofunc g = h -> h.getName()+","+str;
    	hh.setHp(2);
    	System.out.println(g.hf(hh));

    	Datefunc d =(Date date)->date.getTime();
    	System.out.println(d.df(new Date()));
	}
//    =の右辺で作った関数と同型の関数型を左辺に用意しなければならない。 左辺と右辺の変数名と引数名は同じではいけない。
//   「左辺=右辺」    で関数完成、とイメージしたほうがいい。出力はそのあと。 System.out.println(左辺変数.メソッド());で出力。
//    省略について右辺の引数の型は省略可能。
//    右辺の引数が一つの場合、()と｛｝は省略可能。変数にアクセス可能だが、実質final。書き換えたらエラー。
}
