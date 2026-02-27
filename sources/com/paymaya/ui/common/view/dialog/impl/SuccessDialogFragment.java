package com.paymaya.ui.common.view.dialog.impl;

import G5.t;
import L9.C0327e;
import N5.r1;
import O5.a;
import S.b;
import Tc.d;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.store.A0;
import kotlin.jvm.internal.j;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class SuccessDialogFragment extends BaseDialogFragment implements t, d {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public r1 f14394R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f14395S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public HtmlTextView f14396T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0327e f14397U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public A0 f14398V;

    @Override // G5.t
    public final void m(String link, View view) {
        j.g(link, "link");
        j.g(view, "view");
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10241B = (C1220i) ((a) W4.a.e().a().c).f4716g.get();
        C0327e c0327e = new C0327e(17);
        this.f14397U = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_success, viewGroup, false);
        int i = R.id.pma_dialog_fragment_success_text_view_message_content;
        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_success_text_view_message_content);
        if (htmlTextView != null) {
            i = R.id.pma_dialog_fragment_success_text_view_message_title;
            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_success_text_view_message_title);
            if (textView != null) {
                i = R.id.pma_dialog_fragment_success_view_group_close;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_success_view_group_close);
                if (frameLayout != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    this.f14394R = new r1((ViewGroup) linearLayout, (View) htmlTextView, (View) textView, (View) frameLayout, 6);
                    j.f(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f14397U;
        if (c0327e == null) {
            j.n("mSuccessDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f14394R = null;
        super.onDestroyView();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        r1 r1Var = this.f14394R;
        j.d(r1Var);
        this.f14395S = (TextView) r1Var.f4198b;
        r1 r1Var2 = this.f14394R;
        j.d(r1Var2);
        this.f14396T = (HtmlTextView) r1Var2.f4199d;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        HtmlTextView htmlTextView = this.f14396T;
        if (htmlTextView == null) {
            j.n("mTextViewMessageContent");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(this);
        r1 r1Var3 = this.f14394R;
        j.d(r1Var3);
        ((FrameLayout) r1Var3.e).setOnClickListener(new b(this, 17));
        Bundle arguments = getArguments();
        if (arguments != null) {
            String title = arguments.getString("title");
            String string = arguments.getString("content");
            C0327e c0327e = this.f14397U;
            if (c0327e == null) {
                j.n("mSuccessDialogFragmentPresenter");
                throw null;
            }
            c0327e.j();
            SuccessDialogFragment successDialogFragment = (SuccessDialogFragment) ((d) c0327e.c.get());
            successDialogFragment.getClass();
            j.g(title, "title");
            TextView textView = successDialogFragment.f14395S;
            if (textView == null) {
                j.n("mTextViewMessageTitle");
                throw null;
            }
            textView.setText(title);
            if (string == null || C2576A.H(string)) {
                HtmlTextView htmlTextView2 = ((SuccessDialogFragment) ((d) c0327e.c.get())).f14396T;
                if (htmlTextView2 != null) {
                    htmlTextView2.setVisibility(8);
                    return;
                } else {
                    j.n("mTextViewMessageContent");
                    throw null;
                }
            }
            SuccessDialogFragment successDialogFragment2 = (SuccessDialogFragment) ((d) c0327e.c.get());
            successDialogFragment2.getClass();
            HtmlTextView htmlTextView3 = successDialogFragment2.f14396T;
            if (htmlTextView3 != null) {
                htmlTextView3.setTextHTML(string);
            } else {
                j.n("mTextViewMessageContent");
                throw null;
            }
        }
    }
}
