package by.academy.tasks.collections.task9;

public class Student {
    private String name;
    private int numberOfGroup;
    private int course;
    private double averageMark;

    public Student() {
        super();
    }

    public Student(String name, int numberOfGroup, int course, double averageMark) {
        super();
        this.name = name;
        this.numberOfGroup = numberOfGroup;
        this.course = course;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("name='").append(name).append('\'');
        sb.append(", numberOfGroup=").append(numberOfGroup);
        sb.append(", course=").append(course);
        sb.append(", averageMark=").append(averageMark);
        sb.append('}');
        return sb.toString();
    }
}


