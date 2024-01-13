import java.util.List;

public class Faculty {
    private String __ID, __name;
    private List<Student> __studentList;
    private List<Teacher> __teachersList;
    private List<Subject> __subjectList;
    public String getID() {
        return this.__ID;
    }
    public String getName() {
        return this.__name;
    }
    //region Getters and Setters
    public Student[] getStudentListAsArray() {
        Student[] resultArr = new Student[__studentList.size()];
        return this.__studentList.toArray(resultArr);
    }
    public Teacher[] getTeacherListAsArray() {
        Teacher[] resultArr = new Teacher[__studentList.size()];
        return this.__teachersList.toArray(resultArr);
    }
    public Subject[] getSubjectListAsArray() {
        Subject[] resultArray = new Subject[__subjectList.size()];
        return this.__subjectList.toArray(resultArray);
    }
    public void setID(String ID) {
        this.__ID = ID;
    }
    public void setName(String name) {
        this.__name = name;
    }
    private int getStudentIndexWithID(String ID) {
        int indx = -1;
        for (int i=0;i < __studentList.size();++i)
            if (__studentList.get(i).getID().equals(ID)) indx = i;
        return indx;
    }
    private int getTeacherIndexWithID(String ID) {
        int indx = -1;
        for (int i=0;i < __teachersList.size();++i)
            if (__teachersList.get(i).getID().equals(ID)) indx = i;
        return indx;
    }
    private int getSubjectIndexWithID(String ID) {
        int indx = -1;
        for (int i=0;i < __subjectList.size();++i)
            if (__subjectList.get(i).getID().equals(ID)) indx = i;
        return indx;
    }
    public Student getStudentWithIndex(int indx) {
        if (indx >= 0 && indx < this.__studentList.size())
            return this.__studentList.get(indx);
        return null;
    }
    public Teacher getTeacherWithIndex(int indx) {
        if (indx >= 0 && indx < this.__teachersList.size())
            return this.__teachersList.get(indx);
        return null;
    }
    public Subject getSubjectWithIndex(int indx) {
        if (indx >= 0 && indx < this.__subjectList.size())
            return this.__subjectList.get(indx);
        return null;
    }
    public Student getStudentWithID(String ID) {
        return this.getStudentWithIndex(getStudentIndexWithID(ID));
    }
    public Teacher getTeacherWithID(String ID) {
        return this.getTeacherWithIndex(getTeacherIndexWithID(ID));
    }
    public int getNumberStudent() {
        return this.__studentList.size();
    }
    public int getNumberTeacher() {return this.__teachersList.size();}
    public int getNumberSubject() {return this.__subjectList.size();}
    //endregion
    //region Add
    public void AddStudent(Student student) {
        this.__studentList.add(student);
    }
    public void AddTeacher(Teacher teacher) {this.__teachersList.add(teacher);}
    public void AddSubject(Subject subject) {this.__subjectList.add(subject);}
    //endregion
    //region Delete
    public void DeleteStudentWithIndex(int index) {
        if (index >= 0 && index < this.__studentList.size())
            this.__studentList.remove(index);
    }
    public void DeleteTeacherWithIndex(int index) {
        if (index >= 0 && index < this.__teachersList.size())
            this.__teachersList.remove(index);
    }
    public void DeleteSubjectWithIndex(int index) {
        if (index >= 0 && index < this.__subjectList.size())
                this.__subjectList.remove(index);
    }
    public void DeleteStudentWithID(String ID) {
        DeleteStudentWithIndex(getStudentIndexWithID(ID));
    }
    public void DeleteTeacherWithID(String ID) {
        DeleteTeacherWithIndex(getTeacherIndexWithID(ID));
    }
    public void DeleteSubjectWithID(String ID) {DeleteSubjectWithIndex(getSubjectIndexWithID(ID));}
    //endregion
    //region Clear List
    public void ClearStudentList() {
        this.__studentList.clear();
    }
    public void ClearTeacherList() {
        this.__teachersList.clear();
    }
    public void ClearSubjectList() {
        this.__subjectList.clear();
    }
    //endregion
    //region toString
    public String toString() {
        switch (LanguageSystem.language) {
            case Vietnamese:
                return toStringVietnamese();
            case Japanese:
                return toStringJapanese();
            default:
                return toStringJapanese();
        }
    }
    private String toStringVietnamese() {
        return "Khoa: " + this.__name +
                "\nMã khoa: " + this.__ID +
                "\nSố lượng sinh viên: " + this.getNumberStudent() +
                "\nSố lượng giảng viên: " + this.getNumberTeacher() +
                "\nSố lượng môn học: " + this.getNumberSubject();
    }
    private String toStringJapanese() {
        return "学部名前: " + this.__name +
                "\n学部番号: " + this.__ID +
                "\n学生数: " + this.getNumberStudent() +
                "\n教師数: " + this.getNumberTeacher() +
                "\n科目数: " + this.getNumberSubject();
    }
    private String toStringEnglish() {
        return "Faculty: " + this.__name +
                "\nID: " + this.__ID +
                "\nNumber of student: " + this.getNumberStudent() +
                "\nNumber of teacher: " + this.getNumberTeacher() +
                "\nNumber of subject: " + this.getNumberSubject();
    }
    //endregion
}