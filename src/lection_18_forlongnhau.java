public class lection_18_forlongnhau {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("In ra hình vuông đặc:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i +""+ j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình vuông rỗng:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if(j == 1 || j == 7 || i == 1 || i == 7) {

                System.out.print(i +""+ j + "\t");
                }
                 else {
                     System.out.print("\t");
                }
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra tam giác đặc:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i +""+ j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình tam giác rỗng:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if(j == 1 || i == 7 || i == j)
                 System.out.print(i +""+ j + "\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình vuông đặc:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print(i +""+ j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình tam giác ngược đặc:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i + 1; j++) {
                    System.out.print(i +""+ j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình tam giác ngược rỗng:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7 - i + 1; j++) {
                if(j == 1 || i == 1 || (j == 7 - i + 1))
                 System.out.print(i +""+ j + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình tam giác cân đặc:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if(j > 4 - i  && j < 4 + i)
                    System.out.print(i +""+ j + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình tam giác cân rỗng:");
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if(j > 4 - i  && j < 4 + i)
                    if(j == 4 - i + 1  || j == 4 + i - 1 || i == 4)
                        System.out.print(i +""+ j + "\t");
                    else System.out.print("\t");
                else System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình thoi đặc:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if((i >= j &&  i <= 4) || (j > i- 4 &&  i > 4))
                    System.out.print(i +""+ j + "\t");
                else System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình thoi rỗng:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if((i >= j &&  i <= 4) || (j > i-4 &&  i > 4)) {
                    if((i <= 4 && (j == 1 || i == j )) || (i > 4 && (j == 4 || j ==  4 - (7 - i)))) {
                        System.out.print(i +""+ j + "\t");
                    }  else System.out.print("\t");
                }
                else System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình vuông đặc:");
        int num1 = 7 / 2 + 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if((i <= num1 && j <= i) || (i > num1 && j >= i) || i == 4) {

                        System.out.print(i +""+ j + "\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("In ra hình vuông đặc:");
        int num = 7 / 2 + 1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if((i <= num && j <= i) || (i > num && j >= i) || i == 4) {
                    if((i <= num && (i == j || j == 1 || i == 4)) || (i > num && (i == j || j == 7 ))) {
                        System.out.print(i +""+ j + "\t");
                    } else
                        System.out.print("\t");
                }
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
