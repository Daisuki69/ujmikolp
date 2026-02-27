package com.paymaya.ui.support.view.fragment.impl;

import Ae.a;
import O5.b;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.OnClick;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.ui.support.view.activity.impl.SupportActivity;
import oi.C1989g;
import w.C2360b;

/* JADX INFO: loaded from: classes4.dex */
public class SupportFragment extends BaseFragment {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public a f14927S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Ce.a f14928T;

    @BindView(R.id.email_us_text_view_pma_fragment_support)
    HtmlTextView mHtmlTextViewEmail;

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10249R = true;
        setHasOptionsMenu(true);
        this.f14928T = (Ce.a) getActivity();
        W4.a aVarE = W4.a.e();
        if (aVarE.f6283t == null) {
            O5.a aVar = aVarE.f6267a;
            C1989g c1989g = new C1989g();
            aVar.getClass();
            aVarE.f6283t = new b(aVar.f4704b, c1989g);
        }
        O5.a aVar2 = aVarE.f6283t.f4751a;
        this.f10245B = (C1220i) aVar2.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar2.e.get();
        a aVar3 = new a(1);
        this.f14927S = aVar3;
        aVar3.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.pma_fragment_support, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.f14927S.i();
        super.onDestroy();
    }

    @OnClick({R.id.messenger_button_pma_fragment_support})
    public void onMessageSupportClick() {
        C1220i c1220i = this.f10245B;
        FragmentActivity activity = getActivity();
        C1219h c1219hD = C1219h.d(m1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.MESSAGE_PAYMAYACARES);
        c1220i.c(activity, c1219hD);
        SupportActivity supportActivity = (SupportActivity) this.f14928T;
        supportActivity.e.getClass();
        supportActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.me/PayMayaCares")));
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        ((SupportActivity) this.f14928T).Q(this);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mHtmlTextViewEmail.setOnLinkClickListener(new C2360b(this, 10));
    }
}
