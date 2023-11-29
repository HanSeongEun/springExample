package spring.chap01;

import org.springframework.stereotype.Component;

@Component
public class MySQLArticleDao implements ArticleDao {

	//생성자 없음 -> 매개변수 없는 기본 생성자 사용
	
	@Override
	public void insert(Article article) {
		System.out.println("MySQLArticleDao.insert() 실행");

	}

}
