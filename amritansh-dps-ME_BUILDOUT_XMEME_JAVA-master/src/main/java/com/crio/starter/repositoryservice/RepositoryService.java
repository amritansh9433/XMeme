package com.crio.starter.repositoryservice;

import java.util.List;
import java.util.Map;

import com.crio.starter.entities.PostEntity;
import com.crio.starter.exceptions.PostNotFoundException;

public interface RepositoryService {
    
    List<PostEntity> getPosts();

    PostEntity getPost(long postId) throws PostNotFoundException;

    long savePost(PostEntity post);

    void updatePost(Map<String, Object> updates, long postId) throws PostNotFoundException;
}
