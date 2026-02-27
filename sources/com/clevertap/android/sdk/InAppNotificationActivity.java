package com.clevertap.android.sdk;

import D.AbstractC0184q;
import D.C;
import D.C0187u;
import D.I;
import D.N;
import D.S;
import D.Y;
import D.Z;
import D.r;
import N.c;
import N.f;
import N.k;
import N.l;
import We.s;
import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.fragment.app.FragmentActivity;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.CTInAppNotificationButton;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFullFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeCoverImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHalfInterstitialImageFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeInterstitialImageFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class InAppNotificationActivity extends FragmentActivity implements l, I, Y {
    public static boolean h;
    public CleverTapInstanceConfig c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CTInAppNotification f9456d;
    public WeakReference e;
    public Z f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9457g = false;

    @Override // N.l
    public final Bundle A(CTInAppNotification cTInAppNotification, CTInAppAction cTInAppAction, String str, Bundle bundle, FragmentActivity fragmentActivity) {
        l lVarL1 = l1();
        if (lVarL1 != null) {
            return lVarL1.A(cTInAppNotification, cTInAppAction, str, bundle, this);
        }
        return null;
    }

    @Override // N.l
    public final void K(CTInAppNotification cTInAppNotification) {
        k1();
    }

    @Override // N.l
    public final void K0(CTInAppNotification cTInAppNotification, Bundle bundle) {
        h1(bundle, true);
    }

    @Override // D.I
    public final void R0(boolean z4) {
        n1(z4);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // N.l
    public final Bundle e0(CTInAppNotification cTInAppNotification, CTInAppNotificationButton cTInAppNotificationButton, InAppNotificationActivity inAppNotificationActivity) {
        l lVarL1 = l1();
        if (lVarL1 != null) {
            return lVarL1.e0(cTInAppNotification, cTInAppNotificationButton, this);
        }
        return null;
    }

    @Override // D.I
    public final void f0() {
        Z z4 = this.f;
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

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(1, R.anim.fade_in, R.anim.fade_out);
        } else {
            overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
        }
    }

    public final CTInAppBaseFullFragment g1() {
        c cVar = this.f9456d.c;
        switch (cVar.ordinal()) {
            case 1:
                return new CTInAppHtmlCoverFragment();
            case 2:
                return new CTInAppHtmlInterstitialFragment();
            case 3:
            case 4:
            case 9:
            case 10:
            default:
                this.c.c().getClass();
                S.q("InAppNotificationActivity: Unhandled InApp Type: " + cVar);
                return null;
            case 5:
                return new CTInAppHtmlHalfInterstitialFragment();
            case 6:
                return new CTInAppNativeCoverFragment();
            case 7:
                return new CTInAppNativeInterstitialFragment();
            case 8:
                return new CTInAppNativeHalfInterstitialFragment();
            case 11:
                ArrayList arrayList = this.f9456d.i;
                if (arrayList.isEmpty()) {
                    this.c.c().getClass();
                    S.f("InAppNotificationActivity: Notification has no buttons, not showing Alert InApp");
                    return null;
                }
                final CTInAppNotificationButton cTInAppNotificationButton = (CTInAppNotificationButton) arrayList.get(0);
                final int i = 0;
                AlertDialog alertDialogCreate = new AlertDialog.Builder(this, R.style.Theme.Material.Light.Dialog.Alert).setCancelable(false).setTitle(this.f9456d.f9496l).setMessage(this.f9456d.m).setPositiveButton(cTInAppNotificationButton.f9509a, new DialogInterface.OnClickListener(this) { // from class: D.M

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InAppNotificationActivity f855b;

                    {
                        this.f855b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i4) {
                        InAppNotificationActivity inAppNotificationActivity = this.f855b;
                        CTInAppNotificationButton cTInAppNotificationButton2 = cTInAppNotificationButton;
                        switch (i) {
                            case 0:
                                boolean z4 = InAppNotificationActivity.h;
                                inAppNotificationActivity.m1(cTInAppNotificationButton2, true);
                                break;
                            case 1:
                                boolean z5 = InAppNotificationActivity.h;
                                inAppNotificationActivity.m1(cTInAppNotificationButton2, false);
                                break;
                            default:
                                boolean z8 = InAppNotificationActivity.h;
                                N.l lVarL1 = inAppNotificationActivity.l1();
                                inAppNotificationActivity.h1(lVarL1 != null ? lVarL1.e0(inAppNotificationActivity.f9456d, cTInAppNotificationButton2, inAppNotificationActivity) : null, true);
                                break;
                        }
                    }
                }).create();
                if (this.f9456d.i.size() == 2) {
                    final CTInAppNotificationButton cTInAppNotificationButton2 = (CTInAppNotificationButton) arrayList.get(1);
                    final int i4 = 1;
                    alertDialogCreate.setButton(-2, cTInAppNotificationButton2.f9509a, new DialogInterface.OnClickListener(this) { // from class: D.M

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InAppNotificationActivity f855b;

                        {
                            this.f855b = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i42) {
                            InAppNotificationActivity inAppNotificationActivity = this.f855b;
                            CTInAppNotificationButton cTInAppNotificationButton22 = cTInAppNotificationButton2;
                            switch (i4) {
                                case 0:
                                    boolean z4 = InAppNotificationActivity.h;
                                    inAppNotificationActivity.m1(cTInAppNotificationButton22, true);
                                    break;
                                case 1:
                                    boolean z5 = InAppNotificationActivity.h;
                                    inAppNotificationActivity.m1(cTInAppNotificationButton22, false);
                                    break;
                                default:
                                    boolean z8 = InAppNotificationActivity.h;
                                    N.l lVarL1 = inAppNotificationActivity.l1();
                                    inAppNotificationActivity.h1(lVarL1 != null ? lVarL1.e0(inAppNotificationActivity.f9456d, cTInAppNotificationButton22, inAppNotificationActivity) : null, true);
                                    break;
                            }
                        }
                    });
                }
                if (arrayList.size() > 2) {
                    final CTInAppNotificationButton cTInAppNotificationButton3 = (CTInAppNotificationButton) arrayList.get(2);
                    final int i6 = 2;
                    alertDialogCreate.setButton(-3, cTInAppNotificationButton3.f9509a, new DialogInterface.OnClickListener(this) { // from class: D.M

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InAppNotificationActivity f855b;

                        {
                            this.f855b = this;
                        }

                        @Override // android.content.DialogInterface.OnClickListener
                        public final void onClick(DialogInterface dialogInterface, int i42) {
                            InAppNotificationActivity inAppNotificationActivity = this.f855b;
                            CTInAppNotificationButton cTInAppNotificationButton22 = cTInAppNotificationButton3;
                            switch (i6) {
                                case 0:
                                    boolean z4 = InAppNotificationActivity.h;
                                    inAppNotificationActivity.m1(cTInAppNotificationButton22, true);
                                    break;
                                case 1:
                                    boolean z5 = InAppNotificationActivity.h;
                                    inAppNotificationActivity.m1(cTInAppNotificationButton22, false);
                                    break;
                                default:
                                    boolean z8 = InAppNotificationActivity.h;
                                    N.l lVarL1 = inAppNotificationActivity.l1();
                                    inAppNotificationActivity.h1(lVarL1 != null ? lVarL1.e0(inAppNotificationActivity.f9456d, cTInAppNotificationButton22, inAppNotificationActivity) : null, true);
                                    break;
                            }
                        }
                    });
                }
                alertDialogCreate.show();
                h = true;
                k1();
                return null;
            case 12:
                return new CTInAppNativeCoverImageFragment();
            case 13:
                return new CTInAppNativeInterstitialImageFragment();
            case 14:
                return new CTInAppNativeHalfInterstitialImageFragment();
        }
    }

    public final void h1(Bundle bundle, boolean z4) {
        CTInAppNotification cTInAppNotification;
        if (h) {
            h = false;
        }
        if (!this.f9457g) {
            l lVarL1 = l1();
            if (lVarL1 != null && (cTInAppNotification = this.f9456d) != null) {
                lVarL1.K0(cTInAppNotification, bundle);
            }
            this.f9457g = true;
        }
        if (z4) {
            finish();
        }
    }

    public final void k1() {
        l lVarL1 = l1();
        if (lVarL1 != null) {
            lVarL1.K(this.f9456d);
        }
    }

    public final l l1() {
        l lVar;
        try {
            lVar = (l) this.e.get();
        } catch (Throwable unused) {
            lVar = null;
        }
        if (lVar == null && this.f9456d != null) {
            S sC = this.c.c();
            String str = this.c.f9439a;
            String str2 = "InAppActivityListener is null for notification: " + AbstractC0184q.b(this.f9456d.f);
            sC.getClass();
            S.s(str, str2);
        }
        return lVar;
    }

    public final void m1(CTInAppNotificationButton cTInAppNotificationButton, boolean z4) {
        l lVarL1 = l1();
        Bundle bundleE0 = lVarL1 != null ? lVarL1.e0(this.f9456d, cTInAppNotificationButton, this) : null;
        CTInAppNotification cTInAppNotification = this.f9456d;
        if (cTInAppNotification.f9500q) {
            if (z4) {
                n1(cTInAppNotification.f9501r);
                return;
            }
            f0();
        }
        CTInAppAction cTInAppAction = cTInAppNotificationButton.f;
        if (cTInAppAction == null || f.e != cTInAppAction.f9471a) {
            h1(bundleE0, true);
        } else {
            n1(cTInAppAction.e);
        }
    }

    public final void n1(boolean z4) {
        Z z5 = this.f;
        z5.getClass();
        z5.f(this, z4, new A7.f(8, z5, this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        Window window;
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        getOnBackPressedDispatcher().addCallback(this, new N(this, 0));
        int i = getResources().getConfiguration().orientation;
        if (i == 2 && (window = getWindow()) != null) {
            window.addFlags(1024);
            new WindowInsetsControllerCompat(window, window.getDecorView()).hide(WindowInsetsCompat.Type.systemBars());
        }
        try {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                throw new IllegalArgumentException();
            }
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) extras.getParcelable("config");
            this.c = cleverTapInstanceConfig;
            if (cleverTapInstanceConfig == null) {
                throw new IllegalArgumentException();
            }
            C c = C0187u.j(this, cleverTapInstanceConfig).f949b;
            CleverTapInstanceConfig config = this.c;
            ArrayList arrayList = ((r) c.i).e;
            j.g(config, "config");
            this.f = new Z(config, arrayList, this, 24);
            if (extras.getBoolean("displayPushPermissionPrompt", false)) {
                n1(extras.getBoolean("shouldShowFallbackSettings", false));
                return;
            }
            this.e = new WeakReference((k) c.f818k);
            CTInAppNotification cTInAppNotification = (CTInAppNotification) extras.getParcelable("inApp");
            this.f9456d = cTInAppNotification;
            if (cTInAppNotification == null) {
                finish();
                return;
            }
            if (cTInAppNotification.f9495k && !cTInAppNotification.j) {
                if (i == 2) {
                    S.b("App in Landscape, dismissing portrait InApp Notification");
                    finish();
                    h1(null, true);
                    return;
                }
                S.b("App in Portrait, displaying InApp Notification anyway");
            }
            CTInAppNotification cTInAppNotification2 = this.f9456d;
            if (!cTInAppNotification2.f9495k && cTInAppNotification2.j) {
                if (i == 1) {
                    S.b("App in Portrait, dismissing landscape InApp Notification");
                    finish();
                    h1(null, true);
                    return;
                }
                S.b("App in Landscape, displaying InApp Notification anyway");
            }
            if (bundle != null) {
                if (h) {
                    g1();
                    return;
                }
                return;
            }
            CTInAppBaseFullFragment cTInAppBaseFullFragmentG1 = g1();
            if (cTInAppBaseFullFragmentG1 != null) {
                CTInAppNotification inAppNotification = this.f9456d;
                CleverTapInstanceConfig config2 = this.c;
                j.g(inAppNotification, "inAppNotification");
                j.g(config2, "config");
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable("inApp", inAppNotification);
                bundle2.putParcelable("config", config2);
                cTInAppBaseFullFragmentG1.setArguments(bundle2);
                getSupportFragmentManager().beginTransaction().setCustomAnimations(R.animator.fade_in, R.animator.fade_out).add(R.id.content, cTInAppBaseFullFragmentG1, s.p(new StringBuilder(), this.c.f9439a, ":CT_INAPP_CONTENT_FRAGMENT")).commitNow();
            }
        } catch (Throwable th2) {
            S.o("Cannot find a valid notification bundle to show!", th2);
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
        if (isChangingConfigurations()) {
            return;
        }
        h1(null, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        this.f.e(this, i, iArr);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
        Z z4 = this.f;
        if (z4.f889a) {
            z4.f889a = false;
            if (Build.VERSION.SDK_INT >= 33) {
                z4.c(this);
                z4.d();
            }
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

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(R.style.Theme.Translucent.NoTitleBar);
    }
}
