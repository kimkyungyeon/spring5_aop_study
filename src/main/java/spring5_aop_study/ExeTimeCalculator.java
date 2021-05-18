package spring5_aop_study;

public class ExeTimeCalculator implements Calculator {
	private Calculator delegate;

	public ExeTimeCalculator(Calculator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		long start = System.nanoTime();
//		long start = System.currentTimeMillis();
		long result = delegate.factorial(num);
		long end = System.nanoTime();
//		long end = System.currentTimeMillis();
		System.out.printf("%s.factorial(%d) 실행 시간= %d\n",
				delegate.getClass().getSimpleName(),
				num,(end-start));
		return result;
	}

}
