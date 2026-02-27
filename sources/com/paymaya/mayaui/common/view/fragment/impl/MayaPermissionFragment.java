package com.paymaya.mayaui.common.view.fragment.impl;

import L9.C0327e;
import N5.C0453g;
import O5.a;
import S.b;
import S5.c;
import X6.e;
import Y6.f;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.PermissionChecker;
import androidx.viewbinding.ViewBindings;
import cj.C1129o;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.common.view.activity.impl.MayaPermissionActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaPermissionFragment extends MayaBaseFragment implements e {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f11920U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Group f11921V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Group f11922W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0327e f11923X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public f f11924Y;

    public final boolean G1() {
        String[] stringArrayExtra;
        f fVar = this.f11924Y;
        if (fVar != null) {
            Intent intent = ((MayaPermissionActivity) fVar).getIntent();
            if (intent == null || (stringArrayExtra = intent.getStringArrayExtra("permissions")) == null) {
                stringArrayExtra = new String[0];
            }
            if (C1129o.p(stringArrayExtra, "android.permission.CAMERA")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11924Y = (f) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C0327e c0327e = new C0327e(28);
        this.f11923X = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_permission_screen, viewGroup, false);
        int i = R.id.group_camera_permission;
        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_camera_permission);
        if (group != null) {
            i = R.id.group_storage_permission;
            Group group2 = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_storage_permission);
            if (group2 != null) {
                i = R.id.image_view_camera_icon;
                if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_camera_icon)) != null) {
                    i = R.id.image_view_storage_icon;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_storage_icon)) != null) {
                        i = R.id.text_view_camera_permission;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_camera_permission)) != null) {
                            i = R.id.text_view_camera_permission_spiel;
                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_camera_permission_spiel)) != null) {
                                i = R.id.text_view_open_phone_settings;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_open_phone_settings);
                                if (textView != null) {
                                    i = R.id.text_view_permission_title;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_permission_title)) != null) {
                                        i = R.id.text_view_storage_permission;
                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_storage_permission)) != null) {
                                            i = R.id.text_view_storage_permission_spiel;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_storage_permission_spiel)) != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                                this.f11920U = new C0453g(13, constraintLayout, group, group2, textView);
                                                j.f(constraintLayout, "getRoot(...)");
                                                return constraintLayout;
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f11923X;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        f fVar;
        super.onResume();
        C0327e c0327e = this.f11923X;
        if (c0327e == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        c0327e.m();
        c0327e.n();
        ((e) c0327e.c.get()).getClass();
        if ((!((MayaPermissionFragment) ((e) c0327e.c.get())).G1() || PermissionChecker.checkSelfPermission(((MayaPermissionFragment) ((e) c0327e.c.get())).requireContext(), "android.permission.CAMERA") == 0) && (fVar = ((MayaPermissionFragment) ((e) c0327e.c.get())).f11924Y) != null) {
            MayaPermissionActivity mayaPermissionActivity = (MayaPermissionActivity) fVar;
            mayaPermissionActivity.setResult(11);
            mayaPermissionActivity.finish();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f11920U;
        j.d(c0453g);
        this.f11921V = (Group) c0453g.c;
        C0453g c0453g2 = this.f11920U;
        j.d(c0453g2);
        this.f11922W = (Group) c0453g2.f4095d;
        C0453g c0453g3 = this.f11920U;
        j.d(c0453g3);
        ((TextView) c0453g3.e).setOnClickListener(new b(this, 28));
        C0327e c0327e = this.f11923X;
        if (c0327e != null) {
            c0327e.j();
        } else {
            j.n("mFragmentPresenter");
            throw null;
        }
    }
}
