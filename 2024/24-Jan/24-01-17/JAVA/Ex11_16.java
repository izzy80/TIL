package etc;

import java.util.*;

public class Ex11_16 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("myId", "1234");
        map.put("asdf", "1111");
        //key값을 중복해서 사용한다고 해서 에러가 발생하지 않고, 마지막 값으로 변경된다.
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);	// 화면으로부터 라인단위로 입력받는다.

        while(true) {
            System.out.println("id와 password를 입력해주세요.");
            System.out.print("id :");
            //trim() : 앞 뒤 공백 삭제
            String id = s.nextLine().trim(); //"1234  " -> "1234"

            System.out.print("password :");
            String password = s.nextLine().trim();
            System.out.println();

            if(!map.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.");
                continue;
            }

            if(!(map.get(id)).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            } else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        } // while
    } // main의 끝
}

