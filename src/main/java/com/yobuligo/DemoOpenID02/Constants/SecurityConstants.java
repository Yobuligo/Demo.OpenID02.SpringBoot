package com.yobuligo.DemoOpenID02.Constants;

public final class SecurityConstants {

    public static final String AUTH_LOGIN_URL = "/api/authenticate";

    // Signing key for HS512 algorithm
    // You can use the page http://www.allkeysgenerator.com/ to generate all kinds of keys
    public static final String JWT_SECRET = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmVQZZOjDaVN2XbGKn5XtNHucvKGOsWdhlH8FotChKGixd/QAUCtZI8lU3L99kSAlxEUeH9Pu/ZgAvUcu+tAScgO1OFRaAEnqDWeMGNQOo9Wf7v57ONZ4XF5la4+pWXNT2BV9zeO7xZR6UGUmBRi1pIOcxxVDv7TfGx9LuPV8X5wzVwyaJB1YYK/O94sB5YAUc9mVUF6EYf3QhOpipwekvfL18wnlcJOGbrwhPrOp6+XqsItL86LiFV+TZ1ky3M+j99phy1qwGpbUFFQU//gc0BiXGPI/10uIvXOKt127TjyAUC6/De5Shcrak2C0Q65qohsbhTCzT6OKKfWf9B9R7wIDAQAB";    										 

    // JWT token defaults
    public static final String TOKEN_HEADER = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String TOKEN_TYPE = "JWT";
    public static final String TOKEN_ISSUER = "secure-api";
    public static final String TOKEN_AUDIENCE = "secure-app";

    private SecurityConstants() {
        throw new IllegalStateException("Cannot create instance of static util class");
    }
}