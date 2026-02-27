package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import B5.i;
import Fa.c;
import L9.C0327e;
import M8.L;
import N.n;
import N5.C0491z;
import O5.a;
import P9.f;
import Q9.InterfaceC0581k;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseBottomSheetDialogFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.widget.ScrollableWebView;
import com.paymaya.domain.model.CreditAgreement;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.j;
import qj.p;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaAgreementSettingsBottomSheetFragment extends MayaBaseBottomSheetDialogFragment implements f {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public C0491z f13135S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public TextView f13136T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public ScrollableWebView f13137U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public Button f13138V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f13139W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public Function1 f13141Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public C0327e f13142Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public InterfaceC0581k f13143a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public i f13144b0;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f13140X = true;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final EnumC1216e f13145c0 = EnumC1216e.AGREEMENT;

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment
    public final EnumC1216e U() {
        return this.f13145c0;
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10327P = true;
        a aVar = W4.a.e().D().f4752a;
        this.f10325B = (C1220i) aVar.f4716g.get();
        this.f13142Z = new C0327e(3);
        this.f13144b0 = (i) aVar.f4659D.get();
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaAgreementSettingsBottomSheetFragment.NewMayaAgreementSettingsBottomSheetFragmentListener");
        this.f13143a0 = (InterfaceC0581k) componentRequireActivity;
        C0327e c0327e = this.f13142Z;
        if (c0327e == null) {
            j.n("mAgreementSettingsBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.h(this);
        setStyle(0, R.style.MayaBottomSheetDialogStyle);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        j.f(dialogOnCreateDialog, "onCreateDialog(...)");
        dialogOnCreateDialog.requestWindowFeature(1);
        dialogOnCreateDialog.setOnShowListener(new c(this, 13));
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_agreement_settings_bottom_sheet, viewGroup, false);
        int i = R.id.agree_button;
        Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.agree_button);
        if (button != null) {
            i = R.id.policy_web_content_scroll_view;
            ScrollableWebView scrollableWebView = (ScrollableWebView) ViewBindings.findChildViewById(viewInflate, R.id.policy_web_content_scroll_view);
            if (scrollableWebView != null) {
                i = R.id.policy_web_content_view;
                View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.policy_web_content_view);
                if (viewFindChildViewById != null) {
                    i = R.id.sheet_background_view;
                    View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.sheet_background_view);
                    if (viewFindChildViewById2 != null) {
                        i = R.id.title_text_view;
                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.title_text_view);
                        if (textView != null) {
                            i = R.id.top_sheet_line_view;
                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.top_sheet_line_view);
                            if (viewFindChildViewById3 != null) {
                                ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                this.f13135S = new C0491z(constraintLayout, button, scrollableWebView, viewFindChildViewById, viewFindChildViewById2, textView, viewFindChildViewById3, 4);
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

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C0327e c0327e = this.f13142Z;
        if (c0327e == null) {
            j.n("mAgreementSettingsBottomSheetFragmentPresenter");
            throw null;
        }
        c0327e.i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        InterfaceC0581k interfaceC0581k = this.f13143a0;
        if (interfaceC0581k != null) {
            ((NewMayaCreditActivity) interfaceC0581k).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        C0491z c0491z = this.f13135S;
        j.d(c0491z);
        this.f13136T = (TextView) c0491z.f4304d;
        C0491z c0491z2 = this.f13135S;
        j.d(c0491z2);
        this.f13137U = (ScrollableWebView) c0491z2.e;
        C0491z c0491z3 = this.f13135S;
        j.d(c0491z3);
        this.f13138V = (Button) c0491z3.c;
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f13139W = arguments.getInt("position_id");
            this.f13140X = arguments.getBoolean("agreement_acceptance");
            CreditAgreement creditAgreement = (CreditAgreement) arguments.getParcelable("agreement_item");
            C1219h c1219hM1 = m1();
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hM1.j.put("document_type", creditAgreement != null ? creditAgreement.getKey() : null);
            C0327e c0327e = this.f13142Z;
            if (c0327e == null) {
                j.n("mAgreementSettingsBottomSheetFragmentPresenter");
                throw null;
            }
            c0327e.j();
            if (creditAgreement != null) {
                f fVar = (f) c0327e.c.get();
                String title = creditAgreement.getHeading();
                NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment = (NewMayaAgreementSettingsBottomSheetFragment) fVar;
                newMayaAgreementSettingsBottomSheetFragment.getClass();
                j.g(title, "title");
                TextView textView = newMayaAgreementSettingsBottomSheetFragment.f13136T;
                if (textView == null) {
                    j.n("mTextViewTitle");
                    throw null;
                }
                textView.setText(title);
                f fVar2 = (f) c0327e.c.get();
                String content = creditAgreement.getContents();
                final NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment2 = (NewMayaAgreementSettingsBottomSheetFragment) fVar2;
                newMayaAgreementSettingsBottomSheetFragment2.getClass();
                j.g(content, "content");
                C0327e c0327e2 = newMayaAgreementSettingsBottomSheetFragment2.f13142Z;
                if (c0327e2 == null) {
                    j.n("mAgreementSettingsBottomSheetFragmentPresenter");
                    throw null;
                }
                NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment3 = (NewMayaAgreementSettingsBottomSheetFragment) ((f) c0327e2.c.get());
                ScrollableWebView scrollableWebView = newMayaAgreementSettingsBottomSheetFragment3.f13137U;
                if (scrollableWebView == null) {
                    j.n("mWebViewContent");
                    throw null;
                }
                scrollableWebView.setWebViewClient(new n(newMayaAgreementSettingsBottomSheetFragment3));
                String string = newMayaAgreementSettingsBottomSheetFragment2.getString(R.string.pma_label_maya_credit_agreement_html_wrapper, "file:///android_res/font/work_sans_medium.ttf", content);
                j.f(string, "getString(...)");
                ScrollableWebView scrollableWebView2 = newMayaAgreementSettingsBottomSheetFragment2.f13137U;
                if (scrollableWebView2 == null) {
                    j.n("mWebViewContent");
                    throw null;
                }
                scrollableWebView2.setBackgroundColor(ContextCompat.getColor(newMayaAgreementSettingsBottomSheetFragment2.requireContext(), R.color.maya_shades_of_grey_1));
                ScrollableWebView scrollableWebView3 = newMayaAgreementSettingsBottomSheetFragment2.f13137U;
                if (scrollableWebView3 == null) {
                    j.n("mWebViewContent");
                    throw null;
                }
                scrollableWebView3.loadDataWithBaseURL(null, string, "text/html", "utf-8", null);
                if (newMayaAgreementSettingsBottomSheetFragment2.f13140X) {
                    ScrollableWebView scrollableWebView4 = newMayaAgreementSettingsBottomSheetFragment2.f13137U;
                    if (scrollableWebView4 == null) {
                        j.n("mWebViewContent");
                        throw null;
                    }
                    scrollableWebView4.setMOnScrollChanged(new p() { // from class: Q9.j
                        @Override // qj.p
                        public final Object c(Object obj, Object obj2, Object obj3, Object obj4, Serializable serializable) {
                            ((Integer) obj2).getClass();
                            ((Integer) obj3).getClass();
                            ((Integer) obj4).getClass();
                            if (((Integer) serializable).intValue() == 2) {
                                Button button = this.f5323a.f13138V;
                                if (button == null) {
                                    kotlin.jvm.internal.j.n("mButtonAgree");
                                    throw null;
                                }
                                button.setEnabled(true);
                            }
                            return Unit.f18162a;
                        }
                    });
                }
            }
            NewMayaAgreementSettingsBottomSheetFragment newMayaAgreementSettingsBottomSheetFragment4 = (NewMayaAgreementSettingsBottomSheetFragment) ((f) c0327e.c.get());
            Button button = newMayaAgreementSettingsBottomSheetFragment4.f13138V;
            if (button == null) {
                j.n("mButtonAgree");
                throw null;
            }
            button.setText(newMayaAgreementSettingsBottomSheetFragment4.getString(R.string.maya_label_got_it));
        }
        if (!this.f13140X) {
            Button button2 = this.f13138V;
            if (button2 == null) {
                j.n("mButtonAgree");
                throw null;
            }
            button2.setText(getString(R.string.maya_label_done));
            Button button3 = this.f13138V;
            if (button3 == null) {
                j.n("mButtonAgree");
                throw null;
            }
            button3.setEnabled(true);
        }
        Button button4 = this.f13138V;
        if (button4 != null) {
            button4.setOnClickListener(new L(this, 24));
        } else {
            j.n("mButtonAgree");
            throw null;
        }
    }
}
