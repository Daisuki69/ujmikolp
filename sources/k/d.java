package K;

import D.C0176i;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2553a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2554b;
    public final /* synthetic */ int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f2555d;
    public final /* synthetic */ Object e;

    public d(WeakReference weakReference, Context context, int i, String str) {
        this.f2554b = weakReference;
        this.f2555d = context;
        this.c = i;
        this.e = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call() {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: K.d.call():java.lang.Object");
    }

    public d(C0176i c0176i, JSONObject jSONObject, int i, Context context) {
        this.e = c0176i;
        this.f2554b = jSONObject;
        this.c = i;
        this.f2555d = context;
    }

    public d(d dVar, Context context, JSONObject jSONObject, int i) {
        this.e = dVar;
        this.f2555d = context;
        this.f2554b = jSONObject;
        this.c = i;
    }
}
