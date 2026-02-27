package com.paymaya.mayaui.userprofileupdate.view.activity.impl;

import B5.i;
import D.C0187u;
import D8.C0193a;
import N5.C0444d;
import N5.C0491z;
import S5.c;
import Zd.b;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.camera.core.impl.a;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.C1232v;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaPersonalDetailsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileUpdateSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUnderWritingRequirementsFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileContactsSelectionFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import kotlin.jvm.internal.j;
import tc.InterfaceC2280a;
import tc.InterfaceC2282c;
import y5.q;
import yc.InterfaceC2524e;
import yc.l;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaUpdateProfileActivity extends q implements InterfaceC2280a, l, InterfaceC2524e, InterfaceC2282c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f14232p = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f14233n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActivityTransition f14234o = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_right);

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if ((fragment instanceof MayaUserProfileContactsSelectionFragment) || (fragment instanceof MayaAllowContactsPermissionFragment)) {
            return;
        }
        t1();
    }

    @Override // tc.InterfaceC2282c
    public final void S(boolean z4) {
        String strD = AbstractC1236z.d(this, MayaUpdateProfileActivity.class);
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = M2.b.Z(2131231472, getString(R.string.maya_label_that_didnt_load_right), getString(R.string.maya_label_connection_issue_split), null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
        mayaErrorDialogFragmentZ.f11850c0 = new C0193a(this, mayaErrorDialogFragmentZ, z4, 7);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), strD);
    }

    public final void V1(UpdateProfileSelectionModel updateProfileSelectionModel) {
        MayaProfileUpdateSingleSelectionBottomSheetDialogFragment mayaProfileUpdateSingleSelectionBottomSheetDialogFragment = new MayaProfileUpdateSingleSelectionBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bV6P"), updateProfileSelectionModel);
        mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.setArguments(bundle);
        mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.show(getSupportFragmentManager(), AbstractC1236z.d(this, MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class));
    }

    public final void W1() {
        String strTnTj78 = numX49.tnTj78("bV6b");
        try {
            Object objNewInstance = MayaPersonalDetailsFragment.class.getDeclaredConstructor(null).newInstance(null);
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_SCREEN", strTnTj78);
            ((Fragment) objNewInstance).setArguments(bundle);
            j.d(objNewInstance);
            AbstractC1236z.g(this, R.id.frame_layout_container, (MayaPersonalDetailsFragment) ((Fragment) objNewInstance));
        } catch (Exception e) {
            throw new RuntimeException(a.g(MayaPersonalDetailsFragment.class, numX49.tnTj78("bV62")), e);
        }
    }

    public final void X1() {
        Intent intent = getIntent();
        String strTnTj78 = numX49.tnTj78("bV6L");
        String stringExtra = intent.getStringExtra(strTnTj78);
        String strTnTj782 = numX49.tnTj78("bV6r");
        if (stringExtra == null) {
            stringExtra = strTnTj782;
        }
        Intent intent2 = getIntent();
        String strTnTj783 = numX49.tnTj78("bV6Z");
        String stringExtra2 = intent2.getStringExtra(strTnTj783);
        if (stringExtra2 == null) {
            stringExtra2 = strTnTj782;
        }
        Intent intent3 = getIntent();
        String strTnTj784 = numX49.tnTj78("bV6k");
        String stringExtra3 = intent3.getStringExtra(strTnTj784);
        if (stringExtra3 == null) {
            stringExtra3 = strTnTj782;
        }
        Intent intent4 = getIntent();
        String strTnTj785 = numX49.tnTj78("bV6B");
        String stringExtra4 = intent4.getStringExtra(strTnTj785);
        if (stringExtra4 != null) {
            strTnTj782 = stringExtra4;
        }
        try {
            Object objNewInstance = MayaUnderWritingRequirementsFragment.class.getDeclaredConstructor(null).newInstance(null);
            Bundle bundle = new Bundle();
            bundle.putString(strTnTj78, stringExtra);
            bundle.putString(strTnTj783, stringExtra2);
            bundle.putString(strTnTj784, stringExtra3);
            bundle.putString(strTnTj785, strTnTj782);
            ((Fragment) objNewInstance).setArguments(bundle);
            j.d(objNewInstance);
            AbstractC1236z.g(this, R.id.frame_layout_container, (MayaUnderWritingRequirementsFragment) ((Fragment) objNewInstance));
        } catch (Exception e) {
            throw new RuntimeException(a.g(MayaUnderWritingRequirementsFragment.class, numX49.tnTj78("bV6u")), e);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // y5.q
    public final ActivityTransition h1() {
        return this.f14234o;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f14234o = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left);
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        O5.a aVar = W4.a.e().B().f4755a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("bV6V"));
        this.f14233n = new b(1);
        super.onCreate(bundle);
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_update_profile, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 28);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                j.d(c0444d);
                Q1(c0444d.f4073d);
                b bVar = this.f14233n;
                String strTnTj78 = numX49.tnTj78("bV6S");
                if (bVar == null) {
                    j.n(strTnTj78);
                    throw null;
                }
                bVar.h(this);
                if (bundle == null) {
                    b bVar2 = this.f14233n;
                    if (bVar2 != null) {
                        bVar2.j();
                        return;
                    } else {
                        j.n(strTnTj78);
                        throw null;
                    }
                }
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bV6j").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        W4.a.e().f6262V = null;
        b bVar = this.f14233n;
        if (bVar == null) {
            j.n(numX49.tnTj78("bV6d"));
            throw null;
        }
        bVar.i();
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            j.g(item, "item");
            if (item.getItemId() == 16908332) {
                Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.frame_layout_container);
                if (fragmentFindFragmentById instanceof MayaUpdateProfileBaseFragment) {
                    ((MayaUpdateProfileBaseFragment) fragmentFindFragmentById).U();
                    onBackPressed();
                } else {
                    getSupportFragmentManager().popBackStack();
                }
                zOnOptionsItemSelected = true;
            } else {
                zOnOptionsItemSelected = super.onOptionsItemSelected(item);
            }
            return zOnOptionsItemSelected;
        } finally {
            Callback.onOptionsItemSelected_exit();
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
    }

    @Override // tc.InterfaceC2282c
    public final void u() {
        n1().a();
    }
}
