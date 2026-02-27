package com.paymaya.mayaui.dataprivacy.view.fragment.impl;

import Fa.c;
import L9.C0327e;
import N5.C0453g;
import O7.a;
import R7.d;
import S.b;
import S7.j;
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

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"SetJavaScriptEnabled"})
public class MayaDataPrivacyWebContentBottomSheetDialogFragment extends MayaBaseBottomSheetDialogFragment implements d {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0453g f12303S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f12304T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ScrollableWebView f12305U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f12306V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public String f12307W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public String f12308X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public String f12309Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Function1 f12310Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public a f12311a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public C0327e f12312b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public j f12313c0;

    public static final void s1(MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment) {
        C0327e c0327e = mayaDataPrivacyWebContentBottomSheetDialogFragment.f12312b0;
        if (c0327e == null) {
            kotlin.jvm.internal.j.n("mMayaDataPrivacyWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
        Bundle arguments = ((MayaDataPrivacyWebContentBottomSheetDialogFragment) ((d) c0327e.c.get())).getArguments();
        if (arguments != null ? arguments.containsKey("web_content_url") : false) {
            MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment2 = (MayaDataPrivacyWebContentBottomSheetDialogFragment) ((d) c0327e.c.get());
            Function1 function1 = mayaDataPrivacyWebContentBottomSheetDialogFragment2.f12310Z;
            if (function1 != null) {
                Button button = mayaDataPrivacyWebContentBottomSheetDialogFragment2.f12306V;
                if (button == null) {
                    kotlin.jvm.internal.j.n("mDoneButton");
                    throw null;
                }
                function1.invoke(button);
            }
            mayaDataPrivacyWebContentBottomSheetDialogFragment2.dismiss();
            return;
        }
        MayaDataPrivacyWebContentBottomSheetDialogFragment mayaDataPrivacyWebContentBottomSheetDialogFragment3 = (MayaDataPrivacyWebContentBottomSheetDialogFragment) ((d) c0327e.c.get());
        Function1 function12 = mayaDataPrivacyWebContentBottomSheetDialogFragment3.f12310Z;
        if (function12 != null) {
            Button button2 = mayaDataPrivacyWebContentBottomSheetDialogFragment3.f12306V;
            if (button2 == null) {
                kotlin.jvm.internal.j.n("mDoneButton");
                throw null;
            }
            function12.invoke(button2);
        }
        mayaDataPrivacyWebContentBottomSheetDialogFragment3.dismiss();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        O5.a aVar = W4.a.e().l().f4755a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        kotlin.jvm.internal.j.g(sessionSubject, "sessionSubject");
        this.f12312b0 = new C0327e(13);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        kotlin.jvm.internal.j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.dataprivacy.view.fragment.impl.MayaDataPrivacyWebContentBottomSheetDialogFragment.MayaDataPrivacyWebContentBottomSheetDialogFragmentListener");
        this.f12313c0 = (j) componentRequireActivity;
        C0327e c0327e = this.f12312b0;
        if (c0327e != null) {
            c0327e.h(this);
        } else {
            kotlin.jvm.internal.j.n("mMayaDataPrivacyWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        kotlin.jvm.internal.j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 22));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_bottom_sheet_dialog_fragment_data_privacy_web_content, viewGroup, false);
        int i = R.id.content_scrollable_web_view;
        ScrollableWebView scrollableWebView = (ScrollableWebView) ViewBindings.findChildViewById(viewInflate, R.id.content_scrollable_web_view);
        if (scrollableWebView != null) {
            i = R.id.done_button;
            Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.done_button);
            if (button != null) {
                i = R.id.title_header_text_view;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_header_text_view);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                    this.f12303S = new C0453g(3, constraintLayout, scrollableWebView, button, textView);
                    kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                    return constraintLayout;
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f12312b0;
        if (c0327e == null) {
            kotlin.jvm.internal.j.n("mMayaDataPrivacyWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        j jVar = this.f12313c0;
        if (jVar != null) {
            jVar.Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0453g c0453g = this.f12303S;
        kotlin.jvm.internal.j.d(c0453g);
        this.f12304T = (TextView) c0453g.e;
        C0453g c0453g2 = this.f12303S;
        kotlin.jvm.internal.j.d(c0453g2);
        this.f12305U = (ScrollableWebView) c0453g2.c;
        C0453g c0453g3 = this.f12303S;
        kotlin.jvm.internal.j.d(c0453g3);
        this.f12306V = (Button) c0453g3.f4095d;
        ScrollableWebView scrollableWebView = this.f12305U;
        if (scrollableWebView == null) {
            kotlin.jvm.internal.j.n("mContentScrollableWebView");
            throw null;
        }
        scrollableWebView.getSettings().setJavaScriptEnabled(true);
        scrollableWebView.getSettings().setDomStorageEnabled(true);
        scrollableWebView.setWebViewClient(new WebViewClientCompat());
        Button button = this.f12306V;
        if (button == null) {
            kotlin.jvm.internal.j.n("mDoneButton");
            throw null;
        }
        button.setOnClickListener(new b(this, 6));
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f12307W = arguments.getString("title", "");
            this.f12308X = arguments.getString("web_content_url", "");
            this.f12309Y = arguments.getString("web_content", "");
            if (arguments.containsKey("button_text")) {
                String string = arguments.getString("button_text", "");
                C0453g c0453g4 = this.f12303S;
                kotlin.jvm.internal.j.d(c0453g4);
                ((Button) c0453g4.f4095d).setText(string);
            }
        }
        C0327e c0327e = this.f12312b0;
        if (c0327e != null) {
            c0327e.j();
        } else {
            kotlin.jvm.internal.j.n("mMayaDataPrivacyWebContentBottomSheetDialogFragmentPresenter");
            throw null;
        }
    }
}
