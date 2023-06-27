
package Entity;


public class Course {
    
    private String courseName;
    private int hoursPerDay;
    private int daysPerWeek;
    private String shift;
    private int pricePerHour;
    private String[] students = new String[5];   

    public Course() {
    }

    public Course(String courseName, int hoursPerDay, int daysPerWeek, String shift, int pricePerHour) {
        this.courseName = courseName;
        this.hoursPerDay = hoursPerDay;
        this.daysPerWeek = daysPerWeek;
        this.shift = shift;
        this.pricePerHour = pricePerHour;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getHoursPerDay() {
        return hoursPerDay;
    }

    public int getDaysPerWeek() {
        return daysPerWeek;
    }

    public String getShift() {
        return shift;
    }

    public int getPricePerHour() {
        return pricePerHour;
    }

    public String[] getStudents() {
        return students;
    }

    
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }

    public void setDaysPerWeek(int daysPerWeek) {
        this.daysPerWeek = daysPerWeek;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void setPricePerHour(int pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public void setStudents(String[] students) {
        this.students = students;
    }
}