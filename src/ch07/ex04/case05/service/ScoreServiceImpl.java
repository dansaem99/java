package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
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
			scores[i] = new Score[];
			int sum =0;
			for(int j = 0; j <scores[0].length; j++) {
				sum += scores[i][j];
				System.out.printf("%5d", scores[i][j]);
			}
		}
	}
}
