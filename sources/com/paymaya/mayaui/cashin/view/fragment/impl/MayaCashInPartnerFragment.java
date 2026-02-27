package com.paymaya.mayaui.cashin.view.fragment.impl;

import Ae.a;
import G7.t;
import K6.i;
import L6.r;
import N5.C0453g;
import S5.c;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.B;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.S;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInPartnerFragment extends MayaBaseFragment implements i {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0453g f11702U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public HtmlTextView f11703V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11704W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public ImageView f11705X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public a f11706Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public r f11707Z;

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11707Z = (r) getActivity();
        O5.a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (c) aVar.f4724k.get();
        a aVar2 = new a(26);
        this.f11706Y = aVar2;
        aVar2.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_cash_in_partner, viewGroup, false);
        int i = R.id.cash_in_partner_icon_image_view;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.cash_in_partner_icon_image_view);
        if (imageView != null) {
            i = R.id.cash_in_partner_name_text_view;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.cash_in_partner_name_text_view);
            if (textView != null) {
                i = R.id.constraint_layout;
                if (((ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.constraint_layout)) != null) {
                    ScrollView scrollView = (ScrollView) viewInflate;
                    i = R.id.steps_html_text_view;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.steps_html_text_view);
                    if (htmlTextView != null) {
                        i = R.id.title_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view)) != null) {
                            this.f11702U = new C0453g(8, scrollView, imageView, textView, htmlTextView);
                            j.f(scrollView, "getRoot(...)");
                            return scrollView;
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        a aVar = this.f11706Y;
        if (aVar == null) {
            j.n("mMayaCashInPartnerFragmentPresenter");
            throw null;
        }
        aVar.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        r rVar = this.f11707Z;
        if (rVar != null) {
            ((MayaCashInActivity) rVar).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f11702U;
        j.d(c0453g);
        this.f11703V = (HtmlTextView) c0453g.e;
        C0453g c0453g2 = this.f11702U;
        j.d(c0453g2);
        this.f11705X = (ImageView) c0453g2.c;
        C0453g c0453g3 = this.f11702U;
        j.d(c0453g3);
        this.f11704W = (TextView) c0453g3.f4095d;
        HtmlTextView htmlTextView = this.f11703V;
        if (htmlTextView == null) {
            j.n("mHtmlTextViewSteps");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new t(this, 11));
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString(AppMeasurementSdk.ConditionalUserProperty.NAME);
            String string2 = arguments.getString("steps");
            String string3 = arguments.getString("icon");
            a aVar = this.f11706Y;
            if (aVar == null) {
                j.n("mMayaCashInPartnerFragmentPresenter");
                throw null;
            }
            MayaCashInPartnerFragment mayaCashInPartnerFragment = (MayaCashInPartnerFragment) ((i) aVar.c.get());
            ImageView imageView = mayaCashInPartnerFragment.f11705X;
            if (imageView == null) {
                j.n("mImageViewLoadUpPartner");
                throw null;
            }
            imageView.getContext();
            ImageView imageView2 = mayaCashInPartnerFragment.f11705X;
            if (imageView2 == null) {
                j.n("mImageViewLoadUpPartner");
                throw null;
            }
            C.e0(string3, imageView2, 2131231850);
            TextView textView = ((MayaCashInPartnerFragment) ((i) aVar.c.get())).f11704W;
            if (textView == null) {
                j.n("mNameTextView");
                throw null;
            }
            textView.setText(string);
            MayaCashInPartnerFragment mayaCashInPartnerFragment2 = (MayaCashInPartnerFragment) ((i) aVar.c.get());
            Context context = mayaCashInPartnerFragment2.getContext();
            HtmlTextView htmlTextView2 = mayaCashInPartnerFragment2.f11703V;
            if (htmlTextView2 == null) {
                j.n("mHtmlTextViewSteps");
                throw null;
            }
            S s9 = new S(context, htmlTextView2);
            HtmlTextView htmlTextView3 = mayaCashInPartnerFragment2.f11703V;
            if (htmlTextView3 == null) {
                j.n("mHtmlTextViewSteps");
                throw null;
            }
            B b8 = new B();
            if (TextUtils.isEmpty(string2)) {
                return;
            }
            htmlTextView3.setText(htmlTextView3.a(string2, b8, s9));
        }
    }
}
