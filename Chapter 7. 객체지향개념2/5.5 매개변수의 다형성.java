class Product {
    int price; // 제품가격
    int bonusPoint; //보너스점수
}

class Tv extends Product {}
class Computer extends Product {}
class Audio extends Product {}

class Buyer { // 물건사는 사람
    int money = 1000; // 소유금액
    int bonusPoint = 0; // 보너스점수
}


Buyer b = new Buyer();

Tv tv = new Tv();
Computer com = new Computer();

b.buy(tv);
b.buy(com);

Product p1 = new Tv();
Product p2 = new Computer();
Product p3 = new Audio();

void buy(Tv t) {
    money -= t.price;
    bonusPoint += t.bonusPoint;
}

void buy(Product p) {
    money -= p.price;
    bonusPoint += p.bonusPoint;
}