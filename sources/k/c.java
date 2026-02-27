package K;

import D.C0176i;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c1.i;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import dOYHB6.tiZVw8.numX49;
import de.m;
import i1.f;
import j1.C1659g;
import j1.InterfaceC1656d;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2550a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f2551b;
    public final /* synthetic */ Object c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2552d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(d dVar, Context context, JSONObject jSONObject, int i) {
        this.c = dVar;
        this.f2552d = context;
        this.e = jSONObject;
        this.f2551b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2550a) {
            case 0:
                d dVar = (d) this.c;
                l0.b.a((CleverTapInstanceConfig) ((C0176i) dVar.e).f917g).b().k(numX49.tnTj78("PTd"), new d(dVar, (Context) this.f2552d, (JSONObject) this.e, this.f2551b));
                return;
            default:
                i iVar = (i) this.f2552d;
                int i = this.f2551b;
                Runnable runnable = (Runnable) this.e;
                f fVar = (f) this.c;
                k1.b bVar = fVar.f;
                try {
                    try {
                        InterfaceC1656d interfaceC1656d = fVar.c;
                        Objects.requireNonNull(interfaceC1656d);
                        ((C1659g) bVar).k(new m(interfaceC1656d, 15));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) fVar.f17078a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                            ((C1659g) bVar).k(new G6.b(fVar, iVar, i, 10));
                        } else {
                            fVar.a(iVar, i);
                        }
                        break;
                    } catch (SynchronizationException unused) {
                        fVar.f17080d.a(iVar, i + 1, false);
                    }
                    return;
                } finally {
                    runnable.run();
                }
        }
    }

    public /* synthetic */ c(f fVar, i iVar, int i, Runnable runnable) {
        this.c = fVar;
        this.f2552d = iVar;
        this.f2551b = i;
        this.e = runnable;
    }
}
