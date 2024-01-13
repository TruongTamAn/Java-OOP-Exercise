public class Teacher extends Person {
    private double __salary;
    public enum Level {
        Bachelor,
        Master,
        Doctor;
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

        public String toStringVietnamese() {
            switch (this) {
                case Bachelor:
                    return "Cử Nhân";
                case Master:
                    return "Thạc sĩ";
                case Doctor:
                    return "Tiến sĩ";
            }
            return "";
        }

        public String toStringJapanese() {
            switch (this) {
                case Bachelor:
                    return "学士";
                case Master:
                    return "修士";
                case Doctor:
                    return "博士";
            }
            return "";
        }

        public String toStringEnglish() {
            switch (this) {
                case Bachelor:
                    return "Bachelor";
                case Master:
                    return "Master";
                case Doctor:
                    return "Doctor";
            }
            return "";
        }
    }
    private Level __level;
    private int __numberResearch; //Research and Paper
    private String __id,__email, __phoneNumber;
    public Teacher(String ID, String name, String address, Calendar birthday, Gender gender, double salary, Level level, int numberResearch, String email, String phoneNumber) {
        super(name,address,birthday,gender);
        this.__id = ID;
        this.__salary = salary;
        this.__level = level;
        this.__numberResearch = numberResearch;
        this.__email = email;
        this.__phoneNumber = phoneNumber;
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
        return "ID: " + this.__id +
                "\n" + super.toString() +
                "\nEmail: " + this.__email +
                "\nSĐT: " + this.__phoneNumber +
                "\nSố nghiên cứu: " + this.__numberResearch +
                "\nBằng cấp: " + this.__level +
                "\nLương: " + String.format("%.3f",this.__salary);
    }
    private String toStringJapanese() {
        return "";
    }
    private String toStringEnglish() {
        return  "ID: " + this.__id +
                "\n" + super.toString() +
                "\nEmail: " + this.__email +
                "\nSĐT: " + this.__phoneNumber +
                "\nNumber of research: " + this.__numberResearch +
                "\nLevel: " + this.__level +
                "\nSalary: " + String.format("%.3f",this.__salary);
    }
    //endregion
    //region Getters and Setters
    public double getSalary() {
        return this.__salary;
    }
    public Level getLevel() {
        return this.__level;
    }
    public int getNumberResearch() {
        return this.__numberResearch;
    }
    public String getEmail() {
        return this.__email;
    }
    public String getPhoneNumber() {
        return this.__phoneNumber;
    }
    public String getID() {
        return this.__id;
    }
    public void setSalary(double salary) {
        this.__salary = salary;
    }
    public void setLevel(Level level) {
        this.__level = level;
    }
    public void setNumberResearch(int numberResearch) {
        this.__numberResearch = numberResearch;
    }
    public void setEmail(String email) {
        this.__email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.__phoneNumber = phoneNumber;
    }
    public void setID(String ID) {
        this.__id = ID;
    }
    //endregion
}
