package com.MultiThreading.Synchronized;

import com.MultiThreading.InterThreadCommunication.ThreadUtil;

public class CharThread extends Thread implements ThreadUtil{

	Display d;
	LockTypes lock;

	CharThread(Display d, LockTypes lock) {
		this.d = d;
		this.lock = lock;
	}

	@Override
	public void run() {
		switch (lock) {

		case SYNCHRONIZEDMETHOD:
			setCurrentThreadName("CHARACTER THREAD - EXECUTING displayCharacters();");
			d.displayCharacters();
			break;

		case SYNCHRONIZEDBLOCK:
			setCurrentThreadName("CHARACTER THREAD - EXECUTING printCharacters();");
			d.printCharacters();
			break;

		case SYNCHRONIZEDCLASSLOCK:
			setCurrentThreadName("CHARACTER THREAD - EXECUTING printCharactersWithClassLevelLock();");
			d.printCharactersWithClassLevelLock();
			break;

		default:
			System.out.println("This is not supposed to happen");
			break;
		}
	}
}
