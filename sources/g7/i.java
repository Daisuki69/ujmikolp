package G7;

import D.C0190x;
import N5.C0450f;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.ui.common.view.activity.impl.FullScreenFlutterActivity;
import com.paymaya.ui.login.view.activity.impl.LauncherActivity;
import d4.AbstractC1331a;
import dOYHB6.yFtIp6.svM7M6;
import defpackage.AbstractC1414e;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends C0265h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f1861A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f1862s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f1863t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f1864u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public A7.h f1865v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public InterfaceC0263f f1866w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C0190x f1867x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public FlutterEngine f1868y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public J5.b f1869z;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // G7.C0265h
    public final void f(pg.r call, pg.t result) {
        int iIntValue;
        kotlin.jvm.internal.j.g(call, "call");
        kotlin.jvm.internal.j.g(result, "result");
        String str = call.f19112a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1233475520:
                    if (str.equals("updateNativeUnreadCount")) {
                        if (call.b("hasActiveChat")) {
                            Boolean bool = (Boolean) call.a("hasActiveChat");
                            Boolean bool2 = (Boolean) call.a("shouldShowUnread");
                            n().f2416b = bool != null ? bool.booleanValue() : false;
                            n().c = bool2 != null ? bool2.booleanValue() : false;
                        }
                        A7.h hVar = this.f1865v;
                        Integer num = (Integer) call.a("unreadCount");
                        if (num != null) {
                            hVar.getClass();
                            iIntValue = num.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        ((MayaDashboardFragment) ((F7.a) hVar.c.get())).f12177r0 = iIntValue;
                        if (iIntValue > 99) {
                            MayaDashboardFragment mayaDashboardFragment = (MayaDashboardFragment) ((F7.a) hVar.c.get());
                            mayaDashboardFragment.getClass();
                            C0450f c0450f = mayaDashboardFragment.f12158X;
                            if (c0450f == null) {
                                kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                                throw null;
                            }
                            ((AppCompatTextView) c0450f.f4088d).setText("99+");
                            C0450f c0450f2 = ((MayaDashboardFragment) ((F7.a) hVar.c.get())).f12158X;
                            if (c0450f2 != null) {
                                ((CardView) c0450f2.f4087b).setVisibility(0);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                                throw null;
                            }
                        }
                        if (iIntValue == 0) {
                            C0450f c0450f3 = ((MayaDashboardFragment) ((F7.a) hVar.c.get())).f12158X;
                            if (c0450f3 != null) {
                                ((CardView) c0450f3.f4087b).setVisibility(8);
                                return;
                            } else {
                                kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                                throw null;
                            }
                        }
                        F7.a aVar = (F7.a) hVar.c.get();
                        String count = String.valueOf(iIntValue);
                        MayaDashboardFragment mayaDashboardFragment2 = (MayaDashboardFragment) aVar;
                        mayaDashboardFragment2.getClass();
                        kotlin.jvm.internal.j.g(count, "count");
                        C0450f c0450f4 = mayaDashboardFragment2.f12158X;
                        if (c0450f4 == null) {
                            kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                            throw null;
                        }
                        ((AppCompatTextView) c0450f4.f4088d).setText(count);
                        C0450f c0450f5 = ((MayaDashboardFragment) ((F7.a) hVar.c.get())).f12158X;
                        if (c0450f5 != null) {
                            ((CardView) c0450f5.f4087b).setVisibility(0);
                            return;
                        } else {
                            kotlin.jvm.internal.j.n("mViewInboxFlutterIcon");
                            throw null;
                        }
                    }
                    break;
                case -962977510:
                    if (str.equals("refreshAccessToken")) {
                        A7.h hVar2 = this.f1865v;
                        hVar2.getClass();
                        com.paymaya.data.preference.a aVar2 = hVar2.f212d;
                        new Lh.d(new Lh.d(new Lh.h(hVar2.h.a(aVar2.d(), aVar2.z()), zh.b.a(), 0), new J5.a(result, 2), 2), new J5.c(result, 2), 0).e();
                        return;
                    }
                    break;
                case 557577391:
                    if (str.equals("getInboxToggles")) {
                        A7.h hVar3 = this.f1865v;
                        Map<String, Boolean> inboxFlutterToggles = hVar3.f212d.e().getInboxFlutterToggles();
                        A5.b bVar = A5.b.m0;
                        S5.c cVar = hVar3.f215l;
                        AbstractC1414e.k(cVar, bVar, inboxFlutterToggles, "ticket_notification_toggle");
                        AbstractC1414e.k(cVar, A5.b.f114k0, inboxFlutterToggles, "sendbird_caching_collection");
                        AbstractC1414e.k(cVar, A5.b.f117l0, inboxFlutterToggles, "csat_toggle");
                        AbstractC1414e.k(cVar, A5.b.f120n, inboxFlutterToggles, "chat_with_intent");
                        AbstractC1414e.k(cVar, A5.b.f123o, inboxFlutterToggles, "dedup_intent");
                        AbstractC1414e.k(cVar, A5.b.f126p, inboxFlutterToggles, "dedup_end_chat_button");
                        result.success(inboxFlutterToggles);
                        return;
                    }
                    break;
                case 794869884:
                    if (str.equals("getFirebaseToken")) {
                        A7.h hVar4 = this.f1865v;
                        hVar4.getClass();
                        AbstractC1331a.t("firebase_token", svM7M6.getString(hVar4.f212d.f11330b, "key_firebase_token", ""), result);
                        return;
                    }
                    break;
                case 1830894146:
                    if (str.equals("showPushNotification")) {
                        String strValueOf = String.valueOf(call.a("title"));
                        String strValueOf2 = String.valueOf(call.a("content"));
                        String strValueOf3 = String.valueOf(call.a("application-uri"));
                        Object objA = call.a("messageHashCode");
                        kotlin.jvm.internal.j.d(objA);
                        int iIntValue2 = ((Number) objA).intValue();
                        InterfaceC0263f interfaceC0263f = this.f1866w;
                        if (interfaceC0263f != null) {
                            A7.b bVarY1 = ((MayaDashboardActivity) interfaceC0263f).Y1();
                            if (strValueOf.equals("do_not_display") || strValueOf.equals("marketing")) {
                                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((B7.a) bVarY1.c.get());
                                mayaDashboardActivity.getClass();
                                try {
                                    Intent intentMakeRestartActivityTask = Intent.makeRestartActivityTask(new ComponentName(mayaDashboardActivity, (Class<?>) LauncherActivity.class));
                                    intentMakeRestartActivityTask.setFlags(268468224);
                                    intentMakeRestartActivityTask.putExtra("application-uri", strValueOf3);
                                    PendingIntent activity = PendingIntent.getActivity(mayaDashboardActivity, iIntValue2, intentMakeRestartActivityTask, 201326592);
                                    kotlin.jvm.internal.j.d(activity);
                                    Object systemService = mayaDashboardActivity.getSystemService("notification");
                                    kotlin.jvm.internal.j.e(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                                    ((NotificationManager) systemService).notify(iIntValue2, mayaDashboardActivity.V1(strValueOf2, activity).build());
                                    return;
                                } catch (Exception e) {
                                    e.toString();
                                    yk.a.c();
                                    return;
                                }
                            }
                            MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) ((B7.a) bVarY1.c.get());
                            mayaDashboardActivity2.getClass();
                            try {
                                Intent intentMakeRestartActivityTask2 = Intent.makeRestartActivityTask(new ComponentName(mayaDashboardActivity2, (Class<?>) LauncherActivity.class));
                                intentMakeRestartActivityTask2.setFlags(268468224);
                                intentMakeRestartActivityTask2.putExtra("application-uri", strValueOf3);
                                PendingIntent activity2 = PendingIntent.getActivity(mayaDashboardActivity2, iIntValue2, intentMakeRestartActivityTask2, 201326592);
                                kotlin.jvm.internal.j.d(activity2);
                                Object systemService2 = mayaDashboardActivity2.getSystemService("notification");
                                kotlin.jvm.internal.j.e(systemService2, "null cannot be cast to non-null type android.app.NotificationManager");
                                ((NotificationManager) systemService2).notify(iIntValue2, mayaDashboardActivity2.V1(strValueOf2, activity2).setContentTitle(strValueOf).build());
                                return;
                            } catch (Exception e7) {
                                e7.toString();
                                yk.a.c();
                                return;
                            }
                        }
                        return;
                    }
                    break;
            }
        }
        super.f(call, result);
    }

    @Override // G7.C0265h
    public final void h() {
        this.f1869z = (J5.b) ((O5.a) W4.a.e().a().c).f4744v0.get();
        n().f2415a = "";
        super.h();
    }

    @Override // G7.C0265h
    public final void i() {
        C0190x c0190x = this.f1867x;
        this.f1868y = new FlutterEngine((Context) c0190x.invoke());
        FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
        FlutterEngine flutterEngine = this.f1868y;
        if (flutterEngine == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        String str = this.f1863t;
        flutterEngineCache.put(str, flutterEngine);
        FlutterEngine flutterEngine2 = this.f1868y;
        if (flutterEngine2 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine2.getNavigationChannel().setInitialRoute("fullscreenFlowEntrypoint");
        FlutterEngine flutterEngine3 = this.f1868y;
        if (flutterEngine3 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        flutterEngine3.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", this.f1862s));
        k(new FlutterActivity.CachedEngineIntentBuilder(FullScreenFlutterActivity.class, str).build((Context) c0190x.invoke()));
        d().putExtra("engineId", str);
        d().putExtra("applyTransition", true);
        n().f2415a = "";
        FlutterEngine flutterEngine4 = this.f1868y;
        if (flutterEngine4 == null) {
            kotlin.jvm.internal.j.n("flutterActivityEngine");
            throw null;
        }
        this.f1856n = new pg.u(flutterEngine4.getDartExecutor().getBinaryMessenger(), this.f1864u);
        c().b(new A7.r(7, d(), this));
    }

    @Override // G7.C0265h
    public final void l(pg.u uVar, Intent intent) {
        uVar.b(new A7.r(7, intent, this));
    }

    public final J5.b n() {
        J5.b bVar = this.f1869z;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.j.n("mChatSupportCache");
        throw null;
    }
}
