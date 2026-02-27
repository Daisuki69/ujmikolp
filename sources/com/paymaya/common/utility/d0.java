package com.paymaya.common.utility;

import okhttp3.MediaType;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final MediaType f10787a;

    static {
        MediaType.parse("multipart/form-data; charset=utf-8");
        MediaType.parse("text/plain; charset=utf-8");
        f10787a = MediaType.parse("application/json; charset=utf-8");
    }
}
