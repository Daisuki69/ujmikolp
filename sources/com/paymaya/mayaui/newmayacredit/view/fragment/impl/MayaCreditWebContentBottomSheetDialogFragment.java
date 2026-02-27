package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import Fa.c;
import Ke.b;
import L9.C0327e;
import M8.C0332a;
import N5.C0447e;
import P9.e;
import W4.a;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import androidx.webkit.WebViewClientCompat;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.ScrollableWebView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class MayaCreditWebContentBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements e {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0447e f13127S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f13128T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ScrollableWebView f13129U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13130V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f13131W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f13132X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function1 f13133Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0327e f13134Z;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        this.f10325B = (C1220i) a.e().D().f4752a.f4716g.get();
        this.f13134Z = new C0327e(1);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditWebContentBottomSheetDialogFragment.MayaCreditWebContentBottomSheetDialogFragmentListener");
        C0327e c0327e = this.f13134Z;
        if (c0327e != null) {
            c0327e.h(this);
        } else {
            j.n("mMayaCreditWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 12));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_credit_bottom_sheet_dialog_web_content, viewGroup, false);
        int i = R.id.button_done;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_done);
        if (button != null) {
            i = R.id.scroll_web_view_content;
            ScrollableWebView scrollableWebView = (ScrollableWebView) ViewBindings.findChildViewById(viewInflate, R.id.scroll_web_view_content);
            if (scrollableWebView != null) {
                i = R.id.text_view_title;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_title);
                if (textView != null) {
                    i = R.id.view_policy_web_content;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_policy_web_content);
                    if (viewFindChildViewById != null) {
                        ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                        this.f13127S = new C0447e(13, button, scrollableWebView, viewFindChildViewById, constraintLayout, textView);
                        j.f(constraintLayout, "getRoot(...)");
                        return constraintLayout;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13134Z;
        if (c0327e == null) {
            j.n("mMayaCreditWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0447e c0447e = this.f13127S;
        j.d(c0447e);
        this.f13128T = (TextView) c0447e.f;
        C0447e c0447e2 = this.f13127S;
        j.d(c0447e2);
        this.f13129U = (ScrollableWebView) c0447e2.f4080d;
        C0447e c0447e3 = this.f13127S;
        j.d(c0447e3);
        this.f13130V = (Button) c0447e3.c;
        ScrollableWebView scrollableWebView = this.f13129U;
        if (scrollableWebView == null) {
            j.n("mContentScrollableWebView");
            throw null;
        }
        scrollableWebView.getSettings().setJavaScriptEnabled(false);
        scrollableWebView.getSettings().setDomStorageEnabled(true);
        scrollableWebView.setWebViewClient(new WebViewClientCompat());
        Button button = this.f13130V;
        if (button == null) {
            j.n("mDoneButton");
            throw null;
        }
        b.b(button, new C0332a(this, 25));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13131W = arguments.getString("title", "");
            this.f13132X = arguments.getString("web_content", "");
            if (arguments.containsKey("button_text")) {
                String string = arguments.getString("button_text", "");
                Button button2 = this.f13130V;
                if (button2 == null) {
                    j.n("mDoneButton");
                    throw null;
                }
                button2.setText(string);
            }
        }
        C0327e c0327e = this.f13134Z;
        if (c0327e != null) {
            c0327e.j();
        } else {
            j.n("mMayaCreditWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }
}
