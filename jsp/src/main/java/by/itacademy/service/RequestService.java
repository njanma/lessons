package by.itacademy.service;

import by.itacademy.dao.RequestDao;
import by.itacademy.dto.RequestDto;
import by.itacademy.formatter.LocalDateFormatter;
import by.itacademy.model.Request;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class RequestService {

    private static final RequestService INSTANCE = new RequestService();

    public Request save(RequestDto requestDto) {
        Request request = Request.builder()
                .description(requestDto.getDescription())
                .date(LocalDateFormatter.format(requestDto.getDate()))
                .build();
        return RequestDao.getInstance().save(request);
    }

    public static RequestService getInstance() {
        return INSTANCE;
    }
}
