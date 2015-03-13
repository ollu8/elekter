public class Proov1{
	public static void main(String[] arg){
		TakistusKomponent t=new Takisti220oomi();
		System.out.println(t.kysiTakistus());
		System.out.println("Vool 9 Voldi korral: "+t.vool(9));
		TakistusKomponent t2=new Takisti(3000);
		System.out.println(t2.kysiTakistus());
		System.out.println("Vool 9 Voldi korral: "+t2.vool(9));
	}
}