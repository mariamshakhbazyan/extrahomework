package hm;


class Calculation{
	public int num;
	public int extraN;
	public Calculation(int num, int extraN) {
		this.num=num; 
	    this.extraN=extraN;
	}
	public int add() {
		return (num + extraN);
	}
	public int substract() {
		return (num - extraN);
	}
    public static int fact(int n)
    {
    	if(n==1) {
    		return n;
    	}
       return n* fact(n-1);	     
    }

}

class ClassOne {
	public int a = 8;
	public double b = 45.25;
	public int age ;
	public String name;
	public ClassOne(String name, int age) {
		this.name = name; 
		this.age = age;
		
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	
	
}

class ClassSecond {
	public int height = 852; 
	public int weight = 54;
	public int a = 99;
	public double b = 85.25;
	public ClassSecond(int height, int weight){
		this.height = height;
		this.weight = weight;
	}
	public int AddTogether() {
		return height + weight;
	}
	public int SubstractFromEachOther() {
		return height - weight;
	}
}
public class Main {
	
	public static void main(String [] args) {
    	Calculation obj = new Calculation(4,5);
    	System.out.println("Factorial"+ Calculation.fact(4));
    	System.out.println("1 "+ obj.add());
    	System.out.println("1 " + obj.substract());
    	
    	ClassSecond obj1 = new ClassSecond(28,18);
    	System.out.println("2 "+ obj1.AddTogether());
    	System.out.println("2 " + obj1.SubstractFromEachOther());
    	
    	ClassOne obj2 = new ClassOne("Nane",16);
    	System.out.println("3 " + obj2.getAge());
    	System.out.println("3 " + obj2.getName());
    	
    	
    	
    	
    }
}
	