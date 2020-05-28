package lambda;
class MyFunClass implements MyFunctionalInterface {

//	@Override
//	public void run() {
//		System.out.println(" 실행.");
		
//	}
//	
//	
//	}
//	

	};
	fi.run();
	// 간단한 람다표현식. -> run() 메소드 구현하는 부분.
		MyFunctionalInterface fi2 = () -> {
			System.out.println("실행.");
			
		};
		fi2.run();
	}
}
