package defpackage;

import A5.j;
import android.app.Activity;
import bj.C1034e;
import bj.InterfaceC1033d;
import cj.r;
import com.paymaya.domain.store.L;
import dev.fluttercommunity.plus.wakelock.NoActivityException;
import e2.C1421c;
import ig.C1602a;
import java.util.List;
import pg.C2042e;
import pg.InterfaceC2040c;
import pg.InterfaceC2041d;
import pg.q;
import qk.i;

/* JADX INFO: loaded from: classes5.dex */
public final class H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ H0 f2068a = new H0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1033d f2069b = C1034e.b(new j(20));

    public static void a(H0 h02, pg.j jVar, final C1602a c1602a) {
        h02.getClass();
        String strConcat = "".length() > 0 ? ".".concat("") : "";
        String strH = AbstractC1414e.h("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.toggle", strConcat);
        InterfaceC1033d interfaceC1033d = f2069b;
        C2042e c2042e = new C2042e(jVar, strH, (q) interfaceC1033d.getValue(), null);
        if (c1602a != null) {
            final int i = 0;
            c2042e.b(new InterfaceC2040c() { // from class: G0
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    List listB;
                    List listB2;
                    Activity activity;
                    switch (i) {
                        case 0:
                            C1602a c1602a2 = c1602a;
                            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c1602a2.a((B0) obj2);
                                listB = r.c(null);
                                break;
                            } catch (Throwable th2) {
                                listB = i.b(th2);
                            }
                            ((C1421c) interfaceC2041d).reply(listB);
                            return;
                        default:
                            try {
                                L l6 = c1602a.f17146a;
                                kotlin.jvm.internal.j.d(l6);
                                activity = (Activity) l6.f11367b;
                            } catch (Throwable th3) {
                                listB2 = i.b(th3);
                            }
                            if (activity == null) {
                                throw new NoActivityException();
                            }
                            kotlin.jvm.internal.j.d(activity);
                            listB2 = r.c(new P(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0)));
                            ((C1421c) interfaceC2041d).reply(listB2);
                            return;
                    }
                }
            });
        } else {
            c2042e.b(null);
        }
        C2042e c2042e2 = new C2042e(jVar, AbstractC1414e.h("dev.flutter.pigeon.wakelock_plus_platform_interface.WakelockPlusApi.isEnabled", strConcat), (q) interfaceC1033d.getValue(), null);
        if (c1602a == null) {
            c2042e2.b(null);
        } else {
            final int i4 = 1;
            c2042e2.b(new InterfaceC2040c() { // from class: G0
                @Override // pg.InterfaceC2040c
                public final void onMessage(Object obj, InterfaceC2041d interfaceC2041d) {
                    List listB;
                    List listB2;
                    Activity activity;
                    switch (i4) {
                        case 0:
                            C1602a c1602a2 = c1602a;
                            kotlin.jvm.internal.j.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                            Object obj2 = ((List) obj).get(0);
                            kotlin.jvm.internal.j.e(obj2, "null cannot be cast to non-null type <root>.ToggleMessage");
                            try {
                                c1602a2.a((B0) obj2);
                                listB = r.c(null);
                                break;
                            } catch (Throwable th2) {
                                listB = i.b(th2);
                            }
                            ((C1421c) interfaceC2041d).reply(listB);
                            return;
                        default:
                            try {
                                L l6 = c1602a.f17146a;
                                kotlin.jvm.internal.j.d(l6);
                                activity = (Activity) l6.f11367b;
                            } catch (Throwable th3) {
                                listB2 = i.b(th3);
                            }
                            if (activity == null) {
                                throw new NoActivityException();
                            }
                            kotlin.jvm.internal.j.d(activity);
                            listB2 = r.c(new P(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0)));
                            ((C1421c) interfaceC2041d).reply(listB2);
                            return;
                    }
                }
            });
        }
    }
}
