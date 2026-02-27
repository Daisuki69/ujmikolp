package com.paymaya.ui.dataprivacy.view.dialog.impl;

import Ah.p;
import Kh.T;
import Lh.d;
import M7.c;
import N5.X0;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.domain.model.Consent;
import com.paymaya.domain.store.A0;
import com.paymaya.domain.store.C1258f0;
import d4.AbstractC1331a;
import de.m;
import fa.ViewOnClickListenerC1479a;
import java.util.List;
import kotlin.jvm.internal.j;
import md.InterfaceC1862a;
import nd.a;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public final class DataPrivacyDialogFragment extends BaseDialogFragment implements InterfaceC1862a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public X0 f14480R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public c f14481S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public String f14482T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public a f14483U;

    public static final void l1(DataPrivacyDialogFragment dataPrivacyDialogFragment) {
        c cVar = dataPrivacyDialogFragment.f14481S;
        if (cVar == null) {
            j.n("mDataPrivacyDialogFragmentPresenter");
            throw null;
        }
        Fragment fragment = (DataPrivacyDialogFragment) ((InterfaceC1862a) cVar.c.get());
        fragment.getParentFragmentManager().beginTransaction().hide(fragment).commit();
        BaseDialogFragment baseDialogFragment = (BaseDialogFragment) ((InterfaceC1862a) cVar.c.get());
        C.R(baseDialogFragment.getActivity());
        baseDialogFragment.f10242K.setTitle("");
        baseDialogFragment.f10242K.setMessage(baseDialogFragment.getString(R.string.pma_progress_message_please_wait));
        baseDialogFragment.f10242K.setCancelable(false);
        baseDialogFragment.f10242K.show();
        p<List<Consent>> userConsent = cVar.e.f11481b.getUserConsent();
        new T(5, new d(new d(AbstractC1331a.l(userConsent, userConsent, b.a()), new A0(cVar, 14), 2), new C1258f0(cVar, 15), 0), new m(cVar, 25)).e();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.f14482T = arguments != null ? arguments.getString("source") : null;
        this.f14483U = (a) getActivity();
        O5.a aVar = W4.a.e().c().f4752a;
        this.f10241B = (C1220i) aVar.f4716g.get();
        c cVar = new c((com.paymaya.data.preference.a) aVar.e.get(), aVar.j(), 2);
        this.f14481S = cVar;
        cVar.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_data_privacy, viewGroup, false);
        int i = R.id.pma_dialog_fragment_data_privacy_text_view_title;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_data_privacy_text_view_title);
        if (textView != null) {
            i = R.id.pma_dialog_fragment_data_privacy_text_view_view_terms_and_conditions;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_data_privacy_text_view_view_terms_and_conditions);
            if (textView2 != null) {
                LinearLayout linearLayout = (LinearLayout) viewInflate;
                this.f14480R = new X0(linearLayout, textView, textView2, 3);
                return linearLayout;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        c cVar = this.f14481S;
        if (cVar == null) {
            j.n("mDataPrivacyDialogFragmentPresenter");
            throw null;
        }
        cVar.i();
        super.onDestroy();
        this.f14480R = null;
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        setCancelable(false);
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        c cVar = this.f14481S;
        if (cVar == null) {
            j.n("mDataPrivacyDialogFragmentPresenter");
            throw null;
        }
        cVar.j();
        X0 x02 = this.f14480R;
        j.d(x02);
        x02.f4031d.setOnClickListener(new ViewOnClickListenerC1479a(this, 21));
    }
}
