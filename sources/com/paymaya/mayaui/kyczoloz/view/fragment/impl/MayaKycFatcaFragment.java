package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.B;
import I8.d;
import K8.InterfaceC0294t;
import M8.C0334a1;
import M8.InterfaceC0338b1;
import M8.T2;
import N5.C0438b;
import O5.a;
import R4.i;
import S5.c;
import android.os.Bundle;
import android.view.View;
import cj.L;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.ComplianceApi;
import com.paymaya.domain.model.FatcaSelection;
import com.paymaya.domain.model.KycRegulatoryProfileCMSResponse;
import com.paymaya.domain.model.RegulatoryCMSData;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycFatcaFragment;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycFatcaFragment extends MayaKycBaseFragment<C0438b> implements InterfaceC0294t {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public B f12540W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public InterfaceC0338b1 f12541X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12542Y;

    public MayaKycFatcaFragment() {
        super(C0334a1.f3264a);
        this.f12542Y = new N(this, 15);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.FATCA;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        InterfaceC0338b1 interfaceC0338b1 = (InterfaceC0338b1) getActivity();
        this.f12541X = interfaceC0338b1;
        if (interfaceC0338b1 != null) {
            a aVar = (a) W4.a.e().f().c;
            this.f10334B = (C1220i) aVar.f4716g.get();
            this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
            this.f10336P = (c) aVar.f4724k.get();
            i iVar = new i((ComplianceApi) aVar.f4703a1.get());
            com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
            j.g(preference, "preference");
            this.f12540W = new B(iVar, preference);
        }
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12542Y);
        B b8 = this.f12540W;
        if (b8 == null) {
            j.n("mPresenter");
            throw null;
        }
        b8.h(this);
        InterfaceC0338b1 interfaceC0338b12 = this.f12541X;
        if (interfaceC0338b12 != null) {
            MayaKycActivity mayaKycActivity = (MayaKycActivity) interfaceC0338b12;
            mayaKycActivity.t2();
            mayaKycActivity.s1();
            mayaKycActivity.r1();
            mayaKycActivity.t1();
            mayaKycActivity.s2(R.color.maya_shades_of_grey_1, R.color.maya_primary_black);
            mayaKycActivity.p2(new d(mayaKycActivity, 0));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        B b8 = this.f12540W;
        if (b8 == null) {
            j.n("mPresenter");
            throw null;
        }
        b8.j();
        T2.G(this, L.c(new Pair(EnumC1212a.CALLER, "mobile-app-kyc")), true);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        final int i = 0;
        ((C0438b) G1()).f4057d.setOnClickListener(new View.OnClickListener(this) { // from class: M8.Z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycFatcaFragment f3258b;

            {
                this.f3258b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RegulatoryCMSData regulatoryCMSData;
                List<FatcaSelection> fatcaSelections;
                RegulatoryCMSData regulatoryCMSData2;
                List<FatcaSelection> fatcaSelections2;
                switch (i) {
                    case 0:
                        MayaKycFatcaFragment mayaKycFatcaFragment = this.f3258b;
                        Callback.onClick_enter(view2);
                        try {
                            D8.B b8 = mayaKycFatcaFragment.f12540W;
                            FatcaSelection fatcaSelection = null;
                            if (b8 == null) {
                                kotlin.jvm.internal.j.n("mPresenter");
                                throw null;
                            }
                            String actionValue = ((C0438b) mayaKycFatcaFragment.G1()).f4057d.getText().toString();
                            kotlin.jvm.internal.j.g(actionValue, "actionValue");
                            b8.i = actionValue;
                            KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse = b8.f1005g;
                            if (kycRegulatoryProfileCMSResponse != null && (regulatoryCMSData = kycRegulatoryProfileCMSResponse.getRegulatoryCMSData()) != null && (fatcaSelections = regulatoryCMSData.getFatcaSelections()) != null) {
                                fatcaSelection = fatcaSelections.get(1);
                            }
                            b8.o(fatcaSelection);
                            Callback.onClick_exit();
                            return;
                        } finally {
                        }
                    default:
                        MayaKycFatcaFragment mayaKycFatcaFragment2 = this.f3258b;
                        Callback.onClick_enter(view2);
                        try {
                            D8.B b10 = mayaKycFatcaFragment2.f12540W;
                            FatcaSelection fatcaSelection2 = null;
                            if (b10 == null) {
                                kotlin.jvm.internal.j.n("mPresenter");
                                throw null;
                            }
                            String actionValue2 = ((C0438b) mayaKycFatcaFragment2.G1()).f4056b.getText().toString();
                            kotlin.jvm.internal.j.g(actionValue2, "actionValue");
                            b10.i = actionValue2;
                            KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse2 = b10.f1005g;
                            if (kycRegulatoryProfileCMSResponse2 != null && (regulatoryCMSData2 = kycRegulatoryProfileCMSResponse2.getRegulatoryCMSData()) != null && (fatcaSelections2 = regulatoryCMSData2.getFatcaSelections()) != null) {
                                fatcaSelection2 = fatcaSelections2.get(0);
                            }
                            b10.o(fatcaSelection2);
                            Callback.onClick_exit();
                            return;
                        } finally {
                        }
                }
            }
        });
        final int i4 = 1;
        ((C0438b) G1()).f4056b.setOnClickListener(new View.OnClickListener(this) { // from class: M8.Z0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycFatcaFragment f3258b;

            {
                this.f3258b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RegulatoryCMSData regulatoryCMSData;
                List<FatcaSelection> fatcaSelections;
                RegulatoryCMSData regulatoryCMSData2;
                List<FatcaSelection> fatcaSelections2;
                switch (i4) {
                    case 0:
                        MayaKycFatcaFragment mayaKycFatcaFragment = this.f3258b;
                        Callback.onClick_enter(view2);
                        try {
                            D8.B b8 = mayaKycFatcaFragment.f12540W;
                            FatcaSelection fatcaSelection = null;
                            if (b8 == null) {
                                kotlin.jvm.internal.j.n("mPresenter");
                                throw null;
                            }
                            String actionValue = ((C0438b) mayaKycFatcaFragment.G1()).f4057d.getText().toString();
                            kotlin.jvm.internal.j.g(actionValue, "actionValue");
                            b8.i = actionValue;
                            KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse = b8.f1005g;
                            if (kycRegulatoryProfileCMSResponse != null && (regulatoryCMSData = kycRegulatoryProfileCMSResponse.getRegulatoryCMSData()) != null && (fatcaSelections = regulatoryCMSData.getFatcaSelections()) != null) {
                                fatcaSelection = fatcaSelections.get(1);
                            }
                            b8.o(fatcaSelection);
                            Callback.onClick_exit();
                            return;
                        } finally {
                        }
                    default:
                        MayaKycFatcaFragment mayaKycFatcaFragment2 = this.f3258b;
                        Callback.onClick_enter(view2);
                        try {
                            D8.B b10 = mayaKycFatcaFragment2.f12540W;
                            FatcaSelection fatcaSelection2 = null;
                            if (b10 == null) {
                                kotlin.jvm.internal.j.n("mPresenter");
                                throw null;
                            }
                            String actionValue2 = ((C0438b) mayaKycFatcaFragment2.G1()).f4056b.getText().toString();
                            kotlin.jvm.internal.j.g(actionValue2, "actionValue");
                            b10.i = actionValue2;
                            KycRegulatoryProfileCMSResponse kycRegulatoryProfileCMSResponse2 = b10.f1005g;
                            if (kycRegulatoryProfileCMSResponse2 != null && (regulatoryCMSData2 = kycRegulatoryProfileCMSResponse2.getRegulatoryCMSData()) != null && (fatcaSelections2 = regulatoryCMSData2.getFatcaSelections()) != null) {
                                fatcaSelection2 = fatcaSelections2.get(0);
                            }
                            b10.o(fatcaSelection2);
                            Callback.onClick_exit();
                            return;
                        } finally {
                        }
                }
            }
        });
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.d
    public final void q() {
        InterfaceC0338b1 interfaceC0338b1 = this.f12541X;
        if (interfaceC0338b1 != null) {
            ((MayaKycActivity) interfaceC0338b1).q();
        }
    }
}
