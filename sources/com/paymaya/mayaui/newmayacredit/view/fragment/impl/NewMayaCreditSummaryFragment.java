package com.paymaya.mayaui.newmayacredit.view.fragment.impl;

import Ad.a;
import G6.k;
import J9.b;
import J9.d;
import N5.I;
import O9.c;
import P9.n;
import Q9.J;
import Q9.K;
import Q9.L;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.view.KeyEventDispatcher;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewbinding.ViewBindings;
import b7.f;
import c7.C1077a;
import cj.C1132s;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1215d;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.common.utility.j0;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.data.api.CreditApi;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1292x;
import com.paymaya.domain.store.C1293x0;
import com.paymaya.domain.store.C1294y;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j;
import zj.x;

/* JADX INFO: loaded from: classes4.dex */
public class NewMayaCreditSummaryFragment extends MayaBaseLoadingFragment implements n {

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public c f13302B0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public I f13305o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SwipeRefreshLayout f13306p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public RecyclerView f13307q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TextView f13308r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f13309s0;
    public TextView t0;
    public TextView u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public Group f13310v0;
    public k w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public L f13311x0;
    public final f y0 = new f();

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final f f13312z0 = new f();

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public final f f13301A0 = new f();

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final boolean f13303C0 = true;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final boolean f13304D0 = true;

    public static final void S1(NewMayaCreditSummaryFragment newMayaCreditSummaryFragment) {
        k kVarQ1 = newMayaCreditSummaryFragment.Q1();
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) kVarQ1.f1795k;
        if (creditReviewUiModel != null) {
            NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
            newMayaCreditSummaryFragment2.getClass();
            L l6 = newMayaCreditSummaryFragment2.f13311x0;
            if (l6 != null) {
                NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) l6;
                E.a("NewMayaCreditActivity", "navigateToAssignContactReference");
                newMayaCreditActivity.X1().f1802k = creditReviewUiModel;
                newMayaCreditActivity.getWindow().setSoftInputMode(48);
                NewMayaCreditAssignContactReferenceFragment newMayaCreditAssignContactReferenceFragment = new NewMayaCreditAssignContactReferenceFragment();
                Bundle bundle = new Bundle();
                bundle.putBoolean("is_edit", true);
                newMayaCreditAssignContactReferenceFragment.setArguments(bundle);
                AbstractC1236z.h(newMayaCreditActivity, R.id.fragment_container, newMayaCreditAssignContactReferenceFragment);
            }
        }
    }

    public static final void T1(NewMayaCreditSummaryFragment newMayaCreditSummaryFragment) {
        k kVarQ1 = newMayaCreditSummaryFragment.Q1();
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) kVarQ1.f1795k;
        if (creditReviewUiModel != null) {
            NewMayaCreditSummaryFragment newMayaCreditSummaryFragment2 = (NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get());
            newMayaCreditSummaryFragment2.getClass();
            L l6 = newMayaCreditSummaryFragment2.f13311x0;
            if (l6 != null) {
                E.a("NewMayaCreditActivity", "navigateToPersonalDetailsFragment");
                NewMayaCreditUpdatePersonalDetailsContactReferenceFragment newMayaCreditUpdatePersonalDetailsContactReferenceFragment = new NewMayaCreditUpdatePersonalDetailsContactReferenceFragment();
                Bundle bundle = new Bundle();
                bundle.putParcelable("bundle_credit_review", creditReviewUiModel);
                newMayaCreditUpdatePersonalDetailsContactReferenceFragment.setArguments(bundle);
                AbstractC1236z.h((NewMayaCreditActivity) l6, R.id.fragment_container, newMayaCreditUpdatePersonalDetailsContactReferenceFragment);
            }
        }
    }

    public static final void U1(NewMayaCreditSummaryFragment newMayaCreditSummaryFragment) {
        Object systemService = newMayaCreditSummaryFragment.requireActivity().getSystemService("clipboard");
        j.e(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ClipboardManager clipboardManager = (ClipboardManager) systemService;
        TextView textView = newMayaCreditSummaryFragment.u0;
        if (textView == null) {
            j.n("mTextViewAccountNumber");
            throw null;
        }
        clipboardManager.setPrimaryClip(ClipData.newPlainText("Account number", textView.getText().toString()));
        j0.a(newMayaCreditSummaryFragment.requireActivity(), R.string.maya_label_account_number_copied);
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View G1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_fragment_maya_credit_summary, viewGroup, false);
        int i = R.id.account_summary_label;
        if (((AppCompatTextView) ViewBindings.findChildViewById(viewInflate, R.id.account_summary_label)) != null) {
            i = R.id.agreements_recycler_view;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.agreements_recycler_view);
            if (recyclerView != null) {
                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) viewInflate;
                i = R.id.group_contact_reference;
                Group group = (Group) ViewBindings.findChildViewById(viewInflate, R.id.group_contact_reference);
                if (group != null) {
                    i = R.id.image_view_icon_add_contact;
                    if (((ImageView) ViewBindings.findChildViewById(viewInflate, R.id.image_view_icon_add_contact)) != null) {
                        i = R.id.layout_add_contact_reference;
                        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(viewInflate, R.id.layout_add_contact_reference);
                        if (constraintLayout != null) {
                            i = R.id.recycler_view_contact_reference;
                            MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_contact_reference);
                            if (mayaReviewInfoRecyclerView != null) {
                                i = R.id.recycler_view_personal_info;
                                MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView2 = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.recycler_view_personal_info);
                                if (mayaReviewInfoRecyclerView2 != null) {
                                    i = R.id.review_info_recycler_view;
                                    MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView3 = (MayaReviewInfoRecyclerView) ViewBindings.findChildViewById(viewInflate, R.id.review_info_recycler_view);
                                    if (mayaReviewInfoRecyclerView3 != null) {
                                        i = R.id.text_view_account_number;
                                        TextView textView = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_account_number);
                                        if (textView != null) {
                                            i = R.id.text_view_add_contact;
                                            if (((HtmlTextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_add_contact)) != null) {
                                                i = R.id.text_view_billing_title;
                                                if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_billing_title)) != null) {
                                                    i = R.id.text_view_contact_details_edit;
                                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_contact_details_edit);
                                                    if (textView2 != null) {
                                                        i = R.id.text_view_contact_reference_title;
                                                        if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_contact_reference_title)) != null) {
                                                            i = R.id.text_view_name;
                                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_name);
                                                            if (textView3 != null) {
                                                                i = R.id.text_view_personal_details_edit;
                                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_personal_details_edit);
                                                                if (textView4 != null) {
                                                                    i = R.id.text_view_personal_title;
                                                                    if (((TextView) ViewBindings.findChildViewById(viewInflate, R.id.text_view_personal_title)) != null) {
                                                                        this.f13305o0 = new I(swipeRefreshLayout, recyclerView, swipeRefreshLayout, group, constraintLayout, mayaReviewInfoRecyclerView, mayaReviewInfoRecyclerView2, mayaReviewInfoRecyclerView3, textView, textView2, textView3, textView4);
                                                                        j.f(swipeRefreshLayout, "getRoot(...)");
                                                                        return swipeRefreshLayout;
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

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View H1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_error_dashboard, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    @Override // com.paymaya.common.base.MayaBaseLoadingFragment
    public final View J1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.maya_view_loading_progress, viewGroup, false);
        j.f(viewInflate, "inflate(...)");
        return viewInflate;
    }

    public final CreditResponse P1() {
        L l6 = this.f13311x0;
        if (l6 != null) {
            return (CreditResponse) ((NewMayaCreditActivity) l6).X1().j;
        }
        return null;
    }

    public final k Q1() {
        k kVar = this.w0;
        if (kVar != null) {
            return kVar;
        }
        j.n("mMayaCreditSummaryFragmentPresenter");
        throw null;
    }

    public final void R1() {
        SwipeRefreshLayout swipeRefreshLayout = this.f13306p0;
        if (swipeRefreshLayout == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        if (swipeRefreshLayout.isRefreshing()) {
            SwipeRefreshLayout swipeRefreshLayout2 = this.f13306p0;
            if (swipeRefreshLayout2 != null) {
                swipeRefreshLayout2.post(new K(this, 0));
            } else {
                j.n("mSwipeRefreshLayout");
                throw null;
            }
        }
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SUMMARY;
    }

    public final void V1(CreditReviewUiModel creditReviewUiModel) {
        String string;
        f fVar = this.y0;
        k kVarQ1 = Q1();
        String str = creditReviewUiModel.f13057d;
        Double dE = str != null ? x.e(str) : null;
        String string2 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_credit_limit_header);
        j.f(string2, "getString(...)");
        String string3 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_currency_with_value, creditReviewUiModel.f13055a);
        j.f(string3, "getString(...)");
        C1077a c1077a = new C1077a(string2, string3, null, null, null, false, null, 124);
        String string4 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_service_fee);
        j.f(string4, "getString(...)");
        String string5 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_maya_credit_service_fee_value, creditReviewUiModel.f13057d);
        j.f(string5, "getString(...)");
        String string6 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_see_sample_computation);
        j.f(string6, "getString(...)");
        C1077a c1077a2 = new C1077a(string4, string5, string6, new a(13, kVarQ1, dE), null, false, null, 112);
        String string7 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_billing_end_date_header);
        j.f(string7, "getString(...)");
        String string8 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_billing_end_date, creditReviewUiModel.c);
        j.f(string8, "getString(...)");
        String string9 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_billing_end_date_second_value);
        j.f(string9, "getString(...)");
        C1077a c1077a3 = new C1077a(string7, string8, null, null, null, false, string9, 60);
        String string10 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_email_header);
        j.f(string10, "getString(...)");
        n nVar = (n) kVarQ1.c.get();
        d emailStatus = creditReviewUiModel.f;
        NewMayaCreditSummaryFragment newMayaCreditSummaryFragment = (NewMayaCreditSummaryFragment) nVar;
        newMayaCreditSummaryFragment.getClass();
        j.g(emailStatus, "emailStatus");
        int iOrdinal = emailStatus.ordinal();
        if (iOrdinal == 0) {
            string = newMayaCreditSummaryFragment.getString(R.string.maya_label_credit_management_badge_email_verified);
            j.f(string, "getString(...)");
        } else if (iOrdinal == 1) {
            string = newMayaCreditSummaryFragment.getString(R.string.maya_label_credit_management_badge_email_unverified);
            j.f(string, "getString(...)");
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            string = newMayaCreditSummaryFragment.getString(R.string.maya_label_credit_management_badge_no_email);
            j.f(string, "getString(...)");
        }
        String str2 = string;
        boolean z4 = creditReviewUiModel.f == d.f2493a;
        String str3 = creditReviewUiModel.e;
        String string11 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_update_email);
        j.f(string11, "getString(...)");
        fVar.e(C1132s.h(c1077a, c1077a2, c1077a3, new C1077a(string10, str3, string11, new Ba.a(kVarQ1, 25), str2, z4, null, 64)));
    }

    public final void W1(b bVar, String str) {
        f fVar = this.f13312z0;
        k kVarQ1 = Q1();
        String string = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_gender);
        j.f(string, "getString(...)");
        String str2 = bVar.f2488a;
        if (str2 == null) {
            str2 = "";
        }
        C1077a c1077a = new C1077a(string, kVarQ1.n(str2), null, null, null, false, null, 124);
        String string2 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_management_marital_stage);
        j.f(string2, "getString(...)");
        String str3 = bVar.f2489b;
        C1077a c1077a2 = new C1077a(string2, kVarQ1.o(str3 != null ? str3 : ""), null, null, null, false, null, 124);
        String string3 = ((NewMayaCreditSummaryFragment) ((n) kVarQ1.c.get())).getString(R.string.maya_label_credit_alternative_mobile_summary_title);
        j.f(string3, "getString(...)");
        fVar.e(C1132s.g(c1077a, c1077a2, new C1077a(string3, C.p(str == null ? Global.BLANK : str), null, null, null, false, null, 124)));
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f10338R = true;
        O5.a aVar = W4.a.e().D().f4752a;
        this.f10334B = (C1220i) aVar.f4716g.get();
        this.f10335K = (com.paymaya.data.preference.a) aVar.e.get();
        this.f10336P = (S5.c) aVar.f4724k.get();
        C1264i0 c1264i0A = aVar.A();
        C1265j c1265jE = aVar.e();
        C1294y c1294y = new C1294y((PayMayaClientApi) aVar.f4745w.get(), (CreditApi) aVar.f4736q0.get(), (S5.c) aVar.f4724k.get());
        C1292x c1292x = new C1292x((PayMayaClientApi) aVar.f4745w.get(), (CreditApi) aVar.f4736q0.get(), (S5.c) aVar.f4724k.get());
        C1293x0 c1293x0J = aVar.J();
        S5.c mFlagConfigurationService = (S5.c) aVar.f4724k.get();
        Uh.d sessionPublishSubject = (Uh.d) aVar.f4748y.get();
        j.g(mFlagConfigurationService, "mFlagConfigurationService");
        j.g(sessionPublishSubject, "sessionPublishSubject");
        this.w0 = new k(c1264i0A, c1265jE, c1294y, c1292x, c1293x0J, mFlagConfigurationService, sessionPublishSubject);
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        j.e(componentRequireActivity, "null cannot be cast to non-null type com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditSummaryFragment.NewMayaCreditSummaryFragmentListener");
        this.f13311x0 = (L) componentRequireActivity;
        Q1().h(this);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        Q1().i();
        super.onDestroy();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        L l6 = this.f13311x0;
        if (l6 != null) {
            ((NewMayaCreditActivity) l6).Q(this);
        }
        Q1().q();
    }

    @Override // com.paymaya.common.base.MayaBaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        I i = this.f13305o0;
        j.d(i);
        this.f13306p0 = (SwipeRefreshLayout) i.f;
        j.d(this.f13305o0);
        I i4 = this.f13305o0;
        j.d(i4);
        this.f13308r0 = (TextView) i4.c;
        I i6 = this.f13305o0;
        j.d(i6);
        this.f13309s0 = (TextView) i6.f3650l;
        I i10 = this.f13305o0;
        j.d(i10);
        this.t0 = (TextView) i10.f3647d;
        I i11 = this.f13305o0;
        j.d(i11);
        this.u0 = i11.f3646b;
        I i12 = this.f13305o0;
        j.d(i12);
        ((MayaReviewInfoRecyclerView) i12.f3649k).setAdapter(this.y0);
        I i13 = this.f13305o0;
        j.d(i13);
        ((MayaReviewInfoRecyclerView) i13.j).setAdapter(this.f13312z0);
        I i14 = this.f13305o0;
        j.d(i14);
        ((MayaReviewInfoRecyclerView) i14.i).setAdapter(this.f13301A0);
        I i15 = this.f13305o0;
        j.d(i15);
        this.f13307q0 = (RecyclerView) i15.f3648g;
        I i16 = this.f13305o0;
        j.d(i16);
        this.f13310v0 = (Group) i16.h;
        Q1().j();
        SwipeRefreshLayout swipeRefreshLayout = this.f13306p0;
        if (swipeRefreshLayout == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        swipeRefreshLayout.setOnRefreshListener(new Na.d(this, 8));
        SwipeRefreshLayout swipeRefreshLayout2 = this.f13306p0;
        if (swipeRefreshLayout2 == null) {
            j.n("mSwipeRefreshLayout");
            throw null;
        }
        swipeRefreshLayout2.setColorSchemeResources(R.color.pma_primary_100_base);
        this.f13302B0 = new c(this);
        TextView textView = this.f13308r0;
        if (textView == null) {
            j.n("mTextViewContactDetailsEdit");
            throw null;
        }
        textView.setOnClickListener(new J(this, 0));
        TextView textView2 = this.f13309s0;
        if (textView2 == null) {
            j.n("mTextViewPersonalDetailsEdit");
            throw null;
        }
        textView2.setOnClickListener(new J(this, 1));
        TextView textView3 = this.u0;
        if (textView3 == null) {
            j.n("mTextViewAccountNumber");
            throw null;
        }
        textView3.setOnClickListener(new J(this, 2));
        C1219h c1219h = new C1219h();
        c1219h.r(EnumC1216e.ACCOUNT_SUMMARY);
        c1219h.n(21);
        c1219h.i();
        z1(c1219h);
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean p1() {
        return this.f13303C0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final boolean r1() {
        return this.f13304D0;
    }

    @Override // com.paymaya.common.base.MayaBaseFragment
    public final EnumC1215d u1() {
        return EnumC1215d.CREDIT;
    }
}
