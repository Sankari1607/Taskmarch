package Task10_class11;

public class Tea extends BlackTea{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tea c = new Tea();
		GreenTea a = new GreenTea();
		HerbalTea b = new HerbalTea();
		c.PrepareTea();
		c.TasteTea();
		a.PrepareTea();
		a.colorTea();
		b.PrepareTea();
		b.TasteTea();
	}

}
