// 회문수인지 아닌지 구하는 프로그램.(숫자를 거꾸로 읽어도 앞으로 읽는 것과 같은 수)

// 실행결과
// 12321은(는) 회문수 입니다.

public class Main {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number; // number을 tmp에 저장
        int result = 0; // 변수 number를 거꾸로 변환해서 담을 변수


        while (tmp != 0) {
            // 알맞은 코드를 넣어 완성하시오.
            // 내가 처음 쓴 답 : result = (tmp / 10000) + (tmp % 10000 / 1000 * 10) + (tmp % 1000 / 100 * 100) + (tmp % 100 / 10 * 1000) + (tmp % 10 * 10000); // result를 number를 거꾸로 한 수로 초기화. while문 없이 써야하고 입력 자릿수 변경 시 일일이 바꿔야함
            result = result * 10 + tmp % 10; // 기존 결과에 10을 곱해서 더한다.
            tmp /= 10; // tmp = tmp / 10;와 같음. tmp가 10으로 나눠지지 않을때까지 반복
        }

        if (number == result) {
            System.out.println(number + "은(는) 회문수 입니다.");
        } else {
            System.out.println(number + "은(는) 회문수가 아닙니다.");
        }
    } // main
} // clas