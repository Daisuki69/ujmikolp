package com.paymaya.ui.ekyc.view.fragment.impl;

import A7.j;
import G5.t;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.view.KeyEventDispatcher;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.Ekyc;
import com.paymaya.domain.store.P;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import yd.d;
import zd.i;

/* JADX INFO: loaded from: classes4.dex */
public class EDDApplicationStatusFragment extends BaseLoadingFragment implements d, t {

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public j f14525a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public i f14526b0;

    @BindView(R.id.help_center_html_text_view_pma_fragment_edd_application_status)
    public HtmlTextView mHelpCenterHtmlTextView;

    @BindView(R.id.validation_code_text_view_pma_fragment_edd_application_status)
    public TextView mValidationCodeTextView;

    public final j A1() {
        j jVar = this.f14525a0;
        if (jVar != null) {
            return jVar;
        }
        kotlin.jvm.internal.j.n("mEDDApplicationStatusFragmentPresenter");
        throw null;
    }

    @Override // G5.t
    public final void m(String link, View view) {
        kotlin.jvm.internal.j.g(link, "link");
        kotlin.jvm.internal.j.g(view, "view");
        i iVar = this.f14526b0;
        if (iVar != null) {
            EDDActivity eDDActivity = (EDDActivity) iVar;
            eDDActivity.e.w(eDDActivity, "https://cares.paymaya.com/s/article/What-do-I-do-if-my-upgrade-application-was-put-on-hold-or-declined");
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        P p10 = new P();
        p10.f11380b = payMayaClientApi;
        this.f14525a0 = new j(p10, (Uh.d) aVar.f4748y.get());
        KeyEventDispatcher.Component activity = getActivity();
        kotlin.jvm.internal.j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.fragment.impl.EDDApplicationStatusFragment.EDDApplicationStatusFragmentListener");
        this.f14526b0 = (i) activity;
        A1().h(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        A1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        i iVar = this.f14526b0;
        if (iVar != null) {
            ((EDDActivity) iVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        A1().j();
        HtmlTextView htmlTextView = this.mHelpCenterHtmlTextView;
        if (htmlTextView != null) {
            htmlTextView.setOnLinkClickListener(this);
        } else {
            kotlin.jvm.internal.j.n("mHelpCenterHtmlTextView");
            throw null;
        }
    }

    @OnClick({R.id.view_submitted_pma_fragment_edd_application_status})
    public void onViewSubmittedDetailsClick() {
        i iVar;
        Ekyc ekyc = (Ekyc) A1().f;
        if (ekyc == null || (iVar = this.f14526b0) == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("ekyc", ekyc);
        EDDApplicationDetailsFragment eDDApplicationDetailsFragment = new EDDApplicationDetailsFragment();
        eDDApplicationDetailsFragment.setArguments(bundle);
        AbstractC1236z.h((EDDActivity) iVar, R.id.fragment_container_frame_layout_pma_activity_edd, eDDApplicationDetailsFragment);
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View s1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.pma_fragment_edd_application_status, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View t1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.pma_view_error, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseLoadingFragment
    public final View u1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(R.layout.pma_view_loading_fullscreen, viewGroup, false);
    }
}
