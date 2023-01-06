package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl() {}
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		// return scoreDao.selectScores();
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	
	// 과제: 학생별 합계, 평균 필드를 채워라.
	private void calcScore(Score[] scores) {
		for(int i =0; i < scores.length; i++) {
			scores[i].setSum(
					scores[i].getKor() +
					scores[i].getEng() +
					scores[i].getMath());
			scores[i].setAvg(scores[i].getSum() / 3);
			
		}
	}
}
