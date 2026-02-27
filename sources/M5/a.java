package M5;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f3080b;

    @Override // M5.f
    public final String d() {
        switch (this.f3079a) {
            case 0:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "biller", "slug", this.f3080b);
            case 1:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "form_series_bir", "form_series", this.f3080b);
            default:
                return String.format("SELECT * FROM %1$s WHERE %2$s = \"%3$s\"", "online_payment", "category", this.f3080b);
        }
    }
}
