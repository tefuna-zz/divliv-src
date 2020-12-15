package jp.tefuna.divliv.api.filter;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.MDC;
import org.springframework.web.filter.OncePerRequestFilter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestIdFilter extends OncePerRequestFilter {

    private static DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response,
            FilterChain filterChain) throws ServletException, IOException {

        String now = ZonedDateTime.now().format(FORMATTER);
        String requestId = now + RandomStringUtils.randomAlphabetic(3);

        MDC.put("rid", requestId);

        try {
            log.info("begin: {}", this.getClass().getName());
            filterChain.doFilter(request, response);
            log.info("end: {}", this.getClass().getName());
        } catch (Throwable t) {
            log.error("error occured in", t);
        } finally {
            MDC.remove("rid");
        }

    }

}
