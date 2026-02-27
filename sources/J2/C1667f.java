package j2;

import java.io.IOException;
import n2.C1915b;

/* JADX INFO: renamed from: j2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1667f implements k {
    public static final z2.d c = new z2.d(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f17680b;

    public C1667f(C1915b c1915b) {
        this.f17679a = c1915b;
        this.f17680b = c;
    }

    @Override // j2.k
    public void b(j jVar, int i) throws IOException {
        int[] iArr = (int[]) this.f17680b;
        try {
            jVar.read((byte[]) this.f17679a, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            jVar.close();
        }
    }

    public C1667f(byte[] bArr, int[] iArr) {
        this.f17679a = bArr;
        this.f17680b = iArr;
    }
}
