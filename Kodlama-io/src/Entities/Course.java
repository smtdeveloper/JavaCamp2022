package Entities;

public class Course {

	 	private int id; // --> read only
	    private String name;
	    private String educator;
	    private double price;
	    private int categoryId;
	    
		public Course(int id, String name, String educator, double price, int categoryId) {
			super();
			this.id = id;
			this.name = name;
			this.educator = educator;
			this.price = price;
			this.categoryId = categoryId;
		}

		public Course() {
			super();
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEducator() {
			return educator;
		}

		public void setEducator(String educator) {
			this.educator = educator;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public int getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}

	    
	
}
