public class JavaConcepts{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo od=new OverloadingDemo();
		od.showdata();
		od.showdata("ANOTHER METHOD");
		OverridingDemo ord= new OverridingDemo();
		ord.showdata();
		
		TestAbstract ta= new TestAbstract();
		ta.display();
		ta.show();
		ta.showoff();
		
		AbstractClassDemo ab = new TestAbstract();
		ab.display();
		ab.show();
	}

}
