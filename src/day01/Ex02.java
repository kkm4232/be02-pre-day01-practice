package day01;

public class Ex02 {
    public static void main(String[] args) {
        // 다음은 0부터 100까지 숫자 중 하나를 랜덤하게 생성해서
        // num에 저장하는 코드이다.
        Integer num = (int)(Math.random()*100);

        // 위 코드를 활용하여 연금 복권 번호를 생성해보시오.

        // 다음 코드를 6번 반복
        //     0부터 9까지 숫자 중 랜덤한 숫자를 하나 생성해서 저장
        //     저장한 숫자를 출력


        for (num = 0; num < 6; num = num +1){
            Integer num1 = (int)(Math.random()*9);
            System.out.println(num1);
        }


    }
}