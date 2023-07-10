import java.util.*;

interface Address {
    // Adres interface'i
    // Gerekli fonksiyonları burada tanımlayabilirsiniz
}

class HomeAddress implements Address {
    // Ev adresi sınıfı
    // Adres interface'inden kalıtım alabilir ve gerekli fonksiyonları uygulayabilirsiniz
}

class BusinessAddress implements Address {
    // İş adresi sınıfı
    // Adres interface'inden kalıtım alabilir ve gerekli fonksiyonları uygulayabilirsiniz
}

class AddressManager {
    public static void addAddress(User user, Address address) {
        // User nesnesinin adres listesine eleman ekleme işlemini gerçekleştiren fonksiyon
    }

    public static void removeAddress(User user, Address address) {
        // User nesnesinin adres listesinden eleman çıkarma işlemini gerçekleştiren fonksiyon
    }
}

abstract class Account {
    private AuthenticationStatus loginStatus;
    private User user;
    private ArrayList<Insurance> insurances;

    public enum AuthenticationStatus {
        SUCCESS,
        FAIL
    }

    public void login(String email, String password) throws InvalidAuthenticationException {
        // email ve şifre bilgisini kontrol eden fonksiyon
        // Giriş işlemi başarılıysa loginStatus'ü SUCCESS olarak ayarlar
        // Giriş işlemi başarısızsa InvalidAuthenticationException fırlatır
    }

    public abstract void addInsurance(Insurance insurance);

    public void showUserInfo() {
        // Kullanıcının bilgilerini ekrana yazdıran fonksiyon
    }

    // Diğer fonksiyonlar ve getter/setter metodları
}

class Individual extends Account {
    @Override
    public void addInsurance(Insurance insurance) {
        // Bireysel müşteri için sigorta ekleyen fonksiyon
        // Fiyat hesaplamasını bireysel müşteriye göre yapar
    }
}

class Enterprise extends Account {
    @Override
    public void addInsurance(Insurance insurance) {
        // Kurumsal müşteri için sigorta ekleyen fonksiyon
        // Fiyat hesaplamasını kurumsal müşteriye göre yapar
    }
}

abstract class Insurance {
    private String name;
    private double price;
    private Date startDate;
    private Date endDate;

    public abstract void calculate();

    // Diğer fonksiyonlar ve getter/setter metodları
}

class HealthInsurance extends Insurance {
    @Override
    public void calculate() {
        // Sağlık sigortası için fiyat hesaplama işlemini gerçekleştiren fonksiyon
    }
}

class ResidenceInsurance extends Insurance {
    @Override
    public void calculate() {
        // Konut sigortası için fiyat hesaplama işlemini gerçekleştiren fonksiyon
    }
}

class TravelInsurance extends Insurance {
    @Override
    public void calculate() {
        // Seyahat sigortası için fiyat hesaplama işlemini gerçekleştiren fonksiyon
    }
}

class CarInsurance extends Insurance {
    @Override
    public void calculate() {
        // Otomobil sigortası için fiyat hesaplama işlemini gerçekleştiren fonksiyon
    }
}

class AccountManager {
    private TreeSet<Account> accounts;

    public AccountManager() {
        accounts = new TreeSet<>();
    }

    public Account login(String email, String password) {
        // email ve şifre bilgisini alarak kullanıcıyı giriş yapmaya çalışan fonksiyon
        // Eşleşen bir hesap bulunursa ilgili Account nesnesini döndürür
        // Eşleşen bir hesap bulunamazsa null döndürür
    }
}

class InvalidAuthenticationException extends Exception {
    // Giriş bilgileri hatalı olduğunda fırlatılan özel hata sınıfı
}

class User {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String profession;
    private int age;
    private ArrayList<Address> addresses;
    private Date lastLoginDate;

    // Diğer fonksiyonlar ve getter/setter metodları
}

public class Main {
    public static void main(String[] args) {
        // Klavyeden email ve şifre bilgisini alarak giriş yapmaya çalışan kodu burada yazabilirsiniz
        // AccountManager sınıfını kullanarak giriş işlemini gerçekleştirebilirsiniz
    }
}
