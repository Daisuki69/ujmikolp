package K;

import D.C0176i;
import D.S;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2549b;
    public final /* synthetic */ C0176i c;

    public b(int i, C0176i c0176i, Context context) {
        this.c = c0176i;
        this.f2548a = i;
        this.f2549b = context;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        C0176i c0176i = this.c;
        int i = this.f2548a;
        if (i == 2) {
            S s9 = (S) c0176i.f;
            String str = ((CleverTapInstanceConfig) c0176i.f917g).f9439a;
            s9.getClass();
            S.s(str, numX49.tnTj78("PTS"));
        } else {
            S s10 = (S) c0176i.f;
            String str2 = ((CleverTapInstanceConfig) c0176i.f917g).f9439a;
            s10.getClass();
            S.s(str2, numX49.tnTj78("PTj"));
        }
        c0176i.j(this.f2549b, i, null, false);
        return null;
    }
}
