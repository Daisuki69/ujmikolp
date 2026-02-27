package C3;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes3.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f720b;
    public l[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f721d;
    public EnumMap e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String str, byte[] bArr, l[] lVarArr, a aVar) {
        this(str, bArr, lVarArr, aVar, 0);
        System.currentTimeMillis();
    }

    public final void a(k kVar, Object obj) {
        if (this.e == null) {
            this.e = new EnumMap(k.class);
        }
        this.e.put(kVar, obj);
    }

    public final String toString() {
        return this.f719a;
    }

    public j(String str, byte[] bArr, l[] lVarArr, a aVar, int i) {
        this.f719a = str;
        this.f720b = bArr;
        this.c = lVarArr;
        this.f721d = aVar;
        this.e = null;
    }
}
