package td.nhan.listview02.model;

public class Technology {
    private int resImg;
    private String title, sub, content;

    public Technology(int resImg, String title, String sub, String content) {
        this.resImg = resImg;
        this.title = title;
        this.sub = sub;
        this.content = content;
    }

    public int getResImg() {
        return resImg;
    }

    public void setResImg(int resImg) {
        this.resImg = resImg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSub() {
        return sub;
    }

    public void setSub(String sub) {
        this.sub = sub;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Technology{" +
                "resImg=" + resImg +
                ", title='" + title + '\'' +
                ", sub='" + sub + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
