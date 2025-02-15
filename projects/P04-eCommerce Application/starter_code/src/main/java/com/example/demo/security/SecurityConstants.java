package com.example.demo.security;

/*
 * The link for this class implementation and description
 * https://auth0.com/blog/implementing-jwt-authentication-on-spring-boot/
 */

public class SecurityConstants {
    public static final String SECRET = "oursecretkey";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/user/create";
}