public class Runner {
    public static void main(String[] args) {
        System.out.println(Review.sentimentVal("This"));
        System.out.println(Review.sentimentVal("place"));
        System.out.println(Review.sentimentVal("was"));
        System.out.println(Review.sentimentVal("horrible"));

        


        System.out.println(Review.totalSentiment("simpleReview.text"));
    }
}