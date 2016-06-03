package model;

public class Kutikomi {
    private int id; // id
   private String userName; // ユーザー名
   private String review; // 口コミ内容

   public Kutikomi() {
   }

   public Kutikomi(String userName,String review) {
       this.userName = userName;
       this.review = review;
   }

   public Kutikomi(int id, String userName, String review) {
       this.id = id;
       this.userName = userName;
       this.review = review;
   }

   public int getId() {
       return id;
   }

   public String getUserName() {
       return userName;
   }

   public String getReview() {
       return review;
   }
}
