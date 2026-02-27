package com.paymaya.mayaui.banktransfer.view.activity.impl;

import D.C0187u;
import Ke.d;
import Lb.a;
import N5.C0444d;
import N5.C0491z;
import S5.c;
import W6.b;
import W6.k;
import Y6.e;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.internal.ads.AbstractC1173g;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.AttributionSource;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.BankTransferV3;
import com.paymaya.domain.model.BankTransferV3CreateResponse;
import com.paymaya.domain.model.Favorite;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1269l;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferConfirmationFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferFormFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferListFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferOTPFragment;
import com.paymaya.mayaui.banktransfer.view.fragment.impl.MayaBankTransferReceiptFragment;
import com.paymaya.mayaui.common.view.dialog.impl.MayaPostTransactionBottomSheetDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import com.paymaya.mayaui.favorite.view.activity.impl.MayaAddFavoriteActivity;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import p6.InterfaceC2014a;
import s6.InterfaceC2244e;
import t6.InterfaceC2270a;
import t6.InterfaceC2275f;
import t6.h;
import t6.i;
import t6.j;
import y5.InterfaceC2511c;
import y5.g;
import y5.l;

/* JADX INFO: loaded from: classes4.dex */
public class MayaBankTransferActivity extends l implements InterfaceC2014a, g, h, InterfaceC2275f, InterfaceC2270a, i, b, k, j, e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f11530s = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C0444d f11531n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f11532o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Fragment f11533p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MayaPostTransactionBottomSheetDialogFragment f11534q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f11535r;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        String strTnTj78;
        Fragment fragment2 = this.f11533p;
        if (fragment2 instanceof MayaBankTransferFormFragment) {
            strTnTj78 = numX49.tnTj78("bt6P");
        } else if (fragment2 instanceof MayaBankTransferConfirmationFragment) {
            strTnTj78 = numX49.tnTj78("bt6b");
        } else if (fragment2 instanceof MayaBankTransferListFragment) {
            strTnTj78 = numX49.tnTj78("bt62");
        } else if (fragment2 instanceof MayaBankTransferOTPFragment) {
            strTnTj78 = numX49.tnTj78("bt6L");
        } else {
            Bundle extras = getIntent().getExtras();
            if (extras == null || (strTnTj78 = extras.getString(numX49.tnTj78("bt6r"))) == null) {
                strTnTj78 = numX49.tnTj78("bt6Z");
            }
        }
        this.f11535r = strTnTj78;
        this.f11533p = fragment;
        w1(true);
        x1(true);
        y1(true);
        I1(17);
        if (fragment instanceof MayaBankTransferListFragment) {
            K1(getString(R.string.maya_label_bank_transfer));
            r1();
            s1();
            t1();
            return;
        }
        if (fragment instanceof MayaBankTransferFormFragment) {
            t1();
            E1(50);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_50_percent));
            S1();
            return;
        }
        if (fragment instanceof MayaBankTransferConfirmationFragment) {
            t1();
            E1(100);
            R1();
            G1(getString(R.string.maya_label_toolbar_steps_100_percent));
            S1();
            return;
        }
        if (fragment instanceof MayaBankTransferOTPFragment) {
            K1(getString(R.string.maya_label_one_time_pin));
            t1();
            r1();
            s1();
            return;
        }
        if (fragment instanceof MayaBankTransferReceiptFragment) {
            w1(false);
        } else if (fragment instanceof MayaMaintenanceFragment) {
            K1(getString(R.string.maya_label_bank_transfer));
            T1();
            r1();
            s1();
        }
    }

    @Override // y5.n
    public final void Q0(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt6k"));
        n1();
        B5.i.l(this, str, AttributionSource.f10368d);
    }

    public final void X1() {
        if (p1().e().isAppEventV2BankTransferEnabled()) {
            EnumC1217f enumC1217f = EnumC1217f.ACCEPT_CONFIRM_CREDENTIAL;
            a2(d.a(numX49.tnTj78("bt6B")), numX49.tnTj78("bt6u"));
        } else {
            C1220i c1220iK1 = k1();
            C1219h c1219hD = C1219h.d(EnumC1215d.BANK_TRANSFER);
            c1219hD.r(EnumC1216e.PROCESSING);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.DONE);
            c1219hD.i();
            c1220iK1.c(this, c1219hD);
        }
        n1().q(this);
    }

    public final a Y1() {
        a aVar = this.f11532o;
        if (aVar != null) {
            return aVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bt6V"));
        throw null;
    }

    public final void Z1(String str, String str2, String str3) {
        if (p1().e().isAppEventV2BankTransferEnabled()) {
            C1220i c1220iK1 = k1();
            EnumC1212a enumC1212a = EnumC1212a.BUTTON;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String strTnTj78 = numX49.tnTj78("bt6S");
            sb2.append(strTnTj78);
            sb2.append(enumC1212a);
            sb2.append(strTnTj78);
            sb2.append(AbstractC1173g.G(18));
            C1219h c1219hE = C1219h.e(sb2.toString());
            HashMap map = c1219hE.j;
            map.put(numX49.tnTj78("bt6j"), str2);
            map.put(numX49.tnTj78("bt6d"), numX49.tnTj78("bt6i"));
            map.put(numX49.tnTj78("bt6E"), str3);
            c1220iK1.b(c1219hE);
        }
    }

    @Override // y5.j
    public final void a(PayMayaError payMayaError, String str) {
        M2.b.Z(0, null, null, null, null, false, payMayaError, null, false, 447).show(getSupportFragmentManager(), numX49.tnTj78("bt6F"));
    }

    public final void a2(String str, String str2) {
        C1220i c1220iK1 = k1();
        C1219h c1219hE = C1219h.e(numX49.tnTj78("bt6H") + EnumC1212a.BUTTON + numX49.tnTj78("bt6O") + AbstractC1173g.G(18));
        HashMap map = c1219hE.j;
        map.put(numX49.tnTj78("bt6Q"), numX49.tnTj78("bt6t"));
        map.put(numX49.tnTj78("bt6U"), str);
        map.put(numX49.tnTj78("bt6e"), str2);
        c1220iK1.b(c1219hE);
    }

    public final void b2(Favorite favorite) {
        String strTnTj78 = numX49.tnTj78("bt68");
        kotlin.jvm.internal.j.g(favorite, strTnTj78);
        MayaBankTransferFormFragment mayaBankTransferFormFragment = new MayaBankTransferFormFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(strTnTj78, favorite);
        mayaBankTransferFormFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.frame_layout_container, mayaBankTransferFormFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }

    public final void c2(BankTransferV3 bankTransferV3) {
        kotlin.jvm.internal.j.g(bankTransferV3, numX49.tnTj78("bt6C"));
        AbstractC1236z.e(this, MayaBankTransferConfirmationFragment.class, false);
        MayaBankTransferConfirmationFragment mayaBankTransferConfirmationFragment = (MayaBankTransferConfirmationFragment) getSupportFragmentManager().findFragmentByTag(AbstractC1236z.d(this, MayaBankTransferConfirmationFragment.class));
        if (mayaBankTransferConfirmationFragment != null) {
            mayaBankTransferConfirmationFragment.f11548g0 = new com.squareup.wire.internal.a(bankTransferV3, 17);
        }
    }

    public final void d2(BankTransferV3CreateResponse bankTransferV3CreateResponse) {
        MayaBankTransferOTPFragment mayaBankTransferOTPFragment = new MayaBankTransferOTPFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bt64"), bankTransferV3CreateResponse);
        mayaBankTransferOTPFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.frame_layout_container, mayaBankTransferOTPFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    public final void e2(BankTransferV3 bankTransferV3) {
        if (p1().e().isAppEventV2BankTransferEnabled()) {
            a2(numX49.tnTj78("bt6o"), numX49.tnTj78("bt6K"));
        } else {
            C1220i c1220iK1 = k1();
            C1219h c1219hD = C1219h.d(EnumC1215d.BANK_TRANSFER);
            c1219hD.r(EnumC1216e.PROCESSING);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.RECEIPT);
            c1219hD.i();
            c1220iK1.c(this, c1219hD);
        }
        FavoriteDetails favoriteDetails = (FavoriteDetails) Y1().h;
        MayaBankTransferReceiptFragment mayaBankTransferReceiptFragment = new MayaBankTransferReceiptFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bt6w"), bankTransferV3);
        bundle.putParcelable(numX49.tnTj78("bt6c"), favoriteDetails);
        mayaBankTransferReceiptFragment.setArguments(bundle);
        AbstractC1236z.h(this, R.id.frame_layout_container, mayaBankTransferReceiptFragment);
    }

    @Override // androidx.core.app.ComponentActivity, y5.n
    public final void f() {
        Bundle extras = getIntent().getExtras();
        if (!(extras != null ? extras.getBoolean(numX49.tnTj78("bt6m")) : false)) {
            Bundle extras2 = getIntent().getExtras();
            if (!(extras2 != null ? extras2.getBoolean(numX49.tnTj78("bt6D")) : false)) {
                finish();
                return;
            }
        }
        n1();
        B5.i.j(this);
    }

    @Override // W6.k
    public final void k0() {
        if (p1().e().isAppEventV2BankTransferEnabled()) {
            a2(numX49.tnTj78("bt6h"), numX49.tnTj78("bt6M"));
        } else {
            C1220i c1220iK1 = k1();
            C1219h c1219hD = C1219h.d(EnumC1215d.BANK_TRANSFER);
            c1219hD.r(EnumC1216e.PROCESSING);
            c1219hD.n(17);
            c1219hD.t(EnumC1217f.FAVORITES);
            c1219hD.i();
            c1220iK1.c(this, c1219hD);
        }
        n1();
        FavoriteDetails favoriteDetails = (FavoriteDetails) Y1().h;
        Intent intent = new Intent(this, (Class<?>) MayaAddFavoriteActivity.class);
        intent.putExtra(numX49.tnTj78("bt6N"), favoriteDetails);
        startActivityForResult(intent, 600);
    }

    @Override // y5.n
    public final void l(String str) {
        kotlin.jvm.internal.j.g(str, numX49.tnTj78("bt66"));
        n1().k0(this, str);
    }

    @Override // y5.j
    public final void o(String str, String str2) {
        M2.b.Z(0, null, str2, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_Y).show(getSupportFragmentManager(), numX49.tnTj78("bt6a"));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i4, Intent intent) {
        super.onActivityResult(i, i4, intent);
        if (i == 600) {
            MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment = this.f11534q;
            if (mayaPostTransactionBottomSheetDialogFragment != null) {
                if (i4 == 6) {
                    Y1().h = null;
                    MayaPostTransactionBottomSheetDialogFragment mayaPostTransactionBottomSheetDialogFragment2 = this.f11534q;
                    if (mayaPostTransactionBottomSheetDialogFragment2 != null) {
                        mayaPostTransactionBottomSheetDialogFragment2.s1();
                    }
                } else if (i4 == 7 && mayaPostTransactionBottomSheetDialogFragment != null) {
                    mayaPostTransactionBottomSheetDialogFragment.t1();
                }
            }
            ActivityResultCaller activityResultCaller = this.f11533p;
            if (activityResultCaller instanceof InterfaceC2244e) {
                kotlin.jvm.internal.j.e(activityResultCaller, numX49.tnTj78("bt6X"));
                InterfaceC2244e interfaceC2244e = (InterfaceC2244e) activityResultCaller;
                if (i4 == 6) {
                    ((MayaBankTransferReceiptFragment) interfaceC2244e).T1();
                } else {
                    if (i4 != 7) {
                        return;
                    }
                    if (intent != null) {
                    }
                    ((MayaBankTransferReceiptFragment) interfaceC2244e).k2();
                }
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        ActivityResultCaller activityResultCaller = this.f11533p;
        if (activityResultCaller instanceof InterfaceC2511c) {
            kotlin.jvm.internal.j.e(activityResultCaller, numX49.tnTj78("bt63"));
            if (((InterfaceC2511c) activityResultCaller).e0()) {
                return;
            }
        }
        Fragment fragment = this.f11533p;
        boolean z4 = fragment instanceof MayaBankTransferFormFragment;
        String strTnTj78 = numX49.tnTj78("bt6y");
        String strTnTj782 = numX49.tnTj78("bt6v");
        if (!z4) {
            if (fragment instanceof MayaBankTransferListFragment) {
                Z1(numX49.tnTj78("bt60"), strTnTj78, numX49.tnTj78("bt6p"));
                super.onBackPressed();
                return;
            } else if (!(fragment instanceof MayaBankTransferConfirmationFragment)) {
                super.onBackPressed();
                return;
            } else {
                Z1(numX49.tnTj78("bt6f"), numX49.tnTj78("bt6g"), strTnTj782);
                super.onBackPressed();
                return;
            }
        }
        Bundle extras = getIntent().getExtras();
        String strTnTj783 = numX49.tnTj78("bt67");
        boolean z5 = extras != null ? extras.getBoolean(strTnTj783) : false;
        String strTnTj784 = numX49.tnTj78("bt6A");
        if (!z5) {
            Bundle extras2 = getIntent().getExtras();
            if (!(extras2 != null ? extras2.getBoolean(numX49.tnTj78("bt6Y")) : false)) {
                Z1(strTnTj784, strTnTj782, strTnTj78);
                super.onBackPressed();
                return;
            }
        }
        Bundle extras3 = getIntent().getExtras();
        Z1(strTnTj784, strTnTj782, extras3 != null ? extras3.getBoolean(strTnTj783) : false ? numX49.tnTj78("bt6T") : numX49.tnTj78("bt6R"));
        finish();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().h().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        C1269l c1269lF = aVar.f();
        com.paymaya.data.preference.a aVar2 = (com.paymaya.data.preference.a) aVar.e.get();
        kotlin.jvm.internal.j.g(aVar2, numX49.tnTj78("bt61"));
        this.f11532o = new a(c1269lF, aVar2);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_bank_transfer, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.f11531n = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 3);
                setContentView(constraintLayout);
                C0444d c0444d = this.f11531n;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                Y1().h(this);
                if (bundle == null) {
                    Y1().j();
                    return;
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bt6n").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6255O = null;
        Y1().i();
        super.onDestroy();
        this.f11534q = null;
        this.f11531n = null;
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                g1();
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

    @Override // y5.q
    public final EnumC1215d q1() {
        return EnumC1215d.BANK_TRANSFER;
    }
}
