package com.shield.android.internal;

import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15411d = {883288676, 1886918609, 512178748, -1115205120, 800774312, 1200102892, 1834986571, 34408055, 1533022210};
    private boolean fE;
    private boolean fF;
    private int fG;
    private boolean fH;
    private int fI;
    private long fJ;
    private List<String> fK;
    private boolean fL;
    private int fM;
    private int fN;
    private String fO;
    private boolean fP;
    private List<String> fQ;
    private List<String> fR;
    private boolean fS;
    private boolean fT;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        long[] jArr = f15411d;
        long j = jArr[1];
        this(((int) j) ^ 1886918609, ((int) j) ^ 1886918609, ((int) j) ^ 1886918609, ((int) j) ^ 1886918609, ((int) j) ^ 1886918609, 0L, null, ((int) j) ^ 1886918609, ((int) j) ^ 1886918609, ((int) j) ^ 1886918609, null, ((int) j) ^ 1886918609, null, null, ((int) j) ^ 1886918609, ((int) j) ^ 1886918609, ((int) jArr[7]) ^ 34470280);
    }

    public static String f(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15411d[1]) ^ 1886918609;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15411d;
            long j = jArr[8];
            long j6 = jArr[0];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 1533050404) + cCharAt;
            sb2.append((char) (AbstractC1213b.G((cCharAt + (((int) j) ^ 1533050404)) + (((int) j6) ^ 883288677), (~(((int) j) ^ 1533050404)) | i4, i6, (((((int) j) ^ 1533050404) + cCharAt) + (((int) j6) ^ 883288677)) + ((~(((int) j) ^ 1533050404)) | i4)) ^ (i % (((int) jArr[7]) ^ 34470280))));
            long j7 = f15411d[0];
            int i10 = ~i;
            i = i + (((int) j7) ^ 883288677) + (((int) j7) ^ 883288677) + ((~(((int) j7) ^ 883288677)) | i10) + (((((int) j7) ^ 883288677) + i) - ((((((int) j7) ^ 883288677) + i) + (((int) j7) ^ 883288677)) + ((~(((int) j7) ^ 883288677)) | i10)));
        }
        return sb2.toString();
    }

    public final void a(long j) {
        this.fJ = j;
    }

    public final void b(int i) {
        this.fG = i;
    }

    public final String bA() {
        return this.fO;
    }

    public final boolean bB() {
        return this.fP;
    }

    public final List<String> bC() {
        return this.fQ;
    }

    public final List<String> bD() {
        return this.fR;
    }

    public final boolean bE() {
        return this.fS;
    }

    public final boolean bF() {
        return this.fT;
    }

    public final boolean br() {
        return this.fE;
    }

    public final boolean bs() {
        return this.fF;
    }

    public final boolean bt() {
        return this.fH;
    }

    public final int bu() {
        return this.fI;
    }

    public final long bv() {
        return this.fJ;
    }

    public final List<String> bw() {
        return this.fK;
    }

    public final boolean bx() {
        return this.fL;
    }

    public final int by() {
        return this.fM;
    }

    public final int bz() {
        return this.fN;
    }

    public final void c(int i) {
        this.fI = i;
    }

    public final void d(int i) {
        this.fM = i;
    }

    public final void e(int i) {
        this.fN = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return ((int) f15411d[0]) ^ 883288677;
        }
        if (!(obj instanceof c)) {
            return ((int) f15411d[1]) ^ 1886918609;
        }
        c cVar = (c) obj;
        if (this.fE == cVar.fE && this.fF == cVar.fF && this.fG == cVar.fG && this.fH == cVar.fH && this.fI == cVar.fI && this.fJ == cVar.fJ && kotlin.jvm.internal.j.b(this.fK, cVar.fK) && this.fL == cVar.fL && this.fM == cVar.fM && this.fN == cVar.fN && kotlin.jvm.internal.j.b(this.fO, cVar.fO) && this.fP == cVar.fP && kotlin.jvm.internal.j.b(this.fQ, cVar.fQ) && kotlin.jvm.internal.j.b(this.fR, cVar.fR) && this.fS == cVar.fS && this.fT == cVar.fT) {
            return ((int) f15411d[0]) ^ 883288677;
        }
        return ((int) f15411d[1]) ^ 1886918609;
    }

    public final void g(boolean z4) {
        this.fE = z4;
    }

    public final int getVersion() {
        return this.fG;
    }

    public final void h(boolean z4) {
        this.fF = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        boolean z4 = this.fE;
        int i = z4;
        if (z4) {
            i = ((int) f15411d[0]) ^ 883288677;
        }
        long[] jArr = f15411d;
        long j = jArr[6];
        int i4 = i * (((int) j) ^ 1834986580);
        boolean z5 = this.fF;
        int i6 = z5;
        if (z5) {
            i6 = ((int) jArr[0]) ^ 883288677;
        }
        int i10 = (((i4 + i6) * (((int) j) ^ 1834986580)) + this.fG) * (((int) j) ^ 1834986580);
        boolean z8 = this.fH;
        int i11 = z8;
        if (z8) {
            i11 = ((int) jArr[0]) ^ 883288677;
        }
        int i12 = (((i10 + i11) * (((int) j) ^ 1834986580)) + this.fI) * (((int) j) ^ 1834986580);
        long j6 = this.fJ;
        int iHashCode = this.fK.hashCode() + ((i12 + ((int) (j6 ^ (j6 >>> 32)))) * (((int) j) ^ 1834986580));
        long[] jArr2 = f15411d;
        long j7 = jArr2[6];
        int i13 = iHashCode * (((int) j7) ^ 1834986580);
        boolean z9 = this.fL;
        int i14 = z9;
        if (z9) {
            i14 = ((int) jArr2[0]) ^ 883288677;
        }
        int iHashCode2 = this.fO.hashCode() + ((((((i13 + i14) * (((int) j7) ^ 1834986580)) + this.fM) * (((int) j7) ^ 1834986580)) + this.fN) * (((int) j7) ^ 1834986580));
        long[] jArr3 = f15411d;
        long j9 = jArr3[6];
        int i15 = iHashCode2 * (((int) j9) ^ 1834986580);
        boolean z10 = this.fP;
        int i16 = z10;
        if (z10) {
            i16 = ((int) jArr3[0]) ^ 883288677;
        }
        int iHashCode3 = this.fR.hashCode() + ((this.fQ.hashCode() + ((i15 + i16) * (((int) j9) ^ 1834986580))) * (((int) f15411d[6]) ^ 1834986580));
        long[] jArr4 = f15411d;
        long j10 = jArr4[6];
        int i17 = iHashCode3 * (((int) j10) ^ 1834986580);
        boolean z11 = this.fS;
        int i18 = z11;
        if (z11) {
            i18 = ((int) jArr4[0]) ^ 883288677;
        }
        int i19 = (i17 + i18) * (((int) j10) ^ 1834986580);
        boolean z12 = this.fT;
        int i20 = z12;
        if (z12) {
            i20 = ((int) jArr4[0]) ^ 883288677;
        }
        return i19 + i20;
    }

    public final void i(boolean z4) {
        this.fH = z4;
    }

    public final void j(boolean z4) {
        this.fL = z4;
    }

    public final void k(String str) {
        kotlin.jvm.internal.j.g(str, f("渚湔湁湑渏渜渞"));
        this.fO = str;
    }

    public final void l(boolean z4) {
        this.fS = z4;
    }

    public final void m(boolean z4) {
        this.fT = z4;
    }

    public final String toString() {
        return f("湠湷湧湊湌湅湉湆渆湊湂湎湘湒湘湝湦湖湍湙湝湒湔渌") + this.fE + f("渊渇湂湕湣湍湁湍湗湛湅湎湙渖") + this.fF + f("渊渇湒湀湐湐湉湎湀渒") + this.fG + f("渊渇湀湌湑湂湂湍湋湮湙湙湅湭湘渔") + this.fH + f("渊渇湂湕湱湆湔湕湇湁湋湮湋湈湀湌渋") + this.fI + f("渊渇湐湌湏湆湳湕湏湂湜渐") + this.fJ + f("渊渇湀湌湑湂湂湍湋湋湡湂湎湞湄湌湅渊") + this.fK + f("渊渇湊湑湧湍湁湃湂湊湈渐") + this.fL + f("渊渇湈湊湁湂湔湈湁湁湯湂湆湇湍湊湂湞湛湛湻湝湄湔湌湉湝湑渇") + this.fM + f("渊渇湈湊湁湂湔湈湁湁湸湟湋湈湃湀湘湐湠湜湟湖湟湄湊渂") + this.fN + f("渊渇湈湊湁湂湔湈湁湁湯湂湆湇湍湊湂湞湛湛湧湡湼渌") + this.fO + f("渊渇湀湌湑湂湂湍湋湮湜湄湩湄湝湇湂渊") + this.fP + f("渊渇湁湋湃湁湌湄湊湩湉湌湞湞湚湌湅渊") + this.fQ + f("渊渇湀湌湑湂湂湍湋湋湼湈湘湆湁湚湅湞湛湛湁渎") + this.fR + f("渊渇湁湋湃湁湌湄湽湛湃湝渗") + this.fS + f("渊渇湇湊湎湏湅湂湚湦湂湝湟湟湻湆湃湅湗湐湴湖湑湅湋湍湙渀") + this.fT + ((((int) f15411d[5]) ^ 1200102853) == true ? (char) 1 : (char) 0);
    }

    private c(boolean z4, boolean z5, int i, boolean z8, int i4, long j, List<String> list, boolean z9, int i6, int i10, String str, boolean z10, List<String> list2, List<String> list3, boolean z11, boolean z12) {
        kotlin.jvm.internal.j.g(list, f("湂湎湗湄湀湏湅湅湣湀湈湘湆湎湛"));
        kotlin.jvm.internal.j.g(str, f("湊湈湇湄湖湊湏湏湭湀湀湁湏湈湜湀湙湙湡湧湾"));
        kotlin.jvm.internal.j.g(list2, f("湃湉湅湇湎湆湄湧湋湎湘湘湘湎湛"));
        kotlin.jvm.internal.j.g(list3, f("湂湎湗湄湀湏湅湅湾湊湞湀湃湘湛湀湙湙湇"));
        this.fE = z4;
        this.fF = z5;
        this.fG = i;
        this.fH = z8;
        this.fI = i4;
        this.fJ = j;
        this.fK = list;
        this.fL = z9;
        this.fM = i6;
        this.fN = i10;
        this.fO = str;
        this.fP = z10;
        this.fQ = list2;
        this.fR = list3;
        this.fS = z11;
        this.fT = z12;
    }

    public final void b(List<String> list) {
        kotlin.jvm.internal.j.g(list, f("渚湔湁湑渏渜渞"));
        this.fK = list;
    }

    public final void c(List<String> list) {
        kotlin.jvm.internal.j.g(list, f("渚湔湁湑渏渜渞"));
        this.fQ = list;
    }

    public final void d(List<String> list) {
        kotlin.jvm.internal.j.g(list, f("渚湔湁湑渏渜渞"));
        this.fR = list;
    }

    public final void k(boolean z4) {
        this.fP = z4;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public c(boolean z4, boolean z5, int i, boolean z8, int i4, long j, List list, boolean z9, int i6, int i10, String str, boolean z10, List list2, List list3, boolean z11, boolean z12, int i11) {
        C1112C c1112c = C1112C.f9377a;
        String strF = f("");
        long[] jArr = f15411d;
        boolean z13 = ((int) jArr[0]) ^ 883288677;
        long j6 = jArr[1];
        this(z13, ((int) j6) ^ 1886918609, -1, ((int) j6) ^ 1886918609, ((int) jArr[2]) ^ 511945180, jArr[3] ^ 1115205119, c1112c, ((int) j6) ^ 1886918609, 10000, ((int) jArr[4]) ^ 800731848, strF, ((int) j6) ^ 1886918609, c1112c, c1112c, ((int) j6) ^ 1886918609, ((int) j6) ^ 1886918609);
    }
}
