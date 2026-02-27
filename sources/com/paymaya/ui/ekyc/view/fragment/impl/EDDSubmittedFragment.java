package com.paymaya.ui.ekyc.view.fragment.impl;

import B5.i;
import Bb.f;
import G5.t;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.KeyEventDispatcher;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import kotlin.jvm.internal.j;
import zd.s;

/* JADX INFO: loaded from: classes4.dex */
public class EDDSubmittedFragment extends BaseFragment implements t {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public f f14556S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public s f14557T;

    @BindView(R.id.help_center_html_text_view_pma_fragment_edd_submitted)
    public HtmlTextView mHtmlTextView;

    @Override // G5.t
    public final void m(String str, View view) {
        s sVar = this.f14557T;
        if (sVar != null) {
            EDDActivity eDDActivity = (EDDActivity) sVar;
            eDDActivity.e.w(eDDActivity, "https://cares.paymaya.com/s/article/What-do-I-do-if-my-upgrade-application-was-put-on-hold-or-declined");
        }
    }

    @OnClick({R.id.back_to_home_pma_fragment_edd_submitted})
    public void onBackToHome() {
        s sVar = this.f14557T;
        if (sVar != null) {
            EDDActivity eDDActivity = (EDDActivity) sVar;
            eDDActivity.e.getClass();
            i.j(eDDActivity);
            if (eDDActivity.f21061d.e().isEddRestrictionsEnabled()) {
                eDDActivity.f21061d.p0("KYC0_SANCTION_FOR_REVIEW");
            }
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f14556S = new f(aVar.J(), 24);
        KeyEventDispatcher.Component activity = getActivity();
        j.e(activity, "null cannot be cast to non-null type com.paymaya.ui.ekyc.view.fragment.impl.EDDSubmittedFragment.IEDDSubmittedFragmentListener");
        this.f14557T = (s) activity;
        f fVar = this.f14556S;
        if (fVar != null) {
            fVar.h(this);
        } else {
            j.n("mEDDSubmittedFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_submitted, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f14556S;
        if (fVar == null) {
            j.n("mEDDSubmittedFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        s sVar = this.f14557T;
        if (sVar != null) {
            ((EDDActivity) sVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        f fVar = this.f14556S;
        if (fVar == null) {
            j.n("mEDDSubmittedFragmentPresenter");
            throw null;
        }
        fVar.j();
        HtmlTextView htmlTextView = this.mHtmlTextView;
        if (htmlTextView != null) {
            htmlTextView.setOnLinkClickListener(this);
        } else {
            j.n("mHtmlTextView");
            throw null;
        }
    }
}
