switch (num) {
    case 1:
    case 7:
        System.out.println("SK");
        switch (num) {
            case 1:
                System.out.println("1");
                break;
            case 7:
                System.out.println("7");
                break;
        }
        break;
    case 6:
        System.out.println("KTF");
        break;
    case 9:
        System.out.println("LG");
        break;
    default:
        System.out.println("UNKNOWN");
}


switch (num) {
    case 1:
    case 7:
        System.out.println("SK");
        if (num == 1) {
            System.out.println("1");
        } else {
            System.out.println("7");
        }
        break;
    case 6:
        System.out.println("KTF");
        break;
    case 9:
        System.out.println("LG");
        break;
    default:
        System.out.println("UNKNOWN");
}