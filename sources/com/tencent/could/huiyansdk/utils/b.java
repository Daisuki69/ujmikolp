package com.tencent.could.huiyansdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h<byte[]> f15728a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15729a = new b();
    }

    public boolean a(byte[] bArr) {
        synchronized (b.class) {
            try {
                h<byte[]> hVar = this.f15728a;
                if (hVar == null) {
                    return false;
                }
                return hVar.release(bArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
