import java.util.Scanner;
public class javacalculator {
    public static void main(String[] args)
    {
        // Input değerine göre işlem seçimi yapan ve sonucu çıktı olarak veren mini hesap makinesi yapımı
        // * Math kütüphanesi kullanılarak

        Scanner scanner = new Scanner(System.in);
        System.out.println("***********************");
        System.out.println("İşlem türünü seçin : ");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.println("5 - Bir sayinin bir sayiya göre üstünü alma");
        System.out.println("6 - Bir sayinin digerine bölümünden kalan sayiyi bulma");
        System.out.println("7 - Kare alma");
        System.out.println("8 - 10 üzeri kuvvet alma");
        System.out.println("9 - Karekök Alma");
        System.out.println("10 - Bir sayinin 2 üzeri kuvvetini alma");
        System.out.println("11 - Faktöriyel alma");
        System.out.println("***********************");
        System.out.print("İşlem tipini girin : ");
        int islem_tipi = scanner.nextInt();
        if(islem_tipi <= 6)
        {
            System.out.print("1. sayiyi girin: ");
            double sayi_1 = scanner.nextDouble();
            System.out.print("2. sayiyi girin: ");
            double sayi_2 = scanner.nextDouble();
            switch(islem_tipi)
            {
                case 1:
                    System.out.println(sayi_1 + sayi_2); break;
                case 2:
                    System.out.println(sayi_1 - sayi_2); break;
                case 3:
                    System.out.println(sayi_1 * sayi_2); break;
                case 4:
                    System.out.println(sayi_1 / sayi_2); break;
                case 5:
                    System.out.println(Math.pow(sayi_1,sayi_2)); break;
                case 6:
                    System.out.println(sayi_1 % sayi_2); break;
                default:
                    System.out.println("Geçersiz işlem");
            }
        }
        else if(islem_tipi > 6)
        {
            System.out.print("Üzerinde işlem yapilacak sayiyi girin: ");
            double sayi = scanner.nextDouble();
            switch(islem_tipi)
            {
                case 7:
                    System.out.println(sayi * sayi); break;
                case 8:
                    System.out.println(Math.pow(10,sayi)); break;
                case 9:
                    System.out.println(Math.sqrt(sayi)); break;
                case 10:
                    System.out.println(Math.pow(2,sayi)); break;
                case 11:
                    int deger = (int)sayi;
                    int sonuc = 1;
                    for(int i = deger;i>=1;i--)
                    {
                        sonuc = sonuc * i;
                    }
                    System.out.println(sonuc); break;
                default:
                    System.out.println("Geçersiz işlem");
            }
        }
    }
    }
