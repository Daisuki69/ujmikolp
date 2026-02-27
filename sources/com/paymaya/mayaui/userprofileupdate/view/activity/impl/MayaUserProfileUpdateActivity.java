package com.paymaya.mayaui.userprofileupdate.view.activity.impl;

import A7.j;
import B5.i;
import D.C0187u;
import D8.C0193a;
import M2.b;
import N5.C0444d;
import N5.C0491z;
import S5.c;
import Y6.a;
import Y6.d;
import android.content.Intent;
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
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.ActivityTransition;
import com.paymaya.domain.model.MfaTencentErrorResult;
import com.paymaya.domain.model.UpdateProfileSelectionModel;
import com.paymaya.mayaui.common.view.dialog.impl.MayaErrorDialogFragment;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.base.MayaUpdateProfileBaseFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaProfileUpdateSingleSelectionBottomSheetDialogFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserContactReferenceFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileContactsSelectionFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserProfileUpdateFragment;
import com.paymaya.mayaui.userprofileupdate.view.fragment.impl.MayaUserUpdateWorkDetailsFragment;
import dOYHB6.aztWy0.hxOD26;
import dOYHB6.speLp8.iKNpI8;
import dOYHB6.tiZVw8.numX49;
import java.util.HashMap;
import o6.C1967a;
import tc.InterfaceC2281b;
import tc.InterfaceC2282c;
import y5.q;
import yc.F;
import yc.p;
import yc.y;

/* JADX INFO: loaded from: classes4.dex */
public final class MayaUserProfileUpdateActivity extends q implements InterfaceC2281b, y, F, p, InterfaceC2282c, d, a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f14235p = 0;
    public C0444d m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f14236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ActivityTransition f14237o = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_right);

    @Override // y5.g
    public final void Q(Fragment fragment) {
        if (!(fragment instanceof MayaUserProfileContactsSelectionFragment) && !(fragment instanceof MayaAllowContactsPermissionFragment)) {
            t1();
            return;
        }
        w1(true);
        x1(true);
        y1(true);
        K1(getString(R.string.maya_label_all_contacts_title));
        T1();
        r1();
        s1();
        U1();
    }

    @Override // tc.InterfaceC2282c
    public final void S(boolean z4) {
        String strD = AbstractC1236z.d(this, MayaUserProfileUpdateActivity.class);
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(2131231472, getString(R.string.maya_label_that_didnt_load_right), getString(R.string.maya_label_connection_issue_split), null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_HEIGHT);
        mayaErrorDialogFragmentZ.f11850c0 = new C0193a(this, mayaErrorDialogFragmentZ, z4, 8);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), strD);
    }

    @Override // Y6.d
    public final void U() {
        AbstractC1236z.f(this);
    }

    public final j V1() {
        j jVar = this.f14236n;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n(numX49.tnTj78("bV6i"));
        throw null;
    }

    public final String W1() {
        Intent intent = getIntent();
        String stringExtra = intent != null ? intent.getStringExtra(numX49.tnTj78("bV6E")) : null;
        return stringExtra == null ? numX49.tnTj78("bV6F") : stringExtra;
    }

    public final void X1(UpdateProfileSelectionModel updateProfileSelectionModel) {
        MayaProfileUpdateSingleSelectionBottomSheetDialogFragment mayaProfileUpdateSingleSelectionBottomSheetDialogFragment = new MayaProfileUpdateSingleSelectionBottomSheetDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable(numX49.tnTj78("bV6H"), updateProfileSelectionModel);
        mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.setArguments(bundle);
        mayaProfileUpdateSingleSelectionBottomSheetDialogFragment.show(getSupportFragmentManager(), AbstractC1236z.d(this, MayaProfileUpdateSingleSelectionBottomSheetDialogFragment.class));
    }

    public final void Y1(EnumC1215d enumC1215d, EnumC1216e enumC1216e) {
        C1219h c1219h = new C1219h();
        HashMap map = c1219h.j;
        c1219h.p(enumC1215d);
        c1219h.r(enumC1216e);
        c1219h.n(17);
        c1219h.t(EnumC1217f.BACK);
        c1219h.i();
        String str = (String) V1().f;
        String strTnTj78 = numX49.tnTj78("bV6O");
        if (str == null) {
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            map.put(strTnTj78, numX49.tnTj78("bV6Q"));
            k1().c(this, c1219h);
        } else {
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            String strTnTj782 = (String) V1().f;
            if (strTnTj782 == null) {
                strTnTj782 = numX49.tnTj78("bV6t");
            }
            map.put(strTnTj78, strTnTj782);
            k1().c(this, c1219h);
        }
    }

    public final void Z1(String str, String str2) {
        String strTnTj78;
        kotlin.jvm.internal.j.g(str2, numX49.tnTj78("bV6U"));
        String strD = AbstractC1236z.d(this, MayaUserProfileUpdateActivity.class);
        boolean zEquals = str.equals(numX49.tnTj78("bV6e"));
        String strTnTj782 = numX49.tnTj78("bV68");
        if (zEquals) {
            strTnTj78 = getString(R.string.maya_user_profile_update_contact_duplication_warning, str2);
            kotlin.jvm.internal.j.f(strTnTj78, strTnTj782);
        } else if (str.equals(numX49.tnTj78("bV6C"))) {
            strTnTj78 = getString(R.string.maya_contact_reference_contact_duplication_warning, str2);
            kotlin.jvm.internal.j.f(strTnTj78, strTnTj782);
        } else {
            strTnTj78 = numX49.tnTj78("bV64");
        }
        MayaErrorDialogFragment mayaErrorDialogFragmentZ = b.Z(2131231443, null, strTnTj78, null, null, false, null, null, false, TypedValues.PositionType.TYPE_PERCENT_X);
        mayaErrorDialogFragmentZ.f11850c0 = new C1967a(mayaErrorDialogFragmentZ, 20);
        mayaErrorDialogFragmentZ.show(getSupportFragmentManager(), strD);
    }

    public final void a2() {
        String strW1 = W1();
        try {
            Object objNewInstance = MayaUserContactReferenceFragment.class.getDeclaredConstructor(null).newInstance(null);
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_SCREEN", strW1);
            ((Fragment) objNewInstance).setArguments(bundle);
            kotlin.jvm.internal.j.d(objNewInstance);
            AbstractC1236z.g(this, R.id.frame_layout_container, (MayaUserContactReferenceFragment) ((Fragment) objNewInstance));
        } catch (Exception e) {
            throw new RuntimeException(androidx.camera.core.impl.a.g(MayaUserContactReferenceFragment.class, numX49.tnTj78("bV6o")), e);
        }
    }

    public final void b2() {
        String strW1 = W1();
        try {
            Object objNewInstance = MayaUserProfileUpdateFragment.class.getDeclaredConstructor(null).newInstance(null);
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_SCREEN", strW1);
            ((Fragment) objNewInstance).setArguments(bundle);
            kotlin.jvm.internal.j.d(objNewInstance);
            AbstractC1236z.g(this, R.id.frame_layout_container, (MayaUserProfileUpdateFragment) ((Fragment) objNewInstance));
        } catch (Exception e) {
            throw new RuntimeException(androidx.camera.core.impl.a.g(MayaUserProfileUpdateFragment.class, numX49.tnTj78("bV6K")), e);
        }
    }

    public final void c2() {
        String strW1 = W1();
        try {
            Object objNewInstance = MayaUserUpdateWorkDetailsFragment.class.getDeclaredConstructor(null).newInstance(null);
            Bundle bundle = new Bundle();
            bundle.putString("SOURCE_SCREEN", strW1);
            ((Fragment) objNewInstance).setArguments(bundle);
            kotlin.jvm.internal.j.d(objNewInstance);
            AbstractC1236z.g(this, R.id.frame_layout_container, (MayaUserUpdateWorkDetailsFragment) ((Fragment) objNewInstance));
        } catch (Exception e) {
            throw new RuntimeException(androidx.camera.core.impl.a.g(MayaUserUpdateWorkDetailsFragment.class, numX49.tnTj78("bV6w")), e);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean zQBE3G5 = hxOD26.qBE3G5(motionEvent);
        return !zQBE3G5 ? super.dispatchTouchEvent(motionEvent) : zQBE3G5;
    }

    @Override // Y6.a
    public final void g() {
        AbstractC1236z.h(this, R.id.frame_layout_container, new MayaUserProfileContactsSelectionFragment());
    }

    @Override // y5.q
    public final ActivityTransition h1() {
        return this.f14237o;
    }

    @Override // Y6.a
    public final void k() {
        if (getSupportFragmentManager().findFragmentById(R.id.frame_layout_container) instanceof MayaAllowContactsPermissionFragment) {
            AbstractC1236z.e(this, MayaAllowContactsPermissionFragment.class, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        this.f14237o = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left);
        super.onBackPressed();
    }

    @Override // y5.q, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        iKNpI8.xCZPS1(this, bundle);
        super.onCreate(bundle);
        O5.a aVar = W4.a.e().B().f4755a;
        this.f21073d = (C1220i) aVar.f4716g.get();
        this.e = (com.paymaya.data.preference.a) aVar.e.get();
        this.f = (i) aVar.f4659D.get();
        this.f21074g = (c) aVar.f4724k.get();
        this.h = (C0187u) aVar.f.get();
        this.i = (C1232v) aVar.f4663F.get();
        kotlin.jvm.internal.j.g((com.paymaya.data.preference.a) aVar.e.get(), numX49.tnTj78("bV6c"));
        this.f14236n = new j();
        View viewInflate = getLayoutInflater().inflate(R.layout.maya_activity_user_profile_update, (ViewGroup) null, false);
        int i = R.id.frame_layout_container;
        FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.frame_layout_container);
        if (frameLayout != null) {
            i = R.id.toolbar;
            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.toolbar);
            if (viewFindChildViewById != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                this.m = new C0444d(constraintLayout, frameLayout, C0491z.a(viewFindChildViewById), 29);
                setContentView(constraintLayout);
                C0444d c0444d = this.m;
                kotlin.jvm.internal.j.d(c0444d);
                Q1(c0444d.f4073d);
                V1().h(this);
                if (bundle == null) {
                    V1().j();
                }
                getSupportFragmentManager().addOnBackStackChangedListener(new androidx.preference.a(this, 1));
                return;
            }
        }
        throw new NullPointerException(numX49.tnTj78("bV6m").concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // y5.q, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        iKNpI8.gRLNd5(this);
        super.onDestroy();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem item) {
        boolean zOnOptionsItemSelected;
        Callback.onOptionsItemSelected_enter(item);
        try {
            kotlin.jvm.internal.j.g(item, "item");
            if (item.getItemId() == 16908332) {
                Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.frame_layout_container);
                if (fragmentFindFragmentById instanceof MayaUpdateProfileBaseFragment) {
                    EnumC1216e enumC1216eU = ((MayaUpdateProfileBaseFragment) fragmentFindFragmentById).U();
                    if (enumC1216eU != null) {
                        Y1(((MayaUpdateProfileBaseFragment) fragmentFindFragmentById).u1(), enumC1216eU);
                    }
                    if (((String) V1().f) == null) {
                        setResult(MfaTencentErrorResult.TENCENT_ERROR_USER_STOPS);
                        this.f14237o = new ActivityTransition(R.anim.maya_slide_in_from_right, R.anim.maya_slide_out_to_right, R.anim.maya_slide_out_to_left, R.anim.maya_slide_in_from_left);
                        finish();
                    } else {
                        String str = (String) V1().f;
                        if (str == null) {
                            str = "https://paymaya.com/app/";
                        }
                        n1();
                        i.k(this, str);
                    }
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
