package by.itacademy.validator;

import by.itacademy.dto.RequestDto;
import by.itacademy.util.StringUtil;

import static by.itacademy.util.StringUtil.isEmpty;

public class RequestValidator implements Validator<RequestDto> {

    @Override
    public boolean isValid(RequestDto object) {
        return !isEmpty(object.getDescription()) && !isEmpty(object.getDate());
    }
}
