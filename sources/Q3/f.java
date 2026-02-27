package Q3;

import We.s;
import androidx.media3.extractor.ts.PsExtractor;
import androidx.media3.extractor.ts.TsExtractor;

/* JADX INFO: loaded from: classes3.dex */
public class f {
    public static final f[] i = {new f(3, 5, 8, 8, 1, 3, 5, false), new f(5, 7, 10, 10, 1, 5, 7, false), new f(5, 7, 16, 6, 1, 5, 7, true), new f(8, 10, 12, 12, 1, 8, 10, false), new f(10, 11, 14, 6, 2, 10, 11, true), new f(12, 12, 14, 14, 1, 12, 12, false), new f(16, 14, 24, 10, 1, 16, 14, true), new f(18, 14, 16, 16, 1, 18, 14, false), new f(22, 18, 18, 18, 1, 22, 18, false), new f(22, 18, 16, 10, 2, 22, 18, true), new f(30, 20, 20, 20, 1, 30, 20, false), new f(32, 24, 16, 14, 2, 32, 24, true), new f(36, 24, 22, 22, 1, 36, 24, false), new f(44, 28, 24, 24, 1, 44, 28, false), new f(49, 28, 22, 14, 2, 49, 28, true), new f(62, 36, 14, 14, 4, 62, 36, false), new f(86, 42, 16, 16, 4, 86, 42, false), new f(114, 48, 18, 18, 4, 114, 48, false), new f(144, 56, 20, 20, 4, 144, 56, false), new f(174, 68, 22, 22, 4, 174, 68, false), new f(204, 84, 24, 24, 4, 102, 42, false), new f(280, 112, 14, 14, 16, 140, 56, false), new f(368, 144, 16, 16, 16, 92, 36, false), new f(456, PsExtractor.AUDIO_STREAM, 18, 18, 16, 114, 48, false), new f(576, 224, 20, 20, 16, 144, 56, false), new f(696, 272, 22, 22, 16, 174, 68, false), new f(816, 336, 24, 24, 16, TsExtractor.TS_STREAM_TYPE_DTS_HD, 56, false), new f(1050, 408, 18, 18, 36, 175, 68, false), new f(1304, 496, 20, 20, 36, 163, 62, false), new a(1558, 620, 22, 22, 36, -1, 62, false)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5214b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5215d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f5216g;
    public final int h;

    public f(int i4, int i6, int i10, int i11, int i12, int i13, int i14, boolean z4) {
        this.f5213a = z4;
        this.f5214b = i4;
        this.c = i6;
        this.f5215d = i10;
        this.e = i11;
        this.f = i12;
        this.f5216g = i13;
        this.h = i14;
    }

    public static f e(int i4, g gVar) {
        f[] fVarArr = i;
        for (int i6 = 0; i6 < 30; i6++) {
            f fVar = fVarArr[i6];
            if (!(gVar == g.f5218b && fVar.f5213a) && ((gVar != g.c || fVar.f5213a) && i4 <= fVar.f5214b)) {
                return fVar;
            }
        }
        throw new IllegalArgumentException(s.f(i4, "Can't find a symbol arrangement that matches the message. Data codewords: "));
    }

    public int a(int i4) {
        return this.f5216g;
    }

    public final int b() {
        int i4 = 1;
        int i6 = this.f;
        if (i6 != 1) {
            i4 = 2;
            if (i6 != 2 && i6 != 4) {
                if (i6 == 16) {
                    return 4;
                }
                if (i6 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i4;
    }

    public int c() {
        return this.f5214b / this.f5216g;
    }

    public final int d() {
        int i4 = this.f;
        if (i4 == 1 || i4 == 2) {
            return 1;
        }
        if (i4 == 4) {
            return 2;
        }
        if (i4 == 16) {
            return 4;
        }
        if (i4 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5213a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        int i4 = this.f5215d;
        sb2.append(i4);
        sb2.append('x');
        int i6 = this.e;
        sb2.append(i6);
        sb2.append(", symbol size ");
        sb2.append((b() * i4) + (b() << 1));
        sb2.append('x');
        sb2.append((d() * i6) + (d() << 1));
        sb2.append(", symbol data size ");
        sb2.append(b() * i4);
        sb2.append('x');
        sb2.append(d() * i6);
        sb2.append(", codewords ");
        sb2.append(this.f5214b);
        sb2.append('+');
        sb2.append(this.c);
        return sb2.toString();
    }
}
