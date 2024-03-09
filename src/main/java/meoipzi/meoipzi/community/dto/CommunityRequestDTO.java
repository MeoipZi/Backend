package meoipzi.meoipzi.community.dto;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import meoipzi.meoipzi.community.domain.Community;
import org.springframework.web.multipart.MultipartFile;

/* 커뮤니티 글 등록 시 사용할 DTO */
@Getter
@Setter
@RequiredArgsConstructor
public class CommunityRequestDTO {

    private String userName;    // 작성자
    private MultipartFile imgUrl;
    private String title;
    private String contents;
    private String category; // 브랜드/업체 , 쇼핑&패션, 자유게시판
    public Community toEntity() {
        return Community.builder()
                .imgUrl(imgUrl != null ? imgUrl.getOriginalFilename() : null)
                .title(title)
                .contents(contents)
                .category(category)
                .build();
    }
}