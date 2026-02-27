package com.paymaya.ui.invest.view.fragment.impl;

import Ag.k;
import B5.i;
import D8.C0214w;
import Gd.a;
import Hd.b;
import N5.Q;
import N5.k1;
import O5.e;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bj.C1034e;
import bj.InterfaceC1033d;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.OnlinePayment;
import com.paymaya.domain.store.C1256e0;
import com.paymaya.ui.invest.view.activity.impl.InvestActivity;
import kotlin.jvm.internal.j;
import n3.C1916a;
import v.AbstractC2329d;

/* JADX INFO: loaded from: classes4.dex */
public class InvestPreviewFragment extends BaseLoadingFragment implements a {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public k1 f14613a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public b f14614b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Fd.a f14615c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final InterfaceC1033d f14616d0 = C1034e.b(new k(this, 21));

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public C0214w f14617e0;

    public static final void A1(InvestPreviewFragment investPreviewFragment, OnlinePayment onlinePayment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.CONTENT);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put("content", onlinePayment.mName());
        investPreviewFragment.o1(c1219hH);
        String strMExternalLink = onlinePayment.mExternalLink();
        if (strMExternalLink != null) {
            b bVar = investPreviewFragment.f14614b0;
            if (bVar == null) {
                j.n("mInvestPreviewFragmentListener");
                throw null;
            }
            InvestActivity investActivity = (InvestActivity) bVar;
            investActivity.e.getClass();
            i.f(investActivity, strMExternalLink);
        }
    }

    public static final void B1(InvestPreviewFragment investPreviewFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.UPGRADE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, "upgrade");
        investPreviewFragment.o1(c1219hH);
        b bVar = investPreviewFragment.f14614b0;
        if (bVar == null) {
            j.n("mInvestPreviewFragmentListener");
            throw null;
        }
        InvestActivity investActivity = (InvestActivity) bVar;
        investActivity.e.s(investActivity, true);
    }

    public static final void C1(InvestPreviewFragment investPreviewFragment) {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.UPGRADE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219hH.j.put(SessionDescription.ATTR_TYPE, "check");
        investPreviewFragment.o1(c1219hH);
        b bVar = investPreviewFragment.f14614b0;
        if (bVar == null) {
            j.n("mInvestPreviewFragmentListener");
            throw null;
        }
        InvestActivity investActivity = (InvestActivity) bVar;
        investActivity.e.s(investActivity, true);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        W4.a aVarE = W4.a.e();
        if (aVarE.f6245D == null) {
            O5.a aVar = aVarE.f6267a;
            C1916a c1916a = new C1916a(1);
            aVar.getClass();
            aVarE.f6245D = new e(aVar.f4704b, c1916a);
        }
        O5.a aVar2 = aVarE.f6245D.f4754a;
        this.f10245B = (C1220i) aVar2.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar2.e.get();
        this.f14617e0 = new C0214w((com.paymaya.data.preference.a) aVar2.e.get(), aVar2.J(), new C1256e0((PayMayaClientApi) aVar2.f4745w.get()));
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment.InvestPreviewFragmentListener");
        this.f14614b0 = (b) componentRequireActivity;
        C0214w c0214w = this.f14617e0;
        if (c0214w == null) {
            j.n("mInvestPreviewFragmentPresenter");
            throw null;
        }
        c0214w.h(this);
        this.f10249R = true;
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        b bVar = this.f14614b0;
        if (bVar == null) {
            j.n("mInvestPreviewFragmentListener");
            throw null;
        }
        ((InvestActivity) bVar).Q(this);
        C1219h c1219h = new C1219h();
        c1219h.n(2);
        o1(c1219h);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(requireContext(), 3);
        Context contextRequireContext = requireContext();
        j.f(contextRequireContext, "requireContext(...)");
        Fd.b bVar = new Fd.b(contextRequireContext);
        this.f14615c0 = new Fd.a(this);
        k1 k1Var = this.f14613a0;
        j.d(k1Var);
        RecyclerView recyclerView = ((Q) k1Var.f).c;
        recyclerView.setLayoutManager(gridLayoutManager);
        Fd.a aVar = this.f14615c0;
        if (aVar == null) {
            j.n("mInvestmentPartnerAdapter");
            throw null;
        }
        recyclerView.setAdapter(aVar);
        recyclerView.addItemDecoration(bVar);
        C0214w c0214w = this.f14617e0;
        if (c0214w != null) {
            c0214w.j();
        } else {
            j.n("mInvestPreviewFragmentPresenter");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final int r1() {
        return R.drawable.pma_ic_no_connection;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017d A[PHI: r1
  0x017d: PHI (r1v25 int) = (r1v24 int), (r1v28 int), (r1v29 int), (r1v30 int) binds: [B:33:0x00c2, B:35:0x00ce, B:37:0x00da, B:39:0x00e8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0191 A[PHI: r1
  0x0191: PHI (r1v2 int) = (r1v1 int), (r1v5 int), (r1v23 int) binds: [B:3:0x0017, B:5:0x0020, B:31:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0198 A[PHI: r1
  0x0198: PHI (r1v14 int) = (r1v6 int), (r1v15 int), (r1v16 int), (r1v17 int), (r1v18 int), (r1v19 int) binds: [B:17:0x0063, B:19:0x0070, B:21:0x007c, B:23:0x0087, B:25:0x0093, B:27:0x009e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.paymaya.common.base.BaseLoadingFragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View s1(android.view.LayoutInflater r18, android.view.ViewGroup r19) {
        /*
            Method dump skipped, instruction units count: 474
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.ui.invest.view.fragment.impl.InvestPreviewFragment.s1(android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_error2, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup container) {
        j.g(container, "container");
        View viewInflate = layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, container, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final int v1() {
        return R.drawable.pma_ic_server_error;
    }
}
