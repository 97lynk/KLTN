package com.kltn.motelservice.repository;

import com.kltn.motelservice.entity.Post;
import com.kltn.motelservice.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long>, JpaSpecificationExecutor<Post> {
    List<Post> findByUser(User user);

    Optional<Post> findPostById(Long id);

//    Page<Post> findAllByApprovedAndNotApprovedAndDel(boolean approved, boolean notApproved, Pageable pageable, boolean del);

    Page<Post> findAllByApprovedAndNotApproved(boolean approved, boolean notApproved, Pageable pageable);

    Page<Post> findAllByApprovedAndNotApprovedAndAndAccomodation_MotelAndDel(boolean approved, boolean notApproved, boolean motel, Pageable pageable, boolean del);
}
