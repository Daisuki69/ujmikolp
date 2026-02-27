package com.paymaya.ui.ekyc.view.fragment.impl;

import Ah.h;
import Ah.p;
import Bd.i;
import Kh.C0305j;
import Kh.C0311p;
import Kh.E;
import Kh.T;
import Lb.a;
import Lh.f;
import Th.e;
import Uh.d;
import We.s;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import butterknife.BindView;
import butterknife.OnClick;
import cj.C1110A;
import cj.C1112C;
import com.paymaya.R;
import com.paymaya.common.base.BaseFragment;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.data.api.FileManagementApi;
import com.paymaya.data.api.PayMayaClientApi;
import com.paymaya.domain.model.EDD;
import com.paymaya.domain.model.EDDFinancialDocument;
import com.paymaya.domain.store.O;
import com.paymaya.domain.store.S;
import com.paymaya.ui.ekyc.view.activity.impl.EDDActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.j;
import l9.C1803a;
import o6.C1967a;
import ph.C2070f1;
import pi.C2151a;
import qc.c;
import yd.k;
import zd.r;
import zh.b;

/* JADX INFO: loaded from: classes4.dex */
public class EDDSubmissionReviewFragment extends BaseFragment implements k, i {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public a f14552S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public r f14553T;

    @BindView(R.id.bank_information_text_view_pma_fragment_edd_submission_review)
    public TextView mBankInformationTextView;

    @BindView(R.id.financial_documents_photo_linear_layout_pma_fragment_edd_submission_review)
    public LinearLayout mFinancialDocumentsLayout;

    @BindView(R.id.income_source_text_view_pma_fragment_edd_submission_review)
    public TextView mIncomeSourceTextView;

    @BindView(R.id.account_usage_optional_group_view_pma_fragment_edd_submission_review)
    public Group mPrimaryUsageOptionalGroup;

    @BindView(R.id.primary_usage_text_view_pma_fragment_edd_submission_review)
    public TextView mPrimaryUsageTextView;

    @BindView(R.id.purpose_text_view_pma_fragment_edd_submission_review)
    public TextView mPurposeTextView;

    @BindView(R.id.related_companies_text_view_pma_fragment_edd_submission_review)
    public TextView mRelatedCompaniesTextView;

    @BindView(R.id.remittance_text_view_pma_fragment_edd_submission_review)
    public TextView mRemittanceTextView;

    @Override // com.paymaya.common.base.BaseFragment
    public final EnumC1216e U() {
        return EnumC1216e.SUBMIT;
    }

    @Override // Bd.i
    public final void h(File file, String str) {
        r rVar = this.f14553T;
        if (rVar != null) {
            ((EDDActivity) rVar).z1(file, null);
        }
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f14553T = (r) getActivity();
        O5.a aVar = W4.a.e().d().f4753a;
        this.f10245B = (C1220i) aVar.f4716g.get();
        this.f10246K = (com.paymaya.data.preference.a) aVar.e.get();
        O o8 = new O((PayMayaClientApi) aVar.f4745w.get());
        FileManagementApi fileManagementApi = (FileManagementApi) aVar.f4656B0.get();
        S s9 = new S();
        s9.f11386a = fileManagementApi;
        this.f14552S = new a(o8, s9, (com.paymaya.data.preference.a) aVar.e.get(), (d) aVar.f4748y.get());
        r1().h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        j.g(inflater, "inflater");
        return inflater.inflate(R.layout.pma_fragment_edd_submission_review, viewGroup, false);
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        r1().i();
        super.onDestroy();
    }

    @OnClick({R.id.next_button_pma_fragment_pma_fragment_edd_submission_review})
    public void onNextClicked() {
        h e;
        a aVarR1 = r1();
        ((BaseFragment) ((k) aVarR1.c.get())).p1();
        String string = UUID.randomUUID().toString();
        j.f(string, "toString(...)");
        EDD edd = (EDD) aVarR1.h;
        if (edd == null) {
            j.n("mEDD");
            throw null;
        }
        List<EDDFinancialDocument> financialDocuments = edd.getFinancialDocuments();
        if (financialDocuments == null) {
            financialDocuments = C1112C.f9377a;
        }
        ArrayList arrayListW = C1110A.W(financialDocuments);
        int size = arrayListW.size();
        if (size < 0) {
            throw new IllegalArgumentException(s.f(size, "count >= 0 required but it was "));
        }
        if (size == 0) {
            e = C0311p.f2745a;
        } else if (size == 1) {
            e = h.d(0);
        } else {
            if (((long) 0) + ((long) (size - 1)) > 2147483647L) {
                throw new IllegalArgumentException("Integer overflow");
            }
            e = new E(size);
        }
        C0305j c0305j = new C0305j(e, new C2151a(arrayListW, string, aVarR1), 3);
        Eh.d.a(16, "capacityHint");
        new T(5, new Lh.d(new Lh.d(new Lh.h(new f(p.c(new T(c0305j)), new C1967a(aVarR1, 12), 0).h(e.c), b.a(), 0), new c(aVarR1, 5), 2), new C2070f1(aVarR1, 7), 0), new C1803a(aVarR1, 15)).e();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        r rVar = this.f14553T;
        if (rVar != null) {
            ((EDDActivity) rVar).Q(this);
        }
        r1().l();
    }

    @Override // com.paymaya.common.base.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        j.g(view, "view");
        super.onViewCreated(view, bundle);
        r1().j();
    }

    public final a r1() {
        a aVar = this.f14552S;
        if (aVar != null) {
            return aVar;
        }
        j.n("mEDDSubmissionReviewFragmentPresenter");
        throw null;
    }

    public final String s1() {
        String string = getString(R.string.pma_label_na);
        j.f(string, "getString(...)");
        return string;
    }
}
