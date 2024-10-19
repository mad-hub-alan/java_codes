package conceptual_codes.exam_system;

public class ExamResult {   
	
	private String stuName;
	private int stuId;
	private String stuDOB;
	
	private int tam;
	private int eng;
	private int mat;
	private int sci;
	private int soc;
	
	private int total;
	private double avg;
	private double percent;
	
	
	public ExamResult(String name,int id,String dob,int t,int e,int m,int s,int ss){
		this.setStuName(name);
		this.setStuId(id);
		this.setStuDOB(dob);
		this.setMarks(t, e, m, s, ss);
		this.setTotal();
		this.setAverage();
		this.setPercentage();
	}
	public ExamResult() {
		
	}
	
	private void setStuName(String name) {
		this.stuName = name;
	}
	private void setStuId(int id) {
		this.stuId = id;
	}
	private void setStuDOB(String dob) {
		this.stuDOB = dob;
	}
	public String getStuName() {
		return this.stuName;
	}
	public long getStuId() {
		return this.stuId;
	}
	public String getStuDOB() {
		return this.stuDOB;
	}
	
	private void setMarks(int t,int e,int m,int s, int ss) {
		this.tam = t;
		this.eng = e;
		this.mat = m;
		this.sci = s;
		this.soc = ss;
	}
	
	public String getMarks(){
        return "Tamil : "+tam+"\n English : "+eng+"\n Maths : "+mat+"\n Science : "+sci+"\n Social Science : "+soc;
    }
	private void setTotal() {
		this.total = this.tam+this.eng+this.mat+this.sci+this.soc;
	}
	public int getTotal() {
		return this.total;
	}
	private void setAverage() {
		this.avg = this.total/5;
	}
	public double getAverage() {
		return this.avg;
	}
	private void setPercentage() {
		this.percent = (this.total*100)/500; 
	}
	public double getPercentage() {
		return this.percent;
	}


    public void getResult(){
        System.out.println("-----------------------------");
        System.out.println("Student Name : "+getStuName());
        System.out.println("Student Id : "+getStuId());
        System.out.println("Student DOB : "+getStuDOB());
        System.out.println("-----------------------------");
        System.out.println("MARKS OBTAINED");
        System.out.println("Tamil   : "+tam);
        System.out.println("English : "+eng);
        System.out.println("Maths   : "+mat);
        System.out.println("Science : "+sci);
        System.out.println("Social  : "+soc);
        System.out.println("_________________");
        System.out.println("   TOTAL: "+getTotal());
        System.out.println("PERCENTAGE  : "+getPercentage());
        System.out.println("-----------------------------");
    }
	
}
