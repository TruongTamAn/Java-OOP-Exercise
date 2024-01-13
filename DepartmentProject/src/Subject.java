public class Subject {
    private String __ID, __name,__description;
    private int __numberCredit;
    public Subject(String ID, String name, int numberCredit, String description) {
        this.__ID = ID;
        this.__name = name;
        this.__numberCredit = numberCredit;
        this.__description = description;
    }

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
        return "Mã môn học: " + this.__ID +
                "\nTên môn học: " + this.__name +
                "\nSố lượng tín chỉ: " + this.__numberCredit +
                "\nMô tả môn học: " + this.__description;
    }

    public String toStringJapanese() {
        return "番号: " + this.__ID +
                "\n名前: " + this.__name +
                "\nクレジット: " + this.__numberCredit +
                "\n説明: " + this.__description;
    }
    public String toStringEnglish() {
        return "Subject ID: " + this.__ID +
                "\nName: " + this.__name +
                "\nNumber Credit: " + this.__numberCredit +
                "\nDescription: " + this.__description;
    }

    public String getID() {
        return this.__ID;
    }
    public String getName() {
        return this.__name;
    }
    public String getDescription() {
        return this.__description;
    }
    public int getNumberCredit() {
        return this.__numberCredit;
    }
    public void setID(String id) {
        this.__ID = id;
    }
    public void setName(String name) {
        this.__name = name;
    }
    public void setDescription(String description) {
        this.__description = description;
    }
    public void setNumberCredit(int numberCredit) {
        this.__numberCredit = numberCredit;
    }
}