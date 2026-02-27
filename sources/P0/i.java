package P0;

import android.util.SparseBooleanArray;
import com.shockwave.pdfium.PdfDocument;
import com.shockwave.pdfium.PdfiumCore;
import com.shockwave.pdfium.util.Size;
import com.shockwave.pdfium.util.SizeF;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f4960s = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PdfDocument f4961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PdfiumCore f4962b;
    public final int c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Size f4964g;
    public final Size h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f4965k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f4966l;
    public final boolean m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final V0.a f4970q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f4971r;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f4963d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final SparseBooleanArray f = new SparseBooleanArray();
    public SizeF i = new SizeF(0.0f, 0.0f);
    public SizeF j = new SizeF(0.0f, 0.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f4967n = new ArrayList();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f4968o = new ArrayList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f4969p = 0.0f;

    public i(PdfiumCore pdfiumCore, PdfDocument pdfDocument, V0.a aVar, Size size, boolean z4, int i, boolean z5, boolean z8) {
        this.c = 0;
        this.f4964g = new Size(0, 0);
        this.h = new Size(0, 0);
        this.f4962b = pdfiumCore;
        this.f4961a = pdfDocument;
        this.f4970q = aVar;
        this.f4965k = z4;
        this.f4966l = i;
        this.m = z5;
        this.f4971r = z8;
        this.c = pdfiumCore.c(pdfDocument);
        for (int i4 = 0; i4 < this.c; i4++) {
            Size sizeE = pdfiumCore.e(this.f4961a, a(i4));
            if (sizeE.f15513a > this.f4964g.f15513a) {
                this.f4964g = sizeE;
            }
            if (sizeE.f15514b > this.h.f15514b) {
                this.h = sizeE;
            }
            this.f4963d.add(sizeE);
        }
        i(size);
    }

    public final int a(int i) {
        if (i < 0 || i >= this.c) {
            return -1;
        }
        return i;
    }

    public final SizeF b() {
        return this.f4965k ? this.j : this.i;
    }

    public final int c(float f, float f3) {
        int i = 0;
        for (int i4 = 0; i4 < this.c; i4++) {
            if ((((Float) this.f4967n.get(i4)).floatValue() * f3) - (((this.m ? ((Float) this.f4968o.get(i4)).floatValue() : this.f4966l) * f3) / 2.0f) >= f) {
                break;
            }
            i++;
        }
        int i6 = i - 1;
        if (i6 >= 0) {
            return i6;
        }
        return 0;
    }

    public final float d(float f, int i) {
        SizeF sizeFF = f(i);
        return (this.f4965k ? sizeFF.f15516b : sizeFF.f15515a) * f;
    }

    public final float e(float f, int i) {
        if (a(i) < 0) {
            return 0.0f;
        }
        return ((Float) this.f4967n.get(i)).floatValue() * f;
    }

    public final SizeF f(int i) {
        return a(i) < 0 ? new SizeF(0.0f, 0.0f) : (SizeF) this.e.get(i);
    }

    public final SizeF g(float f, int i) {
        SizeF sizeFF = f(i);
        return new SizeF(sizeFF.f15515a * f, sizeFF.f15516b * f);
    }

    public final float h(float f, int i) {
        float f3;
        float f7;
        SizeF sizeFF = f(i);
        if (this.f4965k) {
            f3 = b().f15515a;
            f7 = sizeFF.f15515a;
        } else {
            f3 = b().f15516b;
            f7 = sizeFF.f15516b;
        }
        return ((f3 - f7) * f) / 2.0f;
    }

    public final void i(Size size) {
        float fFloatValue;
        float f;
        float f3;
        SizeF sizeF;
        int i;
        ArrayList arrayList = this.e;
        arrayList.clear();
        V0.b bVar = new V0.b(this.f4970q, this.f4964g, this.h, size, this.f4971r);
        this.j = bVar.c;
        this.i = bVar.f6029d;
        Iterator it = this.f4963d.iterator();
        while (true) {
            fFloatValue = 0.0f;
            if (!it.hasNext()) {
                break;
            }
            Size size2 = (Size) it.next();
            int i4 = size2.f15513a;
            if (i4 <= 0 || (i = size2.f15514b) <= 0) {
                sizeF = new SizeF(0.0f, 0.0f);
            } else {
                boolean z4 = bVar.f6030g;
                Size size3 = bVar.f6028b;
                float f7 = z4 ? size3.f15513a : i4 * bVar.e;
                float f10 = z4 ? size3.f15514b : i * bVar.f;
                int iOrdinal = bVar.f6027a.ordinal();
                sizeF = iOrdinal != 1 ? iOrdinal != 2 ? V0.b.c(size2, f7) : V0.b.a(size2, f7, f10) : V0.b.b(size2, f10);
            }
            arrayList.add(sizeF);
        }
        int i6 = this.f4966l;
        boolean z5 = this.f4965k;
        ArrayList arrayList2 = this.f4968o;
        boolean z8 = this.m;
        if (z8) {
            arrayList2.clear();
            for (int i10 = 0; i10 < this.c; i10++) {
                SizeF sizeF2 = (SizeF) arrayList.get(i10);
                if (z5) {
                    f = size.f15514b;
                    f3 = sizeF2.f15516b;
                } else {
                    f = size.f15513a;
                    f3 = sizeF2.f15515a;
                }
                float fMax = Math.max(0.0f, f - f3);
                if (i10 < this.c - 1) {
                    fMax += i6;
                }
                arrayList2.add(Float.valueOf(fMax));
            }
        }
        float fFloatValue2 = 0.0f;
        for (int i11 = 0; i11 < this.c; i11++) {
            SizeF sizeF3 = (SizeF) arrayList.get(i11);
            fFloatValue2 += z5 ? sizeF3.f15516b : sizeF3.f15515a;
            if (z8) {
                fFloatValue2 = ((Float) arrayList2.get(i11)).floatValue() + fFloatValue2;
            } else if (i11 < this.c - 1) {
                fFloatValue2 += i6;
            }
        }
        this.f4969p = fFloatValue2;
        ArrayList arrayList3 = this.f4967n;
        arrayList3.clear();
        for (int i12 = 0; i12 < this.c; i12++) {
            SizeF sizeF4 = (SizeF) arrayList.get(i12);
            float f11 = z5 ? sizeF4.f15516b : sizeF4.f15515a;
            if (z8) {
                float fFloatValue3 = (((Float) arrayList2.get(i12)).floatValue() / 2.0f) + fFloatValue;
                if (i12 == 0) {
                    fFloatValue3 -= i6 / 2.0f;
                } else if (i12 == this.c - 1) {
                    fFloatValue3 += i6 / 2.0f;
                }
                arrayList3.add(Float.valueOf(fFloatValue3));
                fFloatValue = (((Float) arrayList2.get(i12)).floatValue() / 2.0f) + f11 + fFloatValue3;
            } else {
                arrayList3.add(Float.valueOf(fFloatValue));
                fFloatValue = f11 + i6 + fFloatValue;
            }
        }
    }
}
