package com.clevertap.android.sdk.inbox;

import A7.f;
import D.A;
import D.C0178k;
import D.C0187u;
import D.I;
import D.S;
import D.Z;
import S.a;
import We.s;
import Z.h;
import Z.p;
import Z.r;
import Z.u;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.material.tabs.TabLayout;
import com.paymaya.R;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class CTInboxActivity extends FragmentActivity implements r, I {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f9541k;
    public u c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CTInboxStyleConfig f9542d;
    public TabLayout e;
    public ViewPager f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CleverTapInstanceConfig f9543g;
    public WeakReference h;
    public C0187u i;
    public Z j;

    @Override // D.I
    public final void R0(boolean z4) {
        Z z5 = this.j;
        if (z5 != null) {
            z5.f(this, z4, new f(8, z5, this));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // D.I
    public final void f0() {
        Z z4 = this.j;
        if (z4 != null) {
            z4.c(this);
            ArrayList arrayList = (ArrayList) z4.c;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (it.next() != null) {
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    public final h g1() {
        h hVar;
        try {
            hVar = (h) this.h.get();
        } catch (Throwable unused) {
            hVar = null;
        }
        if (hVar == null) {
            S sC = this.f9543g.c();
            String str = this.f9543g.f9439a;
            sC.getClass();
            S.s(str, "InboxActivityListener is null for notification inbox ");
        }
        return hVar;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        int size;
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            this.f9542d = (CTInboxStyleConfig) extras.getParcelable("styleConfig");
            Bundle bundle2 = extras.getBundle("configBundle");
            if (bundle2 != null) {
                this.f9543g = (CleverTapInstanceConfig) bundle2.getParcelable("config");
            }
            C0187u c0187uJ = C0187u.j(getApplicationContext(), this.f9543g);
            this.i = c0187uJ;
            if (c0187uJ != null) {
                this.h = new WeakReference(c0187uJ);
                CleverTapInstanceConfig config = this.f9543g;
                ArrayList arrayList = ((D.r) this.i.f949b.i).e;
                j.g(config, "config");
                this.j = new Z(config, arrayList, null, 28);
            }
            f9541k = getResources().getConfiguration().orientation;
            setContentView(R.layout.inbox_activity);
            Object obj = this.i.f949b.f815b;
            new WeakReference(this);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitle(this.f9542d.e);
            toolbar.setTitleTextColor(Color.parseColor(this.f9542d.f));
            toolbar.setBackgroundColor(Color.parseColor(this.f9542d.f9435d));
            Drawable drawable = ResourcesCompat.getDrawable(getResources(), R.drawable.ct_ic_arrow_back_white_24dp, null);
            if (drawable != null) {
                drawable.setColorFilter(Color.parseColor(this.f9542d.f9433a), PorterDuff.Mode.SRC_IN);
            }
            toolbar.setNavigationIcon(drawable);
            toolbar.setNavigationContentDescription(getString(R.string.ct_inbox_back_button_content_description));
            toolbar.setNavigationOnClickListener(new a(this, 1));
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.inbox_linear_layout);
            linearLayout.setBackgroundColor(Color.parseColor(this.f9542d.c));
            this.e = (TabLayout) linearLayout.findViewById(R.id.tab_layout);
            this.f = (ViewPager) linearLayout.findViewById(R.id.view_pager);
            TextView textView = (TextView) findViewById(R.id.no_message_view);
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("config", this.f9543g);
            bundle3.putParcelable("styleConfig", this.f9542d);
            String[] strArr = this.f9542d.f9438l;
            int i = 0;
            if (strArr != null && strArr.length > 0) {
                this.f.setVisibility(0);
                String[] strArr2 = this.f9542d.f9438l;
                ArrayList arrayList2 = strArr2 == null ? new ArrayList() : new ArrayList(Arrays.asList(strArr2));
                this.c = new u(getSupportFragmentManager(), arrayList2.size() + 1);
                this.e.setVisibility(0);
                this.e.setTabGravity(0);
                this.e.setTabMode(1);
                this.e.setSelectedTabIndicatorColor(Color.parseColor(this.f9542d.j));
                this.e.setTabTextColors(Color.parseColor(this.f9542d.m), Color.parseColor(this.f9542d.i));
                this.e.setBackgroundColor(Color.parseColor(this.f9542d.f9437k));
                Bundle bundle4 = (Bundle) bundle3.clone();
                bundle4.putInt("position", 0);
                CTInboxListViewFragment cTInboxListViewFragment = new CTInboxListViewFragment();
                cTInboxListViewFragment.setArguments(bundle4);
                u uVar = this.c;
                String str = this.f9542d.f9434b;
                uVar.f6858a[0] = cTInboxListViewFragment;
                uVar.f6859b.add(str);
                while (i < arrayList2.size()) {
                    String str2 = (String) arrayList2.get(i);
                    i++;
                    Bundle bundle5 = (Bundle) bundle3.clone();
                    bundle5.putInt("position", i);
                    bundle5.putString("filter", str2);
                    CTInboxListViewFragment cTInboxListViewFragment2 = new CTInboxListViewFragment();
                    cTInboxListViewFragment2.setArguments(bundle5);
                    u uVar2 = this.c;
                    uVar2.f6858a[i] = cTInboxListViewFragment2;
                    uVar2.f6859b.add(str2);
                    this.f.setOffscreenPageLimit(i);
                }
                this.f.setAdapter(this.c);
                this.c.notifyDataSetChanged();
                this.f.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(this.e));
                this.e.setupWithViewPager(this.f);
                return;
            }
            this.f.setVisibility(8);
            this.e.setVisibility(8);
            C0187u c0187u = this.i;
            if (c0187u != null) {
                synchronized (((C0178k) c0187u.f949b.h).f926b) {
                    try {
                        p pVar = (p) ((A) c0187u.f949b.j).e;
                        if (pVar != null) {
                            size = pVar.d().size();
                        } else {
                            S sE = c0187u.e();
                            String strC = c0187u.c();
                            sE.getClass();
                            S.g(strC, "Notification Inbox not initialized");
                            size = -1;
                        }
                    } finally {
                    }
                }
                if (size == 0) {
                    textView.setBackgroundColor(Color.parseColor(this.f9542d.c));
                    textView.setVisibility(0);
                    textView.setText(this.f9542d.f9436g);
                    textView.setTextColor(Color.parseColor(this.f9542d.h));
                    return;
                }
            }
            ((FrameLayout) findViewById(R.id.list_view_fragment)).setVisibility(0);
            textView.setVisibility(8);
            for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                if (fragment.getTag() != null) {
                    if (!fragment.getTag().equalsIgnoreCase(this.f9543g.f9439a + ":CT_INBOX_LIST_VIEW_FRAGMENT")) {
                        i = 1;
                    }
                }
            }
            if (i == 0) {
                CTInboxListViewFragment cTInboxListViewFragment3 = new CTInboxListViewFragment();
                cTInboxListViewFragment3.setArguments(bundle3);
                getSupportFragmentManager().beginTransaction().add(R.id.list_view_fragment, cTInboxListViewFragment3, s.p(new StringBuilder(), this.f9543g.f9439a, ":CT_INBOX_LIST_VIEW_FRAGMENT")).commit();
            }
        } catch (Throwable th2) {
            S.o("Cannot find a valid notification inbox bundle to show!", th2);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        Object obj = this.i.f949b.f815b;
        new WeakReference(null);
        String[] strArr = this.f9542d.f9438l;
        if (strArr != null && strArr.length > 0) {
            for (Fragment fragment : getSupportFragmentManager().getFragments()) {
                if (fragment instanceof CTInboxListViewFragment) {
                    S.l("Removing fragment - " + fragment.toString());
                    getSupportFragmentManager().getFragments().remove(fragment);
                }
            }
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        Z z4 = this.j;
        if (z4 != null) {
            z4.e(this, i, iArr);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
        Z z4 = this.j;
        if (z4 == null || !z4.f889a) {
            return;
        }
        z4.f889a = false;
        if (Build.VERSION.SDK_INT >= 33) {
            z4.c(this);
            z4.d();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        iKNpI8.pX3PN6(this);
        super.onStart();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
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
    }
}
