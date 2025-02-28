package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Comment;
import service.CommentService;

import java.util.List;

@RestController
@RequestMapping("/api/comments")
public class CommentController {
	
	  @Autowired
	    private CommentService commentService;

	    @GetMapping
	    public List<Comment> getAllComments() {
	        return commentService.fetchAllComments();
	    }

}
