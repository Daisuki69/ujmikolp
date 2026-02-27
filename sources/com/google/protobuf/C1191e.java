package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1191e extends C1192f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10090d;
    public final int e;

    public C1191e(byte[] bArr, int i, int i4) {
        super(bArr);
        C1192f.c(i, i + i4, bArr.length);
        this.f10090d = i;
        this.e = i4;
    }

    @Override // com.google.protobuf.C1192f
    public final byte a(int i) {
        int i4 = this.e;
        if (((i4 - (i + 1)) | i) >= 0) {
            return this.f10092b[this.f10090d + i];
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException(We.s.f(i, "Index < 0: "));
        }
        throw new ArrayIndexOutOfBoundsException(androidx.camera.core.impl.a.c(i, i4, "Index > length: ", ", "));
    }

    @Override // com.google.protobuf.C1192f
    public final int d() {
        return this.f10090d;
    }

    @Override // com.google.protobuf.C1192f
    public final byte e(int i) {
        return this.f10092b[this.f10090d + i];
    }

    @Override // com.google.protobuf.C1192f
    public final int size() {
        return this.e;
    }
}
