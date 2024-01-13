public class Person {
    private String __name, __address;
    private Calendar __birthday;
    public enum Gender {
        Male ,
        Female;

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

        private String toStringJapanese() {
            switch (this) {
                case Male:
                    return "男";
                case Female:
                    return "女";
            }
            return "";
        }

        private String toStringVietnamese() {
            switch (this) {
                case Male:
                    return "Nam";
                case Female:
                    return "Nữ";
            }
            return "";
        }

        private String toStringEnglish() {
            switch (this) {
                case Male:
                    return "Male";
                case Female:
                    return "Female";
            }
            return "";
        }
    }
    private Gender __gender;
    public Person(String name, String address, Calendar birthday, Gender gender) {
        this.__name = name;
        this.__address = address;
        this.__birthday = birthday;
        this.__gender = gender;
    }

    //region tostring
    public String toString() {
        switch (LanguageSystem.language) {
            case Japanese:
                return toStringJapanese();
            case Vietnamese:
                return toStringVietnamese();
            default:
                return toStringEnglish();
        }
    }

    private String toStringVietnamese() {
        return "Tên: " + this.__name +
                "\nĐịa chỉ: " + this.__address +
                "\nNgày sinh: " + this.__birthday +
                "\nGiới tinh: " + this.__gender;
    }

    private String toStringJapanese() {
        return "名前: " + this.__name +
                "\n住所: " + this.__address +
                "\n生年月日: " + this.__birthday +
                "\n性別: " + this.__gender;
    }

    private String toStringEnglish() {
        return "Name: " + this.__name +
                "\nAddress: " + this.__address +
                "\nBirthday: " + this.__birthday +
                "\nGender: " + this.__gender;
    }
    //endregion
    //region getters and setters
    public String getName() {
        return this.__name;
    }
    public String getAddress() {
        return this.__address;
    }
    public Calendar getBirthday() {
        return this.__birthday;
    }
    public Gender getGender() {
        return this.__gender;
    }
    public void setName(String name) {
        this.__name = name;
    }
    public void setAddress(String address) {
        this.__address = address;
    }
    public void setBirthday(Calendar birthday) {
        this.__birthday = birthday;
    }
    public void setGender(Gender gender) {
        this.__gender = gender;
    }
    //endregion
}