package Ff;

import n1.AbstractC1909o;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f1576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1577b;

    public a(byte[] bArr) {
        this.f1576a = false;
        this.f1577b = 0;
        int i = (bArr[0] & 255) << 8;
        this.f1577b = i;
        int i4 = (i | (bArr[1] & 255)) << 8;
        this.f1577b = i4;
        int i6 = (i4 | (bArr[2] & 255)) << 8;
        this.f1577b = i6;
        this.f1577b = (bArr[3] & 255) | i6;
    }

    public void a(int i) {
        this.f1576a |= i > 0;
        this.f1577b += i;
    }

    public void b(int i) {
        this.f1577b = (1 << (i - 1)) | this.f1577b;
    }

    public a(AbstractC1909o abstractC1909o) {
    }
}
