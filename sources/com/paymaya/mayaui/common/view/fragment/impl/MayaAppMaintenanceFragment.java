package com.paymaya.mayaui.common.view.fragment.impl;

import G5.t;
import N5.C0450f;
import O5.a;
import Q6.i;
import Uh.d;
import X6.b;
import Y6.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.common.internal.ImagesContract;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.common.view.activity.impl.MayaMaintenanceActivity;
import com.paymaya.mayaui.common.view.fragment.impl.MayaAppMaintenanceFragment;
import kotlin.jvm.internal.j;
import v.AbstractC2329d;
import zj.C2578C;

/* JADX INFO: loaded from: classes4.dex */
public class MayaAppMaintenanceFragment extends MayaBaseFragment implements b {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0450f f11902U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public i f11903V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public c f11904W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HtmlTextView f11905X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public ConstraintLayout f11906Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public HtmlTextView f11907Z;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().i();
        this.f10338R = true;
        this.f11904W = (c) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        i iVar = new i((S5.c) aVar.f4724k.get(), (d) aVar.f4748y.get());
        this.f11903V = iVar;
        iVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_app_maintenance, viewGroup, false);
        int i = R.id.image_view_maintenance_image;
        if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maintenance_image)) != null) {
            i = R.id.image_view_maya_banner;
            if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_maya_banner)) != null) {
                i = R.id.layout_help_center_card_container;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.layout_help_center_card_container);
                if (viewFindChildViewById != null) {
                    C0450f c0450fB = C0450f.b(viewFindChildViewById);
                    int i4 = R.id.text_view_maintenance_description;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maintenance_description);
                    if (htmlTextView != null) {
                        i4 = R.id.text_view_maintenance_title;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_maintenance_title)) != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                            this.f11902U = new C0450f(constraintLayout, c0450fB, htmlTextView, 6);
                            j.f(constraintLayout, "getRoot(...)");
                            return constraintLayout;
                        }
                    }
                    i = i4;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        i iVar = this.f11903V;
        if (iVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        iVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        A1(c1219h);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0450f c0450f = this.f11902U;
        j.d(c0450f);
        this.f11906Y = (ConstraintLayout) ((C0450f) c0450f.f4087b).c;
        C0450f c0450f2 = this.f11902U;
        j.d(c0450f2);
        this.f11905X = (HtmlTextView) c0450f2.f4088d;
        C0450f c0450f3 = this.f11902U;
        j.d(c0450f3);
        this.f11907Z = (HtmlTextView) ((C0450f) c0450f3.f4087b).f4087b;
        C0450f c0450f4 = this.f11902U;
        j.d(c0450f4);
        ((ImageView) ((C0450f) c0450f4.f4087b).f4088d).setImageResource(2131231530);
        HtmlTextView htmlTextView = this.f11907Z;
        if (htmlTextView == null) {
            j.n("htmlTextViewHelpCenterDescription");
            throw null;
        }
        htmlTextView.setTextHTML(getString(R.string.maya_html_maintenance_help_center_description));
        i iVar = this.f11903V;
        if (iVar == null) {
            j.n("mFragmentPresenter");
            throw null;
        }
        iVar.j();
        ConstraintLayout constraintLayout = this.f11906Y;
        if (constraintLayout == null) {
            j.n("viewHelpCenterContainer");
            throw null;
        }
        constraintLayout.setOnClickListener(new S.b(this, 27));
        HtmlTextView htmlTextView2 = this.f11905X;
        if (htmlTextView2 == null) {
            j.n("mTextViewDescription");
            throw null;
        }
        final int i = 0;
        htmlTextView2.setOnLinkClickListener(new t(this) { // from class: Y6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAppMaintenanceFragment f6760b;

            {
                this.f6760b = this;
            }

            @Override // G5.t
            public final void m(String str, View view2) {
                MayaAppMaintenanceFragment mayaAppMaintenanceFragment = this.f6760b;
                switch (i) {
                    case 0:
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.LINK);
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219hH.j.put(ImagesContract.URL, str != null ? C2578C.e0(100, str) : null);
                        c1219hH.i();
                        mayaAppMaintenanceFragment.A1(c1219hH);
                        c cVar = mayaAppMaintenanceFragment.f11904W;
                        if (cVar != null) {
                            MayaMaintenanceActivity mayaMaintenanceActivity = (MayaMaintenanceActivity) cVar;
                            mayaMaintenanceActivity.n1();
                            B5.i.f(mayaMaintenanceActivity, str);
                        }
                        break;
                    default:
                        c cVar2 = mayaAppMaintenanceFragment.f11904W;
                        if (cVar2 != null) {
                            MayaMaintenanceActivity mayaMaintenanceActivity2 = (MayaMaintenanceActivity) cVar2;
                            mayaMaintenanceActivity2.n1().x(mayaMaintenanceActivity2, "https://support.maya.ph/s/", Boolean.FALSE, true);
                        }
                        break;
                }
            }
        });
        HtmlTextView htmlTextView3 = this.f11907Z;
        if (htmlTextView3 == null) {
            j.n("htmlTextViewHelpCenterDescription");
            throw null;
        }
        final int i4 = 1;
        htmlTextView3.setOnLinkClickListener(new t(this) { // from class: Y6.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaAppMaintenanceFragment f6760b;

            {
                this.f6760b = this;
            }

            @Override // G5.t
            public final void m(String str, View view2) {
                MayaAppMaintenanceFragment mayaAppMaintenanceFragment = this.f6760b;
                switch (i4) {
                    case 0:
                        C1219h c1219hH = AbstractC2329d.h(17);
                        c1219hH.t(EnumC1217f.LINK);
                        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
                        c1219hH.j.put(ImagesContract.URL, str != null ? C2578C.e0(100, str) : null);
                        c1219hH.i();
                        mayaAppMaintenanceFragment.A1(c1219hH);
                        c cVar = mayaAppMaintenanceFragment.f11904W;
                        if (cVar != null) {
                            MayaMaintenanceActivity mayaMaintenanceActivity = (MayaMaintenanceActivity) cVar;
                            mayaMaintenanceActivity.n1();
                            B5.i.f(mayaMaintenanceActivity, str);
                        }
                        break;
                    default:
                        c cVar2 = mayaAppMaintenanceFragment.f11904W;
                        if (cVar2 != null) {
                            MayaMaintenanceActivity mayaMaintenanceActivity2 = (MayaMaintenanceActivity) cVar2;
                            mayaMaintenanceActivity2.n1().x(mayaMaintenanceActivity2, "https://support.maya.ph/s/", Boolean.FALSE, true);
                        }
                        break;
                }
            }
        });
    }
}
