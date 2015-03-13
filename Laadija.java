public class Laadija implements Vooluallikas{
	private double v2ljundpinge, maxvool;
	TakistusKomponent tarbija=null;
	public Laadija(double v2ljundpinge, double maxvool){
		this.v2ljundpinge=v2ljundpinge;
		this.maxvool=maxvool;
	}
	public void yhendaTarbija(TakistusKomponent t){
		tarbija=t;
	}
	public double kysiVool(){
		if(tarbija==null){return 0;}
		double vool=tarbija.vool(v2ljundpinge);
		if(vool<=maxvool){return vool;}
		return 0;
	}
}