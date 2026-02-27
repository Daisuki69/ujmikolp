package com.paymaya.ui.ekyc.view.fragment.impl;

import A7.j;
import E8.D;
import E8.E;
import G5.t;
import Kh.T;
import Lh.d;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import l9.C1803a;
import ph.C2070f1;
import v.AbstractC2329d;
import yd.h;
import zd.n;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class EDDIntroFragment extends BaseFragment implements t, h {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public j f14539S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public n f14540T;

    @BindView(R.id.pma_fragment_edd_intro_close)
    public HtmlTextView mCloseHtmlTextView;

    @BindView(R.id.pma_fragment_edd_help_center_html_text_view)
    public HtmlTextView mHelpCenterHtmlTextView;

    @BindView(R.id.pma_fragment_edd_intro_name)
    public TextView mNameTextView;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.PROMPT;
    }

    @Override // G5.t
    public final void m(String str, View view) {
        if (!kotlin.jvm.internal.j.b(str, "Later")) {
            if (kotlin.jvm.internal.j.b(str, "Help")) {
                C1219h c1219hH = AbstractC2329d.h(17);
                c1219hH.t(EnumC1217f.HELP);
                o1(c1219hH);
                n nVar = this.f14540T;
                if (nVar != null) {
                    EDDActivity eDDActivity = (EDDActivity) nVar;
                    eDDActivity.e.w(eDDActivity, "https://cares.paymaya.com/s/article/What-do-I-do-if-my-upgrade-application-was-put-on-hold-or-declined");
                    return;
                }
                return;
            }
            return;
        }
        C1219h c1219hH2 = AbstractC2329d.h(17);
        c1219hH2.t(EnumC1217f.LATER);
        o1(c1219hH2);
        n nVar2 = this.f14540T;
        if (nVar2 != null) {
            EDDActivity eDDActivity2 = (EDDActivity) nVar2;
            AlertDialog.Builder builder = new AlertDialog.Builder(eDDActivity2);
            builder.setCancelable(false);
            builder.setMessage(R.string.pma_label_edd_intro_close_dialog_description);
            builder.setPositiveButton(R.string.pma_label_yes, new D(eDDActivity2, 7));
            builder.setNegativeButton(R.string.pma_label_cancel, new E(7));
            AlertDialog alertDialogCreate = builder.create();
            kotlin.jvm.internal.j.f(alertDialogCreate, "create(...)");
            alertDialogCreate.setCanceledOnTouchOutside(false);
            alertDialogCreate.setTitle(R.string.pma_label_edd_intro_close_dialog_title);
            alertDialogCreate.show();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        this.f14540T = (n) getActivity();
        a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        j jVar = new j(20, aVar.X(), aVar.J());
        this.f14539S = jVar;
        jVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_intro, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        j jVar = this.f14539S;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mEDDIntroFragmentPresenter");
            throw null;
        }
        jVar.i();
        super.onDestroy();
    }

    @OnClick({R.id.pma_fragment_edd_intro_proceed})
    public void onProceedClick() {
        C1219h c1219hH = AbstractC2329d.h(17);
        c1219hH.t(EnumC1217f.PROCEED);
        o1(c1219hH);
        n nVar = this.f14540T;
        if (nVar != null) {
            ((EDDActivity) nVar).w1();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 0;
        super.onResume();
        n nVar = this.f14540T;
        if (nVar != null) {
            ((EDDActivity) nVar).Q(this);
        }
        j jVar = this.f14539S;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mEDDIntroFragmentPresenter");
            throw null;
        }
        ((BaseFragment) ((h) jVar.c.get())).p1();
        try {
            jVar.e(new T(5, new d(new d(new Lh.h(((C1293x0) jVar.f).g(), b.a(), 0), new C2070f1(jVar, 6), 2), new p8.a(jVar, 10), i), new C1803a(jVar, 14)).e());
        } catch (Exception unused) {
            ((BaseFragment) ((h) jVar.c.get())).n1();
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        j jVar = this.f14539S;
        if (jVar == null) {
            kotlin.jvm.internal.j.n("mEDDIntroFragmentPresenter");
            throw null;
        }
        jVar.j();
        HtmlTextView htmlTextView = this.mCloseHtmlTextView;
        if (htmlTextView == null) {
            kotlin.jvm.internal.j.n("mCloseHtmlTextView");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        HtmlTextView htmlTextView2 = this.mHelpCenterHtmlTextView;
        if (htmlTextView2 != null) {
            htmlTextView2.setOnLinkClickListener(this);
        } else {
            kotlin.jvm.internal.j.n("mHelpCenterHtmlTextView");
            throw null;
        }
    }
}
