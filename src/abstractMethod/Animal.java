package abstractMethod;

public class Animal {
    public String name;

    // abstract hanya definisi dari methodnya saja

    //jika menggunakan abstract maka class turunannya wajib mengoverride method yang ada pada parentnya
    public void run(){};
}
