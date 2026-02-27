package com.dynatrace.android.callback;

/* JADX INFO: loaded from: classes2.dex */
final class CbConstants {
    static final String CONTENT_LENGTH = "Content-Length";
    static final String CONTENT_TYPE = "Content-Type";
    static final char FIELD_SEP = '&';
    static final String HASH = "#";
    static final String HOST = "Host";
    static final String NA = "NA";
    static final int RESPCODE_BAD = -1;
    static final int RESPCODE_NA = 0;
    static final String SLASH = "/";
    static final String SPACE = " ";
    static final String X_ANDROID = "X-Android";

    public enum WrMethod {
        getInputStream,
        getOutputStream,
        getResponseCode,
        execute,
        enqueue
    }

    public enum WrStates {
        PRE_EXEC,
        POST_EXEC_OK,
        POST_EXEC_ERR,
        POST_EXEC_FINALIZE
    }
}
