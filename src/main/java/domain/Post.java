package domain;

public class Post {
    private int postID;
    private String authorID;
    private String textBody;
    private String infoComments;
    private int countLike;
    private int countRepost;
    private int countViews;
    private int date;
    private boolean privateStatus; // who can browse only friends or not
    private int ownerID; // хозяин аккаунта в котором сделан пост
    private int created_by; //ID admin
    private int replyOwnerId;
    private int replyPostId;
    private String postType;
    private String geo; //отметка на карте, привязка к месту

}