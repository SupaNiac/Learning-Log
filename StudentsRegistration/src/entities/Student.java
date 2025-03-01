package entities;
import java.util.ArrayList;

public class Student {

		private String name;
		private Integer age;
		private ArrayList<Double> grades;
		
		public Student (String name, Integer age, ArrayList<Double> grades) {
			this.name = name;
			this.age = age;
			this.grades = grades;
		}


		public String getName() {

			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public Integer getAge() {

			return age;
		}


		public void setAge(Integer age) {
			this.age = age;
		}


		public ArrayList<Double> getGrades() {
			return grades;
		}


		public void setGrades(ArrayList<Double> grades) {
			this.grades = grades;
		}
		
		public double averageScore() {
			if (grades.isEmpty()){
				return 0;
			}

			double sum = 0;
			for (double grade : grades){
				sum += grade;
			}
			return sum / grades.size();
		}

		public double
		
}
