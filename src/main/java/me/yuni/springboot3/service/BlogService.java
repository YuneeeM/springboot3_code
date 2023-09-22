package me.yuni.springboot3.service;

import lombok.RequiredArgsConstructor;
import me.yuni.springboot3.DTO.AddArticleRequest;
import me.yuni.springboot3.domain.Article;
import me.yuni.springboot3.repository.BlogRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BlogService {

    private final BlogRepository blogRepository;

    //블로그 글 추가 메서드
    public Article save(AddArticleRequest request){
        return blogRepository.save(request.toEntity());
    }

    //모든 데이터 조회
    public List<Article> findAll(){
        return blogRepository.findAll();
    }

    //글 ID 조회
    public Article findById(Long id){
        return blogRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("not found: "+ id));
    }

    //글 삭제
    public void delete(Long id){
        blogRepository.deleteById(id);
    }

    //글 수정

}
