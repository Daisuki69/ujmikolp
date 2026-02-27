package d4;

import androidx.media3.extractor.ts.TsExtractor;
import com.dynatrace.android.agent.conf.ServerConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static final int[] e = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};
    public static final g[] f = a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f16273b;
    public final Ri.a[] c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16274d;

    public g(int i, int[] iArr, Ri.a... aVarArr) {
        this.f16272a = i;
        this.f16273b = iArr;
        this.c = aVarArr;
        Ri.a aVar = aVarArr[0];
        int i4 = aVar.f5558b;
        int iK = 0;
        for (F3.a aVar2 : (F3.a[]) aVar.c) {
            iK = AbstractC1331a.k(aVar2.c, i4, aVar2.f1542b, iK);
        }
        this.f16274d = iK;
    }

    public static g[] a() {
        int i = 4;
        int i4 = 10;
        g gVar = new g(1, new int[0], new Ri.a(7, i, new F3.a[]{new F3.a(1, 19, 5)}), new Ri.a(i4, i, new F3.a[]{new F3.a(1, 16, 5)}), new Ri.a(13, i, new F3.a[]{new F3.a(1, 13, 5)}), new Ri.a(17, i, new F3.a[]{new F3.a(1, 9, 5)}));
        int i6 = 22;
        g gVar2 = new g(2, new int[]{6, 18}, new Ri.a(i4, i, new F3.a[]{new F3.a(1, 34, 5)}), new Ri.a(16, i, new F3.a[]{new F3.a(1, 28, 5)}), new Ri.a(i6, i, new F3.a[]{new F3.a(1, 22, 5)}), new Ri.a(28, i, new F3.a[]{new F3.a(1, 16, 5)}));
        int i10 = 26;
        g gVar3 = new g(3, new int[]{6, 22}, new Ri.a(15, i, new F3.a[]{new F3.a(1, 55, 5)}), new Ri.a(i10, i, new F3.a[]{new F3.a(1, 44, 5)}), new Ri.a(18, i, new F3.a[]{new F3.a(2, 17, 5)}), new Ri.a(i6, i, new F3.a[]{new F3.a(2, 13, 5)}));
        g gVar4 = new g(4, new int[]{6, 26}, new Ri.a(20, i, new F3.a[]{new F3.a(1, 80, 5)}), new Ri.a(18, i, new F3.a[]{new F3.a(2, 32, 5)}), new Ri.a(i10, i, new F3.a[]{new F3.a(2, 24, 5)}), new Ri.a(16, i, new F3.a[]{new F3.a(4, 9, 5)}));
        g gVar5 = new g(5, new int[]{6, 30}, new Ri.a(i10, i, new F3.a[]{new F3.a(1, 108, 5)}), new Ri.a(24, i, new F3.a[]{new F3.a(2, 43, 5)}), new Ri.a(18, i, new F3.a[]{new F3.a(2, 15, 5), new F3.a(2, 16, 5)}), new Ri.a(22, i, new F3.a[]{new F3.a(2, 11, 5), new F3.a(2, 12, 5)}));
        g gVar6 = new g(6, new int[]{6, 34}, new Ri.a(18, i, new F3.a[]{new F3.a(2, 68, 5)}), new Ri.a(16, i, new F3.a[]{new F3.a(4, 27, 5)}), new Ri.a(24, i, new F3.a[]{new F3.a(4, 19, 5)}), new Ri.a(28, i, new F3.a[]{new F3.a(4, 15, 5)}));
        g gVar7 = new g(7, new int[]{6, 22, 38}, new Ri.a(20, i, new F3.a[]{new F3.a(2, 78, 5)}), new Ri.a(18, i, new F3.a[]{new F3.a(4, 31, 5)}), new Ri.a(18, i, new F3.a[]{new F3.a(2, 14, 5), new F3.a(4, 15, 5)}), new Ri.a(26, 4, new F3.a[]{new F3.a(4, 13, 5), new F3.a(1, 14, 5)}));
        int i11 = 4;
        g gVar8 = new g(8, new int[]{6, 24, 42}, new Ri.a(24, i11, new F3.a[]{new F3.a(2, 97, 5)}), new Ri.a(22, i11, new F3.a[]{new F3.a(2, 38, 5), new F3.a(2, 39, 5)}), new Ri.a(22, i11, new F3.a[]{new F3.a(4, 18, 5), new F3.a(2, 19, 5)}), new Ri.a(26, 4, new F3.a[]{new F3.a(4, 14, 5), new F3.a(2, 15, 5)}));
        int i12 = 4;
        g gVar9 = new g(9, new int[]{6, 26, 46}, new Ri.a(30, i12, new F3.a[]{new F3.a(2, 116, 5)}), new Ri.a(22, i12, new F3.a[]{new F3.a(3, 36, 5), new F3.a(2, 37, 5)}), new Ri.a(20, i12, new F3.a[]{new F3.a(4, 16, 5), new F3.a(4, 17, 5)}), new Ri.a(24, i12, new F3.a[]{new F3.a(4, 12, 5), new F3.a(4, 13, 5)}));
        int i13 = 4;
        g gVar10 = new g(10, new int[]{6, 28, 50}, new Ri.a(18, i13, new F3.a[]{new F3.a(2, 68, 5), new F3.a(2, 69, 5)}), new Ri.a(26, i13, new F3.a[]{new F3.a(4, 43, 5), new F3.a(1, 44, 5)}), new Ri.a(24, i13, new F3.a[]{new F3.a(6, 19, 5), new F3.a(2, 20, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(6, 15, 5), new F3.a(2, 16, 5)}));
        int i14 = 4;
        g gVar11 = new g(11, new int[]{6, 30, 54}, new Ri.a(20, i14, new F3.a[]{new F3.a(4, 81, 5)}), new Ri.a(30, i14, new F3.a[]{new F3.a(1, 50, 5), new F3.a(4, 51, 5)}), new Ri.a(28, i14, new F3.a[]{new F3.a(4, 22, 5), new F3.a(4, 23, 5)}), new Ri.a(24, 4, new F3.a[]{new F3.a(3, 12, 5), new F3.a(8, 13, 5)}));
        int i15 = 4;
        int i16 = 4;
        g gVar12 = new g(12, new int[]{6, 32, 58}, new Ri.a(24, i15, new F3.a[]{new F3.a(2, 92, 5), new F3.a(2, 93, 5)}), new Ri.a(22, i15, new F3.a[]{new F3.a(6, 36, 5), new F3.a(2, 37, 5)}), new Ri.a(26, i16, new F3.a[]{new F3.a(4, 20, 5), new F3.a(6, 21, 5)}), new Ri.a(28, i16, new F3.a[]{new F3.a(7, 14, 5), new F3.a(4, 15, 5)}));
        int i17 = 4;
        g gVar13 = new g(13, new int[]{6, 34, 62}, new Ri.a(26, i17, new F3.a[]{new F3.a(4, 107, 5)}), new Ri.a(22, i17, new F3.a[]{new F3.a(8, 37, 5), new F3.a(1, 38, 5)}), new Ri.a(24, i17, new F3.a[]{new F3.a(8, 20, 5), new F3.a(4, 21, 5)}), new Ri.a(22, 4, new F3.a[]{new F3.a(12, 11, 5), new F3.a(4, 12, 5)}));
        int i18 = 4;
        g gVar14 = new g(14, new int[]{6, 26, 46, 66}, new Ri.a(30, i18, new F3.a[]{new F3.a(3, 115, 5), new F3.a(1, 116, 5)}), new Ri.a(24, i18, new F3.a[]{new F3.a(4, 40, 5), new F3.a(5, 41, 5)}), new Ri.a(20, 4, new F3.a[]{new F3.a(11, 16, 5), new F3.a(5, 17, 5)}), new Ri.a(24, 4, new F3.a[]{new F3.a(11, 12, 5), new F3.a(5, 13, 5)}));
        g gVar15 = new g(15, new int[]{6, 26, 48, 70}, new Ri.a(22, 4, new F3.a[]{new F3.a(5, 87, 5), new F3.a(1, 88, 5)}), new Ri.a(24, 4, new F3.a[]{new F3.a(5, 41, 5), new F3.a(5, 42, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(5, 24, 5), new F3.a(7, 25, 5)}), new Ri.a(24, 4, new F3.a[]{new F3.a(11, 12, 5), new F3.a(7, 13, 5)}));
        g gVar16 = new g(16, new int[]{6, 26, 50, 74}, new Ri.a(24, 4, new F3.a[]{new F3.a(5, 98, 5), new F3.a(1, 99, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(7, 45, 5), new F3.a(3, 46, 5)}), new Ri.a(24, 4, new F3.a[]{new F3.a(15, 19, 5), new F3.a(2, 20, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(3, 15, 5), new F3.a(13, 16, 5)}));
        g gVar17 = new g(17, new int[]{6, 30, 54, 78}, new Ri.a(28, 4, new F3.a[]{new F3.a(1, 107, 5), new F3.a(5, 108, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(10, 46, 5), new F3.a(1, 47, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(1, 22, 5), new F3.a(15, 23, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(2, 14, 5), new F3.a(17, 15, 5)}));
        int i19 = 4;
        g gVar18 = new g(18, new int[]{6, 30, 56, 82}, new Ri.a(30, i19, new F3.a[]{new F3.a(5, 120, 5), new F3.a(1, 121, 5)}), new Ri.a(26, i19, new F3.a[]{new F3.a(9, 43, 5), new F3.a(4, 44, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(17, 22, 5), new F3.a(1, 23, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(2, 14, 5), new F3.a(19, 15, 5)}));
        int i20 = 4;
        g gVar19 = new g(19, new int[]{6, 30, 58, 86}, new Ri.a(28, i20, new F3.a[]{new F3.a(3, 113, 5), new F3.a(4, 114, 5)}), new Ri.a(26, i20, new F3.a[]{new F3.a(3, 44, 5), new F3.a(11, 45, 5)}), new Ri.a(26, i20, new F3.a[]{new F3.a(17, 21, 5), new F3.a(4, 22, 5)}), new Ri.a(26, 4, new F3.a[]{new F3.a(9, 13, 5), new F3.a(16, 14, 5)}));
        int i21 = 4;
        int i22 = 28;
        g gVar20 = new g(20, new int[]{6, 34, 62, 90}, new Ri.a(28, i21, new F3.a[]{new F3.a(3, 107, 5), new F3.a(5, 108, 5)}), new Ri.a(26, i21, new F3.a[]{new F3.a(3, 41, 5), new F3.a(13, 42, 5)}), new Ri.a(30, i21, new F3.a[]{new F3.a(15, 24, 5), new F3.a(5, 25, 5)}), new Ri.a(i22, 4, new F3.a[]{new F3.a(15, 15, 5), new F3.a(10, 16, 5)}));
        int i23 = 4;
        g gVar21 = new g(21, new int[]{6, 28, 50, 72, 94}, new Ri.a(i22, i23, new F3.a[]{new F3.a(4, 116, 5), new F3.a(4, 117, 5)}), new Ri.a(26, i23, new F3.a[]{new F3.a(17, 42, 5)}), new Ri.a(28, i23, new F3.a[]{new F3.a(17, 22, 5), new F3.a(6, 23, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(19, 16, 5), new F3.a(6, 17, 5)}));
        int i24 = 28;
        int i25 = 4;
        g gVar22 = new g(22, new int[]{6, 26, 50, 74, 98}, new Ri.a(i24, i25, new F3.a[]{new F3.a(2, 111, 5), new F3.a(7, 112, 5)}), new Ri.a(i24, i25, new F3.a[]{new F3.a(17, 46, 5)}), new Ri.a(30, i25, new F3.a[]{new F3.a(7, 24, 5), new F3.a(16, 25, 5)}), new Ri.a(24, i25, new F3.a[]{new F3.a(34, 13, 5)}));
        g gVar23 = new g(23, new int[]{6, 30, 54, 78, 102}, new Ri.a(30, 4, new F3.a[]{new F3.a(4, 121, 5), new F3.a(5, 122, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(4, 47, 5), new F3.a(14, 48, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(11, 24, 5), new F3.a(14, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(16, 15, 5), new F3.a(14, 16, 5)}));
        g gVar24 = new g(24, new int[]{6, 28, 54, 80, 106}, new Ri.a(30, 4, new F3.a[]{new F3.a(6, 117, 5), new F3.a(4, 118, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(6, 45, 5), new F3.a(14, 46, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(11, 24, 5), new F3.a(16, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(30, 16, 5), new F3.a(2, 17, 5)}));
        g gVar25 = new g(25, new int[]{6, 32, 58, 84, 110}, new Ri.a(26, 4, new F3.a[]{new F3.a(8, 106, 5), new F3.a(4, 107, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(8, 47, 5), new F3.a(13, 48, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(7, 24, 5), new F3.a(22, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(22, 15, 5), new F3.a(13, 16, 5)}));
        int i26 = 28;
        int i27 = 4;
        Ri.a aVar = new Ri.a(i26, i27, new F3.a[]{new F3.a(10, 114, 5), new F3.a(2, 115, 5)});
        Ri.a aVar2 = new Ri.a(i26, i27, new F3.a[]{new F3.a(19, 46, 5), new F3.a(4, 47, 5)});
        int i28 = 4;
        g gVar26 = new g(26, new int[]{6, 30, 58, 86, 114}, aVar, aVar2, new Ri.a(28, i28, new F3.a[]{new F3.a(28, 22, 5), new F3.a(6, 23, 5)}), new Ri.a(30, i28, new F3.a[]{new F3.a(33, 16, 5), new F3.a(4, 17, 5)}));
        g gVar27 = new g(27, new int[]{6, 34, 62, 90, 118}, new Ri.a(30, 4, new F3.a[]{new F3.a(8, 122, 5), new F3.a(4, 123, 5)}), new Ri.a(28, 4, new F3.a[]{new F3.a(22, 45, 5), new F3.a(3, 46, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(8, 23, 5), new F3.a(26, 24, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(12, 15, 5), new F3.a(28, 16, 5)}));
        int i29 = 4;
        g gVar28 = new g(28, new int[]{6, 26, 50, 74, 98, 122}, new Ri.a(30, i29, new F3.a[]{new F3.a(3, 117, 5), new F3.a(10, 118, 5)}), new Ri.a(28, i29, new F3.a[]{new F3.a(3, 45, 5), new F3.a(23, 46, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(4, 24, 5), new F3.a(31, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(11, 15, 5), new F3.a(31, 16, 5)}));
        int i30 = 4;
        g gVar29 = new g(29, new int[]{6, 30, 54, 78, 102, 126}, new Ri.a(30, i30, new F3.a[]{new F3.a(7, 116, 5), new F3.a(7, 117, 5)}), new Ri.a(28, i30, new F3.a[]{new F3.a(21, 45, 5), new F3.a(7, 46, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(1, 23, 5), new F3.a(37, 24, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(19, 15, 5), new F3.a(26, 16, 5)}));
        int i31 = 4;
        g gVar30 = new g(30, new int[]{6, 26, 52, 78, 104, 130}, new Ri.a(30, i31, new F3.a[]{new F3.a(5, 115, 5), new F3.a(10, 116, 5)}), new Ri.a(28, i31, new F3.a[]{new F3.a(19, 47, 5), new F3.a(10, 48, 5)}), new Ri.a(30, i31, new F3.a[]{new F3.a(15, 24, 5), new F3.a(25, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(23, 15, 5), new F3.a(25, 16, 5)}));
        int i32 = 4;
        g gVar31 = new g(31, new int[]{6, 30, 56, 82, 108, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO}, new Ri.a(30, i32, new F3.a[]{new F3.a(13, 115, 5), new F3.a(3, 116, 5)}), new Ri.a(28, i32, new F3.a[]{new F3.a(2, 46, 5), new F3.a(29, 47, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(42, 24, 5), new F3.a(1, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(23, 15, 5), new F3.a(28, 16, 5)}));
        int i33 = 4;
        g gVar32 = new g(32, new int[]{6, 34, 60, 86, 112, TsExtractor.TS_STREAM_TYPE_DTS}, new Ri.a(30, i33, new F3.a[]{new F3.a(17, 115, 5)}), new Ri.a(28, i33, new F3.a[]{new F3.a(10, 46, 5), new F3.a(23, 47, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(10, 24, 5), new F3.a(35, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(19, 15, 5), new F3.a(35, 16, 5)}));
        int i34 = 4;
        g gVar33 = new g(33, new int[]{6, 30, 58, 86, 114, 142}, new Ri.a(30, i34, new F3.a[]{new F3.a(17, 115, 5), new F3.a(1, 116, 5)}), new Ri.a(28, i34, new F3.a[]{new F3.a(14, 46, 5), new F3.a(21, 47, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(29, 24, 5), new F3.a(19, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(11, 15, 5), new F3.a(46, 16, 5)}));
        int i35 = 4;
        g gVar34 = new g(34, new int[]{6, 34, 62, 90, 118, 146}, new Ri.a(30, i35, new F3.a[]{new F3.a(13, 115, 5), new F3.a(6, 116, 5)}), new Ri.a(28, i35, new F3.a[]{new F3.a(14, 46, 5), new F3.a(23, 47, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(44, 24, 5), new F3.a(7, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(59, 16, 5), new F3.a(1, 17, 5)}));
        int i36 = 4;
        g gVar35 = new g(35, new int[]{6, 30, 54, 78, 102, 126, ServerConfiguration.DEFAULT_MAX_BEACON_SIZE_KB_SAAS}, new Ri.a(30, i36, new F3.a[]{new F3.a(12, 121, 5), new F3.a(7, 122, 5)}), new Ri.a(28, i36, new F3.a[]{new F3.a(12, 47, 5), new F3.a(26, 48, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(39, 24, 5), new F3.a(14, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(22, 15, 5), new F3.a(41, 16, 5)}));
        int i37 = 4;
        g gVar36 = new g(36, new int[]{6, 24, 50, 76, 102, 128, 154}, new Ri.a(30, i37, new F3.a[]{new F3.a(6, 121, 5), new F3.a(14, 122, 5)}), new Ri.a(28, i37, new F3.a[]{new F3.a(6, 47, 5), new F3.a(34, 48, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(46, 24, 5), new F3.a(10, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(2, 15, 5), new F3.a(64, 16, 5)}));
        int i38 = 4;
        g gVar37 = new g(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new Ri.a(30, i38, new F3.a[]{new F3.a(17, 122, 5), new F3.a(4, 123, 5)}), new Ri.a(28, i38, new F3.a[]{new F3.a(29, 46, 5), new F3.a(14, 47, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(49, 24, 5), new F3.a(10, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(24, 15, 5), new F3.a(46, 16, 5)}));
        int i39 = 4;
        g gVar38 = new g(38, new int[]{6, 32, 58, 84, 110, TsExtractor.TS_STREAM_TYPE_DTS_HD, 162}, new Ri.a(30, i39, new F3.a[]{new F3.a(4, 122, 5), new F3.a(18, 123, 5)}), new Ri.a(28, i39, new F3.a[]{new F3.a(13, 46, 5), new F3.a(32, 47, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(48, 24, 5), new F3.a(14, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(42, 15, 5), new F3.a(32, 16, 5)}));
        int i40 = 4;
        g gVar39 = new g(39, new int[]{6, 26, 54, 82, 110, TsExtractor.TS_STREAM_TYPE_DTS, 166}, new Ri.a(30, i40, new F3.a[]{new F3.a(20, 117, 5), new F3.a(4, 118, 5)}), new Ri.a(28, i40, new F3.a[]{new F3.a(40, 47, 5), new F3.a(7, 48, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(43, 24, 5), new F3.a(22, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(10, 15, 5), new F3.a(67, 16, 5)}));
        int i41 = 4;
        return new g[]{gVar, gVar2, gVar3, gVar4, gVar5, gVar6, gVar7, gVar8, gVar9, gVar10, gVar11, gVar12, gVar13, gVar14, gVar15, gVar16, gVar17, gVar18, gVar19, gVar20, gVar21, gVar22, gVar23, gVar24, gVar25, gVar26, gVar27, gVar28, gVar29, gVar30, gVar31, gVar32, gVar33, gVar34, gVar35, gVar36, gVar37, gVar38, gVar39, new g(40, new int[]{6, 30, 58, 86, 114, 142, 170}, new Ri.a(30, i41, new F3.a[]{new F3.a(19, 118, 5), new F3.a(6, 119, 5)}), new Ri.a(28, i41, new F3.a[]{new F3.a(18, 47, 5), new F3.a(31, 48, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(34, 24, 5), new F3.a(34, 25, 5)}), new Ri.a(30, 4, new F3.a[]{new F3.a(20, 15, 5), new F3.a(61, 16, 5)}))};
    }

    public static g b(int i) {
        int i4 = Integer.MAX_VALUE;
        int i6 = 0;
        for (int i10 = 0; i10 < 34; i10++) {
            int i11 = e[i10];
            if (i11 == i) {
                return c(i10 + 7);
            }
            int iBitCount = Integer.bitCount(i11 ^ i);
            if (iBitCount < i4) {
                i6 = i10 + 7;
                i4 = iBitCount;
            }
        }
        if (i4 <= 3) {
            return c(i6);
        }
        return null;
    }

    public static g c(int i) {
        if (i <= 0 || i > 40) {
            throw new IllegalArgumentException();
        }
        return f[i - 1];
    }

    public final String toString() {
        return String.valueOf(this.f16272a);
    }
}
