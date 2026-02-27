package com.shield.android.j;

/* JADX INFO: loaded from: classes4.dex */
public enum f {
    CHUNKED_SHA256(1, "SHA-256", 32),
    CHUNKED_SHA512(2, "SHA-512", 64),
    VERITY_CHUNKED_SHA256(3, "SHA-256", 32),
    SHA256(4, "SHA-256", 32);

    private final int oZ;

    /* JADX INFO: renamed from: pa, reason: collision with root package name */
    private final String f15442pa;

    /* JADX INFO: renamed from: pb, reason: collision with root package name */
    private final int f15443pb;

    f(int i, String str, int i4) {
        this.oZ = i;
        this.f15442pa = str;
        this.f15443pb = i4;
    }

    public final int dC() {
        return this.oZ;
    }

    public final String dD() {
        return this.f15442pa;
    }

    public final int dE() {
        return this.f15443pb;
    }
}
