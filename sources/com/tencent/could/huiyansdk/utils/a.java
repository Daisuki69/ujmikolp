package com.tencent.could.huiyansdk.utils;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h<byte[]> f15726a;

    /* JADX INFO: renamed from: com.tencent.could.huiyansdk.utils.a$a, reason: collision with other inner class name */
    public static final class C0086a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f15727a = new a();
    }

    public byte[] a() {
        h<byte[]> hVar = this.f15726a;
        if (hVar == null) {
            return null;
        }
        return hVar.acquire();
    }
}
