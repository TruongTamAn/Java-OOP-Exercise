public class Student extends Person {
    private String __ID, __class, __faculityID, __email;
    private double __GPA;
    private int __numberCredit;
    public Student(String ID,String name, String Class, String __faculityID, String email, String address, Calendar birthday, Gender gender, double GPA, int numberCredit) {
        super(name,address,birthday,gender);
        this.__ID = ID;
        this.__class = Class;
        this.__email = email;
        this.__faculityID = __faculityID;
        this.__GPA = GPA;
        this.__numberCredit = numberCredit;
    }
    //region toString
    @Override
    public String toString() {
        switch (LanguageSystem.language) {
            case Vietnamese:
                return toStringVietnamese();
            case Japanese:
                return toStringJapanese();
            default:
                return toStringEnglish();
        }
    }

    private String toStringVietnamese() {
        return "MSSV: " + this.__ID +
                "\n" + super.toString() +
                "\nKhoa: " + this.__faculityID +
                "\nLớp: " + this.__class +
                "\nEmail: " + this.__email +
                "\nGPA: " + String.format("%.2f",this.__GPA) +
                "\nTín chỉ: " + this.__numberCredit;
    }

    private String toStringEnglish() {
        return "Student's ID: " + this.__ID +
                "\n" + super.toString() +
                "\nDepartment: " + this.__faculityID +
                "\nClass: " + this.__class +
                "\nEmail: " + this.__email +
                "\nGPA: " + String.format("%.2f",this.__GPA) +
                "\nCredit: "  + this.__numberCredit;
    }

    private String toStringJapanese() {
        return "学生番号: " + this.__ID +
                "\n" + super.toString() +
                "\n学部: " + this.__faculityID +
                "\nクラス: " + this.__class +
                "\nメール: " + this.__email +
                "\nGPA: " + String.format("%.2f",this.__GPA) +
                "\nクレジット: " + this.__numberCredit;
    }
    //endregion
    //region Getters and Setters
    public void setID(String ID) {
        this.__ID = ID;
    }
    public void setClass(String Class) {
        this.__class = Class;
    }
    public void setFaculityID(String faculityID) {
        this.__faculityID = faculityID;
    }
    public void setEmail(String email) {
        this.__email = email;
    }
    public void setGPA(double gpa) {
        this.__GPA = gpa;
    }
    public void setNumberCredit(int numberCredit) {
        this.__numberCredit = numberCredit;
    }
    public String getID() {
        return this.__ID;
    }
    public String getclass() {
        return this.__class;
    }
    public String getFaculityID() {return this.__faculityID;}
    public String getEmail() {return this.__email;}
    public double getGPA() {return this.__GPA;}
    public int getNumberCredit() {return this.__numberCredit;}
    //endregion
}