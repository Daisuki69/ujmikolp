package K2;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends x3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g f2567b;
    public static final Map c;

    static {
        f fVar = new f();
        fVar.put(461L, "FIREPERF_AUTOPUSH");
        fVar.put(462L, "FIREPERF");
        fVar.put(675L, "FIREPERF_INTERNAL_LOW");
        fVar.put(676L, "FIREPERF_INTERNAL_HIGH");
        c = Collections.unmodifiableMap(fVar);
    }

    @Override // x3.d
    public final String o() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
