package K2;

/* JADX INFO: loaded from: classes2.dex */
public final class d extends x3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f2565b;

    public static synchronized d E() {
        try {
            if (f2565b == null) {
                f2565b = new d();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2565b;
    }

    @Override // x3.d
    public final String o() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // x3.d
    public final String q() {
        return "experiment_app_start_ttid";
    }
}
