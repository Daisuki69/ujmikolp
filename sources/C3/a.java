package C3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f690b;
    public static final a c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f691d;
    public static final a e;
    public static final a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f692g;
    public static final a h;
    public static final a i;
    public static final a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f694l;
    public static final a m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f695n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f696o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f697p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f698q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ a[] f699r;

    static {
        a aVar = new a("AZTEC", 0);
        f689a = aVar;
        a aVar2 = new a("CODABAR", 1);
        f690b = aVar2;
        a aVar3 = new a("CODE_39", 2);
        c = aVar3;
        a aVar4 = new a("CODE_93", 3);
        f691d = aVar4;
        a aVar5 = new a("CODE_128", 4);
        e = aVar5;
        a aVar6 = new a("DATA_MATRIX", 5);
        f = aVar6;
        a aVar7 = new a("EAN_8", 6);
        f692g = aVar7;
        a aVar8 = new a("EAN_13", 7);
        h = aVar8;
        a aVar9 = new a("ITF", 8);
        i = aVar9;
        a aVar10 = new a("MAXICODE", 9);
        j = aVar10;
        a aVar11 = new a("PDF_417", 10);
        f693k = aVar11;
        a aVar12 = new a("QR_CODE", 11);
        f694l = aVar12;
        a aVar13 = new a("RSS_14", 12);
        m = aVar13;
        a aVar14 = new a("RSS_EXPANDED", 13);
        f695n = aVar14;
        a aVar15 = new a("UPC_A", 14);
        f696o = aVar15;
        a aVar16 = new a("UPC_E", 15);
        f697p = aVar16;
        a aVar17 = new a("UPC_EAN_EXTENSION", 16);
        f698q = aVar17;
        f699r = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11, aVar12, aVar13, aVar14, aVar15, aVar16, aVar17};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f699r.clone();
    }
}
