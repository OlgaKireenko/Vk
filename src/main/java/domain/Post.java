package domain;

public class Post {
    private int postID;
    private String authorID;
    private int ownerID; // хозяин аккаунта в котором сделан пост
    private int created_by; //ID admin
    private int date;
    private String textBody;
    private int replyOwnerId;
    private int replyPostId;
    private boolean privateStatus; // who can browse only friends or not
    private CommentsInfo infoComments;
    private CopyRight copyRight;
    private Likes infoLike;
    private Repost infoRepost;
    private Views infoViews;
    private String postType;
    private PostSource infoPostSource;
    private Geo infoGeo; //отметка на карте, привязка к месту
    private int signerID;
    private boolean isFavorite;
    private Donat infoDonat;
    private int postponedID;
    private boolean markedAsAds;

}