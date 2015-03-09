package test;

import java.util.ArrayList;

//≤‚ ‘
public class Test {
	int test;
	static ArrayList<EvaluateVo> quizList = new ArrayList<EvaluateVo>();
	static int[] values = { 1, 2, 3,4,5,6};

	static ArrayList<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		for (int i = 1; i < 7; i++) {
			EvaluateVo x=new EvaluateVo();
			x.setSelectNumber(i);
			quizList.add(x);
		}
		test1(2,3);
		for (int i = 0; i < quizList.size(); i++) {
			System.out.println(quizList.get(i).getSelectNumber()+"====");
		}
	}
	public static void test1(int score,int currentViewPageID){
		int temp = score;
		quizList.get(currentViewPageID).setSelectNumber(score);
		for (int j = 0; j < quizList.size(); j++) {
			if (temp == quizList.get(j).getSelectNumber() && j != currentViewPageID) {
				if(temp==5){
					quizList.get(j).setSelectNumber(0);
				}else{
					quizList.get(j).setSelectNumber(quizList.get(j).getSelectNumber() + 1);
					for (int k = 0; k < quizList.size(); k++) {
						if (quizList.get(k).getSelectNumber() == quizList.get(j).getSelectNumber() && k != j) {
							quizList.get(k).setSelectNumber(quizList.get(k).getSelectNumber() + 1);
							temp = quizList.get(k).getSelectNumber();
							currentViewPageID=k;
						}
					}
				}
			}
			
		}
	}

}