package day07_0116;
class Phone{
    String bander;
    String version;
    String model;
}
public class Reference {
    public static void main(String[] args) {
        int[] arr1; //정수형 배열 변수 arr1 선언
        int[] arr2; //정수형 배열 변수 arr2 선언
        int[] arr3; //정수형 배열 변수 arr3 선언

        arr1 = new int[] {1,2,3};

        System.out.println();

        for(int i = 0; i < arr1.length; i++){

            System.out.println(arr1[i] + " " + arr1.hashCode());
        }

        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Phone phone3 = null;//참조변수는 null로 초기화

        System.out.println();
        System.out.println(phone3);

        System.out.println(phone1 == phone2);
        System.out.println(phone1 == phone3);
        System.out.println(phone2 == phone3);

        int[] intArray = new int[]{0,0,0,0};//null은 주소가 없다.
        intArray[0] = 10;
        System.out.println(intArray[0]);
        System.out.println();

        for(int data : intArray){
            System.out.print(data+" ");
        }

        System.out.println();

        for(int index = 0; index <intArray.length;index ++ ){
            System.out.println(index+1 +"번째 값 : "+intArray[index]);

        }

        String hobby = "여행";
        hobby = null;//기존의 여행이라는 문자열에 저장된 Heap영역의 주소값을 지웟다.

        String kind1 = "자동차";
        String kind2 = kind1;
        System.out.println(kind2.toString());
        System.out.println(kind2);
        System.out.println(kind2.hashCode()+ " " + kind1.hashCode());
        System.out.println(kind1 + " " + kind2);
        //kind1 = null;// 출력 불가
        System.out.println();
        System.out.println(kind2.hashCode()+ " " + kind1.hashCode());
        System.out.println(kind1 + " " + kind2);






    }
}
