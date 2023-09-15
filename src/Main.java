import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp =new Scanner(System.in);
        int right=3,balance=2500;
        int select;
        while(right>0) {
                System.out.print("Kullanıcı Adınız : ");
                userName = inp.nextLine();
                System.out.print("Şifreniz : ");
                password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba,Kodluyoruz Bankasına Hoşgeldiniz.");
                    do {System.out.println("""
                             \s
                            1-Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgulama
                            4-Çıkış""");
                        System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                        select= inp.nextInt();
                        if (select==1){
                            System.out.print("Para Miktarını Giriniz : ");
                            int price=inp.nextInt();
                            balance+=price;
                            System.out.println("\n");
                        } else if (select==2) {
                            System.out.print("Para Miktarını Giriniz : ");
                            int price=inp.nextInt();
                            if (price>balance){
                                System.out.print("Bakiyeniz Yetersiz.");
                                System.out.println("\n");
                            }else {
                                balance -= price;
                                System.out.println("\n");
                            }
                        } else if (select==3) {
                            System.out.print("Bakiyeniz : "+ balance);
                            System.out.println("\n");
                        }
                    }while (select!=4);
                        System.out.println("İşleminiz sona ermiştir.İyi Günler.");
                        break;
            }else{
                right--;
                System.out.println("Kullanıcı adınızı veya Şifrenizi hatalı girdiniz.Tekrar Deneyin!");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else{
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}