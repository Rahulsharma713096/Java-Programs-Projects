package CollectionInterface;

public class student {
private int id;
private String name;
private int marks;
//constructor
public student(int id, String name, int marks) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
}
//Getters
public int getId() {
	return id;
}
public String getName() {
	return name;
}
public int getMarks() {
	return marks;
}
// toString
@Override
public String toString() {
	return "student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
}
}
