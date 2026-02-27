package io.split.android.client.service.http;

import We.s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class HttpGeneralException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f17609a;

    public HttpGeneralException(String str, String str2, Integer num) {
        super(a(num, str, str2));
        this.f17609a = num;
    }

    public static String a(Integer num, String str, String str2) {
        String str3;
        if (num != null) {
            str3 = ". Http status: " + num;
        } else {
            str3 = "";
        }
        return s.l("Error while sending data to ", str, ": ", str2, str3);
    }

    public HttpGeneralException(String str, String str2) {
        super(a(null, str, str2));
        this.f17609a = null;
    }
}
