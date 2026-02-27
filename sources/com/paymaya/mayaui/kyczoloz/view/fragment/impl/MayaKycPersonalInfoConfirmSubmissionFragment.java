package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import Bb.a;
import D.N;
import Dh.c;
import G5.u;
import H8.b;
import J8.l;
import J8.n;
import K8.z;
import M8.B1;
import M8.C0376l;
import M8.C1;
import M8.E1;
import M8.InterfaceC0345d0;
import M8.T2;
import N5.C0463k0;
import N5.C0465l0;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import androidx.navigation.NavArgsLazy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycPersonalInfoSnapshot;
import com.paymaya.domain.model.PersonalInfoConfirmAction;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycPersonalInfoConfirmSubmissionFragment extends MayaKycBaseFragment<C0463k0> implements z, u {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public a f12572W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12573X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public InterfaceC0345d0 f12574Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final NavArgsLazy f12575Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final c f12576a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public l f12577b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final N f12578c0;

    public MayaKycPersonalInfoConfirmSubmissionFragment() {
        super(B1.f3140a);
        this.f12575Z = new NavArgsLazy(kotlin.jvm.internal.z.a(E1.class), new C0376l(this, 9));
        this.f12576a0 = new c(1);
        this.f12578c0 = new N(this, 19);
    }

    @Override // com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment, L8.c
    public final boolean D() {
        a aVar = this.f12572W;
        if (aVar != null) {
            return aVar.e.e().isKycUxTofuRedesignEnabled();
        }
        j.n("mPresenter");
        throw null;
    }

    @Override // G5.u
    public final void H(String str, String str2) {
        if (j.b(str, "DataPrivacy")) {
            String string = getString(R.string.maya_kyc_complete_your_maya_experience_privacy_statement);
            j.f(string, "getString(...)");
            T2.Q(this, string, "https://www.paymaya.com/privacy/?in_app=true", null, 12);
            InterfaceC0345d0 interfaceC0345d0 = this.f12574Y;
            if (interfaceC0345d0 != null) {
                MayaKycActivity mayaKycActivity = (MayaKycActivity) interfaceC0345d0;
                mayaKycActivity.n1().k0(mayaKycActivity, "https://www.paymaya.com/privacy/?in_app=true");
            }
        }
    }

    public final void K1(boolean z4) {
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        ((MayaKycActivity) ((b) componentRequireActivity)).i2(z4);
    }

    public final String L1(PersonalInfoConfirmAction.Section section, String str) {
        int i = C1.f3145a[section.ordinal()];
        String strA = i != 1 ? i != 2 ? i != 3 ? (i == 4 || i == 5) ? M1().a(R.string.maya_kyc_personal_info_confirm_submission_permanent_address_details_header) : "" : M1().a(R.string.maya_kyc_personal_info_confirm_submission_current_address_details_header) : M1().a(R.string.maya_kyc_personal_info_confirm_submission_work_details_header) : M1().a(R.string.maya_kyc_personal_info_confirm_submission_details_header);
        return androidx.camera.core.impl.a.j(strA, Global.BLANK, str);
    }

    public final e0 M1() {
        e0 e0Var = this.f12573X;
        if (e0Var != null) {
            return e0Var;
        }
        j.n("resourceManager");
        throw null;
    }

    public final void N1(E8.z zVar, KycPersonalInfoSnapshot kycPersonalInfoSnapshot, int i, File file) {
        String secondaryIdType;
        ArrayList arrayList = zVar.c;
        boolean z4 = (arrayList.isEmpty() || (secondaryIdType = kycPersonalInfoSnapshot.getSecondaryIdType()) == null || C2576A.H(secondaryIdType)) ? false : true;
        ((C0465l0) ((C0463k0) G1()).f4136b.f3563l).f4143b.setVisibility(z4 ? 0 : 8);
        if (z4) {
            C0465l0 c0465l0 = (C0465l0) ((C0463k0) G1()).f4136b.f3563l;
            c0465l0.f4145g.setText(kycPersonalInfoSnapshot.getSecondaryIdType());
            c0465l0.f.setText(kycPersonalInfoSnapshot.getSecondaryIdNumber());
            c0465l0.e.setText(kycPersonalInfoSnapshot.getSecondaryIdExpiry());
            String secondaryIdExpiry = kycPersonalInfoSnapshot.getSecondaryIdExpiry();
            if (secondaryIdExpiry == null || secondaryIdExpiry.length() == 0) {
                c0465l0.c.setVisibility(8);
            }
            RecyclerView recyclerView = c0465l0.f4144d;
            O1(recyclerView, i);
            recyclerView.setAdapter(new l(arrayList, file));
        }
    }

    public final void O1(RecyclerView recyclerView, int i) {
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
        }
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new n(0, i, 0, 5));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.CONFIRM_SUBMISSION;
    }

    @Override // G5.t
    public final void m(String str, View view) {
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f12574Y = (InterfaceC0345d0) getActivity();
        O5.a aVar = (O5.a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        S5.c flagConfigurationService = (S5.c) aVar.f4724k.get();
        j.g(preference, "preference");
        j.g(flagConfigurationService, "flagConfigurationService");
        this.f12572W = new a(preference, flagConfigurationService, 4);
        this.f12573X = (e0) aVar.f4685S.get();
        requireActivity().getOnBackPressedDispatcher().addCallback(this, this.f12578c0);
        a aVar2 = this.f12572W;
        if (aVar2 != null) {
            aVar2.h(this);
        } else {
            j.n("mPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12576a0.d();
        super.onDestroyView();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            Method dump skipped, instruction units count: 1201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycPersonalInfoConfirmSubmissionFragment.onResume():void");
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        a aVar = this.f12572W;
        if (aVar != null) {
            aVar.j();
        } else {
            j.n("mPresenter");
            throw null;
        }
    }
}
