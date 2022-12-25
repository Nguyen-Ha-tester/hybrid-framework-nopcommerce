package java_basic;

import org.testng.annotations.Test;

public class topic_09_break_continue {

	public void nested_for() {
		// Nested for
		for (int i = 1; i <= 5; i++) {
			System.out.println("Vong lap for thu nhat: " + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("Vong lap for thu hai: " + j);
				for (int f = 1; f <= 5; f++) {
					System.out.println("Vong lap for thu ba: " + f);
				}
			}
		}
	}

	public void for_break() {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				System.out.println(i);
				break; // break để dừng thực thi lệnh trong vòng lặp hoặc trong mệnh đề được chỉ định, ở đây là mệnh đề if
			}

		}
	}

	@Test
	public void for_continue() {
		for (int i = 0; i < 10; i++) {
			if (i == 4) {
				continue; // sau khi i = 4 thì lệnh sau đó là i++ sẽ không được thực hiện => k in ra 4 mà tiếp tục vòng lặp từ 5
				// Cho nên continue sẽ bỏ qua tại điều kiện đã được xác định.
			}
			System.out.println(i);
		}
	}
}
