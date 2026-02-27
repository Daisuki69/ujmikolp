package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1187a f10069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10070b;
    public final Object[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10071d;

    public V(AbstractC1187a abstractC1187a, String str, Object[] objArr) {
        this.f10069a = abstractC1187a;
        this.f10070b = str;
        this.c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f10071d = cCharAt;
            return;
        }
        int i = cCharAt & 8191;
        int i4 = 1;
        int i6 = 13;
        while (true) {
            int i10 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 < 55296) {
                this.f10071d = i | (cCharAt2 << i6);
                return;
            } else {
                i |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i4 = i10;
            }
        }
    }

    public final int a() {
        int i = this.f10071d;
        if ((i & 1) != 0) {
            return 1;
        }
        return (i & 4) == 4 ? 3 : 2;
    }
}
