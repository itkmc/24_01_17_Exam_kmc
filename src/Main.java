
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static <WiseSaying> void main(String[] args) {
		System.out.println("== 명언 앱 실행 ==");
		Scanner sc = new Scanner(System.in);

		int lastId = 0;

		List<WiseSaying> wiseSayings = new ArrayList<>();

		while (true) {
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();

			int id = lastId + 1;

			if (cmd.equals("등록")) {
				System.out.print("명언 : ");
				String content = sc.nextLine().trim();
				System.out.print("작가 : ");
				String author = sc.nextLine().trim();

				WiseSaying wiseSaying = WiseSaying(id, content, author);
				wiseSayings.add(wiseSaying);

				System.out.printf("%d번 명언이 등록됨\n", id);
				lastId++;

			} else if (cmd.equals("목록")) {
				System.out.println("  번호  /   작가   /   명언   ");

			} else if (cmd.equals("수정")) {
				System.out.println("명언(기존) : ", content);
				System.out.println("새 명언 : ");
				String content = sc.nextLine().trim();
				System.out.println("작가(기존) : ", author);
				System.out.println("새 작가 : ");
				String author = sc.nextLine().trim();

			} else if (cmd.equals("삭제")) {
				
				System.out.println("%d번 글이 삭제 되었음/n");
			}
		}

	}

}
