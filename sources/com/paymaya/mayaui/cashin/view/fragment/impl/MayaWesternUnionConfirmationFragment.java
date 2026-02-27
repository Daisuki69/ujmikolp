package com.paymaya.mayaui.cashin.view.fragment.impl;

import A5.l;
import A7.c;
import Ah.p;
import Bb.f;
import G6.v;
import G7.t;
import K6.o;
import Kh.T;
import L6.G;
import Lh.d;
import N5.F;
import O5.a;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.d0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.WesternUnionTransaction;
import com.paymaya.domain.store.e1;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaWesternUnionConfirmationFragment extends MayaBaseFragment implements o {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public F f11767U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11768V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11769W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11770X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public HtmlTextView f11771Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public Button f11772Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f f11773a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public G f11774b0;

    public static final void H1(MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment) {
        C1220i c1220iO1 = mayaWesternUnionConfirmationFragment.o1();
        FragmentActivity activity = mayaWesternUnionConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(EnumC1215d.WESTERN_UNION);
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.RECEIVE);
        c1220iO1.c(activity, c1219hD);
        f fVarG1 = mayaWesternUnionConfirmationFragment.G1();
        ((MayaBaseFragment) ((o) fVarG1.c.get())).E1();
        Bundle arguments = ((MayaWesternUnionConfirmationFragment) ((o) fVarG1.c.get())).getArguments();
        WesternUnionTransaction westernUnionTransaction = arguments != null ? (WesternUnionTransaction) arguments.getParcelable("western_union") : null;
        if (westernUnionTransaction != null) {
            e1 e1Var = (e1) fVarG1.e;
            String strMTrn = westernUnionTransaction.mTrn();
            e1Var.getClass();
            p<WesternUnionTransaction> pVarExecuteWUTransaction = e1Var.f11438b.executeWUTransaction(strMTrn, RequestBody.create(d0.f10787a, new byte[0]));
            new T(5, new d(new d(AbstractC1331a.l(pVarExecuteWUTransaction, pVarExecuteWUTransaction, b.a()), new l(fVarG1, 27), 2), new v(fVarG1, 0), 0), new c(fVarG1, 24)).e();
        }
    }

    public final f G1() {
        f fVar = this.f11773a0;
        if (fVar != null) {
            return fVar;
        }
        j.n("mWesternUnionConfirmationFragmentPresenter");
        throw null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f11774b0 = (G) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        PayMayaClientApi payMayaClientApi = (PayMayaClientApi) aVar.f4745w.get();
        e1 e1Var = new e1();
        e1Var.f11438b = payMayaClientApi;
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(sessionSubject, "sessionSubject");
        this.f11773a0 = new f(e1Var, sessionSubject, 3);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_western_union_confirmation, viewGroup, false);
        int i = R.id.barrier_mtcn_name;
        if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_mtcn_name)) != null) {
            i = R.id.barrier_sender;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_sender)) != null) {
                i = R.id.button_continue;
                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.button_continue);
                if (button != null) {
                    i = R.id.guide_line_labels;
                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.guide_line_labels)) != null) {
                        i = R.id.html_text_view_confirmation_info;
                        HtmlTextView htmlTextView = (HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.html_text_view_confirmation_info);
                        if (htmlTextView != null) {
                            i = R.id.text_view_amount;
                            TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_amount);
                            if (textView != null) {
                                i = R.id.text_view_confirm_transaction;
                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_confirm_transaction)) != null) {
                                    i = R.id.text_view_mtcn_label;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_mtcn_label)) != null) {
                                        i = R.id.text_view_mtcn_value;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_mtcn_value);
                                        if (textView2 != null) {
                                            i = R.id.text_view_sender_label;
                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sender_label)) != null) {
                                                i = R.id.text_view_sender_value;
                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_sender_value);
                                                if (textView3 != null) {
                                                    i = R.id.view_labels_content;
                                                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.view_labels_content);
                                                    if (viewFindChildViewById != null) {
                                                        i = R.id.view_labels_content_bottom_space;
                                                        View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.view_labels_content_bottom_space);
                                                        if (viewFindChildViewById2 != null) {
                                                            i = R.id.view_mtcn_name_divider;
                                                            View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.view_mtcn_name_divider);
                                                            if (viewFindChildViewById3 != null) {
                                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                this.f11767U = new F(nestedScrollView, button, htmlTextView, textView, textView2, textView3, viewFindChildViewById, viewFindChildViewById2, viewFindChildViewById3, 6);
                                                                return nestedScrollView;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
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
        this.f11767U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        G g8 = this.f11774b0;
        if (g8 != null) {
            ((MayaCashInActivity) g8).Q(this);
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        F f = this.f11767U;
        j.d(f);
        this.f11768V = (TextView) f.f;
        F f3 = this.f11767U;
        j.d(f3);
        this.f11769W = (TextView) f3.f3616g;
        F f7 = this.f11767U;
        j.d(f7);
        this.f11770X = (TextView) f7.e;
        F f10 = this.f11767U;
        j.d(f10);
        this.f11771Y = (HtmlTextView) f10.f3615d;
        F f11 = this.f11767U;
        j.d(f11);
        this.f11772Z = (Button) f11.c;
        if (getArguments() != null) {
            Bundle arguments = getArguments();
            WesternUnionTransaction westernUnionTransaction = arguments != null ? (WesternUnionTransaction) arguments.getParcelable("western_union") : null;
            if (westernUnionTransaction != null) {
                f fVarG1 = G1();
                o oVar = (o) fVarG1.c.get();
                String strMSender = westernUnionTransaction.mSender();
                j.f(strMSender, "mSender(...)");
                MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment = (MayaWesternUnionConfirmationFragment) oVar;
                mayaWesternUnionConfirmationFragment.getClass();
                TextView textView = mayaWesternUnionConfirmationFragment.f11769W;
                if (textView == null) {
                    j.n("mTextViewSender");
                    throw null;
                }
                textView.setText(strMSender);
                o oVar2 = (o) fVarG1.c.get();
                String strMMtcn = westernUnionTransaction.mMtcn();
                j.f(strMMtcn, "mMtcn(...)");
                MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment2 = (MayaWesternUnionConfirmationFragment) oVar2;
                mayaWesternUnionConfirmationFragment2.getClass();
                TextView textView2 = mayaWesternUnionConfirmationFragment2.f11768V;
                if (textView2 == null) {
                    j.n("mTextViewMtcn");
                    throw null;
                }
                textView2.setText(strMMtcn);
                String amount = AbstractC1414e.h("₱ ", westernUnionTransaction.mAmount().getFormattedValue());
                MayaWesternUnionConfirmationFragment mayaWesternUnionConfirmationFragment3 = (MayaWesternUnionConfirmationFragment) ((o) fVarG1.c.get());
                mayaWesternUnionConfirmationFragment3.getClass();
                j.g(amount, "amount");
                TextView textView3 = mayaWesternUnionConfirmationFragment3.f11770X;
                if (textView3 == null) {
                    j.n("mTextViewAmount");
                    throw null;
                }
                textView3.setText(amount);
            }
        }
        HtmlTextView htmlTextView = this.f11771Y;
        if (htmlTextView == null) {
            j.n("mHtmlTextViewTermsAndPolicy");
            throw null;
        }
        htmlTextView.setOnLinkClickListener(new t(this, 13));
        Button button = this.f11772Z;
        if (button != null) {
            button.setOnClickListener(new Ba.a(this, 23));
        } else {
            j.n("mButtonReceive");
            throw null;
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.WESTERN_UNION;
    }
}
