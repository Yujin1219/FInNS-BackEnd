package com.finns.post.dto;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PostResponseDTO {
    private long postNo;
    private long userNo;
    private String userName;
    private long cardNo;
    private boolean publicStatus;
    private String category;
    private String memo;
    private long amount;
    private String place;
    private String transactionDate;
    private long greatCount;
    private long stupidCount;
    private boolean renewStatus;
}
