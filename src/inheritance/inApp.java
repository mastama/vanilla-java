package inheritance;

public class inApp {
    public static void main(String[] args) {
        InquiryRequest request = new InquiryRequest();
        request.amount = "45000";
        request.noHp = "08165465165";
        request.clientId = "4596";
        request.channelId = "6666";

        System.out.println(request.amount);
        System.out.println(request.noHp);
        System.out.println(request.clientId);
        System.out.println(request.channelId);
    }
}
