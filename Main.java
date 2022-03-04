class Main {
  public static void main(String[] args) {
    String name = "takashi";
    int age = 25;
    double height = 170;
    double weight = 70;
    double bmi = weight / height / height;
    System.out.println("名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    System.out.println("BMIは" + bmi + "です");

  }
}