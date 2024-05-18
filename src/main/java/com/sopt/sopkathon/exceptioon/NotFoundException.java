package com.sopt.sopkathon.exceptioon;

import com.sopt.sopkathon.common.dto.ErrorMessage;
import lombok.Getter;

@Getter
public class NotFoundException extends BusinessException {
    public NotFoundException(ErrorMessage errorMessage) {
        super(errorMessage);
    }
}
