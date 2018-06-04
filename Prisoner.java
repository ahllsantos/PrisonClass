import java.util.Date;

public class Prisoner implements Edible {

	private int termMonths;
	private String name;
	private int prisonerNumber;
	private String crimeCommitted;
	private int cellNumber;
	private Date releaseDate;
	private boolean isPrisoner;
	private Date admissionDate;
	private String comments;
	private static int nextPrisonerNumber = 1;
	
	// STATIC VAR EX
	// aka "class variable"
	// shared between all objects
	public Prisoner() {
		setPrisoner(true);
		//prisonerNumber = get.NextPrisonerNumber();
		//cellNumber = assignCellNumber();
	}

	public Prisoner(String _name) {
		this.name = _name; 
		//prisonerNumber = get.NextPrisonerNumber();
		//cellNumber = assignCellNumber();
		setAdmissionDate(new Date());
	}
	
	public void release(Date _releaseDate) {
		setReleaseDate(_releaseDate);
		setPrisoner(false);
	}
	public String toString() {
		return "Prisoner: " + name + "; " + prisonerNumber; //dummy method
	}
	
	public void escaped(Date date) {
		setComments(getComments() + "Escaped on " + date);
	}
	public void admit(Date _admissionDate) {
		admissionDate = _admissionDate;
		isPrisoner = true;
		prisonerNumber = nextPrisonerNumber;
		nextPrisonerNumber++;
		
		// @return new term length
		// @parameter changeInMonths Negative if the term is being reduced
	}
	
	// @return int new term length[
	public int changeTermLength(int changeInMonths) {
		termMonths += changeInMonths;
		//TODO set release date
		return termMonths += changeInMonths;
		// return termMonths;
	}
	public String name() {
		return name;
	}
	public int termMonths() {
		return termMonths;
	}
	public int prisonerNumber() {
		return prisonerNumber;
	}

	public static int getNextPrisonerNumber() {
		return nextPrisonerNumber;
	}

	public static void setNextPrisonerNumber(int nextPrisonerNumber) {
		Prisoner.nextPrisonerNumber = nextPrisonerNumber;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Date getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(Date admissionDate) {
		this.admissionDate = admissionDate;
	}

	public boolean isPrisoner() {
		return isPrisoner;
	}

	public void setPrisoner(boolean isPrisoner) {
		this.isPrisoner = isPrisoner;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public int getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(int cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getCrimeCommitted() {
		return crimeCommitted;
	}

	public void setCrimeCommitted(String crimeCommitted) {
		this.crimeCommitted = crimeCommitted;
	}
	
	public int compareTo(Prisoner otherPrisoner) {
		int comparisonValue = this.name.compareTo(otherPrisoner.name);
		return comparisonValue;
	}
	
	// STATIC METHOD EX
	//available all the time
	// doesn't need object
	
	public static String GetSpecies() {
		return "Homo Sapien";
	}
	
	public String eatit() {
		return "Yummy";
	}
	
	public boolean notDisgusting() {
		return true;
	}

	public String eatIt() {
		return null;
	}
}
