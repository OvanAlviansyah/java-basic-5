package javabasic6;

public class Hero {

  private String name;
  private int age;
  private int level;
  private int energy = 100;

  public void setProfile(String name, int age, int level) {
    this.name   = name;
    this.age    = age;
    this.level = level;
  }

  public void profile() {
    System.out.println("=//=//=//=//-Profile=//=//=//=//=");    
    System.out.println("Name   : " + this.name);
    System.out.println("Age    : " + this.age);
    System.out.println("Level  : " + this.level);
    System.out.println("Energy : " + this.energy);
    System.out.println("=//=//=//=//=//-=-//=//=//=//=//=");
  }



private void checkHealth() {
  if(this.energy <= 0) {
  System.out.println("Sisa Energy Anda adalah : " + this.energy);
  System.out.println("Energy Anda sudah habis! Player " + this.name + " tamat!");
  System.exit(0);
  }
}

void walk() {
  checkHealth();
  System.out.println(this.name + " sedang berjalan....");
  energy -= 1;
}

void run() {
  checkHealth();
  System.out.println(this.name + " sedang berlari....");
  energy -= 2;
}

void eat() {
  checkHealth();
  System.out.println(this.name + " sedang makan....");
  energy += 2;
}

void drink() {
  checkHealth();
  System.out.println(this.name + " sedang minum....");
  energy += 2;
}

void jump() {
  checkHealth();
  System.out.println(this.name + " sedang lompat....");
  energy += 2;
}

void sit() {
  checkHealth();
  System.out.println(this.name + " sedang duduk....");
  energy += 2;
}

void attack() {
  checkHealth();
  System.out.println(this.name + " sedang diserang....");
  energy -= 30;
}

void remainingEnergy(){
  System.out.println("Sisa Energy Palyer "+ name +" adalah : " + this.energy);
}

/* Buat method untuk lari, makan, minum, lompat, dan duduk. Masing2 memiliki kriteria sebagai berikut:
   - pasang method checkHealth() di dalam method yang akan dibuat
   - Tampilkan pesan kegiatan yang sedang dilakukan, misal, jika lari: " sedang berlari..."
   - ubah health sesuai kegiatan yang dilakukan:
    * lari = -2
    * makan = +2
    * minum = +2
    * lompat = -2
    * duduk = +1
    Contoh method seperti method jalan() diatas.

  */

}