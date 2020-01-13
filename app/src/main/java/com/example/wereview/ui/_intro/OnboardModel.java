package com.example.wereview.ui._intro;

class OnboardModel {

    private String title, body;
    private int image;

    public OnboardModel(String title, String body, int image) {
        this.title = title;
        this.body = body;
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

}
