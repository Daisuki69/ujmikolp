package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Bb.a;
import D.N;
import H8.b;
import K8.x;
import M8.ViewOnClickListenerC0336b;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycMaintenanceFragment extends MayaBaseFragment implements x {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12565U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final N f12566V = new N(this, 17);

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        a aVar2 = new a(preference, 3, false);
        this.f12565U = aVar2;
        aVar2.h(this);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12566V);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_kyc_maintenance, viewGroup, false);
        int i = R.id.image_view_maintenance_image;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maintenance_image)) != null) {
            i = R.id.text_view_header;
            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header)) != null) {
                i = R.id.text_view_header_subtext;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_header_subtext)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f12565U;
        if (aVar == null) {
            j.n("mMaintenanceFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f10338R = true;
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        b bVar = (b) componentRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) bVar;
        mayaKycActivity.t2();
        mayaKycActivity.v2(R.string.maya_kyc_maintenance_title);
        mayaKycActivity.s2(R.color.maya_primary_white, R.color.maya_shades_of_grey_11);
        mayaKycActivity.o2(R.drawable.maya_ic_close);
        mayaKycActivity.p2(new ViewOnClickListenerC0336b(5, bVar));
        a aVar = this.f12565U;
        if (aVar != null) {
            aVar.j();
        } else {
            j.n("mMaintenanceFragmentPresenter");
            throw null;
        }
    }
}
