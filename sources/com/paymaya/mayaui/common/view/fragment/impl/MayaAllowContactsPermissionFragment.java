package com.paymaya.mayaui.common.view.fragment.impl;

import L9.C0327e;
import N5.C0489y;
import S.b;
import S5.c;
import X6.a;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.j;
import o1.AbstractC1955a;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAllowContactsPermissionFragment extends MayaBaseFragment implements a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public String f11897U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0327e f11898V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Y6.a f11899W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public C0489y f11900X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ActivityResultLauncher f11901Y;

    public static final void G1(MayaAllowContactsPermissionFragment mayaAllowContactsPermissionFragment) {
        C0327e c0327e = mayaAllowContactsPermissionFragment.f11898V;
        if (c0327e == null) {
            j.n("mMayaAllowContactsPermissionFragmentPresenter");
            throw null;
        }
        MayaAllowContactsPermissionFragment mayaAllowContactsPermissionFragment2 = (MayaAllowContactsPermissionFragment) ((a) c0327e.c.get());
        mayaAllowContactsPermissionFragment2.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", mayaAllowContactsPermissionFragment2.requireContext().getPackageName(), null));
        try {
            ActivityResultLauncher activityResultLauncher = mayaAllowContactsPermissionFragment2.f11901Y;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(intent);
            }
        } catch (ActivityNotFoundException unused) {
            yk.a.b();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getActivity() instanceof Y6.a) {
            KeyEventDispatcher.Component activity = getActivity();
            j.e(activity, "null cannot be cast to non-null type com.paymaya.mayaui.common.view.fragment.impl.MayaAllowContactsPermissionFragment.MayaAllowContactsPermissionFragmentListener");
            this.f11899W = (Y6.a) activity;
        }
        O5.a aVar = (O5.a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        C0327e c0327e = new C0327e(21);
        this.f11898V = c0327e;
        c0327e.h(this);
        this.f11901Y = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new Xa.c(this, 4));
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_permission_contacts_screen, viewGroup, false);
        int i = R.id.button_allow_access;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_allow_access);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
            int i4 = R.id.image_view_warning_icon;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_warning_icon)) != null) {
                i4 = R.id.text_view_description;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_description)) != null) {
                    i4 = R.id.text_view_title;
                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title)) != null) {
                        this.f11900X = new C0489y(constraintLayout, button, 3);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
            i = i4;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        if (j.b(this.f11897U, "Product Details")) {
            String strW = AbstractC1213b.w(5);
            j.f(strW, "viewed(...)");
            Map mapH = M.h(new Pair(EnumC1212a.SOURCE_PAGE, this.f11897U), new Pair(EnumC1212a.PERMISSION_GRANTED, String.valueOf(AbstractC1955a.u(getContext(), "android.permission.READ_CONTACTS"))));
            if (t1().e().isShopEventsV2Enabled()) {
                C1219h c1219hE = C1219h.e(strW);
                for (Map.Entry entry : mapH.entrySet()) {
                    c1219hE.k((EnumC1212a) entry.getKey(), (String) entry.getValue());
                }
                o1().b(c1219hE);
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Y6.a aVar = this.f11899W;
        if (aVar != null) {
            aVar.Q(this);
        }
        C0327e c0327e = this.f11898V;
        if (c0327e != null) {
            c0327e.k();
        } else {
            j.n("mMayaAllowContactsPermissionFragmentPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0489y c0489y = this.f11900X;
        j.d(c0489y);
        c0489y.c.setOnClickListener(new b(this, 26));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f11897U = arguments.getString("key_analytics_source_page");
        }
    }
}
