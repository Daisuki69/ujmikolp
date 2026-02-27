package com.paymaya.mayaui.missions.view.activity.impl;

import C9.a;
import D.C0187u;
import G9.b;
import G9.c;
import G9.f;
import G9.i;
import G9.k;
import G9.m;
import N5.C0444d;
import N5.C0491z;
import Y6.e;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.MissionV2;
import com.paymaya.domain.model.MissionV2Action;
import com.paymaya.mayaui.common.view.dialog.impl.MayaLoadingDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaMaintenanceFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsDetailsFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsEnterCodeBottomSheetFragment;
import com.paymaya.mayaui.missions.view.fragment.impl.MayaMissionsPreviewBottomSheetFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaMissionsActivity extends q implements a, e, f, i, k, b, m, c, G9.e {
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Ae.a f12954n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MayaLoadingDialogFragment f12955o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MissionV2 f12956p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MissionV2Action f12957q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final EnumC1215d f12958r = EnumC1215d.MISSIONS;

    @Override // y5.g
    public final void Q(Fragment fragment) {
        w1(true);
        x1(true);
        K1(getString(R.string.maya_label_missions));
    }

    public final void V1(MissionV2 missionV2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjCP"), missionV2);
        MayaMissionsPreviewBottomSheetFragment mayaMissionsPreviewBottomSheetFragment = new MayaMissionsPreviewBottomSheetFragment();
        mayaMissionsPreviewBottomSheetFragment.setArguments(bundle);
        mayaMissionsPreviewBottomSheetFragment.show(getSupportFragmentManager(), mayaMissionsPreviewBottomSheetFragment.getTag());
    }

    public final void W1(String str) {
        String string = getString(R.string.maya_label_that_didnt_load_right);
        if (str == null) {
            str = getString(R.string.maya_label_server_issue);
            j.f(str, numX49.tnTj78("bjCb"));
        }
        M2.b.Z(0, string, str, null, null, false, null, null, false, TypedValues.PositionType.TYPE_SIZE_PERCENT).show(getSupportFragmentManager(), numX49.tnTj78("bjC2"));
    }

    public final void X1(MissionV2 missionV2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjCL"), missionV2);
        MayaMissionsDetailsFragment mayaMissionsDetailsFragment = new MayaMissionsDetailsFragment();
        mayaMissionsDetailsFragment.setArguments(bundle);
        AbstractC1236z.i(this, R.id.maya_activity_missions_fragment_container, mayaMissionsDetailsFragment, R.anim.pma_slide_in_from_right, R.anim.pma_slide_out_to_left, R.anim.pma_slide_in_from_left, R.anim.pma_slide_out_to_right);
    }

    public final void Y1(MissionV2 missionV2, MissionV2Action missionV2Action) {
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bjCr"), missionV2);
        bundle.putParcelable(numX49.tnTj78("bjCZ"), missionV2Action);
        MayaMissionsEnterCodeBottomSheetFragment mayaMissionsEnterCodeBottomSheetFragment = new MayaMissionsEnterCodeBottomSheetFragment();
        mayaMissionsEnterCodeBottomSheetFragment.setArguments(bundle);
        mayaMissionsEnterCodeBottomSheetFragment.show(getSupportFragmentManager(), mayaMissionsEnterCodeBottomSheetFragment.getTag());
    }

    public final void Z1() {
        MayaMaintenanceFragment mayaMaintenanceFragmentA0 = M2.b.a0(null, 7);
        C1220i c1220iK1 = k1();
        C1219h c1219hD = C1219h.d(this.f12958r);
        c1219hD.r(EnumC1216e.MAINTENANCE_SCREEN);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.MISSIONS);
        c1220iK1.c(this, c1219hD);
        AbstractC1236z.g(this, R.id.maya_activity_missions_fragment_container, mayaMaintenanceFragmentA0);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().s().f4753a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (B5.i) aVar.f4659D.get();
        this.f21074g = (S5.c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        this.f12954n = new Ae.a(2);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_missions, (ViewGroup) null, false);
        int i = R.id.maya_activity_missions_fragment_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_activity_missions_fragment_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 14);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                Ae.a aVar2 = this.f12954n;
                String strTnTj78 = numX49.tnTj78("bjCk");
                if (aVar2 == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                aVar2.h(this);
                if (bundle == null) {
                    Ae.a aVar3 = this.f12954n;
                    if (aVar3 != null) {
                        aVar3.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bjCB").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6286w = null;
        Ae.a aVar = this.f12954n;
        if (aVar == null) {
            j.n(numX49.tnTj78("bjCu"));
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
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
        return this.f12958r;
    }
}
