package com.tencent.cloud.ai.network.okhttp3.internal.connection;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IOException f15521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f15522b;

    public h(IOException iOException) {
        super(iOException);
        this.f15521a = iOException;
        this.f15522b = iOException;
    }
}
