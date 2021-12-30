public class Student {
    private int sutdentId;
    private String studentName;
    private String studentAddress;

    public Student(int sutdentId, String studentName, String studentAddress) {
        this.sutdentId = sutdentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    public int getSutdentId() {
        return sutdentId;
    }

    public void setSutdentId(int sutdentId) {
        this.sutdentId = sutdentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sutdentId=" + sutdentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }
}
