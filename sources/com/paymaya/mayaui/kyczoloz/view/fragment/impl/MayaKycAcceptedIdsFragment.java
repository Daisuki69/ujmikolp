package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Bb.a;
import H8.b;
import J8.e;
import K8.InterfaceC0276a;
import M8.C0332a;
import N5.C0466m;
import S5.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBindings;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycAcceptedIdsFragment extends MayaBaseFragment implements InterfaceC0276a {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f12462U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public C0466m f12463V;

    public final a G1() {
        a aVar = this.f12462U;
        if (aVar != null) {
            return aVar;
        }
        j.n("mAcceptedIdsFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.ELIGIBLE_ID;
    }

    public final KycCmsContent getCmsContent() {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        return ((MayaKycActivity) ((b) componentRequireActivity)).Z1().f;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f12462U = new a(preference, 1, false);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_kyc_accepted_ids, viewGroup, false);
        int i = R.id.kyc_accepted_ids_bottom_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.kyc_accepted_ids_bottom_button);
        if (button != null) {
            i = R.id.kyc_primary_ids_recycler_view_ids;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.kyc_primary_ids_recycler_view_ids);
            if (recyclerView != null) {
                i = R.id.kyc_primary_ids_text_view_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.kyc_primary_ids_text_view_title);
                if (textView != null) {
                    i = R.id.kyc_recommended_ids_recycler_view_ids;
                    RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.kyc_recommended_ids_recycler_view_ids);
                    if (recyclerView2 != null) {
                        i = R.id.kyc_recommended_ids_text_view_title;
                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.kyc_recommended_ids_text_view_title);
                        if (textView2 != null) {
                            i = R.id.kyc_secondary_ids_recycler_view_ids;
                            RecyclerView recyclerView3 = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.kyc_secondary_ids_recycler_view_ids);
                            if (recyclerView3 != null) {
                                i = R.id.kyc_secondary_ids_text_view_title;
                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.kyc_secondary_ids_text_view_title);
                                if (textView3 != null) {
                                    i = R.id.scrollview_accepted_ids;
                                    if (((NestedScrollView) ViewBindings.findChildViewById(viewInflate, R.id.scrollview_accepted_ids)) != null) {
                                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                        this.f12463V = new C0466m((ViewGroup) constraintLayout, (Object) button, (View) recyclerView, (Object) textView, (Object) recyclerView2, (Object) textView2, (View) recyclerView3, (View) textView3, 8);
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
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12463V = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<KycDocument> recommendedDocuments;
        KycCmsContentData data;
        List<KycDocument> documents;
        List<KycDocument> otherPrimaryDocuments;
        KycCmsContentData data2;
        KycCmsContentData data3;
        KycCmsContentData data4;
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.t2();
        mayaKycActivity.p2(new Ba.a(this, 27));
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        mayaKycActivity.v2(R.string.maya_kyc_accepted_ids_title);
        C0466m c0466m = this.f12463V;
        j.d(c0466m);
        a aVarG1 = G1();
        List<KycDocument> secondaryDocuments = null;
        if (aVarG1.e.I()) {
            KycCmsContent cmsContent = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG1.c.get())).getCmsContent();
            recommendedDocuments = (cmsContent == null || (data4 = cmsContent.getData()) == null) ? null : data4.getRecommendedDocuments();
            if (recommendedDocuments == null) {
                recommendedDocuments = C1112C.f9377a;
            }
        } else {
            KycCmsContent cmsContent2 = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG1.c.get())).getCmsContent();
            if (cmsContent2 == null || (data = cmsContent2.getData()) == null || (documents = data.getDocuments()) == null) {
                recommendedDocuments = null;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj : documents) {
                    if (((KycDocument) obj).getShowOnList()) {
                        arrayList.add(obj);
                    }
                }
                recommendedDocuments = arrayList;
            }
            if (recommendedDocuments == null) {
                recommendedDocuments = C1112C.f9377a;
            }
        }
        if (recommendedDocuments.isEmpty()) {
            C0466m c0466m2 = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG1.c.get())).f12463V;
            j.d(c0466m2);
            ((TextView) c0466m2.f4152g).setVisibility(8);
            ((RecyclerView) c0466m2.f).setVisibility(8);
        } else {
            MayaKycAcceptedIdsFragment mayaKycAcceptedIdsFragment = (MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG1.c.get());
            mayaKycAcceptedIdsFragment.getClass();
            C0466m c0466m3 = mayaKycAcceptedIdsFragment.f12463V;
            j.d(c0466m3);
            ((TextView) c0466m3.f4152g).setVisibility(0);
            RecyclerView recyclerView = (RecyclerView) c0466m3.f;
            recyclerView.setVisibility(0);
            recyclerView.setAdapter(new e(recommendedDocuments));
            recyclerView.setLayoutManager(new LinearLayoutManager(mayaKycAcceptedIdsFragment.getContext()));
        }
        a aVarG12 = G1();
        if (aVarG12.e.I()) {
            KycCmsContent cmsContent3 = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG12.c.get())).getCmsContent();
            otherPrimaryDocuments = (cmsContent3 == null || (data3 = cmsContent3.getData()) == null) ? null : data3.getOtherPrimaryDocuments();
            if (otherPrimaryDocuments == null) {
                otherPrimaryDocuments = C1112C.f9377a;
            }
        } else {
            otherPrimaryDocuments = C1112C.f9377a;
        }
        if (otherPrimaryDocuments.isEmpty()) {
            C0466m c0466m4 = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG12.c.get())).f12463V;
            j.d(c0466m4);
            ((TextView) c0466m4.e).setVisibility(8);
            ((RecyclerView) c0466m4.f4151d).setVisibility(8);
        } else {
            MayaKycAcceptedIdsFragment mayaKycAcceptedIdsFragment2 = (MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG12.c.get());
            mayaKycAcceptedIdsFragment2.getClass();
            C0466m c0466m5 = mayaKycAcceptedIdsFragment2.f12463V;
            j.d(c0466m5);
            ((TextView) c0466m5.e).setVisibility(0);
            RecyclerView recyclerView2 = (RecyclerView) c0466m5.f4151d;
            recyclerView2.setVisibility(0);
            recyclerView2.setAdapter(new e(otherPrimaryDocuments));
            recyclerView2.setLayoutManager(new LinearLayoutManager(mayaKycAcceptedIdsFragment2.getContext()));
        }
        a aVarG13 = G1();
        if (aVarG13.e.I()) {
            KycCmsContent cmsContent4 = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG13.c.get())).getCmsContent();
            if (cmsContent4 != null && (data2 = cmsContent4.getData()) != null) {
                secondaryDocuments = data2.getSecondaryDocuments();
            }
            if (secondaryDocuments == null) {
                secondaryDocuments = C1112C.f9377a;
            }
        } else {
            secondaryDocuments = C1112C.f9377a;
        }
        if (secondaryDocuments.isEmpty()) {
            C0466m c0466m6 = ((MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG13.c.get())).f12463V;
            j.d(c0466m6);
            ((TextView) c0466m6.i).setVisibility(8);
            ((RecyclerView) c0466m6.h).setVisibility(8);
        } else {
            MayaKycAcceptedIdsFragment mayaKycAcceptedIdsFragment3 = (MayaKycAcceptedIdsFragment) ((InterfaceC0276a) aVarG13.c.get());
            mayaKycAcceptedIdsFragment3.getClass();
            C0466m c0466m7 = mayaKycAcceptedIdsFragment3.f12463V;
            j.d(c0466m7);
            ((TextView) c0466m7.i).setVisibility(0);
            RecyclerView recyclerView3 = (RecyclerView) c0466m7.h;
            recyclerView3.setVisibility(0);
            recyclerView3.setAdapter(new e(secondaryDocuments));
            recyclerView3.setLayoutManager(new LinearLayoutManager(mayaKycAcceptedIdsFragment3.getContext()));
        }
        Ke.b.b((Button) c0466m.c, new C0332a(this, 0));
        G1().j();
    }
}
