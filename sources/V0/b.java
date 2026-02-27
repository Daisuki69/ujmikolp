package V0;

import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;

/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f6028b;
    public final SizeF c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SizeF f6029d;
    public final float e;
    public final float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f6030g;

    public b(a aVar, Size size, Size size2, Size size3, boolean z4) {
        this.f6027a = aVar;
        this.f6028b = size3;
        this.f6030g = z4;
        int iOrdinal = aVar.ordinal();
        int i = size3.f15514b;
        if (iOrdinal == 1) {
            SizeF sizeFB = b(size2, i);
            this.f6029d = sizeFB;
            float f = sizeFB.f15516b / size2.f15514b;
            this.f = f;
            this.c = b(size, size.f15514b * f);
            return;
        }
        int i4 = size3.f15513a;
        if (iOrdinal != 2) {
            SizeF sizeFC = c(size, i4);
            this.c = sizeFC;
            float f3 = sizeFC.f15515a / size.f15513a;
            this.e = f3;
            this.f6029d = c(size2, size2.f15513a * f3);
            return;
        }
        float f7 = i;
        SizeF sizeFA = a(size, i4, f7);
        float f10 = size.f15513a;
        SizeF sizeFA2 = a(size2, size2.f15513a * (sizeFA.f15515a / f10), f7);
        this.f6029d = sizeFA2;
        float f11 = sizeFA2.f15516b / size2.f15514b;
        this.f = f11;
        SizeF sizeFA3 = a(size, i4, size.f15514b * f11);
        this.c = sizeFA3;
        this.e = sizeFA3.f15515a / f10;
    }

    public static SizeF a(Size size, float f, float f3) {
        float f7 = size.f15513a / size.f15514b;
        float fFloor = (float) Math.floor(f / f7);
        if (fFloor > f3) {
            f = (float) Math.floor(f7 * f3);
        } else {
            f3 = fFloor;
        }
        return new SizeF(f, f3);
    }

    public static SizeF b(Size size, float f) {
        return new SizeF((float) Math.floor(f / (size.f15514b / size.f15513a)), f);
    }

    public static SizeF c(Size size, float f) {
        return new SizeF(f, (float) Math.floor(f / (size.f15513a / size.f15514b)));
    }
}
