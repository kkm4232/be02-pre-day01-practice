package day01;

class School {
    public static void main(String[] args) {
        // 클래스로 객체 생성
        // 객체를 저장할 수 있는 변수 생성
        Student kty;

        // 앞에서 만든 변수에 new로 객체를 생성해서 = 으로 저장
        kty = new Student();
        kty.age = 26;
        kty.name = "김태윤";
        kty.major = true;



        Student yhd;
        yhd = new Student();

        // 객체 안에 있는 변수, 메소드 사용할 때는 변수이름 다음 . 사용
        yhd.age = 31;
        yhd.name = "유형도";

        Student kkm;
        kkm = new Student();
        kkm.age = 27;
        kkm.name = "김경미";
        kkm.major = false;

        Integer totalAge;
        totalAge = kty.age + yhd.age * kkm.age;


        // 산술 연산자
        Integer result ;
        result = kty.age + yhd.age; // 57
        System.out.println(result);
        result = kty.age - yhd.age; // -4
        System.out.println(result);
        result = kty.age * yhd.age; // 806
        System.out.println(result);
        result = kty.age / yhd.age; // 0, 몫만나옴
        System.out.println(result);
        result = kty.age % yhd.age; // 26
        System.out.println(result);

        // 괄호 -> 산(술) -> 비교 -> 논(리) -> 대(입)

        // 비교 연산자
        Boolean result2;
        result2 = kty.age + kkm.age > yhd.age;
        System.out.println(result2);
        result2 = kty.age >= yhd.age;
        System.out.println(result2);
        result2 = kty.age < yhd.age;
        System.out.println(result2);
        result2 = kty.age <= yhd.age;
        System.out.println(result2);
        result2 = kty.age == yhd.age;
        System.out.println(result2);
        result2 = kty.age != yhd.age;
        System.out.println(result2);

        // 논리 연산자
        //  연산      결과
        // t && t      t
        //



        Class Linux;
        Linux = new Class();
        Linux.subject_name = "리눅스";
        Linux.subject_time =  2;

        Class DB;
        DB = new Class();
        DB.subject_name = "데이터베이스";
        DB.subject_time =  8;

        Class SW;
        SW = new Class();
        SW.subject_name = "소프트웨어 공학";
        DB.subject_time =  3;






    }
}