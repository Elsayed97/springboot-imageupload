package com.example.springbootimageupload.dao;

import com.example.springbootimageupload.entity.Image;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<Image,Long> {
    Optional<Image> findByName(String name);
}
