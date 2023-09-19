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

    public List<Article> findAll(){
        return blogRepository.findAll();
    }
}
