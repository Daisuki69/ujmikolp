package com.paymaya.mayaui.dashboard.view.activity.impl;

import A5.m;
import A7.C0103a;
import B5.i;
import B7.a;
import Bj.H;
import C7.e;
import C7.f;
import D.C;
import D.C0187u;
import D.CallableC0168a;
import D.S;
import D7.d;
import G7.C0258a;
import G7.G;
import G7.InterfaceC0263f;
import Kh.J;
import Lc.c;
import N.h;
import N.k;
import N5.C0452f1;
import N5.C0453g;
import N5.k1;
import S7.j;
import W6.b;
import W6.l;
import a.AbstractC0617a;
import a5.C0631c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import cj.C1110A;
import cj.C1112C;
import cj.C1132s;
import cj.M;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.EnumC1218g;
import com.paymaya.common.utility.V;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.model.BackUpIdentity;
import com.paymaya.domain.model.DashboardTab;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PurchasedTicket;
import com.paymaya.domain.model.ReKycCriteriaBase;
import com.paymaya.domain.model.SecondaryFeature;
import com.paymaya.domain.model.User;
import com.paymaya.domain.model.UserActivity;
import com.paymaya.domain.store.C1290w;
import com.paymaya.domain.store.C1297z0;
import com.paymaya.domain.store.b1;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.dialog.impl.MayaAlertBottomSheetDialogFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaDashboardFragment;
import com.paymaya.mayaui.dashboard.view.fragment.impl.MayaServicesV2Fragment;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.pay.view.impl.MayaPayActivity;
import com.paymaya.mayaui.rekyc.view.fragment.impl.ReKycIntroBottomSheetFragment;
import com.paymaya.mayaui.score.view.activity.impl.MayaScoreActivity;
import com.paymaya.mayaui.sendmoney.view.activity.impl.MayaSendMoneyActivity;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import dOYHB6.yFtIp6.svM7M6;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineCache;
import io.flutter.embedding.engine.dart.DartExecutor;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import lb.InterfaceC1820a;
import org.joda.time.DateTime;
import pg.t;
import rb.InterfaceC2193b;
import w.C2361c;
import x5.C2467a;
import y5.g;
import y5.q;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaDashboardActivity extends q implements a, InterfaceC0263f, G, G7.q, Q9.G, b, C6.a, g, InterfaceC1820a, l, j, c, InterfaceC2193b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public static final /* synthetic */ int f12133U = 0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final ArrayList f12134B;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public ActivityResultLauncher f12135K;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public PopupWindow f12136P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public A7.b f12137Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0631c f12138R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public String f12139S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Object f12140T;
    public C0453g m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f12141n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f12142o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f12143p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f12144q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ViewPager2 f12145r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d f12146s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public TextView f12147t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MayaDashboardFragment f12148u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final MayaServicesV2Fragment f12149v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C7.a f12150w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f12151x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f12152y;

    public MayaDashboardActivity() {
        MayaDashboardFragment mayaDashboardFragment = new MayaDashboardFragment();
        this.f12148u = mayaDashboardFragment;
        MayaServicesV2Fragment mayaServicesV2Fragment = new MayaServicesV2Fragment();
        this.f12149v = mayaServicesV2Fragment;
        this.f12150w = new C7.a(this, 0);
        this.f12151x = new Handler();
        this.f12152y = C1132s.h(mayaDashboardFragment, mayaServicesV2Fragment);
        this.f12134B = new ArrayList();
        this.f12139S = numX49.tnTj78("bt5P");
        this.f12140T = C1112C.f9377a;
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if (fragment instanceof MayaDashboardFragment) {
            ImageView imageView = this.f12141n;
            if (imageView != null) {
                h2(imageView);
                return;
            } else {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bt5b"));
                throw null;
            }
        }
        if (fragment instanceof MayaServicesV2Fragment) {
            ImageView imageView2 = this.f12143p;
            if (imageView2 != null) {
                h2(imageView2);
            } else {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bt52"));
                throw null;
            }
        }
    }

    public final NotificationCompat.Builder V1(String str, PendingIntent pendingIntent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, getString(R.string.pma_default_notification_channel));
        builder.setContentText(str);
        builder.setSmallIcon(R.drawable.maya_ic_push_notification).setStyle(new NotificationCompat.BigTextStyle().bigText(str));
        builder.setColor(ContextCompat.getColor(this, R.color.ocean_green));
        builder.setContentIntent(pendingIntent);
        builder.setAutoCancel(true);
        builder.setPriority(2);
        return builder;
    }

    public final void W1(String str, String str2) {
        ImageView imageView = this.f12141n;
        if (imageView == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bt5Z"));
            throw null;
        }
        c2(imageView, true);
        MayaDashboardFragment mayaDashboardFragment = this.f12148u;
        if (mayaDashboardFragment.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            mayaDashboardFragment.G1().p(str, str2);
            return;
        }
        if (mayaDashboardFragment.getArguments() == null) {
            mayaDashboardFragment.setArguments(new Bundle());
        }
        Bundle arguments = mayaDashboardFragment.getArguments();
        if (arguments != null) {
            arguments.putString(numX49.tnTj78("bt5L"), str);
        }
        Bundle arguments2 = mayaDashboardFragment.getArguments();
        if (arguments2 != null) {
            arguments2.putString(numX49.tnTj78("bt5r"), str2);
        }
    }

    public final void X1(String str, String str2) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(numX49.tnTj78("bt5k"));
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put(numX49.tnTj78("bt5B"), str);
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        c1219hE.j.put(numX49.tnTj78("bt5u"), str2);
        c1220iK1.c(this, c1219hE);
        A7.b bVarY1 = Y1();
        androidx.camera.core.impl.a.A(bVarY1.f196d.f11330b, numX49.tnTj78("bt5V"), false);
        PopupWindow popupWindow = ((MayaDashboardActivity) ((a) bVarY1.c.get())).f12136P;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    public final A7.b Y1() {
        A7.b bVar = this.f12137Q;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bt5S"));
        throw null;
    }

    public final void Z1(t tVar) {
        A7.b bVarY1 = Y1();
        User userJ = bVarY1.f200n.j();
        BackUpIdentity backUpIdentityA = bVarY1.i.a();
        String strTnTj78 = (backUpIdentityA == null || !backUpIdentityA.isVerifiedEmail()) ? numX49.tnTj78("bt5j") : backUpIdentityA.mValue();
        com.paymaya.data.preference.a aVar = bVarY1.f196d;
        tVar.success(M.h(new Pair(numX49.tnTj78("bt5d"), aVar.k()), new Pair(numX49.tnTj78("bt5i"), userJ.mFirstName()), new Pair(numX49.tnTj78("bt5E"), userJ.mLastName()), new Pair(numX49.tnTj78("bt5F"), aVar.r()), new Pair(numX49.tnTj78("bt5H"), strTnTj78)));
    }

    public final void a2(t tVar) {
        kotlin.jvm.internal.j.g(tVar, numX49.tnTj78("bt5O"));
        Y1();
        Map mapE = s5.l.c;
        if (mapE == null) {
            mapE = M.e();
        }
        tVar.success(mapE);
    }

    public final void b2(String str) {
        A7.b bVarY1 = Y1();
        boolean zIsAtLeast = this.f12148u.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
        boolean z4 = this.f12148u.getArguments() == null;
        if (str != null) {
            if (zIsAtLeast) {
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((a) bVarY1.c.get());
                mayaDashboardActivity.getClass();
                mayaDashboardActivity.f12148u.G1().E(str);
                return;
            }
            if (z4) {
                MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) ((a) bVarY1.c.get());
                mayaDashboardActivity2.getClass();
                mayaDashboardActivity2.f12148u.setArguments(new Bundle());
            }
            MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) ((a) bVarY1.c.get());
            mayaDashboardActivity3.getClass();
            Bundle arguments = mayaDashboardActivity3.f12148u.getArguments();
            if (arguments != null) {
                arguments.putString(numX49.tnTj78("bt5Q"), str);
            }
        }
    }

    public final void c2(View view, boolean z4) {
        h2(view);
        ImageView imageView = this.f12141n;
        if (imageView == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bt5c"));
            throw null;
        }
        boolean zB = kotlin.jvm.internal.j.b(view, imageView);
        String strTnTj78 = numX49.tnTj78("bt5t");
        if (zB) {
            ViewPager2 viewPager2 = this.f12145r;
            if (viewPager2 == null) {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
            viewPager2.setCurrentItem(0, z4);
            C0453g c0453g = this.m;
            kotlin.jvm.internal.j.d(c0453g);
            ((CardView) ((k1) c0453g.c).e).setVisibility(0);
            return;
        }
        ImageView imageView2 = this.f12142o;
        if (imageView2 == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bt5w"));
            throw null;
        }
        if (!kotlin.jvm.internal.j.b(view, imageView2)) {
            ImageView imageView3 = this.f12143p;
            if (imageView3 == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bt5K"));
                throw null;
            }
            if (kotlin.jvm.internal.j.b(view, imageView3)) {
                ViewPager2 viewPager22 = this.f12145r;
                if (viewPager22 == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                viewPager22.setCurrentItem(1, z4);
                A7.b bVarY1 = Y1();
                if (S5.c.b(bVarY1.f203q, A5.b.f144x)) {
                    C0453g c0453g2 = ((MayaDashboardActivity) ((a) bVarY1.c.get())).m;
                    kotlin.jvm.internal.j.d(c0453g2);
                    ((CardView) ((k1) c0453g2.c).e).setVisibility(8);
                    return;
                }
                return;
            }
            return;
        }
        A7.b bVarY12 = Y1();
        if (S5.c.b(bVarY12.f203q, A5.b.f121n0)) {
            bVarY12.f196d.Z(true);
            C1232v c1232v = ((MayaDashboardActivity) ((a) bVarY12.c.get())).i;
            if (c1232v == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bt54"));
                throw null;
            }
            C0187u c0187u = c1232v.f11232a;
            C c = c0187u.f949b;
            if (((CleverTapInstanceConfig) c.f814a).h) {
                S sE = c0187u.e();
                String strC = c0187u.c();
                sE.getClass();
                S.g(strC, numX49.tnTj78("bt5C"));
            } else {
                S sE2 = c0187u.e();
                String strC2 = c0187u.c();
                sE2.getClass();
                S.g(strC2, numX49.tnTj78("bt5U"));
                S sE3 = c0187u.e();
                String strC3 = c0187u.c();
                sE3.getClass();
                S.g(strC3, numX49.tnTj78("bt5e"));
                k kVar = (k) c.f818k;
                kVar.f3482p = h.f3468b;
                S s9 = kVar.f3480n;
                String str = kVar.f3481o;
                s9.getClass();
                S.s(str, numX49.tnTj78("bt58"));
            }
        } else {
            bVarY12.f196d.Z(false);
        }
        n1().C(this, this.f12135K, numX49.tnTj78("bt5o"), Boolean.FALSE, V.values(), Boolean.TRUE, getString(R.string.maya_label_qrph_code));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(SecondaryFeature secondaryFeature) {
        kotlin.jvm.internal.j.g(secondaryFeature, numX49.tnTj78("bt5m"));
        A7.b bVarY1 = Y1();
        if (!bVarY1.n() && secondaryFeature.isKycRequired()) {
            a aVar = (a) bVarY1.c.get();
            String eventNameForModule = secondaryFeature.getEventNameForModule();
            kotlin.jvm.internal.j.f(eventNameForModule, numX49.tnTj78("bt5D"));
            ((MayaDashboardActivity) aVar).u2(eventNameForModule);
            return;
        }
        if (!bVarY1.m(secondaryFeature)) {
            String strMUri = secondaryFeature.mUri();
            if (com.paymaya.common.utility.C.Y(strMUri)) {
                ((MayaDashboardActivity) ((a) bVarY1.c.get())).getIntent().setData(Uri.parse(strMUri));
                bVarY1.l(strMUri);
                return;
            }
            return;
        }
        String ageRestrictedTitle = secondaryFeature.getAgeRestrictedTitle();
        String strTnTj78 = numX49.tnTj78("bt5h");
        if (ageRestrictedTitle == null) {
            ageRestrictedTitle = ((MayaDashboardActivity) ((a) bVarY1.c.get())).getString(R.string.maya_label_age_restricted_title);
            kotlin.jvm.internal.j.f(ageRestrictedTitle, strTnTj78);
        }
        String ageRestrictedMessage = secondaryFeature.getAgeRestrictedMessage();
        if (ageRestrictedMessage == null) {
            ageRestrictedMessage = ((MayaDashboardActivity) ((a) bVarY1.c.get())).getString(R.string.maya_label_age_restricted_message);
            kotlin.jvm.internal.j.f(ageRestrictedMessage, strTnTj78);
        }
        ((MayaDashboardActivity) ((a) bVarY1.c.get())).k2(ageRestrictedTitle, ageRestrictedMessage);
    }

    public final void f2() {
        String strTnTj78;
        StringBuilder sb2 = new StringBuilder();
        switch (49) {
            case 1:
                strTnTj78 = numX49.tnTj78("bt5bO");
                break;
            case 2:
                strTnTj78 = numX49.tnTj78("bt5bH");
                break;
            case 3:
                strTnTj78 = numX49.tnTj78("bt5bF");
                break;
            case 4:
                strTnTj78 = numX49.tnTj78("bt5bE");
                break;
            case 5:
                strTnTj78 = numX49.tnTj78("bt5bi");
                break;
            case 6:
                strTnTj78 = numX49.tnTj78("bt5bd");
                break;
            case 7:
                strTnTj78 = numX49.tnTj78("bt5bj");
                break;
            case 8:
                strTnTj78 = numX49.tnTj78("bt5bS");
                break;
            case 9:
                strTnTj78 = numX49.tnTj78("bt5bV");
                break;
            case 10:
                strTnTj78 = numX49.tnTj78("bt5bu");
                break;
            case 11:
                strTnTj78 = numX49.tnTj78("bt5bB");
                break;
            case 12:
                strTnTj78 = numX49.tnTj78("bt5bk");
                break;
            case 13:
                strTnTj78 = numX49.tnTj78("bt5bZ");
                break;
            case 14:
                strTnTj78 = numX49.tnTj78("bt5br");
                break;
            case 15:
                strTnTj78 = numX49.tnTj78("bt5bL");
                break;
            case 16:
                strTnTj78 = numX49.tnTj78("bt5b2");
                break;
            case 17:
                strTnTj78 = numX49.tnTj78("bt5bb");
                break;
            case 18:
                strTnTj78 = numX49.tnTj78("bt5bP");
                break;
            case 19:
                strTnTj78 = numX49.tnTj78("bt5b9");
                break;
            case 20:
                strTnTj78 = numX49.tnTj78("bt5PW");
                break;
            case 21:
                strTnTj78 = numX49.tnTj78("bt5Pl");
                break;
            case 22:
                strTnTj78 = numX49.tnTj78("bt5Pz");
                break;
            case 23:
                strTnTj78 = numX49.tnTj78("bt5Pq");
                break;
            case 24:
                strTnTj78 = numX49.tnTj78("bt5PI");
                break;
            case 25:
                strTnTj78 = numX49.tnTj78("bt5PJ");
                break;
            case 26:
                strTnTj78 = numX49.tnTj78("bt5P5");
                break;
            case 27:
                strTnTj78 = numX49.tnTj78("bt5Ps");
                break;
            case 28:
                strTnTj78 = numX49.tnTj78("bt5Px");
                break;
            case 29:
                strTnTj78 = numX49.tnTj78("bt5Pn");
                break;
            case 30:
                strTnTj78 = numX49.tnTj78("bt5P1");
                break;
            case 31:
                strTnTj78 = numX49.tnTj78("bt5Pf");
                break;
            case 32:
                strTnTj78 = numX49.tnTj78("bt5Pg");
                break;
            case 33:
                strTnTj78 = numX49.tnTj78("bt5P0");
                break;
            case 34:
                strTnTj78 = numX49.tnTj78("bt5Pp");
                break;
            case 35:
                strTnTj78 = numX49.tnTj78("bt5PR");
                break;
            case 36:
                strTnTj78 = numX49.tnTj78("bt5PT");
                break;
            case 37:
                strTnTj78 = numX49.tnTj78("bt5PY");
                break;
            case 38:
                strTnTj78 = numX49.tnTj78("bt5PA");
                break;
            case 39:
                strTnTj78 = numX49.tnTj78("bt5P7");
                break;
            case 40:
                strTnTj78 = numX49.tnTj78("bt5Pv");
                break;
            case 41:
                strTnTj78 = numX49.tnTj78("bt5Py");
                break;
            case 42:
                strTnTj78 = numX49.tnTj78("bt5P3");
                break;
            case 43:
                strTnTj78 = numX49.tnTj78("bt5PG");
                break;
            case 44:
                strTnTj78 = numX49.tnTj78("bt5PX");
                break;
            case 45:
                strTnTj78 = numX49.tnTj78("bt5Pa");
                break;
            case 46:
                strTnTj78 = numX49.tnTj78("bt5P6");
                break;
            case 47:
                strTnTj78 = numX49.tnTj78("bt5PN");
                break;
            case 48:
                strTnTj78 = numX49.tnTj78("bt5PM");
                break;
            case 49:
                strTnTj78 = numX49.tnTj78("bt5Ph");
                break;
            case 50:
                strTnTj78 = numX49.tnTj78("bt5PD");
                break;
            case 51:
                strTnTj78 = numX49.tnTj78("bt5Pm");
                break;
            case 52:
                strTnTj78 = numX49.tnTj78("bt5Pc");
                break;
            case 53:
                strTnTj78 = numX49.tnTj78("bt5Pw");
                break;
            case 54:
                strTnTj78 = numX49.tnTj78("bt5PK");
                break;
            case 55:
                strTnTj78 = numX49.tnTj78("bt5Po");
                break;
            case 56:
                strTnTj78 = numX49.tnTj78("bt5P4");
                break;
            case 57:
                strTnTj78 = numX49.tnTj78("bt5PC");
                break;
            case 58:
                strTnTj78 = numX49.tnTj78("bt5P8");
                break;
            case 59:
                strTnTj78 = numX49.tnTj78("bt5Pe");
                break;
            case 60:
                strTnTj78 = numX49.tnTj78("bt5PU");
                break;
            case 61:
                strTnTj78 = numX49.tnTj78("bt5Pt");
                break;
            case 62:
                strTnTj78 = numX49.tnTj78("bt5PQ");
                break;
            case 63:
                strTnTj78 = numX49.tnTj78("bt5PO");
                break;
            case 64:
                strTnTj78 = numX49.tnTj78("bt5PH");
                break;
            case 65:
                strTnTj78 = numX49.tnTj78("bt5PF");
                break;
            case 66:
                strTnTj78 = numX49.tnTj78("bt5PE");
                break;
            case 67:
                strTnTj78 = numX49.tnTj78("bt5Pi");
                break;
            case 68:
                strTnTj78 = numX49.tnTj78("bt5Pd");
                break;
            case 69:
                strTnTj78 = numX49.tnTj78("bt5Pj");
                break;
            case 70:
                strTnTj78 = numX49.tnTj78("bt5PS");
                break;
            case 71:
                strTnTj78 = numX49.tnTj78("bt5PV");
                break;
            case 72:
                strTnTj78 = numX49.tnTj78("bt5Pu");
                break;
            case 73:
                strTnTj78 = numX49.tnTj78("bt5PB");
                break;
            case 74:
                strTnTj78 = numX49.tnTj78("bt5Pk");
                break;
            case 75:
                strTnTj78 = numX49.tnTj78("bt5PZ");
                break;
            case 76:
                strTnTj78 = numX49.tnTj78("bt5Pr");
                break;
            case 77:
                strTnTj78 = numX49.tnTj78("bt5PL");
                break;
            case 78:
                strTnTj78 = numX49.tnTj78("bt5P2");
                break;
            case 79:
                strTnTj78 = numX49.tnTj78("bt5Pb");
                break;
            case 80:
                strTnTj78 = numX49.tnTj78("bt5PP");
                break;
            case 81:
                strTnTj78 = numX49.tnTj78("bt5P9");
                break;
            case 82:
                strTnTj78 = numX49.tnTj78("bt5W");
                break;
            case 83:
                strTnTj78 = numX49.tnTj78("bt5l");
                break;
            case 84:
                strTnTj78 = numX49.tnTj78("bt5z");
                break;
            case 85:
                strTnTj78 = numX49.tnTj78("bt5q");
                break;
            case 86:
                strTnTj78 = numX49.tnTj78("bt5I");
                break;
            case 87:
                strTnTj78 = numX49.tnTj78("bt5J");
                break;
            case 88:
                strTnTj78 = numX49.tnTj78("bt55");
                break;
            case 89:
                strTnTj78 = numX49.tnTj78("bt5s");
                break;
            case 90:
                strTnTj78 = numX49.tnTj78("bt5x");
                break;
            case 91:
                strTnTj78 = numX49.tnTj78("bt5n");
                break;
            case 92:
                strTnTj78 = numX49.tnTj78("bt51");
                break;
            case 93:
                strTnTj78 = numX49.tnTj78("bt5f");
                break;
            case 94:
                strTnTj78 = numX49.tnTj78("bt5g");
                break;
            case 95:
                strTnTj78 = numX49.tnTj78("bt50");
                break;
            case 96:
                strTnTj78 = numX49.tnTj78("bt5p");
                break;
            case 97:
                strTnTj78 = numX49.tnTj78("bt5R");
                break;
            case 98:
                strTnTj78 = numX49.tnTj78("bt5T");
                break;
            case 99:
                strTnTj78 = numX49.tnTj78("bt5Y");
                break;
            case 100:
                strTnTj78 = numX49.tnTj78("bt5A");
                break;
            case 101:
                strTnTj78 = numX49.tnTj78("bt57");
                break;
            case 102:
                strTnTj78 = numX49.tnTj78("bt5v");
                break;
            case 103:
                strTnTj78 = numX49.tnTj78("bt5y");
                break;
            case 104:
                strTnTj78 = numX49.tnTj78("bt53");
                break;
            case 105:
                strTnTj78 = numX49.tnTj78("bt5G");
                break;
            case 106:
                strTnTj78 = numX49.tnTj78("bt5X");
                break;
            case 107:
                strTnTj78 = numX49.tnTj78("bt5a");
                break;
            case 108:
                strTnTj78 = numX49.tnTj78("bt56");
                break;
            case 109:
                strTnTj78 = numX49.tnTj78("bt5N");
                break;
            default:
                strTnTj78 = numX49.tnTj78("bt5M");
                break;
        }
        sb2.append(strTnTj78.concat(numX49.tnTj78("bt5bQ")));
        sb2.append(numX49.tnTj78("bt5bt"));
        String string = sb2.toString();
        n1();
        i.y(this, string);
    }

    public final void g2(String str) {
        C1220i c1220iK1 = k1();
        EnumC1218g enumC1218g = EnumC1218g.FLOATING_NAVIGATION;
        C1219h c1219h = new C1219h();
        c1219h.o(enumC1218g);
        c1219h.n(17);
        c1219h.t(EnumC1217f.ITEM);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(numX49.tnTj78("bt5bU"), str);
        c1220iK1.c(this, c1219h);
    }

    @Override // y5.q
    public final ActivityTransition h1() {
        return new ActivityTransition(0, 0, 0, 0, 15, null);
    }

    public final void h2(View view) {
        for (ImageView imageView : this.f12134B) {
            imageView.setSelected(kotlin.jvm.internal.j.b(imageView, view));
        }
    }

    public final void i2(UserActivity userActivity, PurchasedTicket purchasedTicket) {
        kotlin.jvm.internal.j.g(userActivity, numX49.tnTj78("bt5be"));
        n1();
        Intent intent = new Intent(this, (Class<?>) MayaTransactionsActivity.class);
        intent.putExtra(numX49.tnTj78("bt5b8"), userActivity);
        intent.putExtra(numX49.tnTj78("bt5bC"), purchasedTicket);
        startActivity(intent);
    }

    public final void j2() {
        n1();
        Intent intent = new Intent(getApplicationContext(), (Class<?>) MayaCashInActivity.class);
        intent.putExtra(numX49.tnTj78("bt5b4"), numX49.tnTj78("bt5bo"));
        intent.setData(getIntent().getData());
        i.v0(this, intent);
        startActivity(intent);
    }

    public final void k2(String str, String str2) {
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231240, str, str2, new Pair(getString(R.string.maya_label_got_it), new e(this, 4)), null, null, 112);
        mayaAlertBottomSheetDialogFragmentN.f11817Z = true;
        mayaAlertBottomSheetDialogFragmentN.f11819b0 = numX49.tnTj78("bt5bK");
        mayaAlertBottomSheetDialogFragmentN.f10329R = 8;
        mayaAlertBottomSheetDialogFragmentN.show(getSupportFragmentManager(), numX49.tnTj78("bt5bw"));
    }

    @Override // y5.q
    public final boolean l1() {
        return true;
    }

    public final void l2(PayMayaError payMayaError) {
        M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(getSupportFragmentManager(), numX49.tnTj78("bt5bc"));
    }

    public final void m2(String str) {
        n1().v(this, str, getString(R.string.maya_label_help));
    }

    public final void n2(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt5bm"));
        n1();
        i.y(this, str);
    }

    public final void o2(String str) {
        n1();
        Intent intent = new Intent(this, (Class<?>) MayaPayActivity.class);
        intent.putExtra(numX49.tnTj78("bt5bD"), str);
        intent.setData(getIntent().getData());
        startActivity(intent);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.List] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        A7.b bVarY1 = Y1();
        DashboardTab dashboardTab = (DashboardTab) C1110A.B(((MayaDashboardActivity) ((a) bVarY1.c.get())).f12140T);
        String strTnTj78 = numX49.tnTj78("bt5bh");
        if (dashboardTab == null) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((a) bVarY1.c.get());
            ImageView imageView = mayaDashboardActivity.f12141n;
            if (imageView != null) {
                mayaDashboardActivity.c2(imageView, true);
                return;
            } else {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
        }
        if (!((MayaDashboardActivity) ((a) bVarY1.c.get())).f12148u.isVisible()) {
            MayaDashboardActivity mayaDashboardActivity2 = (MayaDashboardActivity) ((a) bVarY1.c.get());
            ImageView imageView2 = mayaDashboardActivity2.f12141n;
            if (imageView2 != null) {
                mayaDashboardActivity2.c2(imageView2, true);
                return;
            } else {
                kotlin.jvm.internal.j.n(strTnTj78);
                throw null;
            }
        }
        if (!kotlin.jvm.internal.j.b(((MayaDashboardActivity) ((a) bVarY1.c.get())).f12148u.H1(), dashboardTab.getId())) {
            String id = dashboardTab.getId();
            int iHashCode = id.hashCode();
            String strTnTj782 = numX49.tnTj78("bt5bM");
            String strTnTj783 = numX49.tnTj78("bt5bN");
            switch (iHashCode) {
                case -1352291591:
                    String strTnTj784 = numX49.tnTj78("bt5bG");
                    if (id.equals(strTnTj784)) {
                        ((MayaDashboardActivity) ((a) bVarY1.c.get())).W1(strTnTj784, strTnTj783);
                        return;
                    }
                    break;
                case -795192327:
                    if (id.equals(strTnTj782)) {
                        ((MayaDashboardActivity) ((a) bVarY1.c.get())).W1(strTnTj782, strTnTj783);
                        return;
                    }
                    break;
                case 94431075:
                    String strTnTj785 = numX49.tnTj78("bt5bX");
                    if (id.equals(strTnTj785)) {
                        ((MayaDashboardActivity) ((a) bVarY1.c.get())).W1(strTnTj785, strTnTj783);
                        return;
                    }
                    break;
                case 103143811:
                    String strTnTj786 = numX49.tnTj78("bt5ba");
                    if (id.equals(strTnTj786)) {
                        ((MayaDashboardActivity) ((a) bVarY1.c.get())).W1(strTnTj786, strTnTj783);
                        return;
                    }
                    break;
                case 1872948409:
                    String strTnTj787 = numX49.tnTj78("bt5b6");
                    if (id.equals(strTnTj787)) {
                        ((MayaDashboardActivity) ((a) bVarY1.c.get())).W1(strTnTj787, strTnTj783);
                        return;
                    }
                    break;
            }
            ((MayaDashboardActivity) ((a) bVarY1.c.get())).W1(strTnTj782, strTnTj783);
            return;
        }
        TextView textView = ((MayaDashboardActivity) ((a) bVarY1.c.get())).f12147t;
        String strTnTj788 = numX49.tnTj78("bt5b3");
        if (textView == null) {
            kotlin.jvm.internal.j.n(strTnTj788);
            throw null;
        }
        int visibility = textView.getVisibility();
        EnumC1216e enumC1216e = EnumC1216e.CONFIRMATION;
        EnumC1215d enumC1215d = EnumC1215d.LOGOUT;
        if (visibility == 0) {
            bVarY1.f201o.a(false);
            MayaDashboardActivity mayaDashboardActivity3 = (MayaDashboardActivity) ((a) bVarY1.c.get());
            C1220i c1220iK1 = mayaDashboardActivity3.k1();
            C1219h c1219h = new C1219h();
            c1219h.p(enumC1215d);
            c1219h.r(enumC1216e);
            c1219h.n(17);
            c1219h.t(EnumC1217f.BACK);
            c1219h.i();
            c1220iK1.c(mayaDashboardActivity3, c1219h);
            super.onBackPressed();
            return;
        }
        MayaDashboardActivity mayaDashboardActivity4 = (MayaDashboardActivity) ((a) bVarY1.c.get());
        C1220i c1220iK12 = mayaDashboardActivity4.k1();
        C1219h c1219h2 = new C1219h();
        c1219h2.p(enumC1215d);
        c1219h2.r(enumC1216e);
        c1219h2.n(2);
        c1219h2.i();
        c1220iK12.c(mayaDashboardActivity4, c1219h2);
        TextView textView2 = mayaDashboardActivity4.f12147t;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n(strTnTj788);
            throw null;
        }
        textView2.setText(mayaDashboardActivity4.getString(R.string.maya_label_press_back_confirmation));
        TextView textView3 = mayaDashboardActivity4.f12147t;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n(strTnTj788);
            throw null;
        }
        textView3.setAlpha(0.0f);
        TextView textView4 = mayaDashboardActivity4.f12147t;
        if (textView4 == null) {
            kotlin.jvm.internal.j.n(strTnTj788);
            throw null;
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = textView4.animate();
        viewPropertyAnimatorAnimate.alpha(1.0f);
        viewPropertyAnimatorAnimate.setDuration(400L);
        viewPropertyAnimatorAnimate.setUpdateListener(new C7.b(mayaDashboardActivity4, 0));
        viewPropertyAnimatorAnimate.start();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        String strTnTj78 = numX49.tnTj78("bt5by");
        try {
            FlutterEngineCache flutterEngineCache = FlutterEngineCache.getInstance();
            kotlin.jvm.internal.j.f(flutterEngineCache, "getInstance(...)");
            if (!flutterEngineCache.contains(strTnTj78)) {
                FlutterEngine flutterEngine = new FlutterEngine(getApplicationContext());
                flutterEngine.getDartExecutor().executeDartEntrypoint(new DartExecutor.DartEntrypoint("flutter_assets", "runXP"));
                flutterEngineCache.put(strTnTj78, flutterEngine);
            }
        } catch (Exception unused) {
            yk.a.d();
        }
        O5.a aVar = (O5.a) W4.a.e().b().c;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        C1290w c1290wL = aVar.l();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        com.paymaya.data.preference.a aVar3 = (com.paymaya.data.preference.a) aVar.e.get();
        b1 b1Var = new b1();
        b1Var.c = payMayaClientApi;
        b1Var.f11428b = aVar3;
        this.f12137Q = new A7.b(aVar2, c1290wL, b1Var, aVar.f(), aVar.s(), aVar.e(), aVar.P(), aVar.o(), aVar.O(), new C1297z0((Context) aVar.f4709d.get(), (PayMayaClientApi) aVar.f4745w.get(), (com.paymaya.data.preference.a) aVar.e.get(), (L5.a) aVar.f4669I.get()), aVar.J(), (m) aVar.f4653A.get(), (Uh.d) aVar.f4717g0.get(), (S5.c) aVar.f4724k.get());
        this.f12138R = (C0631c) aVar.f4661E.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_dashboard, (ViewGroup) null, false);
        int i = R.id.view_navigation;
        View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_navigation);
        String strTnTj782 = numX49.tnTj78("bt5bv");
        if (viewFindChildViewById != null) {
            int i4 = R.id.card_constraint;
            ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewFindChildViewById, R.id.card_constraint);
            if (constraintLayout != null) {
                CardView cardView = (CardView) viewFindChildViewById;
                i4 = R.id.image_view_freeze;
                if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_freeze)) != null) {
                    i4 = R.id.image_view_freeze_warning;
                    if (((ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_freeze_warning)) != null) {
                        i4 = R.id.image_view_home;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_home);
                        if (imageView != null) {
                            i4 = R.id.image_view_scan;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_scan);
                            if (imageView2 != null) {
                                i4 = R.id.image_view_services;
                                ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.image_view_services);
                                if (imageView3 != null) {
                                    i4 = R.id.text_view_freeze;
                                    if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_freeze)) != null) {
                                        i4 = R.id.text_view_home;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_home);
                                        if (textView != null) {
                                            i4 = R.id.text_view_scan;
                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_scan);
                                            if (textView2 != null) {
                                                i4 = R.id.text_view_services;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, R.id.text_view_services);
                                                if (textView3 != null) {
                                                    k1 k1Var = new k1(cardView, constraintLayout, cardView, imageView, imageView2, imageView3, textView, textView2, textView3);
                                                    i = R.id.view_pager;
                                                    ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(viewInflate, R.id.view_pager);
                                                    if (viewPager2 != null) {
                                                        i = R.id.view_toast;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_toast);
                                                        if (viewFindChildViewById2 != null) {
                                                            TextView textView4 = (TextView) viewFindChildViewById2;
                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) viewInflate;
                                                            this.m = new C0453g(0, constraintLayout2, k1Var, viewPager2, new C0452f1(textView4, textView4, 4));
                                                            setContentView(constraintLayout2);
                                                            kotlin.jvm.internal.j.d(this.m);
                                                            kotlin.jvm.internal.j.d(this.m);
                                                            C0453g c0453g = this.m;
                                                            kotlin.jvm.internal.j.d(c0453g);
                                                            this.f12141n = (ImageView) ((k1) c0453g.c).f4138b;
                                                            kotlin.jvm.internal.j.d(this.m);
                                                            C0453g c0453g2 = this.m;
                                                            kotlin.jvm.internal.j.d(c0453g2);
                                                            this.f12142o = (ImageView) ((k1) c0453g2.c).c;
                                                            kotlin.jvm.internal.j.d(this.m);
                                                            C0453g c0453g3 = this.m;
                                                            kotlin.jvm.internal.j.d(c0453g3);
                                                            this.f12143p = (ImageView) ((k1) c0453g3.c).f;
                                                            C0453g c0453g4 = this.m;
                                                            kotlin.jvm.internal.j.d(c0453g4);
                                                            this.f12144q = (TextView) ((k1) c0453g4.c).f4139d;
                                                            C0453g c0453g5 = this.m;
                                                            kotlin.jvm.internal.j.d(c0453g5);
                                                            this.f12145r = (ViewPager2) c0453g5.f4095d;
                                                            C0453g c0453g6 = this.m;
                                                            kotlin.jvm.internal.j.d(c0453g6);
                                                            this.f12147t = ((C0452f1) c0453g6.e).c;
                                                            ImageView imageView4 = this.f12141n;
                                                            String strTnTj783 = numX49.tnTj78("bt5b7");
                                                            if (imageView4 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj783);
                                                                throw null;
                                                            }
                                                            imageView4.setOnClickListener(new C7.c(this, 4));
                                                            ImageView imageView5 = this.f12142o;
                                                            String strTnTj784 = numX49.tnTj78("bt5bA");
                                                            if (imageView5 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj784);
                                                                throw null;
                                                            }
                                                            imageView5.setOnClickListener(new C7.c(this, 5));
                                                            ImageView imageView6 = this.f12143p;
                                                            String strTnTj785 = numX49.tnTj78("bt5bY");
                                                            if (imageView6 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj785);
                                                                throw null;
                                                            }
                                                            imageView6.setOnClickListener(new C7.c(this, 6));
                                                            this.f12135K = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new A7.c(this, 8));
                                                            ArrayList arrayList = this.f12134B;
                                                            ImageView imageView7 = this.f12141n;
                                                            if (imageView7 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj783);
                                                                throw null;
                                                            }
                                                            ImageView imageView8 = this.f12142o;
                                                            if (imageView8 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj784);
                                                                throw null;
                                                            }
                                                            ImageView imageView9 = this.f12143p;
                                                            if (imageView9 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj785);
                                                                throw null;
                                                            }
                                                            arrayList.addAll(C1132s.g(imageView7, imageView8, imageView9));
                                                            ImageView imageView10 = this.f12141n;
                                                            if (imageView10 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj783);
                                                                throw null;
                                                            }
                                                            imageView10.setSelected(true);
                                                            this.f12146s = new d(this, this.f12152y);
                                                            ViewPager2 viewPager22 = this.f12145r;
                                                            String strTnTj786 = numX49.tnTj78("bt5bT");
                                                            if (viewPager22 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj786);
                                                                throw null;
                                                            }
                                                            viewPager22.setUserInputEnabled(false);
                                                            ViewPager2 viewPager23 = this.f12145r;
                                                            if (viewPager23 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj786);
                                                                throw null;
                                                            }
                                                            d dVar = this.f12146s;
                                                            if (dVar == null) {
                                                                kotlin.jvm.internal.j.n(numX49.tnTj78("bt5bp"));
                                                                throw null;
                                                            }
                                                            viewPager23.setAdapter(dVar);
                                                            ViewPager2 viewPager24 = this.f12145r;
                                                            if (viewPager24 == null) {
                                                                kotlin.jvm.internal.j.n(strTnTj786);
                                                                throw null;
                                                            }
                                                            viewPager24.setSaveEnabled(false);
                                                            String strS = p1().s();
                                                            if (this.f12138R == null) {
                                                                kotlin.jvm.internal.j.n(numX49.tnTj78("bt5bR"));
                                                                throw null;
                                                            }
                                                            C2467a c2467a = AbstractC0617a.f6973b;
                                                            if (c2467a != null ? S5.c.b(c2467a.c, A5.b.g1) : false) {
                                                                s5.l lVar = s5.l.f20024a;
                                                                s5.l.f20026d = H.b();
                                                                s5.l.c = null;
                                                                H.w(s5.l.f20025b, null, null, new s5.j(strS, null), 3);
                                                            }
                                                            Y1().h(this);
                                                            if (bundle == null) {
                                                                Y1().j();
                                                            }
                                                            MayaKycActivity.f12445B = this;
                                                            return;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException(strTnTj782.concat(viewFindChildViewById.getResources().getResourceName(i4)));
        }
        throw new NullPointerException(strTnTj782.concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        this.f12151x.removeCallbacks(this.f12150w);
        W4.a.e().f6272d = null;
        Y1().i();
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        kotlin.jvm.internal.j.g(intent, numX49.tnTj78("bt5b0"));
        super.onNewIntent(intent);
        setIntent(intent);
        MayaDashboardFragment mayaDashboardFragment = this.f12148u;
        G7.i iVar = mayaDashboardFragment.f12171k0;
        if (iVar != null && iVar.f1861A) {
            FlutterEngineCache.getInstance().remove(iVar.f1863t);
            iVar.i();
        }
        Bundle extras = intent.getExtras();
        if ((extras != null ? extras.getBoolean(numX49.tnTj78("bt5bg")) : false) && mayaDashboardFragment.f12165e0 != null) {
            FlutterEngineCache.getInstance().remove(numX49.tnTj78("bt5bf"));
            C0258a c0258a = mayaDashboardFragment.f12165e0;
            if (c0258a == null) {
                kotlin.jvm.internal.j.n(numX49.tnTj78("bt5b1"));
                throw null;
            }
            c0258a.i();
        }
        A7.b bVarY1 = Y1();
        String dataString = intent.getDataString();
        if (dataString == null || C2576A.H(dataString) || !com.paymaya.common.utility.C.Y(dataString)) {
            return;
        }
        bVarY1.l(dataString);
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        String str;
        iKNpI8.r8PTp0(this);
        int i = 1;
        super.onResume();
        int i4 = 0;
        if (p1().e().isPartnerOnboardingEnabled()) {
            com.paymaya.data.preference.a aVar = Y1().f196d;
            if (aVar.e().isPartnerOnboardingEnabled() && aVar.K()) {
                String strP = aVar.p();
                kotlin.jvm.internal.j.f(strP, numX49.tnTj78("bt5bn"));
                com.paymaya.common.utility.C.s0(aVar, strP, false);
            }
        }
        A7.b bVarY1 = Y1();
        if (kotlin.jvm.internal.j.b(svM7M6.getString(bVarY1.f196d.f11330b, numX49.tnTj78("bt5bs"), numX49.tnTj78("bt5bx")), numX49.tnTj78("bt5b5")) && bVarY1.f196d.e().isEDDEnabled()) {
            MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) ((a) bVarY1.c.get());
            mayaDashboardActivity.n1();
            Intent intent = new Intent(mayaDashboardActivity, (Class<?>) EDDActivity.class);
            intent.addFlags(131072);
            mayaDashboardActivity.startActivity(intent);
        } else if (bVarY1.f196d.e().isRekycFlowEnabled()) {
            com.paymaya.data.preference.a aVar2 = bVarY1.f196d;
            aVar2.getClass();
            String string = DateTime.now().minusMinutes(1).toString();
            SharedPreferences sharedPreferences = aVar2.f11330b;
            String strTnTj78 = numX49.tnTj78("bt5bJ");
            DateTime dateTime = DateTime.parse(svM7M6.getString(sharedPreferences, strTnTj78, string));
            kotlin.jvm.internal.j.f(dateTime, numX49.tnTj78("bt5bI"));
            DateTime dateTimeNow = DateTime.now();
            kotlin.jvm.internal.j.f(dateTimeNow, numX49.tnTj78("bt5bq"));
            if (bVarY1.f196d.e().isRekyc10MinutesTestEnabled() ? dateTimeNow.isAfter(dateTime.plusMinutes(10)) : dateTimeNow.isAfter(dateTime.plusMinutes(0)) || dateTimeNow.isEqual(dateTime.plusMinutes(0))) {
                bVarY1.f196d.f11330b.edit().putString(strTnTj78, DateTime.now().toString()).apply();
                if (bVarY1.f196d.e().isShortenedFlowExpandedReKycEnabled()) {
                    String strTnTj782 = numX49.tnTj78("bt5bz");
                    Context context = bVarY1.m.f11506b;
                    kotlin.jvm.internal.j.g(context, numX49.tnTj78("bt5bl"));
                    try {
                        InputStream inputStreamOpen = context.getAssets().open(strTnTj782);
                        kotlin.jvm.internal.j.f(inputStreamOpen, "open(...)");
                        byte[] bArr = new byte[inputStreamOpen.available()];
                        inputStreamOpen.read(bArr);
                        inputStreamOpen.close();
                        Charset UTF_8 = StandardCharsets.UTF_8;
                        kotlin.jvm.internal.j.f(UTF_8, "UTF_8");
                        str = new String(bArr, UTF_8);
                    } catch (IOException e) {
                        e.printStackTrace();
                        str = null;
                    }
                    bVarY1.e(new Lh.d(new Lh.d(new Lh.h(new Lh.h(new J(new CallableC0168a((ReKycCriteriaBase) new com.google.gson.j().e(str, ReKycCriteriaBase.class), 13), 3).h(Th.e.c), zh.b.a(), i4), zh.b.a(), i4), new C2361c(bVarY1, i), 2), C0103a.c, i4).e());
                } else if (bVarY1.f196d.e().isRekycFlowEnabled() && bVarY1.o()) {
                    ((MayaDashboardActivity) ((a) bVarY1.c.get())).q2();
                }
            }
        }
        A7.b bVarY12 = Y1();
        if (!S5.c.b(bVarY12.f203q, A5.b.f121n0)) {
            bVarY12.f196d.Z(false);
            return;
        }
        bVarY12.f196d.Z(true);
        C1232v c1232v = ((MayaDashboardActivity) ((a) bVarY12.c.get())).i;
        if (c1232v == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bt522"));
            throw null;
        }
        C0187u c0187u = c1232v.f11232a;
        C c = c0187u.f949b;
        if (((CleverTapInstanceConfig) c.f814a).h) {
            S sE = c0187u.e();
            String strC = c0187u.c();
            sE.getClass();
            S.g(strC, numX49.tnTj78("bt52b"));
            return;
        }
        S sE2 = c0187u.e();
        String strC2 = c0187u.c();
        sE2.getClass();
        S.g(strC2, numX49.tnTj78("bt5bW"));
        k kVar = (k) c.f818k;
        kVar.f3482p = h.c;
        S s9 = kVar.f3480n;
        String str2 = kVar.f3481o;
        s9.getClass();
        S.s(str2, numX49.tnTj78("bt529"));
        S.s(str2, numX49.tnTj78("bt52P"));
        kVar.k();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        iKNpI8.xoZZl9(this);
        super.onStop();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zZN5YC5 = hxOD26.zN5YC5(motionEvent);
        return !zZN5YC5 ? super.onTouchEvent(motionEvent) : zZN5YC5;
    }

    @Override // android.app.Activity
    public void onUserInteraction() {
        iKNpI8.fBndJ9(this);
        super.onUserInteraction();
        n1().u0(this);
    }

    public final void p2(String str, String str2) {
        com.paymaya.common.utility.C.Q(this, getCurrentFocus());
        n1();
        Intent intent = new Intent(this, (Class<?>) MayaScoreActivity.class);
        intent.putExtra(numX49.tnTj78("bt52L"), str2);
        intent.putExtra(numX49.tnTj78("bt52r"), str);
        startActivity(intent);
    }

    public final void q2() {
        String strD = AbstractC1236z.d(this, ReKycIntroBottomSheetFragment.class);
        if (getSupportFragmentManager().findFragmentByTag(strD) == null) {
            ReKycIntroBottomSheetFragment reKycIntroBottomSheetFragment = new ReKycIntroBottomSheetFragment();
            reKycIntroBottomSheetFragment.setArguments(new Bundle());
            reKycIntroBottomSheetFragment.setCancelable(false);
            reKycIntroBottomSheetFragment.show(getSupportFragmentManager(), strD);
        }
    }

    public final void r2(String str, String str2) {
        n1();
        i.S(this, str, str2, new Ag.k(this, 7));
    }

    public final void s2() {
        com.paymaya.common.utility.C.Q(this, getCurrentFocus());
        i iVarN1 = n1();
        if (!iVarN1.f367a.e().isSendMoneyAvailable()) {
            i.U(this, getString(R.string.pma_label_send_money), iVarN1.f367a.e().mMaintenanceConfig().mServiceAvailabilityConfig().mSendMoneyAvailability().mMessage());
            return;
        }
        Intent intent = new Intent(this, (Class<?>) MayaSendMoneyActivity.class);
        intent.setData(getIntent().getData());
        intent.putExtra(numX49.tnTj78("bt52Z"), numX49.tnTj78("bt52k"));
        i.v0(this, intent);
        startActivity(intent);
    }

    public final void t2(EnumC1215d enumC1215d, EnumC1216e enumC1216e) {
        String string = getString(R.string.maya_label_upgrade_dialog_title);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bt52B"));
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, getString(R.string.maya_label_upgrade_dialog_description), new Pair(getString(R.string.maya_label_upgrade_now), new C7.g(0, this, enumC1215d, enumC1216e)), new Pair(getString(R.string.maya_label_maybe_later), null), null, 96);
        mayaAlertBottomSheetDialogFragmentN.s1(enumC1215d);
        mayaAlertBottomSheetDialogFragmentN.f11820c0 = enumC1216e;
        mayaAlertBottomSheetDialogFragmentN.show(getSupportFragmentManager(), numX49.tnTj78("bt52u"));
    }

    public final void u2(String str) {
        String string = getString(R.string.maya_label_upgrade_dialog_title);
        kotlin.jvm.internal.j.f(string, numX49.tnTj78("bt52V"));
        MayaAlertBottomSheetDialogFragment mayaAlertBottomSheetDialogFragmentN = z2.d.n(2131231670, string, getString(R.string.maya_label_upgrade_dialog_description), new Pair(getString(R.string.maya_label_upgrade_now), new f(0, this, str)), new Pair(getString(R.string.maya_label_maybe_later), null), null, 96);
        mayaAlertBottomSheetDialogFragmentN.f11817Z = true;
        mayaAlertBottomSheetDialogFragmentN.f11819b0 = str;
        mayaAlertBottomSheetDialogFragmentN.show(getSupportFragmentManager(), numX49.tnTj78("bt52S"));
    }

    public final void v2(String str) {
        n1().k0(this, str);
    }
}
