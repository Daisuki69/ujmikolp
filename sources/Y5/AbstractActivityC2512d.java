package y5;

import D.C0187u;
import D.O;
import N5.C0491z;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.paymaya.R;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.ActivityTransition;
import d2.C1328c;
import dOYHB6.iY9fr2.dLgao9;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import u5.AbstractC2302a;

/* JADX INFO: renamed from: y5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC2512d extends AppCompatActivity implements Uc.c, O {
    public C1220i c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.paymaya.data.preference.a f21061d;
    public B5.i e;
    public C0187u f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Toolbar f21062g;
    public C0491z h;
    public boolean i;

    @Override // D.O
    public final void A0(HashMap map) {
        String str = (String) map.get("application-uri");
        if (!C.Y(str)) {
            this.e.t(this, str);
            return;
        }
        B5.i iVar = this.e;
        AttributionSource attributionSource = AttributionSource.e;
        iVar.getClass();
        B5.i.l(this, str, attributionSource);
    }

    @Override // android.app.Activity
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
        if (this.i) {
            onBackPressed();
        }
    }

    public ActivityTransition h1() {
        return new ActivityTransition(R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left);
    }

    public EnumC1215d k1() {
        return EnumC1215d.DEFAULT;
    }

    public final void l1(int i) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(i);
        }
    }

    public final void m1(String str) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(str);
        }
    }

    public final void n1(boolean z4) {
        if (getSupportActionBar() != null) {
            if (z4) {
                getSupportActionBar().show();
            } else {
                getSupportActionBar().hide();
            }
        }
    }

    public final void o1(boolean z4) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(z4);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ActivityTransition activityTransitionH1 = h1();
        if (!activityTransitionH1.isSystemEntrance()) {
            overridePendingTransition(activityTransitionH1.getEntranceAnim(), activityTransitionH1.getBackStackExitAnim());
        }
        C.i(getClass().getSimpleName(), "onCreate activity");
        if (Build.VERSION.SDK_INT == 26) {
            getWindow().getDecorView().setImportantForAutofill(8);
        }
        C0187u c0187u = this.f;
        if (c0187u != null) {
            ((D.r) c0187u.f949b.i).f936d = new WeakReference(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        C.i(getClass().getSimpleName(), "onDestroy activity");
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.i = false;
        C.i(getClass().getSimpleName(), "onPause activity");
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.i = true;
        C.i(getClass().getSimpleName(), "onResume activity");
        try {
            boolean z4 = AbstractC2302a.f20265a;
            AbstractC2302a.b(getApplicationContext());
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
        super.onStop();
    }

    public final void p1(boolean z4) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayShowHomeEnabled(z4);
        }
    }

    public final void q1(int i) {
        getWindow().setStatusBarColor(ContextCompat.getColor(getApplicationContext(), i));
    }

    public final void r1() {
        Window window = getWindow();
        dLgao9.oVike1(window, AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.getDecorView().setSystemUiVisibility(1280);
    }

    public final void s1() {
        this.f21062g = (Toolbar) findViewById(R.id.pma_view_toolbar);
        setSupportActionBar(this.f21062g);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        s1();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        super.setContentView(view);
        s1();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        s1();
    }
}
