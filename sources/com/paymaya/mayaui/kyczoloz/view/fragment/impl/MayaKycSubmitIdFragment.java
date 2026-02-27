package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.C0190x;
import D.N;
import D8.C0215x;
import H8.b;
import J8.c;
import K8.K;
import M8.C0410t2;
import M8.C0418v2;
import M8.M1;
import M8.T2;
import N5.C0482u0;
import O5.a;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cj.C1110A;
import cj.C1112C;
import cj.L;
import com.paymaya.R;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycCmsContent;
import com.paymaya.domain.model.KycCmsContentData;
import com.paymaya.domain.model.KycDisabledDocumentSelection;
import com.paymaya.domain.model.KycDocument;
import com.paymaya.domain.model.MayaEKYCSelectedDocument;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSubmitIdFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSubmitIdFragment extends MayaKycBaseFragment<C0482u0> implements K {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public C0215x f12627W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public c f12628X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public c f12629Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public c f12630Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public int f12631a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f12632b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public MayaEKYCSelectedDocument f12633c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final N f12634d0;

    public MayaKycSubmitIdFragment() {
        super(C0410t2.f3372a);
        this.f12631a0 = -1;
        this.f12634d0 = new N(this, 28);
    }

    public static final void K1(MayaKycSubmitIdFragment mayaKycSubmitIdFragment, String documentType) {
        KycDocument kycDocument;
        KycDocument kycDocument2;
        KycDocument kycDocument3;
        KeyEventDispatcher.Component activity = mayaKycSubmitIdFragment.getActivity();
        b bVar = activity instanceof b ? (b) activity : null;
        if (bVar != null) {
            ((MayaKycActivity) bVar).f12450r = 0;
        }
        C0215x c0215xM1 = mayaKycSubmitIdFragment.M1();
        j.g(documentType, "documentType");
        int iHashCode = documentType.hashCode();
        if (iHashCode == -817598092) {
            if (documentType.equals("secondary")) {
                MayaKycSubmitIdFragment mayaKycSubmitIdFragment2 = (MayaKycSubmitIdFragment) ((K) c0215xM1.c.get());
                c cVar = mayaKycSubmitIdFragment2.f12628X;
                if (cVar != null) {
                    cVar.e();
                }
                c cVar2 = mayaKycSubmitIdFragment2.f12629Y;
                if (cVar2 != null) {
                    cVar2.e();
                }
                c cVar3 = mayaKycSubmitIdFragment2.f12630Z;
                if (cVar3 != null && (kycDocument = (KycDocument) cVar3.f2456a.get(cVar3.c)) != null) {
                    C0215x c0215xM12 = mayaKycSubmitIdFragment2.M1();
                    String key = kycDocument.getKey();
                    mayaKycSubmitIdFragment2.f12633c0 = new MayaEKYCSelectedDocument(kycDocument, c0215xM12.k(key != null ? key : ""), "secondary", 0);
                }
                MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycSubmitIdFragment2.f12633c0;
                if (mayaEKYCSelectedDocument != null) {
                    mayaKycSubmitIdFragment2.N1(mayaEKYCSelectedDocument);
                    return;
                } else {
                    j.n("mSelectedDocument");
                    throw null;
                }
            }
            return;
        }
        if (iHashCode == -314765822) {
            if (documentType.equals("primary")) {
                MayaKycSubmitIdFragment mayaKycSubmitIdFragment3 = (MayaKycSubmitIdFragment) ((K) c0215xM1.c.get());
                c cVar4 = mayaKycSubmitIdFragment3.f12628X;
                if (cVar4 != null) {
                    cVar4.e();
                }
                c cVar5 = mayaKycSubmitIdFragment3.f12630Z;
                if (cVar5 != null) {
                    cVar5.e();
                }
                c cVar6 = mayaKycSubmitIdFragment3.f12629Y;
                if (cVar6 != null && (kycDocument2 = (KycDocument) cVar6.f2456a.get(cVar6.c)) != null) {
                    C0215x c0215xM13 = mayaKycSubmitIdFragment3.M1();
                    String key2 = kycDocument2.getKey();
                    mayaKycSubmitIdFragment3.f12633c0 = new MayaEKYCSelectedDocument(kycDocument2, c0215xM13.k(key2 != null ? key2 : ""), "primary", 0);
                }
                MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = mayaKycSubmitIdFragment3.f12633c0;
                if (mayaEKYCSelectedDocument2 != null) {
                    mayaKycSubmitIdFragment3.N1(mayaEKYCSelectedDocument2);
                    return;
                } else {
                    j.n("mSelectedDocument");
                    throw null;
                }
            }
            return;
        }
        if (iHashCode == 1437916763 && documentType.equals("recommended")) {
            MayaKycSubmitIdFragment mayaKycSubmitIdFragment4 = (MayaKycSubmitIdFragment) ((K) c0215xM1.c.get());
            c cVar7 = mayaKycSubmitIdFragment4.f12629Y;
            if (cVar7 != null) {
                cVar7.e();
            }
            c cVar8 = mayaKycSubmitIdFragment4.f12630Z;
            if (cVar8 != null) {
                cVar8.e();
            }
            c cVar9 = mayaKycSubmitIdFragment4.f12628X;
            if (cVar9 != null && (kycDocument3 = (KycDocument) cVar9.f2456a.get(cVar9.c)) != null) {
                C0215x c0215xM14 = mayaKycSubmitIdFragment4.M1();
                String key3 = kycDocument3.getKey();
                mayaKycSubmitIdFragment4.f12633c0 = new MayaEKYCSelectedDocument(kycDocument3, c0215xM14.k(key3 != null ? key3 : ""), "recommended", 0);
            }
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument3 = mayaKycSubmitIdFragment4.f12633c0;
            if (mayaEKYCSelectedDocument3 != null) {
                mayaKycSubmitIdFragment4.N1(mayaEKYCSelectedDocument3);
            } else {
                j.n("mSelectedDocument");
                throw null;
            }
        }
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        return M1().o();
    }

    public final KycDisabledDocumentSelection L1() {
        e0 e0Var = M1().f;
        return new KycDisabledDocumentSelection(e0Var.a(R.string.maya_kyc_submit_an_id_label_service_unavailable), ContextCompat.getColor(e0Var.f10905a, R.color.sonic_silver_gray));
    }

    public final C0215x M1() {
        C0215x c0215x = this.f12627W;
        if (c0215x != null) {
            return c0215x;
        }
        j.n("mSubmitIdFragmentPresenter");
        throw null;
    }

    public final void N1(MayaEKYCSelectedDocument selectedDocument) {
        j.g(selectedDocument, "selectedDocument");
        if (!M1().o()) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument = this.f12633c0;
            if (mayaEKYCSelectedDocument != null) {
                T2.Q(this, mayaEKYCSelectedDocument.getDescription(), null, null, 14);
                return;
            } else {
                j.n("mSelectedDocument");
                throw null;
            }
        }
        C0215x c0215xM1 = M1();
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = this.f12633c0;
        if (mayaEKYCSelectedDocument2 != null) {
            c0215xM1.p(mayaEKYCSelectedDocument2);
        } else {
            j.n("mSelectedDocument");
            throw null;
        }
    }

    public final void O1(String str) {
        C0482u0 c0482u0 = (C0482u0) G1();
        int iHashCode = str.hashCode();
        if (iHashCode == -817598092) {
            if (str.equals("secondary")) {
                c0482u0.f4224k.setVisibility(8);
                c0482u0.h.setVisibility(8);
                c0482u0.m.setVisibility(8);
                return;
            }
            return;
        }
        if (iHashCode == -314765822) {
            if (str.equals("primary")) {
                c0482u0.j.setVisibility(8);
                c0482u0.f4223g.setVisibility(8);
                return;
            }
            return;
        }
        if (iHashCode == 1437916763 && str.equals("recommended")) {
            c0482u0.i.setVisibility(8);
            c0482u0.f.setVisibility(8);
        }
    }

    public final void P1() {
        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = this.f12633c0;
        if (mayaEKYCSelectedDocument == null) {
            j.n("mSelectedDocument");
            throw null;
        }
        C0418v2 c0418v2 = new C0418v2(mayaEKYCSelectedDocument);
        if (M1().o()) {
            MayaEKYCSelectedDocument mayaEKYCSelectedDocument2 = this.f12633c0;
            if (mayaEKYCSelectedDocument2 == null) {
                j.n("mSelectedDocument");
                throw null;
            }
            T2.Q(this, mayaEKYCSelectedDocument2.getDescription(), T2.l(this, c0418v2).toString(), null, 12);
        } else {
            T2.Q(this, ((C0482u0) G1()).f4221b.getText().toString(), T2.l(this, c0418v2).toString(), null, 12);
        }
        ConstraintLayout constraintLayout = ((C0482u0) G1()).f4220a;
        j.f(constraintLayout, "getRoot(...)");
        Navigation.findNavController(constraintLayout).navigate(c0418v2);
    }

    public final void Q1(List list, List primaryDocuments, List secondaryDocuments) {
        j.g(primaryDocuments, "primaryDocuments");
        j.g(secondaryDocuments, "secondaryDocuments");
        C0482u0 c0482u0 = (C0482u0) G1();
        this.f12628X = new c(list, new C0190x(0, this, MayaKycSubmitIdFragment.class, "actionEnableButton", "actionEnableButton()V", 0, 22), this.f12631a0, "recommended", new M1(1, this, MayaKycSubmitIdFragment.class, "onSelectItem", "onSelectItem(Ljava/lang/String;)V", 0, 5), M1().o(), M1().n(), L1());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        RecyclerView recyclerView = c0482u0.f;
        recyclerView.setLayoutManager(linearLayoutManager);
        this.f12629Y = new c(primaryDocuments, new C0190x(0, this, MayaKycSubmitIdFragment.class, "actionEnableButton", "actionEnableButton()V", 0, 23), this.f12631a0, "primary", new M1(1, this, MayaKycSubmitIdFragment.class, "onSelectItem", "onSelectItem(Ljava/lang/String;)V", 0, 6), M1().o(), M1().n(), L1());
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getContext());
        RecyclerView recyclerView2 = c0482u0.f4223g;
        recyclerView2.setLayoutManager(linearLayoutManager2);
        this.f12630Z = new c(secondaryDocuments, new C0190x(0, this, MayaKycSubmitIdFragment.class, "actionEnableButton", "actionEnableButton()V", 0, 24), this.f12631a0, "secondary", new M1(1, this, MayaKycSubmitIdFragment.class, "onSelectItem", "onSelectItem(Ljava/lang/String;)V", 0, 7), M1().o(), M1().n(), L1());
        LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(getContext());
        RecyclerView recyclerView3 = c0482u0.h;
        recyclerView3.setLayoutManager(linearLayoutManager3);
        recyclerView.setAdapter(this.f12628X);
        recyclerView2.setAdapter(this.f12629Y);
        recyclerView3.setAdapter(this.f12630Z);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SELECT_ID;
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
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        e0 resourceManager = (e0) aVar.f4685S.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        j.g(resourceManager, "resourceManager");
        this.f12627W = new C0215x(preference, flagConfigurationService, resourceManager, 1);
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12634d0);
        M1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        M1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12628X = null;
        this.f12629Y = null;
        this.f12630Z = null;
        this.f12631a0 = -1;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C0215x c0215xM1 = M1();
        if (c0215xM1.e.e().isPartnerOnboardingEnabled()) {
            String strP = c0215xM1.e.p();
            j.f(strP, "getMayaOnboardingPartner(...)");
            if (strP.length() > 0) {
                MayaKycSubmitIdFragment mayaKycSubmitIdFragment = (MayaKycSubmitIdFragment) ((K) c0215xM1.c.get());
                mayaKycSubmitIdFragment.getClass();
                T2.H(mayaKycSubmitIdFragment, L.c(new Pair(EnumC1212a.ONBOARDING_KYC_LEVEL, mayaKycSubmitIdFragment.t1().k().toString())), 2);
                return;
            }
        }
        MayaKycSubmitIdFragment mayaKycSubmitIdFragment2 = (MayaKycSubmitIdFragment) ((K) c0215xM1.c.get());
        mayaKycSubmitIdFragment2.getClass();
        T2.H(mayaKycSubmitIdFragment2, null, 3);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onStop() {
        if (M1().o()) {
            KeyEventDispatcher.Component componentRequireActivity = requireActivity();
            j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
            MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
            mayaKycActivity.m2();
            mayaKycActivity.l2();
        }
        super.onStop();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        MayaKycActivity mayaKycActivity = (MayaKycActivity) ((b) componentRequireActivity);
        mayaKycActivity.t2();
        mayaKycActivity.t1();
        H8.a aVar = H8.a.f2141b;
        mayaKycActivity.R1();
        mayaKycActivity.E1(33);
        mayaKycActivity.n2(aVar);
        mayaKycActivity.p2(new M8.L(this, 14));
        final int i = 0;
        C.r0(((C0482u0) G1()).f4221b, new Function0(this) { // from class: M8.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSubmitIdFragment f3368b;

            {
                this.f3368b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycCmsContentData data2;
                switch (i) {
                    case 0:
                        MayaKycSubmitIdFragment mayaKycSubmitIdFragment = this.f3368b;
                        C0215x c0215xM1 = mayaKycSubmitIdFragment.M1();
                        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycSubmitIdFragment.f12633c0;
                        if (mayaEKYCSelectedDocument != null) {
                            c0215xM1.p(mayaEKYCSelectedDocument);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mSelectedDocument");
                        throw null;
                    default:
                        MayaKycSubmitIdFragment mayaKycSubmitIdFragment2 = this.f3368b;
                        C0215x c0215xM12 = mayaKycSubmitIdFragment2.M1();
                        if (mayaKycSubmitIdFragment2.f12632b0) {
                            MayaKycSubmitIdFragment mayaKycSubmitIdFragment3 = (MayaKycSubmitIdFragment) ((K8.K) c0215xM12.c.get());
                            String string = mayaKycSubmitIdFragment3.getString(R.string.maya_kyc_show_more_ids_collapsed_title);
                            kotlin.jvm.internal.j.f(string, "getString(...)");
                            mayaKycSubmitIdFragment3.f12632b0 = false;
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4225l.setText(string);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4225l.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_down_green, 0);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).j.setVisibility(8);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4222d.setVisibility(8);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4223g.setVisibility(8);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).h.setVisibility(8);
                            if (mayaKycSubmitIdFragment3.t1().e().isShortenedFlowShowOtherIdEnabled()) {
                                ((C0482u0) mayaKycSubmitIdFragment3.G1()).e.setVisibility(8);
                            }
                            String string2 = mayaKycSubmitIdFragment3.getString(R.string.maya_kyc_show_more_ids_expanded_title);
                            kotlin.jvm.internal.j.f(string2, "getString(...)");
                            T2.Q(mayaKycSubmitIdFragment3, string2, null, null, 14);
                        } else {
                            K8.K k8 = (K8.K) c0215xM12.c.get();
                            KycCmsContent cmsContent = ((MayaKycSubmitIdFragment) ((K8.K) c0215xM12.c.get())).getCmsContent();
                            MayaKycSubmitIdFragment mayaKycSubmitIdFragment4 = (MayaKycSubmitIdFragment) k8;
                            String string3 = mayaKycSubmitIdFragment4.getString(R.string.maya_kyc_show_more_ids_expanded_title);
                            kotlin.jvm.internal.j.f(string3, "getString(...)");
                            mayaKycSubmitIdFragment4.f12632b0 = true;
                            ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4225l.setText(string3);
                            ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4225l.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_up_green, 0);
                            List<KycDocument> otherPrimaryDocuments = (cmsContent == null || (data2 = cmsContent.getData()) == null) ? null : data2.getOtherPrimaryDocuments();
                            if (otherPrimaryDocuments == null) {
                                otherPrimaryDocuments = C1112C.f9377a;
                            }
                            ArrayList arrayListW = C1110A.W(otherPrimaryDocuments);
                            List<KycDocument> secondaryDocuments = (cmsContent == null || (data = cmsContent.getData()) == null) ? null : data.getSecondaryDocuments();
                            if (secondaryDocuments == null) {
                                secondaryDocuments = C1112C.f9377a;
                            }
                            ArrayList arrayListW2 = C1110A.W(secondaryDocuments);
                            if (!arrayListW.isEmpty()) {
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).j.setVisibility(0);
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4223g.setVisibility(0);
                            }
                            if (!arrayListW2.isEmpty()) {
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4222d.setVisibility(0);
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).h.setVisibility(0);
                            }
                            if (mayaKycSubmitIdFragment4.t1().e().isShortenedFlowShowOtherIdEnabled()) {
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).e.setVisibility(0);
                            }
                            String string4 = mayaKycSubmitIdFragment4.getString(R.string.maya_kyc_show_more_ids_collapsed_title);
                            kotlin.jvm.internal.j.f(string4, "getString(...)");
                            T2.Q(mayaKycSubmitIdFragment4, string4, null, null, 14);
                        }
                        return Unit.f18162a;
                }
            }
        });
        final int i4 = 1;
        C.r0(((C0482u0) G1()).f4225l, new Function0(this) { // from class: M8.s2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSubmitIdFragment f3368b;

            {
                this.f3368b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                KycCmsContentData data;
                KycCmsContentData data2;
                switch (i4) {
                    case 0:
                        MayaKycSubmitIdFragment mayaKycSubmitIdFragment = this.f3368b;
                        C0215x c0215xM1 = mayaKycSubmitIdFragment.M1();
                        MayaEKYCSelectedDocument mayaEKYCSelectedDocument = mayaKycSubmitIdFragment.f12633c0;
                        if (mayaEKYCSelectedDocument != null) {
                            c0215xM1.p(mayaEKYCSelectedDocument);
                            return Unit.f18162a;
                        }
                        kotlin.jvm.internal.j.n("mSelectedDocument");
                        throw null;
                    default:
                        MayaKycSubmitIdFragment mayaKycSubmitIdFragment2 = this.f3368b;
                        C0215x c0215xM12 = mayaKycSubmitIdFragment2.M1();
                        if (mayaKycSubmitIdFragment2.f12632b0) {
                            MayaKycSubmitIdFragment mayaKycSubmitIdFragment3 = (MayaKycSubmitIdFragment) ((K8.K) c0215xM12.c.get());
                            String string = mayaKycSubmitIdFragment3.getString(R.string.maya_kyc_show_more_ids_collapsed_title);
                            kotlin.jvm.internal.j.f(string, "getString(...)");
                            mayaKycSubmitIdFragment3.f12632b0 = false;
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4225l.setText(string);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4225l.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_down_green, 0);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).j.setVisibility(8);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4222d.setVisibility(8);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).f4223g.setVisibility(8);
                            ((C0482u0) mayaKycSubmitIdFragment3.G1()).h.setVisibility(8);
                            if (mayaKycSubmitIdFragment3.t1().e().isShortenedFlowShowOtherIdEnabled()) {
                                ((C0482u0) mayaKycSubmitIdFragment3.G1()).e.setVisibility(8);
                            }
                            String string2 = mayaKycSubmitIdFragment3.getString(R.string.maya_kyc_show_more_ids_expanded_title);
                            kotlin.jvm.internal.j.f(string2, "getString(...)");
                            T2.Q(mayaKycSubmitIdFragment3, string2, null, null, 14);
                        } else {
                            K8.K k8 = (K8.K) c0215xM12.c.get();
                            KycCmsContent cmsContent = ((MayaKycSubmitIdFragment) ((K8.K) c0215xM12.c.get())).getCmsContent();
                            MayaKycSubmitIdFragment mayaKycSubmitIdFragment4 = (MayaKycSubmitIdFragment) k8;
                            String string3 = mayaKycSubmitIdFragment4.getString(R.string.maya_kyc_show_more_ids_expanded_title);
                            kotlin.jvm.internal.j.f(string3, "getString(...)");
                            mayaKycSubmitIdFragment4.f12632b0 = true;
                            ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4225l.setText(string3);
                            ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4225l.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.maya_ic_chevron_up_green, 0);
                            List<KycDocument> otherPrimaryDocuments = (cmsContent == null || (data2 = cmsContent.getData()) == null) ? null : data2.getOtherPrimaryDocuments();
                            if (otherPrimaryDocuments == null) {
                                otherPrimaryDocuments = C1112C.f9377a;
                            }
                            ArrayList arrayListW = C1110A.W(otherPrimaryDocuments);
                            List<KycDocument> secondaryDocuments = (cmsContent == null || (data = cmsContent.getData()) == null) ? null : data.getSecondaryDocuments();
                            if (secondaryDocuments == null) {
                                secondaryDocuments = C1112C.f9377a;
                            }
                            ArrayList arrayListW2 = C1110A.W(secondaryDocuments);
                            if (!arrayListW.isEmpty()) {
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).j.setVisibility(0);
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4223g.setVisibility(0);
                            }
                            if (!arrayListW2.isEmpty()) {
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).f4222d.setVisibility(0);
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).h.setVisibility(0);
                            }
                            if (mayaKycSubmitIdFragment4.t1().e().isShortenedFlowShowOtherIdEnabled()) {
                                ((C0482u0) mayaKycSubmitIdFragment4.G1()).e.setVisibility(0);
                            }
                            String string4 = mayaKycSubmitIdFragment4.getString(R.string.maya_kyc_show_more_ids_collapsed_title);
                            kotlin.jvm.internal.j.f(string4, "getString(...)");
                            T2.Q(mayaKycSubmitIdFragment4, string4, null, null, 14);
                        }
                        return Unit.f18162a;
                }
            }
        });
        C0215x c0215xM1 = M1();
        c0215xM1.j();
        if (this.f12631a0 != -1) {
            ((C0482u0) ((MayaKycSubmitIdFragment) ((K) c0215xM1.c.get())).G1()).f4221b.setEnabled(true);
        }
    }
}
