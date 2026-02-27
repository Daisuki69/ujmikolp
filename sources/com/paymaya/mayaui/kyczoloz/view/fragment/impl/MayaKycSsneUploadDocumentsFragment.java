package com.paymaya.mayaui.kyczoloz.view.fragment.impl;

import D.N;
import D8.O;
import E8.C;
import H8.b;
import K8.H;
import M8.C0387n2;
import M8.L;
import M8.M1;
import N5.C0476r0;
import O5.a;
import S5.c;
import Xh.i;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.paymaya.R;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.e0;
import com.paymaya.domain.model.KycJobTitle;
import com.paymaya.mayaui.kyczoloz.view.activity.impl.MayaKycActivity;
import com.paymaya.mayaui.kyczoloz.view.fragment.base.MayaKycBaseFragment;
import com.paymaya.mayaui.kyczoloz.view.fragment.impl.MayaKycSsneUploadDocumentsFragment;
import java.util.HashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import y5.q;

/* JADX INFO: loaded from: classes4.dex */
public class MayaKycSsneUploadDocumentsFragment extends MayaKycBaseFragment<C0476r0> implements H {

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public O f12618W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public e0 f12619X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final N f12620Y;

    public MayaKycSsneUploadDocumentsFragment() {
        super(C0387n2.f3342a);
        this.f12620Y = new N(this, 25);
    }

    public final O K1() {
        O o8 = this.f12618W;
        if (o8 != null) {
            return o8;
        }
        j.n("mSsneUploadDocumentsFragmentPresenter");
        throw null;
    }

    public final boolean L1() {
        KycJobTitle kycJobTitle = (KycJobTitle) C.a(null, "job_title_object");
        if (j.b(kycJobTitle != null ? kycJobTitle.getCode() : null, "BUSINESS_OWNER")) {
            return true;
        }
        return j.b(kycJobTitle != null ? kycJobTitle.getCode() : null, "DIRECTOR");
    }

    public final void M1(String buttonLabel, String str) {
        String str2;
        j.g(buttonLabel, "buttonLabel");
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.SSNE_CHECKPOINT);
        c1219hD.n(18);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        HashMap map = c1219hD.j;
        map.put("button", buttonLabel);
        map.put("page_name", getString(R.string.maya_kyc_ssne_page_name_label));
        boolean zL1 = L1();
        if (zL1) {
            str2 = "Business Owner / Director";
        } else {
            if (zL1) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "Individual";
        }
        map.put("ssne_type", str2);
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        c1219hD.i();
        EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
        if (str.length() > 0) {
            c1219hD.j.put("destination_page", str);
        }
        o1().c(getActivity(), c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SSNE_CHECKPOINT;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        a aVar = (a) W4.a.e().f().c;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        this.f12618W = new O();
        this.f12619X = (e0) aVar.f4685S.get();
        K1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        K1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBindingFragment, com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f12620Y.remove();
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        C1220i c1220iO1 = o1();
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(u1());
        c1219hD.r(EnumC1216e.SSNE_CHECKPOINT);
        c1219hD.n(4);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        String string = getString(R.string.maya_kyc_ssne_page_name_label);
        HashMap map = c1219hD.j;
        map.put("page_name", string);
        map.put("source_page", getString(R.string.maya_kyc_work_details_screen_label));
        map.put("kyc_status", t1().l());
        map.put("path", "TOFU 1.0");
        c1219hD.i();
        c1220iO1.c(activity, c1219hD);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        requireActivity().getOnBackPressedDispatcher().addCallback(this.f12620Y);
        Object objRequireActivity = requireActivity();
        j.e(objRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.kyczoloz.view.activity.IMayaKycActivityView");
        Object obj = (b) objRequireActivity;
        MayaKycActivity mayaKycActivity = (MayaKycActivity) obj;
        mayaKycActivity.t2();
        e0 e0Var = this.f12619X;
        if (e0Var == null) {
            j.n("resourceManager");
            throw null;
        }
        mayaKycActivity.r2(ContextCompat.getColor(e0Var.f10905a, R.color.ghost_white));
        e0 e0Var2 = this.f12619X;
        if (e0Var2 == null) {
            j.n("resourceManager");
            throw null;
        }
        ((q) obj).N1(ContextCompat.getColor(e0Var2.f10905a, R.color.ghost_white));
        mayaKycActivity.p2(new L(this, 11));
        mayaKycActivity.t1();
        mayaKycActivity.s1();
        mayaKycActivity.r1();
        K1().j();
        final int i = 0;
        Ke.b.b(((C0476r0) G1()).i, new Function0(this) { // from class: M8.m2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneUploadDocumentsFragment f3338b;

            {
                this.f3338b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0383m2.invoke():java.lang.Object");
            }
        });
        final int i4 = 1;
        Ke.b.b(((C0476r0) G1()).h, new Function0(this) { // from class: M8.m2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneUploadDocumentsFragment f3338b;

            {
                this.f3338b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0383m2.invoke():java.lang.Object");
            }
        });
        final int i6 = 2;
        Ke.b.b(((C0476r0) G1()).f4195d, new Function0(this) { // from class: M8.m2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneUploadDocumentsFragment f3338b;

            {
                this.f3338b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0383m2.invoke():java.lang.Object");
            }
        });
        final int i10 = 3;
        Ke.b.b(((C0476r0) G1()).f4194b, new Function0(this) { // from class: M8.m2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneUploadDocumentsFragment f3338b;

            {
                this.f3338b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0383m2.invoke():java.lang.Object");
            }
        });
        final int i11 = 4;
        Ke.b.b(((C0476r0) G1()).c, new Function0(this) { // from class: M8.m2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MayaKycSsneUploadDocumentsFragment f3338b;

            {
                this.f3338b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
            @Override // kotlin.jvm.functions.Function0
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke() {
                /*
                    Method dump skipped, instruction units count: 544
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: M8.C0383m2.invoke():java.lang.Object");
            }
        });
        i.D(this, z.a(MayaKycRestartBottomSheetDialogFragment.class), new M1(1, K1(), O.class, "handleConfirmationResult", "handleConfirmationResult(Z)V", 0, 4));
    }
}
