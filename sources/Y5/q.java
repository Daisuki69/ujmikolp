package y5;

import D.C0187u;
import D.O;
import N5.C0491z;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.mayaui.common.view.activity.impl.MayaSessionExpiredActivity;
import d2.C1328c;
import dOYHB6.iY9fr2.dLgao9;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Locale;
import oi.C1983a;
import u5.AbstractC2302a;
import v0.C2333a;
import zj.C2578C;

/* JADX INFO: loaded from: classes10.dex */
public abstract class q extends AppCompatActivity implements W6.f, O {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1220i f21073d;
    public com.paymaya.data.preference.a e;
    public B5.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public S5.c f21074g;
    public C0187u h;
    public C1232v i;
    public C0491z j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f21075k;
    public final ActivityTransition c = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1033d f21076l = C1034e.b(new W4.b(this, 26));

    @Override // D.O
    public final void A0(HashMap payload) {
        kotlin.jvm.internal.j.g(payload, "payload");
        String str = (String) payload.get("application-uri");
        if (!C.Y(str)) {
            n1().t(this, str);
        } else {
            n1();
            B5.i.l(this, str, AttributionSource.e);
        }
    }

    public final void A1() {
        getWindow().getDecorView().setSystemUiVisibility(8192);
    }

    public final void B1() {
        Toolbar toolbar;
        C0491z c0491z = this.j;
        if (c0491z == null || (toolbar = (Toolbar) c0491z.e) == null) {
            return;
        }
        toolbar.setBackgroundColor(jk.b.n(this, R.attr.mayaColorBackgroundPrimaryAlt));
    }

    public final void C1(int i) {
        C0491z c0491z;
        if (getSupportActionBar() == null || (c0491z = this.j) == null) {
            return;
        }
        ((Toolbar) c0491z.e).setNavigationIcon(i);
    }

    public final void D1(float f) {
        C0491z c0491z;
        ProgressBar progressBar;
        ProgressBar progressBar2;
        ProgressBar progressBar3;
        if (getSupportActionBar() == null || (c0491z = this.j) == null) {
            return;
        }
        if (c0491z != null && (progressBar3 = (ProgressBar) c0491z.f) != null) {
            progressBar3.setAlpha(f);
        }
        if (f > 0.0f) {
            C0491z c0491z2 = this.j;
            if (c0491z2 == null || (progressBar2 = (ProgressBar) c0491z2.f) == null) {
                return;
            }
            progressBar2.setVisibility(0);
            return;
        }
        C0491z c0491z3 = this.j;
        if (c0491z3 == null || (progressBar = (ProgressBar) c0491z3.f) == null) {
            return;
        }
        progressBar.setVisibility(4);
    }

    public void E(String str, Dialog dialog) {
        if (str != null) {
            String strE0 = C2578C.e0(100, str);
            C1220i c1220iK1 = k1();
            C1219h c1219h = new C1219h();
            HashMap map = c1219h.j;
            c1219h.o(EnumC1215d.ERROR);
            c1219h.n(17);
            c1219h.t(EnumC1217f.LINK);
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            String str2 = q1().f10786a;
            Locale locale = Locale.getDefault();
            kotlin.jvm.internal.j.f(locale, "getDefault(...)");
            String lowerCase = str2.toLowerCase(locale);
            kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
            map.put("module", lowerCase);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            map.put(ImagesContract.URL, strE0);
            c1219h.i();
            c1220iK1.b(c1219h);
        }
    }

    public final void E1(int i) {
        C0491z c0491z;
        if (getSupportActionBar() == null || (c0491z = this.j) == null) {
            return;
        }
        ((ProgressBar) c0491z.f).setProgress(i);
    }

    public final void F1(int i, int i4) {
        String string = getString(R.string.maya_label_toolbar_steps_percent_format, String.valueOf(i), String.valueOf(i4));
        kotlin.jvm.internal.j.f(string, "getString(...)");
        G1(string);
    }

    public final void G1(String str) {
        C0491z c0491z;
        TextView textView;
        if (getSupportActionBar() == null || (c0491z = this.j) == null || c0491z == null || (textView = (TextView) c0491z.f4304d) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void H1(float f) {
        C0491z c0491z;
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (getSupportActionBar() == null || (c0491z = this.j) == null) {
            return;
        }
        if (c0491z != null && (textView3 = (TextView) c0491z.f4304d) != null) {
            textView3.setAlpha(f);
        }
        if (f > 0.0f) {
            C0491z c0491z2 = this.j;
            if (c0491z2 == null || (textView2 = (TextView) c0491z2.f4304d) == null) {
                return;
            }
            textView2.setVisibility(0);
            return;
        }
        C0491z c0491z3 = this.j;
        if (c0491z3 == null || (textView = (TextView) c0491z3.f4304d) == null) {
            return;
        }
        textView.setVisibility(4);
    }

    public final void I1(int i) {
        C0491z c0491z;
        if (getSupportActionBar() == null || (c0491z = this.j) == null) {
            return;
        }
        ((TextView) c0491z.h).setGravity(i);
    }

    public final void J1(int i) {
        K1(getString(i));
    }

    public final void K1(String str) {
        C0491z c0491z;
        TextView textView;
        if (getSupportActionBar() == null || (c0491z = this.j) == null || c0491z == null || (textView = (TextView) c0491z.h) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void L1(float f) {
        C0491z c0491z;
        TextView textView;
        TextView textView2;
        TextView textView3;
        if (getSupportActionBar() == null || (c0491z = this.j) == null) {
            return;
        }
        if (c0491z != null && (textView3 = (TextView) c0491z.h) != null) {
            textView3.setAlpha(f);
        }
        if (f > 0.0f) {
            C0491z c0491z2 = this.j;
            if (c0491z2 == null || (textView2 = (TextView) c0491z2.h) == null) {
                return;
            }
            textView2.setVisibility(0);
            return;
        }
        C0491z c0491z3 = this.j;
        if (c0491z3 == null || (textView = (TextView) c0491z3.h) == null) {
            return;
        }
        textView.setVisibility(4);
    }

    public final void M1(int i) {
        N1(ContextCompat.getColor(getApplicationContext(), i));
    }

    public final void N1(int i) {
        getWindow().setStatusBarColor(i);
    }

    public final void O1() {
        Window window = getWindow();
        dLgao9.oVike1(window, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void P1() {
        View viewFindViewById = findViewById(android.R.id.content);
        kotlin.jvm.internal.j.d(viewFindViewById);
        C1983a c1983a = new C1983a(this, 24);
        Sc.d dVar = new Sc.d();
        dVar.f5718a = viewFindViewById;
        dVar.f5719b = c1983a;
        dVar.c = new Handler(Looper.getMainLooper());
        if (viewFindViewById.getViewTreeObserver().isAlive() && viewFindViewById.isAttachedToWindow()) {
            viewFindViewById.getViewTreeObserver().addOnDrawListener(dVar);
        } else {
            viewFindViewById.addOnAttachStateChangeListener(new Sc.c(dVar, 0));
        }
    }

    public final void Q1(C0491z binding) {
        kotlin.jvm.internal.j.g(binding, "binding");
        this.j = binding;
        setSupportActionBar((Toolbar) binding.e);
    }

    public final void R1() {
        D1(1.0f);
    }

    public final void S1() {
        H1(1.0f);
    }

    public final void T1() {
        L1(1.0f);
    }

    public final void U1() {
        C0491z c0491z;
        View view;
        if (getSupportActionBar() == null || (c0491z = this.j) == null || c0491z == null || (view = (View) c0491z.f4305g) == null) {
            return;
        }
        view.setVisibility(0);
    }

    @Override // android.app.Activity, p9.InterfaceC2030o
    public void finish() {
        super.finish();
        ActivityTransition activityTransitionH1 = h1();
        if (activityTransitionH1.isSystemExit()) {
            return;
        }
        overridePendingTransition(activityTransitionH1.getBackStackReEntryAnim(), activityTransitionH1.getExitAnim());
    }

    public final void g1() {
        C.Q(this, getCurrentFocus());
        if (this.f21075k) {
            onBackPressed();
        }
    }

    public ActivityTransition h1() {
        return this.c;
    }

    public final C1220i k1() {
        C1220i c1220i = this.f21073d;
        if (c1220i != null) {
            return c1220i;
        }
        kotlin.jvm.internal.j.n("mAnalyticsUtils");
        throw null;
    }

    public boolean l1() {
        return this instanceof MayaSessionExpiredActivity;
    }

    public final S5.c m1() {
        S5.c cVar = this.f21074g;
        if (cVar != null) {
            return cVar;
        }
        kotlin.jvm.internal.j.n("mFlagConfigurationService");
        throw null;
    }

    public final B5.i n1() {
        B5.i iVar = this.f;
        if (iVar != null) {
            return iVar;
        }
        kotlin.jvm.internal.j.n("mFlowController");
        throw null;
    }

    public final C5.a o1() {
        return (C5.a) this.f21076l.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            getWindow().setNavigationBarContrastEnforced(false);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(android.R.id.content), new C2333a(1));
        }
        o1().f739a = l1();
        o1().e("ttd");
        o1().e("ttfd");
        ActivityTransition activityTransitionH1 = h1();
        if (!activityTransitionH1.isSystemEntrance()) {
            overridePendingTransition(activityTransitionH1.getEntranceAnim(), activityTransitionH1.getBackStackExitAnim());
        }
        C.i(getClass().getSimpleName(), "onCreate activity");
        if (i == 26) {
            getWindow().getDecorView().setImportantForAutofill(8);
        }
        C0187u c0187u = this.h;
        if (c0187u != null) {
            ((D.r) c0187u.f949b.i).f936d = new WeakReference(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C.i(getClass().getSimpleName(), "onDestroy activity");
        o1().a();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.f21075k = false;
        C.i(getClass().getSimpleName(), "onPause activity");
        o1().a();
        super.onPause();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        o1().f("ttd");
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f21075k = true;
        C.i(getClass().getSimpleName(), "onResume activity");
        try {
            boolean z4 = AbstractC2302a.f20265a;
            Context applicationContext = getApplicationContext();
            kotlin.jvm.internal.j.f(applicationContext, "getApplicationContext(...)");
            AbstractC2302a.b(applicationContext);
        } catch (Exception e) {
            C1328c.a().b(e);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        C.i(getClass().getSimpleName(), "onStart activity");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        C.i(getClass().getSimpleName(), "onStop activity");
        o1().a();
        super.onStop();
    }

    public final com.paymaya.data.preference.a p1() {
        com.paymaya.data.preference.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.j.n("mPreference");
        throw null;
    }

    public EnumC1215d q1() {
        return EnumC1215d.DEFAULT;
    }

    public final void r1() {
        D1(0.0f);
    }

    public final void s1() {
        H1(0.0f);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        P1();
    }

    public final void t1() {
        L1(0.0f);
    }

    public final void u1() {
        C0491z c0491z;
        View view;
        if (getSupportActionBar() == null || (c0491z = this.j) == null || c0491z == null || (view = (View) c0491z.f4305g) == null) {
            return;
        }
        view.setVisibility(8);
    }

    public final void v1(C1219h c1219h) {
        C1220i c1220iK1 = k1();
        c1219h.p(q1());
        c1220iK1.c(this, c1219h);
    }

    public final void w1(boolean z4) {
        if (z4) {
            ActionBar supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.show();
                return;
            }
            return;
        }
        ActionBar supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.hide();
        }
    }

    public final void x1(boolean z4) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayHomeAsUpEnabled(z4);
        }
    }

    public final void y1(boolean z4) {
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.setDisplayShowHomeEnabled(z4);
        }
    }

    public void z0() {
        g1();
    }

    public final void z1() {
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        P1();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        P1();
    }
}
