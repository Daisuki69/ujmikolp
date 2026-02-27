package K2;

/* JADX INFO: loaded from: classes2.dex */
public final class c extends x3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c f2564b;

    public static synchronized c E() {
        try {
            if (f2564b == null) {
                f2564b = new c();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f2564b;
    }

    @Override // x3.d
    public final String o() {
        return "isEnabled";
    }

    @Override // x3.d
    public final String q() {
        return "firebase_performance_collection_enabled";
    }
}
