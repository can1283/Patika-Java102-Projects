import java.util.*;

public class PatikaStore {
    private static List<String> brands = new ArrayList<>();
    private static List<CepTelefonu> cepTelefonlari = new ArrayList<>();
    private static List<Notebook> notebooklar = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        markalariOlustur();
        anaMenu();
    }

    public static void markalariOlustur() {
        brands.add("Samsung");
        brands.add("Lenovo");
        brands.add("Apple");
        brands.add("Huawei");
        brands.add("Casper");
        brands.add("Asus");
        brands.add("HP");
        brands.add("Xiaomi");
        brands.add("Monster");

        Collections.sort(brands); // Markaları alfabetik sıraya göre sırala
    }

    public static void anaMenu() {
        int secim;

        do {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");

            secim = scanner.nextInt();
            scanner.nextLine(); // Boşluğu oku

            switch (secim) {
                case 1:
                    notebookIslemleri();
                    break;
                case 2:
                    cepTelefonuIslemleri();
                    break;
                case 3:
                    markalariListele();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }

            System.out.println();
        } while (secim != 0);
    }

    public static void markalariListele() {
        System.out.println("Markalarımız");
        System.out.println("--------------");

        for (String brand : brands) {
            System.out.println("- " + brand);
        }
    }

    public static void notebookIslemleri() {
        int secim;

        do {
            System.out.println("Notebook İşlemleri");
            System.out.println("1 - Notebook Listele");
            System.out.println("2 - Notebook Ekle");
            System.out.println("3 - Notebook Sil");
            System.out.println("0 - Ana Menüye Dön");
            System.out.print("Tercihiniz: ");

            secim = scanner.nextInt();
            scanner.nextLine(); // Boşluğu oku

            switch (secim) {
                case 1:
                    notebooklariListele();
                    break;
                case 2:
                    notebookEkle();
                    break;
                case 3:
                    notebookSil();
                    break;
                case 0:
                    System.out.println("Ana menüye dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }

            System.out.println();
        } while (secim != 0);
    }

    public static void notebooklariListele() {
        System.out.println("Notebook Listesi\n");
        System.out.println("|  ID  |     PRODUCT NAME     |    PRICE    |  BRAND   |  STORAGE  |  SCREEN  |  RAM  |");

        for (Notebook notebook : notebooklar) {
            System.out.format("|  %-3d |  %-19s |  %-10.2f  |  %-7s  |  %-8d  |  %-7.1f  |  %-5d  |\n",
                    notebook.getId(), notebook.getProductName(), notebook.getPrice(),
                    notebook.getBrand(), notebook.getStorage(), notebook.getScreenSize(), notebook.getRam());
        }
    }

    public static void notebookEkle() {
        Notebook notebook = new Notebook();

        System.out.print("Ürünün sistemde kayıtlı benzersiz numarası: ");
        notebook.setId(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Birim fiyatı: ");
        notebook.setPrice(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("İndirim oranı: ");
        notebook.setDiscount(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Stok miktarı: ");
        notebook.setStock(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Ürün adı: ");
        notebook.setProductName(scanner.nextLine());

        System.out.print("Marka bilgisi: ");
        notebook.setBrand(scanner.nextLine());

        System.out.print("Ram: ");
        notebook.setRam(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Depolama: ");
        notebook.setStorage(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Ekran boyutu: ");
        notebook.setScreenSize(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        notebooklar.add(notebook);

        System.out.println("Notebook başarıyla eklendi.");
    }

    public static void notebookSil() {
        System.out.print("Silmek istediğiniz notebookun benzersiz numarasını girin: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Boşluğu oku

        boolean silindi = false;

        for (Notebook notebook : notebooklar) {
            if (notebook.getId() == id) {
                notebooklar.remove(notebook);
                silindi = true;
                break;
            }
        }

        if (silindi) {
            System.out.println("Notebook başarıyla silindi.");
        } else {
            System.out.println("Böyle bir notebook bulunamadı.");
        }
    }

    public static void cepTelefonuIslemleri() {
        int secim;

        do {
            System.out.println("Cep Telefonu İşlemleri");
            System.out.println("1 - Cep Telefonu Listele");
            System.out.println("2 - Cep Telefonu Ekle");
            System.out.println("3 - Cep Telefonu Sil");
            System.out.println("0 - Ana Menüye Dön");
            System.out.print("Tercihiniz: ");

            secim = scanner.nextInt();
            scanner.nextLine(); // Boşluğu oku

            switch (secim) {
                case 1:
                    cepTelefonlariListele();
                    break;
                case 2:
                    cepTelefonuEkle();
                    break;
                case 3:
                    cepTelefonuSil();
                    break;
                case 0:
                    System.out.println("Ana menüye dönülüyor...");
                    break;
                default:
                    System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
            }

            System.out.println();
        } while (secim != 0);
    }

    public static void cepTelefonlariListele() {
        System.out.println("Cep Telefonu Listesi\n");
        System.out.println("| ID |      PRODUCT NAME     |   PRICE   |  BRAND  | STORAGE | SCREEN | CAMERA | BATTERY | RAM | COLOR |");
        System.out.println("|:--:|:---------------------:|:---------:|:-------:|:-------:|:------:|:------:|:-------:|:---:|:-----:|");

        for (CepTelefonu cepTelefonu : cepTelefonlari) {
            System.out.format("| %-2d |  %-20s | %-9.2f | %-7s |  %-6d |  %-5.1f |  %-5d | %-7.1f |  %-3d | %-5s |\n",
                    cepTelefonu.getId(), cepTelefonu.getProductName(), cepTelefonu.getPrice(),
                    cepTelefonu.getBrand(), cepTelefonu.getStorage(), cepTelefonu.getScreenSize(),
                    cepTelefonu.getCamera(), cepTelefonu.getBattery(), cepTelefonu.getRam(), cepTelefonu.getColor());
        }
    }

    public static void cepTelefonuEkle() {
        CepTelefonu cepTelefonu = new CepTelefonu();

        System.out.print("Ürünün sistemde kayıtlı benzersiz numarası: ");
        cepTelefonu.setId(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Birim fiyatı: ");
        cepTelefonu.setPrice(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("İndirim oranı: ");
        cepTelefonu.setDiscount(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Stok miktarı: ");
        cepTelefonu.setStock(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Ürün adı: ");
        cepTelefonu.setProductName(scanner.nextLine());

        System.out.print("Marka bilgisi: ");
        cepTelefonu.setBrand(scanner.nextLine());

        System.out.print("Depolama: ");
        cepTelefonu.setStorage(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Ekran boyutu: ");
        cepTelefonu.setScreenSize(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Kamera: ");
        cepTelefonu.setCamera(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Pil gücü: ");
        cepTelefonu.setBattery(scanner.nextDouble());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Ram: ");
        cepTelefonu.setRam(scanner.nextInt());
        scanner.nextLine(); // Boşluğu oku

        System.out.print("Renk: ");
        cepTelefonu.setColor(scanner.nextLine());

        cepTelefonlari.add(cepTelefonu);

        System.out.println("Cep telefonu başarıyla eklendi.");
    }

    public static void cepTelefonuSil() {
        System.out.print("Silmek istediğiniz cep telefonunun benzersiz numarasını girin: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Boşluğu oku

        boolean silindi = false;

        for (CepTelefonu cepTelefonu : cepTelefonlari) {
            if (cepTelefonu.getId() == id) {
                cepTelefonlari.remove(cepTelefonu);
                silindi = true;
                break;
            }
        }

        if (silindi) {
            System.out.println("Cep telefonu başarıyla silindi.");
        } else {
            System.out.println("Böyle bir cep telefonu bulunamadı.");
        }
    }
}

class Notebook {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String productName;
    private String brand;
    private int ram;
    private int storage;
    private double screenSize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
}

class CepTelefonu {
    private int id;
    private double price;
    private double discount;
    private int stock;
    private String productName;
    private String brand;
    private int storage;
    private double screenSize;
    private int camera;
    private double battery;
    private int ram;
    private String color;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public double getBattery() {
        return battery;
    }

    public void setBattery(double battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
