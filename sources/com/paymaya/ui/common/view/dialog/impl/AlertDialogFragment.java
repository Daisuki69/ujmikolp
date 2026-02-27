package com.paymaya.ui.common.view.dialog.impl;

import L9.C0327e;
import N5.r1;
import S.b;
import Tc.a;
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
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AlertDialogFragment extends BaseDialogFragment implements a {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public r1 f14376R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f14377S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f14378T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C0327e f14379U;

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10241B = (C1220i) ((O5.a) W4.a.e().a().c).f4716g.get();
        C0327e c0327e = new C0327e(14);
        this.f14379U = c0327e;
        c0327e.h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_alert, viewGroup, false);
        int i = R.id.pma_dialog_fragment_alert_text_view_message_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_alert_text_view_message_content);
        if (textView != null) {
            i = R.id.pma_dialog_fragment_alert_text_view_message_title;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_alert_text_view_message_title);
            if (textView2 != null) {
                i = R.id.pma_dialog_fragment_alert_view_group_close;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_alert_view_group_close);
                if (frameLayout != null) {
                    LinearLayout linearLayout = (LinearLayout) viewInflate;
                    this.f14376R = new r1((ViewGroup) linearLayout, textView, textView2, frameLayout, 5);
                    j.f(linearLayout, "getRoot(...)");
                    return linearLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f14379U;
        if (c0327e == null) {
            j.n("mAlertDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        r1 r1Var = this.f14376R;
        j.d(r1Var);
        this.f14377S = (TextView) r1Var.f4199d;
        r1 r1Var2 = this.f14376R;
        j.d(r1Var2);
        this.f14378T = (TextView) r1Var2.f4198b;
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        r1 r1Var3 = this.f14376R;
        j.d(r1Var3);
        ((FrameLayout) r1Var3.e).setOnClickListener(new b(this, 15));
        Bundle arguments = getArguments();
        if (arguments != null) {
            C0327e c0327e = this.f14379U;
            if (c0327e == null) {
                j.n("mAlertDialogFragmentPresenter");
                throw null;
            }
            String title = arguments.getString("title");
            String message = arguments.getString("content");
            j.g(title, "title");
            j.g(message, "message");
            c0327e.j();
            AlertDialogFragment alertDialogFragment = (AlertDialogFragment) ((a) c0327e.c.get());
            alertDialogFragment.getClass();
            TextView textView = alertDialogFragment.f14377S;
            if (textView == null) {
                j.n("mTextViewMessageTitle");
                throw null;
            }
            textView.setText(title);
            AlertDialogFragment alertDialogFragment2 = (AlertDialogFragment) ((a) c0327e.c.get());
            alertDialogFragment2.getClass();
            TextView textView2 = alertDialogFragment2.f14378T;
            if (textView2 != null) {
                textView2.setText(message);
            } else {
                j.n("mTextViewMessageContent");
                throw null;
            }
        }
    }
}
