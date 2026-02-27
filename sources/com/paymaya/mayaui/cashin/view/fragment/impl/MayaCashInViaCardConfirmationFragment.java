package com.paymaya.mayaui.cashin.view.fragment.impl;

import A5.l;
import Ag.f;
import Ah.p;
import D8.C0214w;
import G6.q;
import K6.k;
import Kh.T;
import L6.t;
import Lh.d;
import N5.C;
import O5.a;
import V2.c;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.viewbinding.ViewBindings;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.common.utility.d0;
import com.paymaya.domain.model.CreatePullFunds;
import com.paymaya.domain.model.ExecutePullFunds;
import com.paymaya.domain.model.PullFundsDetails;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import d4.AbstractC1331a;
import kotlin.jvm.internal.j;
import okhttp3.RequestBody;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class MayaCashInViaCardConfirmationFragment extends MayaBaseFragment implements k {

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public C f11717U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextView f11718V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public TextView f11719W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public TextView f11720X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public TextView f11721Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public TextView f11722Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public Button f11723a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public TextView f11724b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public Group f11725c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public ImageView f11726d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f11727e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public ExecutePullFunds f11728f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public C0214w f11729g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public t f11730h0;

    public static final void H1(MayaCashInViaCardConfirmationFragment mayaCashInViaCardConfirmationFragment) {
        C1220i c1220iO1 = mayaCashInViaCardConfirmationFragment.o1();
        FragmentActivity activity = mayaCashInViaCardConfirmationFragment.getActivity();
        C1219h c1219hD = C1219h.d(mayaCashInViaCardConfirmationFragment.u1());
        c1219hD.n(17);
        c1219hD.t(EnumC1217f.SUBMIT);
        c1220iO1.c(activity, c1219hD);
        C0214w c0214wG1 = mayaCashInViaCardConfirmationFragment.G1();
        ((MayaBaseFragment) ((k) c0214wG1.c.get())).E1();
        C1295y0 c1295y0 = (C1295y0) c0214wG1.f;
        CreatePullFunds createPullFunds = (CreatePullFunds) c0214wG1.f1106g;
        String strMPurchaseId = createPullFunds != null ? createPullFunds.mPurchaseId() : null;
        c1295y0.getClass();
        p<ExecutePullFunds> pVarExecutePullFunds = c1295y0.f11503b.executePullFunds(strMPurchaseId, RequestBody.create(d0.f10787a, new byte[0]));
        c cVar = new c(c0214wG1, 28);
        pVarExecutePullFunds.getClass();
        new T(5, new d(new d(pVarExecutePullFunds, cVar, 2), new l(c0214wG1, 25), 0), new A7.c(c0214wG1, 23)).e();
    }

    public final C0214w G1() {
        C0214w c0214w = this.f11729g0;
        if (c0214w != null) {
            return c0214w;
        }
        j.n("mFragmentPresenter");
        throw null;
    }

    public final void I1(ExecutePullFunds executePullFunds) {
        j.g(executePullFunds, "executePullFunds");
        t tVar = this.f11730h0;
        if (tVar != null) {
            MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) tVar;
            String string = mayaCashInActivity.getString(R.string.maya_label_cash_in_failed_title);
            j.f(string, "getString(...)");
            String string2 = mayaCashInActivity.getString(R.string.maya_label_cash_in_via_card_failed_description);
            j.f(string2, "getString(...)");
            mayaCashInActivity.Z1(R.drawable.maya_ic_failed, string, string2, executePullFunds, new f(1, mayaCashInActivity, MayaCashInActivity.class, "showViaCardWebReceiptFailed", "showViaCardWebReceiptFailed(Lcom/paymaya/domain/model/ExecutePullFunds;)V", 0, 24));
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m1().r(EnumC1216e.VIA_CARD_CONFIRMATION);
        this.f10338R = true;
        this.f11730h0 = (t) getActivity();
        a aVar = W4.a.e().i().f4751a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        com.paymaya.data.preference.a preference = (com.paymaya.data.preference.a) aVar.e.get();
        C1295y0 c1295y0K = aVar.K();
        Uh.d sessionSubject = (Uh.d) aVar.f4748y.get();
        j.g(preference, "preference");
        j.g(sessionSubject, "sessionSubject");
        this.f11729g0 = new C0214w(preference, c1295y0K, sessionSubject);
        G1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.maya_fragment_cash_in_via_card_confirmation, viewGroup, false);
        int i = R.id.amount_text_view;
        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.amount_text_view);
        if (textView != null) {
            i = R.id.barrier_source;
            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.barrier_source)) != null) {
                i = R.id.cash_in_amount_barrier;
                if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.cash_in_amount_barrier)) != null) {
                    i = R.id.cash_in_amount_divider_view;
                    View viewFindChildViewById = ViewBindings.findChildViewById(viewInflate, R.id.cash_in_amount_divider_view);
                    if (viewFindChildViewById != null) {
                        i = R.id.cash_in_amount_label_text_view;
                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.cash_in_amount_label_text_view)) != null) {
                            i = R.id.cash_in_amount_value_text_view;
                            TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.cash_in_amount_value_text_view);
                            if (textView2 != null) {
                                i = R.id.cash_in_now_button;
                                Button button = (Button) ViewBindings.findChildViewById(viewInflate, R.id.cash_in_now_button);
                                if (button != null) {
                                    i = R.id.confirm_transaction_text_view;
                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.confirm_transaction_text_view)) != null) {
                                        i = R.id.group_cash_in_amount;
                                        Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_cash_in_amount);
                                        if (group != null) {
                                            i = R.id.labels_content_bottom_space_view;
                                            View viewFindChildViewById2 = ViewBindings.findChildViewById(viewInflate, R.id.labels_content_bottom_space_view);
                                            if (viewFindChildViewById2 != null) {
                                                i = R.id.labels_content_view;
                                                View viewFindChildViewById3 = ViewBindings.findChildViewById(viewInflate, R.id.labels_content_view);
                                                if (viewFindChildViewById3 != null) {
                                                    i = R.id.labels_guide_line;
                                                    if (((Guideline) ViewBindings.findChildViewById(viewInflate, R.id.labels_guide_line)) != null) {
                                                        i = R.id.logo_image_view;
                                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewInflate, R.id.logo_image_view);
                                                        if (imageView != null) {
                                                            i = R.id.source_barrier;
                                                            if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.source_barrier)) != null) {
                                                                i = R.id.source_card_masked_number_value_text_view;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.source_card_masked_number_value_text_view);
                                                                if (textView3 != null) {
                                                                    i = R.id.source_card_name_value_text_view;
                                                                    TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.source_card_name_value_text_view);
                                                                    if (textView4 != null) {
                                                                        i = R.id.source_divider_view;
                                                                        View viewFindChildViewById4 = ViewBindings.findChildViewById(viewInflate, R.id.source_divider_view);
                                                                        if (viewFindChildViewById4 != null) {
                                                                            i = R.id.source_label_text_view;
                                                                            if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.source_label_text_view)) != null) {
                                                                                i = R.id.text_view_cash_in_note;
                                                                                TextView textView5 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_cash_in_note);
                                                                                if (textView5 != null) {
                                                                                    i = R.id.transfer_fee_barrier;
                                                                                    if (((Barrier) ViewBindings.findChildViewById(viewInflate, R.id.transfer_fee_barrier)) != null) {
                                                                                        i = R.id.transfer_fee_label_text_view;
                                                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.transfer_fee_label_text_view)) != null) {
                                                                                            i = R.id.transfer_fee_value_text_view;
                                                                                            TextView textView6 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.transfer_fee_value_text_view);
                                                                                            if (textView6 != null) {
                                                                                                NestedScrollView nestedScrollView = (NestedScrollView) viewInflate;
                                                                                                this.f11717U = new C(nestedScrollView, textView, viewFindChildViewById, textView2, button, group, viewFindChildViewById2, viewFindChildViewById3, imageView, textView3, textView4, viewFindChildViewById4, textView5, textView6);
                                                                                                j.f(nestedScrollView, "getRoot(...)");
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
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f11717U = null;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        t tVar = this.f11730h0;
        if (tVar != null) {
            ((MayaCashInActivity) tVar).Q(this);
        }
        if (this.f11727e0) {
            this.f11727e0 = false;
            ExecutePullFunds executePullFunds = this.f11728f0;
            if (executePullFunds != null) {
                C0214w c0214wG1 = G1();
                ((MayaBaseFragment) ((k) c0214wG1.c.get())).E1();
                C1295y0 c1295y0 = (C1295y0) c0214wG1.f;
                p<PullFundsDetails> pullFundsDetails = c1295y0.f11503b.getPullFundsDetails("purchase", executePullFunds.mPurchaseId());
                new d(new d(AbstractC1331a.l(pullFundsDetails, pullFundsDetails, b.a()), new q(c0214wG1, executePullFunds, 0), 2), new q(c0214wG1, executePullFunds, 1), 0).e();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0252  */
    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instruction units count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardConfirmationFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
