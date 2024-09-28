public class Author {
    private String familyName;
    private String firstName;

    //Конструктор
    public Author (String familyName, String firstName) {
        this.familyName = familyName;
        this.firstName = firstName;
    }

    public Author() {

    }
    //геттеры

    public String getFamilyName() {
        return familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }


}
