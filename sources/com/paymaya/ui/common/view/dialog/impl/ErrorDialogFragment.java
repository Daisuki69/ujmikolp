package com.paymaya.ui.common.view.dialog.impl;

import B5.i;
import Bb.f;
import G5.t;
import N5.C0491z;
import O5.a;
import Tc.b;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.dynatrace.android.callback.Callback;
import com.paymaya.R;
import com.paymaya.common.base.BaseDialogFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import com.paymaya.ui.common.view.dialog.impl.ErrorDialogFragment;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class ErrorDialogFragment extends BaseDialogFragment implements b, t {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0491z f14380R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public TextView f14381S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f14382T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public TextView f14383U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public ImageView f14384V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public HtmlTextView f14385W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public f f14386X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public i f14387Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Uc.b f14388Z;

    public static final void l1(ErrorDialogFragment errorDialogFragment) {
        f fVar = errorDialogFragment.f14386X;
        if (fVar == null) {
            j.n("mErrorDialogFragmentPresenter");
            throw null;
        }
        PayMayaError payMayaError = (PayMayaError) fVar.e;
        if ((payMayaError != null ? payMayaError.mAction() : null) == null) {
            ((ErrorDialogFragment) ((b) fVar.c.get())).dismiss();
            return;
        }
        PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
        String url = payMayaErrorActionMAction != null ? payMayaErrorActionMAction.mUrl() : null;
        if (C.Y(url)) {
            ErrorDialogFragment errorDialogFragment2 = (ErrorDialogFragment) ((b) fVar.c.get());
            errorDialogFragment2.getClass();
            j.g(url, "url");
            if (errorDialogFragment2.getActivity() != null) {
                if (errorDialogFragment2.f14387Y != null) {
                    i.k(errorDialogFragment2.getActivity(), url);
                    return;
                } else {
                    j.n("mFlowController");
                    throw null;
                }
            }
            return;
        }
        PayMayaErrorAction payMayaErrorActionMAction2 = payMayaError.mAction();
        if (payMayaErrorActionMAction2 != null ? j.b(payMayaErrorActionMAction2.isExternal(), Boolean.TRUE) : false) {
            ErrorDialogFragment errorDialogFragment3 = (ErrorDialogFragment) ((b) fVar.c.get());
            FragmentActivity activity = errorDialogFragment3.getActivity();
            if (activity != null) {
                if (errorDialogFragment3.f14387Y != null) {
                    i.f(activity, url);
                    return;
                } else {
                    j.n("mFlowController");
                    throw null;
                }
            }
            return;
        }
        ErrorDialogFragment errorDialogFragment4 = (ErrorDialogFragment) ((b) fVar.c.get());
        errorDialogFragment4.getClass();
        j.g(url, "url");
        if (errorDialogFragment4.getActivity() != null) {
            i iVar = errorDialogFragment4.f14387Y;
            if (iVar != null) {
                iVar.l0(errorDialogFragment4.getActivity(), url);
            } else {
                j.n("mFlowController");
                throw null;
            }
        }
    }

    @Override // G5.t
    public final void m(String link, View view) {
        j.g(link, "link");
        j.g(view, "view");
        dismiss();
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a aVar = (a) W4.a.e().a().c;
        this.f10241B = (C1220i) aVar.f4716g.get();
        this.f14386X = new f(6);
        this.f14387Y = (i) aVar.f4659D.get();
        f fVar = this.f14386X;
        if (fVar != null) {
            fVar.h(this);
        } else {
            j.n("mErrorDialogFragmentPresenter");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.pma_dialog_fragment_error, viewGroup, false);
        int i = R.id.pma_dialog_fragment_error_html_text_view_action;
        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_error_html_text_view_action);
        if (htmlTextView != null) {
            i = R.id.pma_dialog_fragment_error_image_view_close;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_error_image_view_close);
            if (imageView != null) {
                i = R.id.pma_dialog_fragment_error_text_view_action;
                TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_error_text_view_action);
                if (textView != null) {
                    i = R.id.pma_dialog_fragment_error_text_view_message;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_error_text_view_message);
                    if (textView2 != null) {
                        i = R.id.pma_dialog_fragment_error_text_view_title;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_error_text_view_title);
                        if (textView3 != null) {
                            i = R.id.pma_dialog_fragment_error_view_group_close;
                            FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(viewInflate, R.id.pma_dialog_fragment_error_view_group_close);
                            if (frameLayout != null) {
                                LinearLayout linearLayout = (LinearLayout) viewInflate;
                                this.f14380R = new C0491z((ViewGroup) linearLayout, (TextView) htmlTextView, (View) imageView, textView, textView2, (View) textView3, (View) frameLayout, 28);
                                j.f(linearLayout, "getRoot(...)");
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        f fVar = this.f14386X;
        if (fVar == null) {
            j.n("mErrorDialogFragmentPresenter");
            throw null;
        }
        fVar.i();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        j.g(dialog, "dialog");
        Uc.b bVar = this.f14388Z;
        if (bVar != null) {
            bVar.onDismiss();
        }
        super.onDismiss(dialog);
    }

    @Override // com.paymaya.common.base.BaseDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f14380R;
        j.d(c0491z);
        this.f14381S = (TextView) c0491z.f;
        C0491z c0491z2 = this.f14380R;
        j.d(c0491z2);
        this.f14382T = (TextView) c0491z2.h;
        C0491z c0491z3 = this.f14380R;
        j.d(c0491z3);
        this.f14383U = (TextView) c0491z3.f4304d;
        C0491z c0491z4 = this.f14380R;
        j.d(c0491z4);
        this.f14384V = (ImageView) c0491z4.e;
        C0491z c0491z5 = this.f14380R;
        j.d(c0491z5);
        this.f14385W = (HtmlTextView) c0491z5.c;
        ImageView imageView = this.f14384V;
        if (imageView == null) {
            j.n("mImageViewClose");
            throw null;
        }
        final int i = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorDialogFragment f5969b;

            {
                this.f5969b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i) {
                    case 0:
                        ErrorDialogFragment errorDialogFragment = this.f5969b;
                        Callback.onClick_enter(view2);
                        try {
                            errorDialogFragment.getClass();
                            errorDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        ErrorDialogFragment errorDialogFragment2 = this.f5969b;
                        Callback.onClick_enter(view2);
                        try {
                            ErrorDialogFragment.l1(errorDialogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        TextView textView = this.f14383U;
        if (textView == null) {
            j.n("mTextViewAction");
            throw null;
        }
        final int i4 = 1;
        textView.setOnClickListener(new View.OnClickListener(this) { // from class: Uc.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ErrorDialogFragment f5969b;

            {
                this.f5969b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                switch (i4) {
                    case 0:
                        ErrorDialogFragment errorDialogFragment = this.f5969b;
                        Callback.onClick_enter(view2);
                        try {
                            errorDialogFragment.getClass();
                            errorDialogFragment.dismiss();
                            return;
                        } finally {
                        }
                    default:
                        ErrorDialogFragment errorDialogFragment2 = this.f5969b;
                        Callback.onClick_enter(view2);
                        try {
                            ErrorDialogFragment.l1(errorDialogFragment2);
                            return;
                        } finally {
                        }
                }
            }
        });
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            String title = arguments.getString("title");
            String string = arguments.getString("action");
            String string2 = arguments.getString("html");
            String message = arguments.getString("message");
            boolean z4 = arguments.getBoolean("close_button", true);
            PayMayaError payMayaError = (PayMayaError) arguments.getParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            f fVar = this.f14386X;
            if (fVar == null) {
                j.n("mErrorDialogFragmentPresenter");
                throw null;
            }
            fVar.j();
            ErrorDialogFragment errorDialogFragment = (ErrorDialogFragment) ((b) fVar.c.get());
            errorDialogFragment.getClass();
            j.g(title, "title");
            TextView textView2 = errorDialogFragment.f14381S;
            if (textView2 == null) {
                j.n("mTextViewTitle");
                throw null;
            }
            textView2.setText(title);
            if (!z4) {
                ImageView imageView2 = ((ErrorDialogFragment) ((b) fVar.c.get())).f14384V;
                if (imageView2 == null) {
                    j.n("mImageViewClose");
                    throw null;
                }
                imageView2.setVisibility(8);
            }
            if (payMayaError != null) {
                fVar.e = payMayaError;
                b bVar = (b) fVar.c.get();
                String message2 = payMayaError.mSpiel();
                ErrorDialogFragment errorDialogFragment2 = (ErrorDialogFragment) bVar;
                errorDialogFragment2.getClass();
                j.g(message2, "message");
                TextView textView3 = errorDialogFragment2.f14382T;
                if (textView3 == null) {
                    j.n("mTextViewMessage");
                    throw null;
                }
                textView3.setText(message2);
                HtmlTextView htmlTextView = ((ErrorDialogFragment) ((b) fVar.c.get())).f14385W;
                if (htmlTextView == null) {
                    j.n("mHtmlTextViewAction");
                    throw null;
                }
                htmlTextView.setVisibility(8);
                if (payMayaError.mAction() == null) {
                    TextView textView4 = ((ErrorDialogFragment) ((b) fVar.c.get())).f14383U;
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                        return;
                    } else {
                        j.n("mTextViewAction");
                        throw null;
                    }
                }
                b bVar2 = (b) fVar.c.get();
                PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
                j.d(payMayaErrorActionMAction);
                String action = payMayaErrorActionMAction.mTitle();
                ErrorDialogFragment errorDialogFragment3 = (ErrorDialogFragment) bVar2;
                errorDialogFragment3.getClass();
                j.g(action, "action");
                TextView textView5 = errorDialogFragment3.f14383U;
                if (textView5 != null) {
                    textView5.setText(action);
                    return;
                } else {
                    j.n("mTextViewAction");
                    throw null;
                }
            }
            if (string == null || C2576A.H(string)) {
                TextView textView6 = ((ErrorDialogFragment) ((b) fVar.c.get())).f14383U;
                if (textView6 == null) {
                    j.n("mTextViewAction");
                    throw null;
                }
                textView6.setVisibility(8);
            } else {
                ErrorDialogFragment errorDialogFragment4 = (ErrorDialogFragment) ((b) fVar.c.get());
                errorDialogFragment4.getClass();
                TextView textView7 = errorDialogFragment4.f14383U;
                if (textView7 == null) {
                    j.n("mTextViewAction");
                    throw null;
                }
                textView7.setText(string);
                TextView textView8 = ((ErrorDialogFragment) ((b) fVar.c.get())).f14383U;
                if (textView8 == null) {
                    j.n("mTextViewAction");
                    throw null;
                }
                textView8.setVisibility(0);
            }
            if (string2 == null || C2576A.H(string2)) {
                HtmlTextView htmlTextView2 = ((ErrorDialogFragment) ((b) fVar.c.get())).f14385W;
                if (htmlTextView2 == null) {
                    j.n("mHtmlTextViewAction");
                    throw null;
                }
                htmlTextView2.setVisibility(8);
            } else {
                ErrorDialogFragment errorDialogFragment5 = (ErrorDialogFragment) ((b) fVar.c.get());
                errorDialogFragment5.getClass();
                HtmlTextView htmlTextView3 = errorDialogFragment5.f14385W;
                if (htmlTextView3 == null) {
                    j.n("mHtmlTextViewAction");
                    throw null;
                }
                htmlTextView3.setTextHTML(string2);
                ErrorDialogFragment errorDialogFragment6 = (ErrorDialogFragment) ((b) fVar.c.get());
                HtmlTextView htmlTextView4 = errorDialogFragment6.f14385W;
                if (htmlTextView4 == null) {
                    j.n("mHtmlTextViewAction");
                    throw null;
                }
                htmlTextView4.setOnLinkClickListener(errorDialogFragment6);
            }
            ErrorDialogFragment errorDialogFragment7 = (ErrorDialogFragment) ((b) fVar.c.get());
            errorDialogFragment7.getClass();
            j.g(message, "message");
            TextView textView9 = errorDialogFragment7.f14382T;
            if (textView9 != null) {
                textView9.setText(message);
            } else {
                j.n("mTextViewMessage");
                throw null;
            }
        }
    }
}
