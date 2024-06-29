package ru.netology.AppConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.netology.repository.PostRepository;
import ru.netology.repository.PostRepositoryStubImpl;
import ru.netology.service.PostService;
import ru.netology.controller.PostController;

@Configuration
public class AppConfig {

	@Bean
	public PostRepository postRepository() {
		return new PostRepositoryStubImpl();
	}

	@Bean
	public PostService postService(PostRepository postRepository) {
		return new PostService(postRepository);
	}

	@Bean
	public PostController postController(PostService postService) {
		return new PostController(postService);
	}
}