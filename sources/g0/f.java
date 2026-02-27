package g0;

import D.S;
import D.b0;
import android.app.job.JobScheduler;
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f16776b;

    public /* synthetic */ f(g gVar, int i) {
        this.f16775a = i;
        this.f16776b = gVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f16775a) {
            case 0:
                g.b(this.f16776b, true);
                break;
            case 1:
                g gVar = this.f16776b;
                Context context = gVar.f16780g;
                int iB = b0.b(context, -1, "pfjobid");
                if (iB != -1) {
                    ((JobScheduler) context.getSystemService("jobscheduler")).cancel(iB);
                    b0.m(context, "pfjobid");
                }
                CleverTapInstanceConfig cleverTapInstanceConfig = gVar.f;
                if (!cleverTapInstanceConfig.i || cleverTapInstanceConfig.h) {
                    S sC = cleverTapInstanceConfig.c();
                    String str = cleverTapInstanceConfig.f9439a;
                    sC.getClass();
                    S.g(str, "Pushamp - Cancelling worker as background sync is disabled or config is analytics only");
                    gVar.h();
                } else {
                    g.b(gVar, false);
                }
                break;
            default:
                g gVar2 = this.f16776b;
                Iterator it = gVar2.f16778b.iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    CleverTapInstanceConfig cleverTapInstanceConfig2 = gVar2.f;
                    if (!zHasNext) {
                        for (h hVar : gVar2.c) {
                            try {
                                gVar2.f(gVar2.c(hVar), true, hVar);
                            } catch (Throwable th2) {
                                cleverTapInstanceConfig2.f("Token Refresh error " + hVar, th2);
                            }
                        }
                        break;
                    } else {
                        InterfaceC1492a interfaceC1492a = (InterfaceC1492a) it.next();
                        try {
                            interfaceC1492a.requestToken();
                        } catch (Throwable th3) {
                            cleverTapInstanceConfig2.f("Token Refresh error " + interfaceC1492a, th3);
                        }
                    }
                }
                break;
        }
        return null;
    }
}
