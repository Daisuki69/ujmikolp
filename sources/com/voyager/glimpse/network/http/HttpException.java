package com.voyager.glimpse.network.http;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f16232b;

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f16232b;
    }
}
