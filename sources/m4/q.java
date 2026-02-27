package m4;

import We.s;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f18370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18371b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f18372d;
    public final int e;
    public Rect f;

    public q(byte[] bArr, int i, int i4, int i6, int i10) {
        this.f18370a = bArr;
        this.f18371b = i;
        this.c = i4;
        this.e = i10;
        this.f18372d = i6;
        if (i * i4 <= bArr.length) {
            return;
        }
        StringBuilder sbU = s.u("Image data does not match the resolution. ", i, "x", i4, " > ");
        sbU.append(bArr.length);
        throw new IllegalArgumentException(sbU.toString());
    }
}
