package com.example.easysoc.response;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.List;

/**
 * @project: EasySoc
 * @author: Sarvar55
 */
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseUrl<T> {
    private List<T> urls;
    private HttpStatus status;
    private String message;
}
