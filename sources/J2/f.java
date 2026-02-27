package J2;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f {
    public static final M2.a e = M2.a.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f2407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameMetricsAggregator f2408b;
    public final HashMap c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2409d;

    public f(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.f2409d = false;
        this.f2407a = activity;
        this.f2408b = frameMetricsAggregator;
        this.c = map;
    }

    public final T2.d a() {
        boolean z4 = this.f2409d;
        M2.a aVar = e;
        if (!z4) {
            aVar.a("No recording has been started.");
            return new T2.d();
        }
        SparseIntArray[] metrics = this.f2408b.getMetrics();
        if (metrics == null) {
            aVar.a("FrameMetricsAggregator.mMetrics is uninitialized.");
            return new T2.d();
        }
        SparseIntArray sparseIntArray = metrics[0];
        if (sparseIntArray == null) {
            aVar.a("FrameMetricsAggregator.mMetrics[TOTAL_INDEX] is uninitialized.");
            return new T2.d();
        }
        int i = 0;
        int i4 = 0;
        int i6 = 0;
        for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
            int iKeyAt = sparseIntArray.keyAt(i10);
            int iValueAt = sparseIntArray.valueAt(i10);
            i += iValueAt;
            if (iKeyAt > 700) {
                i6 += iValueAt;
            }
            if (iKeyAt > 16) {
                i4 += iValueAt;
            }
        }
        return new T2.d(new N2.c(i, i4, i6));
    }
}
