package com.paymaya.mayaui.common.view.dialog.impl;

import B5.i;
import L9.C0327e;
import N5.C0491z;
import O5.a;
import V6.c;
import W6.d;
import W6.e;
import W6.f;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.PayMayaErrorAction;
import kotlin.jvm.internal.j;
import mx_android.support.v7.media.MediaRouteProviderProtocol;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public class MayaErrorDialogFragment extends MayaBaseDialogFragment implements c {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public C0491z f11839R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public ImageView f11840S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f11841T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public HtmlTextView f11842U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f11843V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public Button f11844W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f11845X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public EnumC1215d f11846Y = EnumC1215d.DEFAULT;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0327e f11847Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i f11848a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public f f11849b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public e f11850c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public d f11851d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public View.OnClickListener f11852e0;

    public static final void u1(MayaErrorDialogFragment mayaErrorDialogFragment) {
        C0327e c0327eP1 = mayaErrorDialogFragment.p1();
        Bundle arguments = ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).getArguments();
        PayMayaError payMayaError = arguments != null ? (PayMayaError) arguments.getParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR) : null;
        if ((payMayaError != null ? payMayaError.mAction() : null) != null) {
            c0327eP1.l(payMayaError.mAction());
        } else {
            MayaErrorDialogFragment mayaErrorDialogFragment2 = (MayaErrorDialogFragment) ((c) c0327eP1.c.get());
            View.OnClickListener onClickListener = mayaErrorDialogFragment2.f11852e0;
            if (onClickListener != null) {
                onClickListener.onClick(mayaErrorDialogFragment2.n1());
            }
        }
        Bundle arguments2 = ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).getArguments();
        if (arguments2 != null ? arguments2.getBoolean("action_dismiss", true) : true) {
            ((c) c0327eP1.c.get()).dismiss();
        }
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment
    public final EnumC1215d m1() {
        return this.f11846Y;
    }

    public final Button n1() {
        Button button = this.f11843V;
        if (button != null) {
            return button;
        }
        j.n("mButtonActionPrimary");
        throw null;
    }

    public final Button o1() {
        Button button = this.f11844W;
        if (button != null) {
            return button;
        }
        j.n("mButtonActionSecondary");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f11845X) {
            C1219h c1219h = this.f10332P;
            if (c1219h == null) {
                j.n("durationAnalyticsEvent");
                throw null;
            }
            c1219h.i();
            this.f10333Q = true;
        }
        this.f11849b0 = (f) getActivity();
        a aVar = (a) W4.a.e().a().c;
        this.f10330B = (C1220i) aVar.f4716g.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        j.g(preference, "preference");
        this.f11847Z = new C0327e(23);
        this.f11848a0 = (i) aVar.f4659D.get();
        p1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_dialog_fragment_error, viewGroup, false);
        int i = R.id.button_action_primary;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_action_primary);
        if (button != null) {
            i = R.id.button_action_secondary;
            Button button2 = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_action_secondary);
            if (button2 != null) {
                i = R.id.image_view_error_image;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_error_image);
                if (imageView != null) {
                    i = R.id.text_view_error_message;
                    HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_message);
                    if (htmlTextView != null) {
                        i = R.id.text_view_error_title;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_error_title);
                        if (textView != null) {
                            i = R.id.view_divider;
                            View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_divider);
                            if (viewFindChildViewById != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f11839R = new C0491z((ViewGroup) constraintLayout, (View) button, (Object) button2, (Object) imageView, (View) htmlTextView, (View) textView, viewFindChildViewById, 1);
                                j.f(constraintLayout, "getRoot(...)");
                                return constraintLayout;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        p1().i();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        j.g(dialog, "dialog");
        e eVar = this.f11850c0;
        if (eVar != null) {
            eVar.onDismiss();
        }
        super.onDismiss(dialog);
    }

    @Override // com.paymaya.common.base.MayaBaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f11839R;
        j.d(c0491z);
        this.f11840S = (ImageView) c0491z.f;
        C0491z c0491z2 = this.f11839R;
        j.d(c0491z2);
        this.f11841T = (TextView) c0491z2.f4304d;
        C0491z c0491z3 = this.f11839R;
        j.d(c0491z3);
        this.f11842U = (HtmlTextView) c0491z3.f4305g;
        C0491z c0491z4 = this.f11839R;
        j.d(c0491z4);
        this.f11843V = (Button) c0491z4.c;
        C0491z c0491z5 = this.f11839R;
        j.d(c0491z5);
        this.f11844W = (Button) c0491z5.e;
        HtmlTextView htmlTextView = this.f11842U;
        if (htmlTextView == null) {
            j.n("mTextViewMessage");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new Na.d(this, 24));
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setCanceledOnTouchOutside(false);
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i = arguments.getInt("drawable", 0);
            String string = arguments.getString("title");
            String string2 = arguments.getString("action");
            String string3 = arguments.getString("cancel");
            boolean z4 = arguments.getBoolean("imply_cancel");
            String string4 = arguments.getString("message");
            PayMayaError payMayaError = (PayMayaError) arguments.getParcelable(MediaRouteProviderProtocol.SERVICE_DATA_ERROR);
            C0327e c0327eP1 = p1();
            if (i == 0) {
                MayaErrorDialogFragment mayaErrorDialogFragment = (MayaErrorDialogFragment) ((c) c0327eP1.c.get());
                ImageView imageView = mayaErrorDialogFragment.f11840S;
                if (imageView == null) {
                    j.n("mImageViewImage");
                    throw null;
                }
                imageView.setImageDrawable(ContextCompat.getDrawable(mayaErrorDialogFragment.requireContext(), 2131231241));
            } else {
                MayaErrorDialogFragment mayaErrorDialogFragment2 = (MayaErrorDialogFragment) ((c) c0327eP1.c.get());
                ImageView imageView2 = mayaErrorDialogFragment2.f11840S;
                if (imageView2 == null) {
                    j.n("mImageViewImage");
                    throw null;
                }
                imageView2.setImageDrawable(ContextCompat.getDrawable(mayaErrorDialogFragment2.requireContext(), i));
            }
            if (string == null || C2576A.H(string)) {
                MayaErrorDialogFragment mayaErrorDialogFragment3 = (MayaErrorDialogFragment) ((c) c0327eP1.c.get());
                TextView textView = mayaErrorDialogFragment3.f11841T;
                if (textView == null) {
                    j.n("mTextViewTitle");
                    throw null;
                }
                textView.setText(mayaErrorDialogFragment3.getString(R.string.maya_label_something_went_wrong_title));
            } else {
                TextView textView2 = ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).f11841T;
                if (textView2 == null) {
                    j.n("mTextViewTitle");
                    throw null;
                }
                textView2.setText(string);
            }
            if (payMayaError != null) {
                c cVar = (c) c0327eP1.c.get();
                String strMSpiel = payMayaError.mSpiel();
                HtmlTextView htmlTextView2 = ((MayaErrorDialogFragment) cVar).f11842U;
                if (htmlTextView2 == null) {
                    j.n("mTextViewMessage");
                    throw null;
                }
                htmlTextView2.setTextHTML(strMSpiel);
                if (payMayaError.mAction() == null) {
                    ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).v1();
                    return;
                }
                c cVar2 = (c) c0327eP1.c.get();
                PayMayaErrorAction payMayaErrorActionMAction = payMayaError.mAction();
                j.d(payMayaErrorActionMAction);
                ((MayaErrorDialogFragment) cVar2).t1(payMayaErrorActionMAction.mTitle(), true);
                return;
            }
            if (string2 == null || C2576A.H(string2)) {
                ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).v1();
            } else if (string3 == null || C2576A.H(string3)) {
                ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).t1(string2, z4);
            } else {
                MayaErrorDialogFragment mayaErrorDialogFragment4 = (MayaErrorDialogFragment) ((c) c0327eP1.c.get());
                mayaErrorDialogFragment4.getClass();
                mayaErrorDialogFragment4.t1(string2, true);
                mayaErrorDialogFragment4.o1().setText(string3);
            }
            if (string4 != null && !C2576A.H(string4)) {
                HtmlTextView htmlTextView3 = ((MayaErrorDialogFragment) ((c) c0327eP1.c.get())).f11842U;
                if (htmlTextView3 != null) {
                    htmlTextView3.setTextHTML(string4);
                    return;
                } else {
                    j.n("mTextViewMessage");
                    throw null;
                }
            }
            MayaErrorDialogFragment mayaErrorDialogFragment5 = (MayaErrorDialogFragment) ((c) c0327eP1.c.get());
            HtmlTextView htmlTextView4 = mayaErrorDialogFragment5.f11842U;
            if (htmlTextView4 != null) {
                htmlTextView4.setTextHTML(mayaErrorDialogFragment5.getString(R.string.maya_label_lets_try_that_again));
            } else {
                j.n("mTextViewMessage");
                throw null;
            }
        }
    }

    public final C0327e p1() {
        C0327e c0327e = this.f11847Z;
        if (c0327e != null) {
            return c0327e;
        }
        j.n("mErrorDialogFragmentPresenter");
        throw null;
    }

    public final i q1() {
        i iVar = this.f11848a0;
        if (iVar != null) {
            return iVar;
        }
        j.n("mFlowController");
        throw null;
    }

    public final String r1() {
        return n1().getText().toString();
    }

    public final void s1(PayMayaErrorAction payMayaErrorAction) {
        p1().l(payMayaErrorAction);
    }

    public final void t1(String str, boolean z4) {
        n1().setVisibility(0);
        n1().setText(str);
        n1().setOnClickListener(new T6.f(this, 1));
        if (!z4) {
            o1().setVisibility(8);
            return;
        }
        o1().setVisibility(0);
        o1().setText(getString(R.string.maya_label_got_it));
        o1().setOnClickListener(new T6.f(this, 2));
    }

    public final void v1() {
        n1().setVisibility(0);
        o1().setVisibility(8);
        n1().setText(getString(R.string.maya_label_got_it));
        n1().setOnClickListener(new T6.f(this, 3));
    }
}
