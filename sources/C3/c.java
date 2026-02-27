package C3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f707b;
    public static final c c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f708d;
    public static final c e;
    public static final c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f709g;
    public static final c h;
    public static final c i;
    public static final c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f710k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f711l;
    public static final /* synthetic */ c[] m;

    static {
        c cVar = new c("ERROR_CORRECTION", 0);
        f706a = cVar;
        c cVar2 = new c("CHARACTER_SET", 1);
        f707b = cVar2;
        c cVar3 = new c("DATA_MATRIX_SHAPE", 2);
        c = cVar3;
        c cVar4 = new c("MIN_SIZE", 3);
        f708d = cVar4;
        c cVar5 = new c("MAX_SIZE", 4);
        e = cVar5;
        c cVar6 = new c("MARGIN", 5);
        f = cVar6;
        c cVar7 = new c("PDF417_COMPACT", 6);
        f709g = cVar7;
        c cVar8 = new c("PDF417_COMPACTION", 7);
        h = cVar8;
        c cVar9 = new c("PDF417_DIMENSIONS", 8);
        i = cVar9;
        c cVar10 = new c("AZTEC_LAYERS", 9);
        j = cVar10;
        c cVar11 = new c("QR_VERSION", 10);
        f710k = cVar11;
        c cVar12 = new c("GS1_FORMAT", 11);
        f711l = cVar12;
        m = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) m.clone();
    }
}
