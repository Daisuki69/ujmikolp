package O3;

import androidx.media3.extractor.ts.TsExtractor;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import d4.AbstractC1331a;

/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final c[] h = {new c(1, 10, 10, 8, 8, new Ri.a(5, new F3.a(1, 3, 1))), new c(2, 12, 12, 10, 10, new Ri.a(7, new F3.a(1, 5, 1))), new c(3, 14, 14, 12, 12, new Ri.a(10, new F3.a(1, 8, 1))), new c(4, 16, 16, 14, 14, new Ri.a(12, new F3.a(1, 12, 1))), new c(5, 18, 18, 16, 16, new Ri.a(14, new F3.a(1, 18, 1))), new c(6, 20, 20, 18, 18, new Ri.a(18, new F3.a(1, 22, 1))), new c(7, 22, 22, 20, 20, new Ri.a(20, new F3.a(1, 30, 1))), new c(8, 24, 24, 22, 22, new Ri.a(24, new F3.a(1, 36, 1))), new c(9, 26, 26, 24, 24, new Ri.a(28, new F3.a(1, 44, 1))), new c(10, 32, 32, 14, 14, new Ri.a(36, new F3.a(1, 62, 1))), new c(11, 36, 36, 16, 16, new Ri.a(42, new F3.a(1, 86, 1))), new c(12, 40, 40, 18, 18, new Ri.a(48, new F3.a(1, 114, 1))), new c(13, 44, 44, 20, 20, new Ri.a(56, new F3.a(1, 144, 1))), new c(14, 48, 48, 22, 22, new Ri.a(68, new F3.a(1, 174, 1))), new c(15, 52, 52, 24, 24, new Ri.a(42, new F3.a(2, 102, 1))), new c(16, 64, 64, 14, 14, new Ri.a(56, new F3.a(2, 140, 1))), new c(17, 72, 72, 16, 16, new Ri.a(36, new F3.a(4, 92, 1))), new c(18, 80, 80, 18, 18, new Ri.a(48, new F3.a(4, 114, 1))), new c(19, 88, 88, 20, 20, new Ri.a(56, new F3.a(4, 144, 1))), new c(20, 96, 96, 22, 22, new Ri.a(68, new F3.a(4, 174, 1))), new c(21, 104, 104, 24, 24, new Ri.a(56, new F3.a(6, TsExtractor.TS_STREAM_TYPE_DTS_HD, 1))), new c(22, 120, 120, 18, 18, new Ri.a(68, new F3.a(6, 175, 1))), new c(23, 132, 132, 20, 20, new Ri.a(62, new F3.a(8, 163, 1))), new c(24, 144, 144, 22, 22, new Ri.a(new F3.a(8, 156, 1), new F3.a(2, ModuleDescriptor.MODULE_VERSION, 1))), new c(25, 8, 18, 6, 16, new Ri.a(7, new F3.a(1, 5, 1))), new c(26, 8, 32, 6, 14, new Ri.a(11, new F3.a(1, 10, 1))), new c(27, 12, 26, 10, 24, new Ri.a(14, new F3.a(1, 16, 1))), new c(28, 12, 36, 10, 16, new Ri.a(18, new F3.a(1, 22, 1))), new c(29, 16, 36, 14, 16, new Ri.a(24, new F3.a(1, 32, 1))), new c(30, 16, 48, 14, 22, new Ri.a(28, new F3.a(1, 49, 1)))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4636b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4637d;
    public final int e;
    public final Ri.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4638g;

    public c(int i, int i4, int i6, int i10, int i11, Ri.a aVar) {
        this.f4635a = i;
        this.f4636b = i4;
        this.c = i6;
        this.f4637d = i10;
        this.e = i11;
        this.f = aVar;
        int iK = 0;
        for (F3.a aVar2 : (F3.a[]) aVar.c) {
            iK = AbstractC1331a.k(aVar2.c, aVar.f5558b, aVar2.f1542b, iK);
        }
        this.f4638g = iK;
    }

    public final String toString() {
        return String.valueOf(this.f4635a);
    }
}
