package Kg;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends Vg.d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final M5.d f2659g = new M5.d("Before", 2);
    public static final M5.d h = new M5.d("State", 2);
    public static final M5.d i = new M5.d("After", 2);
    public static final M5.d j = new M5.d("Receive", 2);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final M5.d f2660k = new M5.d("Parse", 2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final M5.d f2661l = new M5.d("Transform", 2);
    public static final M5.d m = new M5.d("State", 2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final M5.d f2662n = new M5.d("After", 2);
    public final /* synthetic */ int e;
    public final boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i4) {
        super(f2659g, h, i);
        this.e = i4;
        switch (i4) {
            case 1:
                super(j, f2660k, f2661l, m, f2662n);
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
