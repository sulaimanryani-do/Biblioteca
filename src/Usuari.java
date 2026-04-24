public class Usuari {

	private int id;
	private String nom;
	private String email;

	// ── Constructor
	public Usuari(int id, String nom, String email) {
		this.id = id;
		this.nom = nom;
		this.email = email;
	}

	// ── Getters ──────────────────────────────────────────────────────────────
	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getEmail() {
		return email;
	}

	//Modify
	public void setNom(String nouNom) {
		if (nouNom != null && !nouNom.isBlank()) {
			this.nom = nouNom;
			System.out.println("Nom actualitzat a: " + nouNom);
		} else {
			System.out.println("El nom no pot estar buit.");
		}
	}

	public void setEmail(String nouEmail) {
		if (nouEmail != null && nouEmail.contains("@")) {
			this.email = nouEmail;
			System.out.println("Email actualitzat a: " + nouEmail);
		} else {
			System.out.println("Email no vàlid.");
		}
	}

	// ── toString ─────────────────────────────────────────────────────────────
	@Override
	public String toString() {
		return "Usuari{id=" + id + ", nom='" + nom + "', email='" + email + "'}";
	}
}