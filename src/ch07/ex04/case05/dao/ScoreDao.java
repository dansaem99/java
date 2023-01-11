package ch07.ex04.case05.dao;

import ch07.ex04.case05.domain.Score;

public interface ScoreDao {
	void insertScore(Score score);//row insertScore = 넣을 점수
	Score[] selectScores(); //[]1차원
}
