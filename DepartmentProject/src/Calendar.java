public class Calendar {
    private int __day, __month, __year;

    public Calendar(int day, int month,int year) {
        this.__day = day;
        this.__month = month;
        this.__year = year;
    }

    @Override
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
        return "Ngày " + String.format("%02d",this.__day) +
                ", tháng " + String.format("%02d",this.__month) +
                ", năm " + String.valueOf(this.__year);
    }

    private String toStringJapanese() {
        return String.valueOf(this.__year) + "年" +
                String.valueOf(this.__month) + "月" +
                String.valueOf(this.__day) + "日";
    }

    private String toStringEnglish() {
        String monthName = new String();
        switch (__month) {
            case 1:
                monthName = "January";
                break;
            case 2:
                monthName = "February";
                break;
            case 3:
                monthName = "March";
                break;
            case 4:
                monthName = "April";
                break;
            case 5:
                monthName = "May";
                break;
            case 6:
                monthName = "June";
                break;
            case 7:
                monthName = "July";
                break;
            case 8:
                monthName = "August";
                break;
            case 9:
                monthName = "September";
                break;
            case 10:
                monthName = "October";
                break;
            case 11:
                monthName = "November";
                break;
            case 12:
                monthName = "December";
                break;
        }
        String dayPostfix;
        switch (__day) {
            case 1:
                dayPostfix = "st";
                break;
            case 2:
                dayPostfix = "nd";
                break;
            case 3:
                dayPostfix = "rd";
                break;
            case 21:
                dayPostfix = "st";
                break;
            case 22:
                dayPostfix = "nd";
                break;
            case 23:
                dayPostfix = "rd";
                break;
            case 31:
                dayPostfix = "st";
                break;
            default:
                dayPostfix = "th";
        }
        return monthName + " " + String.valueOf(__day) + dayPostfix + ", " + String.valueOf(__year);
    }
}
