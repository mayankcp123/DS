
public class EarlyBinding {

	public static void main(String[] args) {
		
		GovtJob gj = new GovtJob();
		gj.impWork();
		CivilServices cs = new CivilServices();
		cs.impwork();
		IAS ias = new IAS();
		ias.impWork();
		ias.impwork();
		GovtJob ref = gj;
		ref.impWork();
		ref = cs;
		ref.impWork();
		ref = ias;
		ref.impWork();

		if(gj instanceof GovtJob) {
			System.out.println("Yes, d is pointing to a Doctor");
		}
		
		if(cs instanceof GovtJob) {
			System.out.println("Yes, s is pointing to a Doctor");
		}
		
		if(ias instanceof GovtJob) {
			System.out.println("Yes, hs is pointing to a Doctor");
		}
	}

}
class GovtJob{
	void impWork() {
		System.out.println(getClass()+"Government Job : It is the most demanding job.");
	}
}
class CivilServices extends GovtJob{
	void impwork() {
		System.out.println("Civil Services : It is a prestigious job and demading too.");
	}
	
}
class IAS extends CivilServices{
	void impWork() {
		System.out.println("IAS 	       : It is an elite position and Prestigious too.");
	}
	
}