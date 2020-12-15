package jp.tefuna.divliv.api.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.filter.OncePerRequestFilter;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LoggingFilter extends OncePerRequestFilter {

    @Override
    protected void initFilterBean() throws ServletException {
        log.info("initFilterBean: " + getFilterConfig());
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        log.info("begin: {}", this.getClass().getCanonicalName());

        filterChain.doFilter(request, response);

        log.info("end: {}", this.getClass().getCanonicalName());
    }
}
