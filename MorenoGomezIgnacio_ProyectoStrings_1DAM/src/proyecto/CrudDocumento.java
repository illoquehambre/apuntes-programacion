package proyecto;

public class CrudDocumento {
	
	private Documento doc;

	public CrudDocumento(Documento doc) {
		super();
		this.doc = doc;
	}

	public Documento getDoc() {
		return doc;
	}

	public void setDoc(Documento doc) {
		this.doc = doc;
	}

	@Override
	public String toString() {
		return "CrudDocumento [doc=" + doc + "]";
	}

	
	
	
}
