package G6;

import android.content.Intent;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.AppsFlyerProperties;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.C;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements Ch.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f1806b;

    public /* synthetic */ o(p pVar, int i) {
        this.f1805a = i;
        this.f1806b = pVar;
    }

    @Override // Ch.c
    public final void accept(Object obj) {
        String dataString;
        Object next;
        Intent intent;
        switch (this.f1805a) {
            case 0:
                p pVar = this.f1806b;
                PayMayaError payMayaErrorF = pVar.f((Throwable) obj, true);
                kotlin.jvm.internal.j.f(payMayaErrorF, "mayaErrorHandling(...)");
                pVar.s(payMayaErrorF);
                return;
            default:
                List<LoadUpPartner> loadUpPartnerList = (List) obj;
                kotlin.jvm.internal.j.g(loadUpPartnerList, "loadUpPartnerList");
                p pVar2 = this.f1806b;
                pVar2.getClass();
                Iterator it = loadUpPartnerList.iterator();
                while (true) {
                    dataString = null;
                    if (it.hasNext()) {
                        next = it.next();
                        boolean zEquals = "smart-padala-code".equals(((LoadUpPartner) next).mSlug());
                        pVar2.f = zEquals;
                        if (zEquals) {
                        }
                    } else {
                        next = null;
                    }
                }
                pVar2.i = (LoadUpPartner) next;
                if (((com.paymaya.data.preference.a) pVar2.e).e().isMayaSavingsEnabled()) {
                    AppCompatTextView appCompatTextView = ((MayaCashInFragment) ((K6.h) pVar2.c.get())).f11696q0;
                    if (appCompatTextView == null) {
                        kotlin.jvm.internal.j.n("mTextViewMayaSavings");
                        throw null;
                    }
                    appCompatTextView.setVisibility(0);
                } else {
                    AppCompatTextView appCompatTextView2 = ((MayaCashInFragment) ((K6.h) pVar2.c.get())).f11696q0;
                    if (appCompatTextView2 == null) {
                        kotlin.jvm.internal.j.n("mTextViewMayaSavings");
                        throw null;
                    }
                    appCompatTextView2.setVisibility(8);
                }
                pVar2.r();
                if (((com.paymaya.data.preference.a) pVar2.e).e().mPullFundsConfig().mBPIPullFundsPartner().mIsEnabled()) {
                    AppCompatTextView appCompatTextView3 = ((MayaCashInFragment) ((K6.h) pVar2.c.get())).t0;
                    if (appCompatTextView3 == null) {
                        kotlin.jvm.internal.j.n("mTextViewBankAccount");
                        throw null;
                    }
                    appCompatTextView3.setVisibility(0);
                } else {
                    AppCompatTextView appCompatTextView4 = ((MayaCashInFragment) ((K6.h) pVar2.c.get())).t0;
                    if (appCompatTextView4 == null) {
                        kotlin.jvm.internal.j.n("mTextViewBankAccount");
                        throw null;
                    }
                    appCompatTextView4.setVisibility(8);
                }
                RecyclerView recyclerView = ((MayaCashInFragment) ((K6.h) pVar2.c.get())).f11699v0;
                if (recyclerView == null) {
                    kotlin.jvm.internal.j.n("mRecyclerViewPartners");
                    throw null;
                }
                recyclerView.setVisibility(0);
                ((MayaCashInFragment) ((K6.h) pVar2.c.get())).R1();
                ((MayaCashInFragment) ((K6.h) pVar2.c.get())).Q1();
                MayaCashInFragment mayaCashInFragment = (MayaCashInFragment) ((K6.h) pVar2.c.get());
                mayaCashInFragment.getClass();
                J6.f fVar = mayaCashInFragment.f11691H0;
                if (fVar != null) {
                    ArrayList oldList = fVar.c;
                    kotlin.jvm.internal.j.g(oldList, "oldList");
                    DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new N6.b(oldList, loadUpPartnerList));
                    kotlin.jvm.internal.j.f(diffResultCalculateDiff, "calculateDiff(...)");
                    oldList.clear();
                    oldList.addAll(loadUpPartnerList);
                    diffResultCalculateDiff.dispatchUpdatesTo(fVar);
                }
                ((MayaCashInFragment) ((K6.h) pVar2.c.get())).L1();
                ((MayaBaseLoadingFragment) ((K6.h) pVar2.c.get())).f10359n0 = true;
                FragmentActivity activity = ((MayaCashInFragment) ((K6.h) pVar2.c.get())).getActivity();
                if (activity != null && (intent = activity.getIntent()) != null) {
                    dataString = intent.getDataString();
                }
                int iW = C.w(dataString);
                if (11 == iW) {
                    pVar2.m();
                    return;
                }
                if (10 == iW && ((com.paymaya.data.preference.a) pVar2.e).e().mPullFundsConfig().mBPIPullFundsPartner().mIsEnabled()) {
                    pVar2.n();
                    return;
                }
                if (12 == iW) {
                    String strL = C.L(dataString, AppsFlyerProperties.CHANNEL);
                    if (strL == null || C2576A.H(strL)) {
                        ((MayaCashInFragment) ((K6.h) pVar2.c.get())).V1();
                        return;
                    }
                    for (LoadUpPartner loadUpPartner : loadUpPartnerList) {
                        if (strL.equalsIgnoreCase(loadUpPartner.mSlug())) {
                            ((MayaCashInFragment) ((K6.h) pVar2.c.get())).V1();
                            pVar2.k(loadUpPartner);
                            return;
                        }
                    }
                    ((MayaCashInFragment) ((K6.h) pVar2.c.get())).V1();
                    return;
                }
                return;
        }
    }
}
