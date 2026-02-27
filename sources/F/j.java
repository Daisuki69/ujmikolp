package F;

import We.s;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import java.io.File;
import java.io.FilenameFilter;
import zj.z;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1506b;

    public /* synthetic */ j(Object obj, int i) {
        this.f1505a = i;
        this.f1506b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f1505a) {
            case 0:
                Cg.c cVar = (Cg.c) this.f1506b;
                kotlin.jvm.internal.j.d(str);
                return z.w(str, 2, numX49.tnTj78("Pc5"), false) && z.n(str, 2, s.p(new StringBuilder(), ((CleverTapInstanceConfig) cVar.c).f9439a, numX49.tnTj78("PcJ")), false);
            default:
                return str.startsWith((String) this.f1506b);
        }
    }
}
