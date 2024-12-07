package service;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import model.Comment;

import java.util.Arrays;
import java.util.List;
@Service
public class CommentService {
	
	 private final RestTemplate restTemplate;

	    public CommentService(RestTemplate restTemplate) {
	        this.restTemplate = restTemplate;
	    }

	    public List<Comment> fetchAllComments() {
	        String url = "https://jsonplaceholder.typicode.com/comments";
	        Comment[] commentsArray = restTemplate.getForObject(url, Comment[].class);
	        return Arrays.asList(commentsArray);
	    }

}
