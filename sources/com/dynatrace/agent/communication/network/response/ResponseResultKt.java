package com.dynatrace.agent.communication.network.response;

import kotlin.jvm.internal.j;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public final class ResponseResultKt {
    private static final int ACCEPTED_RESPONSE_CODE = 202;
    private static final int BAD_REQUEST_RESPONSE_CODE = 400;
    private static final int CONTENT_TOO_LARGE_RESPONSE_CODE = 413;
    private static final int FORBIDDEN_RESPONSE_CODE = 403;
    private static final int INTERNAL_ERROR_RESPONSE_CODE = 500;
    private static final int LENGTH_REQUIRED_RESPONSE_CODE = 411;
    private static final int METHOD_NOT_ALLOWED_RESPONSE_CODE = 405;
    private static final int OK_RESPONSE_CODE = 200;
    private static final int SERVICE_UNAVAILABLE_RESPONSE_CODE = 503;
    private static final int TOO_MANY_REQUESTS_RESPONSE_CODE = 429;

    public static final boolean isMethodNotAllowed(Response response) {
        j.g(response, "<this>");
        return response.code() == METHOD_NOT_ALLOWED_RESPONSE_CODE;
    }

    public static final boolean isSuccess(Response response) {
        j.g(response, "<this>");
        return response.code() == 200;
    }

    public static final boolean isTooManyRequest(Response response) {
        j.g(response, "<this>");
        return response.code() == TOO_MANY_REQUESTS_RESPONSE_CODE;
    }

    public static final boolean isUnexpectedError(Response response) {
        j.g(response, "<this>");
        return isMethodNotAllowed(response) || isUnknownCode(response);
    }

    public static final boolean isUnknownCode(Response response) {
        j.g(response, "<this>");
        return (response.code() == METHOD_NOT_ALLOWED_RESPONSE_CODE || response.code() == TOO_MANY_REQUESTS_RESPONSE_CODE || response.code() == 200 || response.code() == 503 || response.code() == 500 || response.code() == LENGTH_REQUIRED_RESPONSE_CODE || response.code() == CONTENT_TOO_LARGE_RESPONSE_CODE || response.code() == 403 || response.code() == 400 || response.code() == ACCEPTED_RESPONSE_CODE) ? false : true;
    }
}
