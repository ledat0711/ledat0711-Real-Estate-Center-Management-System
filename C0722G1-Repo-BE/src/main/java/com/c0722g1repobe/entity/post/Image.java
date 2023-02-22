package com.c0722g1repobe.entity.post;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idImage;
    private String url;
    @ManyToOne
    private Post post;
}
