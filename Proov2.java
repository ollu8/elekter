public class Proov2{
	public static void main(String[] arg){
		TakistusKomponent t=new Takisti220oomi();
		Vooluallikas telefonilaadija=new Laadija(5, 3.5);
		telefonilaadija.yhendaTarbija(t);
		System.out.println(telefonilaadija.kysiVool());
	}
}
//"c:\Program Files (x86)\Git\bin\git.exe"