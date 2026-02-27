package f0;

import D.S;
import b1.t;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.firebase.messaging.r;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import n0.d;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f16686b;

    public /* synthetic */ b(t tVar, int i) {
        this.f16685a = i;
        this.f16686b = tVar;
    }

    private final Object a() {
        synchronized (this) {
            try {
                try {
                    HashMap map = new HashMap();
                    if (((Map) this.f16686b.i).isEmpty()) {
                        t tVar = this.f16686b;
                        map = t.a(tVar, tVar.e());
                    } else {
                        map.putAll((Map) this.f16686b.i);
                        ((Map) this.f16686b.i).clear();
                    }
                    ((Map) this.f16686b.f8333a).clear();
                    if (!((Map) this.f16686b.f8334b).isEmpty()) {
                        t tVar2 = this.f16686b;
                        ((Map) tVar2.f8333a).putAll((Map) tVar2.f8334b);
                    }
                    ((Map) this.f16686b.f8333a).putAll(map);
                    S sC = ((CleverTapInstanceConfig) this.f16686b.e).c();
                    String strL = jk.b.l((CleverTapInstanceConfig) this.f16686b.e);
                    String str = "Activated successfully with configs: " + ((Map) this.f16686b.f8333a);
                    sC.getClass();
                    S.s(strL, str);
                } catch (Exception e) {
                    e.printStackTrace();
                    S sC2 = ((CleverTapInstanceConfig) this.f16686b.e).c();
                    String strL2 = jk.b.l((CleverTapInstanceConfig) this.f16686b.e);
                    String str2 = "Activate failed: " + e.getLocalizedMessage();
                    sC2.getClass();
                    S.s(strL2, str2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Boolean bool;
        switch (this.f16685a) {
            case 0:
                return a();
            case 1:
                t tVar = this.f16686b;
                S sC = ((CleverTapInstanceConfig) tVar.e).c();
                String strL = jk.b.l((CleverTapInstanceConfig) tVar.e);
                sC.getClass();
                S.s(strL, "Product Config: fetch Success");
                tVar.m(2);
                return null;
            default:
                synchronized (this) {
                    try {
                        if (!((Map) this.f16686b.f8334b).isEmpty()) {
                            t tVar2 = this.f16686b;
                            ((Map) tVar2.f8333a).putAll((Map) tVar2.f8334b);
                        }
                        t tVar3 = this.f16686b;
                        HashMap mapA = t.a(tVar3, tVar3.e());
                        if (!mapA.isEmpty()) {
                            ((Map) this.f16686b.i).putAll(mapA);
                        }
                        S sC2 = ((CleverTapInstanceConfig) this.f16686b.e).c();
                        String strL2 = jk.b.l((CleverTapInstanceConfig) this.f16686b.e);
                        String str = "Loaded configs ready to be applied: " + ((Map) this.f16686b.i);
                        sC2.getClass();
                        S.s(strL2, str);
                        t tVar4 = this.f16686b;
                        ((r) tVar4.h).F((d) tVar4.f8335d);
                        ((AtomicBoolean) this.f16686b.c).set(true);
                        bool = Boolean.TRUE;
                    } catch (Exception e) {
                        e.printStackTrace();
                        S sC3 = ((CleverTapInstanceConfig) this.f16686b.e).c();
                        String strL3 = jk.b.l((CleverTapInstanceConfig) this.f16686b.e);
                        String str2 = "InitAsync failed - " + e.getLocalizedMessage();
                        sC3.getClass();
                        S.s(strL3, str2);
                        bool = Boolean.FALSE;
                    } finally {
                    }
                }
                return bool;
        }
    }
}
