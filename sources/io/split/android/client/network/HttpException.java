package io.split.android.client.network;

import defpackage.AbstractC1414e;

/* JADX INFO: loaded from: classes4.dex */
public class HttpException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f17569a;

    public HttpException(String str) {
        super(AbstractC1414e.h("HttpException: ", str));
        this.f17569a = null;
    }

    public HttpException(String str, int i) {
        super(AbstractC1414e.h("HttpException: ", str));
        this.f17569a = 9009;
    }
}
