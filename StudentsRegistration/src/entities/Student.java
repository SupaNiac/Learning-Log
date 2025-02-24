package entities;

public class Student {

		String name;
		Integer age;
		Double grades;
		
		
		public Student (String name, Integer age, Double grades) {
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


		public Double getGrades() {
			return grades;
		}


		public void setGrades(Double grades) {
			this.grades = grades;
		}
		
		public double avarageScore(Double grades) {
			return grades + grades + grades / 3;
		}
		
}
