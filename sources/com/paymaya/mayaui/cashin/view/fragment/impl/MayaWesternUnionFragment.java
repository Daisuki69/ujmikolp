package com.paymaya.mayaui.cashin.view.fragment.impl;

import G6.u;
import G6.x;
import K6.p;
import Ke.e;
import L6.H;
import L6.l;
import N5.C0453g;
import O5.a;
import S5.c;
import Uh.d;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.store.e1;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWesternUnionFragment extends MayaBaseFragment implements p {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f11775U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public MayaInputLayout f11776V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f11777W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public HtmlTextView f11778X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public x f11779Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public H f11780Z;

    public final x G1() {
        x xVar = this.f11779Y;
        if (xVar != null) {
            return xVar;
        }
        j.n("mWesternUnionFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        this.f11780Z = (H) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        e1 e1Var = new e1();
        e1Var.f11438b = payMayaClientApi;
        d sessionSubject = (d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        this.f11779Y = new x(e1Var, sessionSubject);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_western_union, viewGroup, false);
        int i = R.id.button_continue;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
        if (button != null) {
            i = R.id.maya_input_layout_mtcn;
            MayaInputLayout mayaInputLayout = (MayaInputLayout) ViewBindings.findChildViewById(viewInflate, R.id.maya_input_layout_mtcn);
            if (mayaInputLayout != null) {
                ScrollView scrollView = (ScrollView) viewInflate;
                i = R.id.text_view_title_header;
                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title_header)) != null) {
                    i = R.id.text_view_whats_mtcn;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_whats_mtcn);
                    if (htmlTextView != null) {
                        this.f11775U = new C0453g(21, scrollView, button, mayaInputLayout, htmlTextView);
                        return scrollView;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        G1().i();
        super.onDestroy();
        this.f11775U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        H h = this.f11780Z;
        if (h != null) {
            ((MayaCashInActivity) h).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f11775U;
        j.d(c0453g);
        this.f11776V = (MayaInputLayout) c0453g.f4095d;
        C0453g c0453g2 = this.f11775U;
        j.d(c0453g2);
        this.f11777W = (Button) c0453g2.c;
        C0453g c0453g3 = this.f11775U;
        j.d(c0453g3);
        this.f11778X = (HtmlTextView) c0453g3.e;
        Button button = this.f11777W;
        if (button == null) {
            j.n("mButtonContinue");
            throw null;
        }
        button.setOnClickListener(new Ba.a(this, 24));
        MayaInputLayout mayaInputLayout = this.f11776V;
        if (mayaInputLayout == null) {
            j.n("mMayaInputLayoutMTCN");
            throw null;
        }
        mayaInputLayout.getInputEditText().addTextChangedListener(new l(this, 1));
        HtmlTextView htmlTextView = this.f11778X;
        if (htmlTextView == null) {
            j.n("mHtmlTextViewWhatsMTCN");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new u(this, 8));
        MayaInputLayout mayaInputLayout2 = this.f11776V;
        if (mayaInputLayout2 == null) {
            j.n("mMayaInputLayoutMTCN");
            throw null;
        }
        mayaInputLayout2.getInputEditText().setOnEditorActionListener(new e(this, 1));
        mayaInputLayout2.c();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.WESTERN_UNION;
    }
}
