package com.paymaya.mayaui.regv2.view.activity.impl;

import B5.i;
import Bb.f;
import D.C0187u;
import N5.C0458i;
import N5.C0491z;
import Qc.b;
import S7.j;
import U8.c;
import Ya.a;
import a.AbstractC0617a;
import ab.C0670c;
import ab.C0671d;
import ab.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.ActivityKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDirections;
import androidx.navigation.fragment.NavHostFragment;
import androidx.viewbinding.ViewBindings;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1229s;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.domain.model.OngoingRegistration;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.E0;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment;
import com.paymaya.mayaui.regv2.view.activity.impl.MayaRegistrationV2Activity;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountCreationFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaAccountProvisionFragment;
import com.paymaya.mayaui.regv2.view.fragment.impl.MayaVerifyRegistrationV2Fragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import eb.d;
import eb.o;
import f9.InterfaceC1478e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import n3.C1916a;
import y5.l;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaRegistrationV2Activity extends l implements b, a, d, eb.l, j, o, InterfaceC1478e {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f13663v = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0458i f13664n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public f f13665o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public C1229s f13666p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public OngoingRegistration f13667q = new OngoingRegistration(null, null, null, null, 15, null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC1033d f13668r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Integer f13669s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Integer f13670t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC1033d f13671u;

    public MayaRegistrationV2Activity() {
        final int i = 0;
        this.f13668r = C1034e.b(new Function0(this) { // from class: ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationV2Activity f7071b;

            {
                this.f7071b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaRegistrationV2Activity mayaRegistrationV2Activity = this.f7071b;
                switch (i) {
                    case 0:
                        int i4 = MayaRegistrationV2Activity.f13663v;
                        return C1916a.b(mayaRegistrationV2Activity);
                    default:
                        int i6 = MayaRegistrationV2Activity.f13663v;
                        FragmentManager supportFragmentManager = mayaRegistrationV2Activity.getSupportFragmentManager();
                        C0458i c0458i = mayaRegistrationV2Activity.f13664n;
                        kotlin.jvm.internal.j.d(c0458i);
                        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(c0458i.c.getId());
                        kotlin.jvm.internal.j.e(fragmentFindFragmentById, numX49.tnTj78("buHP"));
                        return ((NavHostFragment) fragmentFindFragmentById).getNavController();
                }
            }
        });
        final int i4 = 1;
        this.f13671u = C1034e.b(new Function0(this) { // from class: ab.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaRegistrationV2Activity f7071b;

            {
                this.f7071b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                MayaRegistrationV2Activity mayaRegistrationV2Activity = this.f7071b;
                switch (i4) {
                    case 0:
                        int i42 = MayaRegistrationV2Activity.f13663v;
                        return C1916a.b(mayaRegistrationV2Activity);
                    default:
                        int i6 = MayaRegistrationV2Activity.f13663v;
                        FragmentManager supportFragmentManager = mayaRegistrationV2Activity.getSupportFragmentManager();
                        C0458i c0458i = mayaRegistrationV2Activity.f13664n;
                        kotlin.jvm.internal.j.d(c0458i);
                        Fragment fragmentFindFragmentById = supportFragmentManager.findFragmentById(c0458i.c.getId());
                        kotlin.jvm.internal.j.e(fragmentFindFragmentById, numX49.tnTj78("buHP"));
                        return ((NavHostFragment) fragmentFindFragmentById).getNavController();
                }
            }
        });
    }

    @Override // f9.InterfaceC1478e
    public final void D() {
        n1();
        i.Q(this, numX49.tnTj78("bj7P"), numX49.tnTj78("bj7b"), null);
    }

    @Override // f9.InterfaceC1478e
    public final void N() {
        n1();
        i.M(this, numX49.tnTj78("bj72"));
    }

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(true);
        y1(true);
        x1(true);
        if (fragment instanceof MayaAccountCreationFragment) {
            t1();
            E1(50);
            R1();
            F1(1, 2);
            S1();
            return;
        }
        if (fragment instanceof MayaAccountProvisionFragment) {
            t1();
            E1(100);
            R1();
            F1(2, 2);
            S1();
            return;
        }
        if (fragment instanceof MayaVerifyRegistrationV2Fragment) {
            K1(getString(R.string.maya_label_one_time_pin));
            t1();
            r1();
            s1();
        }
    }

    public final void X1(String str, Function1 function1) {
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, str, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y);
        mayaErrorDialogFragmentZ.f11851d0 = new e(function1, mayaErrorDialogFragmentZ, 0);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bj7L"));
    }

    public final void Y1(PayMayaError payMayaError, Function1 function1) {
        C.Q(this, getCurrentFocus());
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447);
        mayaErrorDialogFragmentZ.f11850c0 = new c(11, this, function1, mayaErrorDialogFragmentZ);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), numX49.tnTj78("bj7r"));
    }

    public final void Z1(String str, String str2, Function0 function0) {
        La.a aVar = new La.a(3, function0);
        MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment = new MayaDataPrivacyWebContentBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putString(numX49.tnTj78("bj7Z"), str);
        bundle.putString(numX49.tnTj78("bj7k"), str2);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.setArguments(bundle);
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12310Z = aVar;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.f12311a0 = null;
        mayaDataPrivacyWebContentBottomSheetDialogFragment.show(getSupportFragmentManager(), mayaDataPrivacyWebContentBottomSheetDialogFragment.getTag());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().w().f4755a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        E0 e0M = aVar.M();
        kotlin.jvm.internal.j.g(aVar2, numX49.tnTj78("bj7B"));
        this.f13665o = new f(aVar2, e0M);
        this.f13666p = (C1229s) aVar.f4684R.get();
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_registration_v2, (ViewGroup) null, false);
        int i = R.id.nav_host_fragment;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) ViewBindings.findChildViewById(viewInflate, R.id.nav_host_fragment);
        if (fragmentContainerView != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f13664n = new C0458i(constraintLayout, fragmentContainerView, C0491z.a(viewFindChildViewById), 1);
                setContentView(constraintLayout);
                C0458i c0458i = this.f13664n;
                kotlin.jvm.internal.j.d(c0458i);
                Q1(c0458i.f4116d);
                B1();
                f fVar = this.f13665o;
                String strTnTj78 = numX49.tnTj78("bj7u");
                if (fVar == null) {
                    kotlin.jvm.internal.j.n(strTnTj78);
                    throw null;
                }
                fVar.h(this);
                if (bundle != null) {
                    this.f13667q = (OngoingRegistration) AbstractC0617a.D(bundle, numX49.tnTj78("bj7V"), OngoingRegistration.class);
                } else {
                    f fVar2 = this.f13665o;
                    if (fVar2 == null) {
                        kotlin.jvm.internal.j.n(strTnTj78);
                        throw null;
                    }
                    fVar2.j();
                }
                ((NavController) this.f13671u.getValue()).addOnDestinationChangedListener(new C0670c(this));
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bj7S").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6266Z = null;
        Ne.d dVar = (Ne.d) this.f13668r.getValue();
        if (dVar != null) {
            Ne.c cVar = dVar.f4395g;
            if (cVar != null) {
                dVar.f4393b.removeLocationUpdates(cVar);
                dVar.f4395g = null;
            }
            dVar.h.d();
        }
        f fVar = this.f13665o;
        if (fVar == null) {
            kotlin.jvm.internal.j.n(numX49.tnTj78("bj7j"));
            throw null;
        }
        fVar.i();
        ((NavController) this.f13671u.getValue()).removeOnDestinationChangedListener(new C0671d(this));
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                onBackPressed();
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            Callback.onOptionsItemSelected_exit();
            return zOnOptionsItemSelected;
        } catch (Throwable th2) {
            Callback.onOptionsItemSelected_exit();
            throw th2;
        }
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        iKNpI8.jG8Sm1(this);
        super.onPause();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        iKNpI8.r8PTp0(this);
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        kotlin.jvm.internal.j.g(bundle, numX49.tnTj78("bj7d"));
        bundle.putParcelable(numX49.tnTj78("bj7i"), this.f13667q);
        super.onSaveInstanceState(bundle);
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
    }

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.REGISTRATION;
    }

    @Override // Ya.a
    public final CharSequence r() {
        NavDestination destination;
        Integer num = this.f13669s;
        InterfaceC1033d interfaceC1033d = this.f13671u;
        CharSequence label = null;
        if (num != null) {
            NavDestination navDestinationFindNode = ((NavController) interfaceC1033d.getValue()).getGraph().findNode(num.intValue());
            CharSequence label2 = navDestinationFindNode != null ? navDestinationFindNode.getLabel() : null;
            if (label2 != null) {
                return label2;
            }
        }
        NavBackStackEntry previousBackStackEntry = ((NavController) interfaceC1033d.getValue()).getPreviousBackStackEntry();
        if (previousBackStackEntry != null && (destination = previousBackStackEntry.getDestination()) != null) {
            label = destination.getLabel();
        }
        return label == null ? numX49.tnTj78("bj7E") : label;
    }

    @Override // Ya.a
    public final CharSequence s() {
        NavDestination destination;
        CharSequence label;
        NavBackStackEntry currentBackStackEntry = ActivityKt.findNavController(this, R.id.nav_host_fragment).getCurrentBackStackEntry();
        return (currentBackStackEntry == null || (destination = currentBackStackEntry.getDestination()) == null || (label = destination.getLabel()) == null) ? numX49.tnTj78("bj7F") : label;
    }

    @Override // Ya.a
    public final CharSequence t0(NavDirections navDirections) {
        return C.E(this, navDirections, R.id.nav_host_fragment);
    }

    @Override // f9.InterfaceC1478e
    public final void x() {
        n1();
        i.M(this, numX49.tnTj78("bj7H"));
    }
}
