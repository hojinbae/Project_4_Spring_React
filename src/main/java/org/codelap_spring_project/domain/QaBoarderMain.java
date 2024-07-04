package org.codelap_spring_project.domain;

//import lombok.Getter;
//import lombok.Setter;
//
//@Getter
//@Setter
public class QaBoarderMain {
    private String qaid;
    private String author;
    private String title;
    private String created_at;
    private String content;
    private String views;
    private String likes;
    private String imagename;
    private String festivalid;

    public String getQacomments_count() {
        return qacomments_count;
    }

    public void setQacomments_count(String qacomments_count) {
        this.qacomments_count = qacomments_count;
    }

    public String getFestivalid() {
        return festivalid;
    }

    public void setFestivalid(String festivalid) {
        this.festivalid = festivalid;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getViews() {
        return views;
    }

    public void setViews(String views) {
        this.views = views;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getQaid() {
        return qaid;
    }

    public void setQaid(String qaid) {
        this.qaid = qaid;
    }

    private String qacomments_count;


    public QaBoarderMain(String qaid, String author, String title, String created_at, String content, String views, String likes, String imagename, String festivalid, String qacomments_count) {
        this.qaid = qaid;
        this.author = author;
        this.title = title;
        this.created_at = created_at;
        this.content = content;
        this.views = views;
        this.likes = likes;
        this.imagename = imagename;
        this.festivalid = festivalid;
        this.qacomments_count = qacomments_count;
    }

    public QaBoarderMain(){

    }
}
