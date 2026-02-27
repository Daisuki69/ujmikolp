package Ag;

import okhttp3.Protocol;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307a;

    static {
        int[] iArr = new int[Protocol.values().length];
        try {
            iArr[Protocol.HTTP_1_0.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Protocol.HTTP_1_1.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Protocol.SPDY_3.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Protocol.HTTP_2.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Protocol.QUIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f307a = iArr;
    }
}
