package spring.chap01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("writeArticleService")
public class WriteArticleServiceImpl implements WriteArticleService {
	
	@Autowired
	private ArticleDao articleDao;// 구현 객체 저장

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	//기본생성자 : setter방식으로 주입시 기본 생성자 사용, 매개변수가 있는 생성자가 있기 때문에
	public WriteArticleServiceImpl() {}

	public WriteArticleServiceImpl(ArticleDao articleDao) { 
		 this.articleDao = articleDao; // MySQLArticleDao객체 저장 }
	}
	
	@Override
	public void write(Article article) {
		System.out.println("WriteArticleServiceImpl.write() 메서드 실행");
		articleDao.insert(article);
	}

}
