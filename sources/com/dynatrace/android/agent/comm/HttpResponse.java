package com.dynatrace.android.agent.comm;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class HttpResponse {
    public final String body;
    public final Map<String, List<String>> headers;
    public final int responseCode;
    public final String responseMessage;

    public HttpResponse(int i, String str, String str2, Map<String, List<String>> map) {
        this.responseCode = i;
        this.responseMessage = str;
        this.body = str2;
        this.headers = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpResponse httpResponse = (HttpResponse) obj;
            if (this.responseCode != httpResponse.responseCode) {
                return false;
            }
            String str = this.responseMessage;
            if (str == null ? httpResponse.responseMessage != null : !str.equals(httpResponse.responseMessage)) {
                return false;
            }
            String str2 = this.body;
            String str3 = httpResponse.body;
            if (str2 != null) {
                return str2.equals(str3);
            }
            if (str3 == null) {
                return true;
            }
        }
        return false;
    }

    public boolean isSuccessful() {
        int i = this.responseCode;
        return i >= 200 && i <= 299;
    }
}
