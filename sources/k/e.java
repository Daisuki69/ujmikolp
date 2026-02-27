package K;

import D.C0176i;
import D.S;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import dOYHB6.tiZVw8.numX49;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f2557b;
    public final /* synthetic */ C0176i c;

    public /* synthetic */ e(int i, C0176i c0176i, Context context) {
        this.f2556a = i;
        this.c = c0176i;
        this.f2557b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2556a) {
            case 0:
                C0176i c0176i = this.c;
                Context context = this.f2557b;
                c0176i.i(context, 1);
                c0176i.i(context, 2);
                break;
            default:
                C0176i c0176i2 = this.c;
                S sC = ((CleverTapInstanceConfig) c0176i2.f917g).c();
                String str = ((CleverTapInstanceConfig) c0176i2.f917g).f9439a;
                sC.getClass();
                S.s(str, numX49.tnTj78("PTP"));
                c0176i2.i(this.f2557b, 2);
                break;
        }
    }
}
