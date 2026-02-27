package Jg;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends Vg.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M5.d f2528g = new M5.d("Before", 2);
    public static final M5.d h = new M5.d("State", 2);
    public static final M5.d i = new M5.d("Transform", 2);
    public static final M5.d j = new M5.d("Render", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M5.d f2529k = new M5.d("Send", 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M5.d f2530l = new M5.d("Before", 2);
    public static final M5.d m = new M5.d("State", 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final M5.d f2531n = new M5.d("Monitoring", 2);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final M5.d f2532o = new M5.d("Engine", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final M5.d f2533p = new M5.d("Receive", 2);
    public final /* synthetic */ int e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i4) {
        super(f2528g, h, i, j, f2529k);
        this.e = i4;
        switch (i4) {
            case 1:
                super(f2530l, m, f2531n, f2532o, f2533p);
                this.f = true;
                break;
            default:
                this.f = true;
                break;
        }
    }

    @Override // Vg.d
    public final boolean d() {
        switch (this.e) {
        }
        return this.f;
    }
}
