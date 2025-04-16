/**
 * 파일명:Ed01Queue.java <br/>
 * 생성일:2025-04-15
 */
package com.pcwk.ehr.ed01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ed01Queue {

	// 기록 명령어 최대 개수:5, HISTORY_LIMIT
	private static final int HISTORY_LIMIT = 5;

	// historyQueue:
	private Queue<String> historyQueue = new LinkedList<String>();

	// 명령어 저정 함수: addCommand, parameter:String, void
	public void addCommand(String command) {
		// 명령어 저장 : 5, 기존 명령어중 가장먼저 입력한 명령어 삭제
		if (historyQueue.size() == HISTORY_LIMIT) {
			historyQueue.poll();
		}

		boolean flag = this.historyQueue.offer(command);
		String status = (flag == true) ? "추가" : "실패";
		System.out.printf("%s:%s\t", command, status);
		System.out.printf("명려어 개수:%d%n", historyQueue.size());

	}

	// 명령어 조회 함수: showHistory,
	public void showHistory() {
		// System.out.println("showHistory call");
		System.out.println("Command History");
		int i = 1;
		for (String command : historyQueue) {
			// 1.dir
			System.out.printf("%2d.%s%n", i, command);
			i++;
		}

	}

//	import문 정리:ctrl+shift+o 
//	소스 정렬 : ctrl+shift+f 
	public static void main(String[] args) {
		// 명령어 history: Queue, 명령어 저장, 명령어(history) 보기, history =5
		// Scanner통해 명령어 입력:(q를 입력 하면 종료)
		Ed01Queue cmd = new Ed01Queue();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			// q를 입력 하면 프로그램 종료
			System.out.println("q 를 입력 하면 프로그램 종료.");
			System.out.printf("h(history)를 입력하면 최근 입력한 명령어 %d개를 보여 줍니다.>", HISTORY_LIMIT);

			String command = scanner.nextLine();

			if (command.equalsIgnoreCase("q")) {
				System.out.println("┌───────────────────────┐");
				System.out.println("│프로그램 종료               │");
				System.out.println("└───────────────────────┘");

				System.exit(0);
			} else if (command.equalsIgnoreCase("h") || command.equalsIgnoreCase("history")) {
				cmd.showHistory();

			} else {
				cmd.addCommand(command);
			}

		} // while end

	}

}
