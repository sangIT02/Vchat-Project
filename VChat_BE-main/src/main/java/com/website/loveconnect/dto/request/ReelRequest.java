package com.website.loveconnect.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ReelRequest {
    @NonNull
    private MultipartFile video;
    @NotBlank(message = "Content cannot be blank")
    private String content;
    private String userEmail;
    @NonNull
    private Boolean isPublic;

}
