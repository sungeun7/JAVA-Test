if (score > 60) {
    System.out.println("합격입니다.");
} else {
    System.out.println("불합격입니다.");
}

if (num > 0) {
    System.out.println("양수입니다.");
} else if (num < 0) {
    System.out.println("음수입니다.");
} else {
    System.out.println("0입니다.");
}

if (score >= 90) {
    System.out.println("A등급");
} else if (score >= 80 && score < 90) {
    System.out.println("B등급");
} else if (score >= 70 && score < 80) {
    System.out.println("C등급");
} else {
    System.out.println("F등급");
}