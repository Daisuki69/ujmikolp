package com.paymaya.common.retrofit;

import retrofit2.Response;

/* JADX INFO: loaded from: classes3.dex */
public class RetrofitException extends RuntimeException {
    public static final /* synthetic */ int c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f10364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10365b;

    public RetrofitException(String str, Response response, int i, Throwable th2) {
        super(str, th2);
        this.f10364a = response;
        this.f10365b = i;
    }
}
