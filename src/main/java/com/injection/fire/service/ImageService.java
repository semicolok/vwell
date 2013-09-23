package com.injection.fire.service;

import org.springframework.web.multipart.MultipartFile;

public interface ImageService {

	Object uploadImage(MultipartFile multipartFile);
	Object getUploadedImage(Long id);

}
