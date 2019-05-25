package com.kltn.motelservice.service;

import com.kltn.motelservice.model.CommentDTO;
import org.springframework.data.domain.Page;
import org.springframework.security.oauth2.provider.OAuth2Authentication;

import java.util.List;

public interface CommentService {

    Page<CommentDTO> getCommentByIdPost(Long idPost, int page);

    CommentDTO createComment(CommentDTO commentDTO, String email);

    CommentDTO updateComment(Long id, CommentDTO commentDTO, String email);

    String deleteComment(Long id);
}
