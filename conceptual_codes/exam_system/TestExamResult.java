package conceptual_codes.exam_system;

public class TestExamResult {

	public static void main(String[] args) {
		
		ExamResult madhu = new ExamResult("Madhu",444,"17/10/1999",96,81,90,100,99);
		ExamResult maddy = new ExamResult("Maddy",143,"17/10/1999",85,81,88,89,82);
		
		// System.out.println(madhu.getStuName());
		// System.out.println(madhu.getStuDOB());
		// System.out.println(madhu.getStuId());
		// System.out.println(madhu.getTotal());
		// System.out.println(madhu.getAverage());
		// System.out.println(madhu.getPercentage());
		// System.out.println(maddy.getPercentage());
		// System.out.println();
		// System.out.println();

        madhu.getResult();
        maddy.getResult();
	}

}
