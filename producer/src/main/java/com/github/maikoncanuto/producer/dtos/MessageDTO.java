package com.github.maikoncanuto.producer.dtos;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class MessageDTO implements Serializable {

    private String message;

}
