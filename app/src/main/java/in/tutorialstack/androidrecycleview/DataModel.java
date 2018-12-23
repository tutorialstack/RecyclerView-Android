package in.tutorialstack.androidrecycleview;

public class DataModel {
    String Title;
    String Date;

    public DataModel(String title, String date) {
        Title = title;
        Date = date;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getTitle() {
        return Title;
    }

    public String getDate() {
        return Date;
    }
}
