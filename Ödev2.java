package ödev2;
public class Ödev2 {

    public static void main(String[] args) {
     ApartmanGorevi apartman=new ApartmanGorevi();
     apartman.SetSiteAdi("Yavuz Apartman");
     apartman.oturansayisi=15;
     apartman.SetYoneticiAdi("Recep Yavuz");
     apartman.ortakgiderler=1500;
     
    }
    
}
class ApartmanGorevi {
         private String SiteAdi;
         public int oturansayisi;
         public int ortakgiderler;
         private String yoneticiadi;

         ApartmanGorevi() {
             oturansayisi = 0;
             ortakgiderler = 0;
             yoneticiadi = " ";
             SiteAdi=" ";

         }

         ApartmanGorevi(int oturansayisi) {
             this.oturansayisi = oturansayisi;
             ortakgiderler = 0;
             yoneticiadi = " ";
              SiteAdi=" ";

         }

         ApartmanGorevi(int oturansayisi, int ortakgiderler) {
             this.oturansayisi = oturansayisi;
             this.ortakgiderler = ortakgiderler;
             yoneticiadi = " ";
              SiteAdi=" ";

         }

         ApartmanGorevi(int oturansayisi, int ortakgiderler, String yoneticiadi) {
             this.oturansayisi = oturansayisi;
             this.ortakgiderler = ortakgiderler;
             this.yoneticiadi = yoneticiadi;
              SiteAdi=" ";

         }
         ApartmanGorevi(int oturansayisi, int ortakgiderler, String yoneticiadi,String SiteAdi) {
             this.oturansayisi = oturansayisi;
             this.ortakgiderler = ortakgiderler;
             this.yoneticiadi = yoneticiadi;
             this.SiteAdi=SiteAdi;

         }
         public void ortakgiderzamla(int eklenecektutar){
         ortakgiderler+=eklenecektutar;
         }
          public void ortakgiderindirim(int indirilecektutar){
         ortakgiderler-=indirilecektutar;
         }
public void OturanEkle(int kackisi){
             oturansayisi+=kackisi;

        }
      public void SetYoneticiAdi(String yoneticiadi){
          if (yoneticiadi!="") {
                this.yoneticiadi=yoneticiadi;
          }
           else {
            System.out.println("Lütfen Boş Karakter Girmeyiniz.");
          }
         }
       public String GetYoneticiAdiDegistir(){
             return yoneticiadi;
       }
      public void SetSiteAdi(String SiteAdi){
          if (SiteAdi!="") {
                this.SiteAdi=SiteAdi;
          }
           else {
            System.out.println("Lütfen Boş Karakter Girmeyiniz.");
          }
         }
       public String GetSiteAdi(){
             return SiteAdi;
       }
       public void AdresGoster(){
         System.out.println("Şanlıurfa Merkez");
       }


       class LaleApartmanı extends ApartmanGorevi{

           public void AdresGoster(){
               System.out.println("Hilvan");
           }

       }
}