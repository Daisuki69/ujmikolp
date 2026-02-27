package L9;

import M8.A0;
import N5.C0449e1;
import N5.C0489y;
import N5.C0491z;
import N5.G0;
import android.content.Intent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import cj.L;
import com.dynatrace.android.agent.events.eventsapi.EventMetricsAggregator;
import com.liaoinstan.springview.widget.SpringView;
import com.paymaya.R;
import com.paymaya.adkit.presentation.banneradcarousel.view.BannerAdCarousel;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.base.MayaBaseLoadingFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.EnumC1216e;
import com.paymaya.domain.model.AvailabilityConfig;
import com.paymaya.domain.model.CreditAccount;
import com.paymaya.domain.model.CreditAmount;
import com.paymaya.domain.model.CreditApplication;
import com.paymaya.domain.model.CreditBillingStatement;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.FileUrl;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.store.C1264i0;
import com.paymaya.domain.store.C1265j;
import com.paymaya.domain.store.C1266j0;
import com.paymaya.domain.store.Z;
import com.paymaya.mayaui.dashboard.view.activity.impl.MayaDashboardActivity;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditFragment;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class B extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f2857d;
    public final S5.c e;
    public final C1264i0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.paymaya.domain.store.A f2858g;
    public final C1265j h;
    public final C1266j0 i;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CreditResponse f2859k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f2860l;
    public CreditBillingStatement m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Double f2861n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(com.paymaya.data.preference.a mPreference, S5.c mFlagConfigurationService, C1264i0 c1264i0, com.paymaya.domain.store.A a8, C1265j c1265j, C1266j0 c1266j0, Uh.d dVar) {
        super(dVar);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(mFlagConfigurationService, "mFlagConfigurationService");
        this.f2857d = mPreference;
        this.e = mFlagConfigurationService;
        this.f = c1264i0;
        this.f2858g = a8;
        this.h = c1265j;
        this.i = c1266j0;
    }

    public final void A(boolean z4) {
        CreditAmount dues;
        Double dValueOf = null;
        String str = null;
        dValueOf = null;
        if (z4) {
            CreditResponse creditResponse = this.f2859k;
            if (creditResponse != null) {
                CreditAccount creditAccount = creditResponse.getCreditAccount();
                if (creditAccount != null) {
                    Double d10 = this.f2861n;
                    if (d10 != null) {
                        str = new DecimalFormat("#,###.##", new DecimalFormatSymbols(Locale.ENGLISH)).format(d10.doubleValue());
                        kotlin.jvm.internal.j.f(str, "format(...)");
                    }
                    creditAccount.setBillingStatementAmountDue(str);
                }
                ((NewMayaCreditFragment) ((P9.k) this.c.get())).h2(creditResponse);
                return;
            }
            return;
        }
        CreditResponse creditResponse2 = this.f2859k;
        if (creditResponse2 != null) {
            CreditAccount creditAccount2 = creditResponse2.getCreditAccount();
            if (creditAccount2 != null) {
                CreditAccount creditAccount3 = creditResponse2.getCreditAccount();
                if (creditAccount3 != null && (dues = creditAccount3.getDues()) != null) {
                    dValueOf = Double.valueOf(dues.getTotal());
                }
                creditAccount2.setBillingStatementAmountDue(String.valueOf(dValueOf));
            }
            ((NewMayaCreditFragment) ((P9.k) this.c.get())).h2(creditResponse2);
        }
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        super.j();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).O1();
        n();
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        Button button = newMayaCreditFragment.f13233E0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonBillingStatement");
            throw null;
        }
        button.setText(newMayaCreditFragment.getString(R.string.maya_label_real_time_billing_statement_view));
        Button button2 = newMayaCreditFragment.f13235F0;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mButtonBillingStatementPayNow");
            throw null;
        }
        button2.setText(newMayaCreditFragment.getString(R.string.maya_label_real_time_billing_statement_pay_now));
        o();
    }

    public final void k(CreditResponse creditResponse) {
        CreditAccount creditAccount = creditResponse.getCreditAccount();
        if (creditAccount != null && (kotlin.jvm.internal.j.b(creditAccount.getStatus(), "SUSPENDED") || creditAccount.getDaysInArrears() >= 30)) {
            CreditAccount creditAccount2 = creditResponse.getCreditAccount();
            if (creditAccount2 == null) {
                return;
            }
            double total = creditAccount2.getDues().getTotal();
            if (total > AudioStats.AUDIO_AMPLITUDE_NONE) {
                NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
                String string = newMayaCreditFragment.getString(R.string.maya_label_credit_modal_locked_content);
                kotlin.jvm.internal.j.f(string, "getString(...)");
                A0.y(newMayaCreditFragment, newMayaCreditFragment.getString(R.string.maya_label_credit_modal_locked_title), String.format(string, Arrays.copyOf(new Object[]{Double.valueOf(total)}, 1)), newMayaCreditFragment.getString(R.string.maya_label_credit_dpd_error_pay_action), newMayaCreditFragment.getString(R.string.maya_label_credit_error_got_it), new Q9.E(newMayaCreditFragment, 5));
                return;
            }
            NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            String string2 = newMayaCreditFragment2.getString(R.string.maya_label_credit_modal_under_review_title);
            String string3 = newMayaCreditFragment2.getString(R.string.maya_label_credit_modal_under_review_content);
            String string4 = newMayaCreditFragment2.getString(R.string.maya_label_credit_error_got_it);
            Q9.G g8 = newMayaCreditFragment2.D1;
            if (g8 != null) {
                M2.b.Z(2131231486, string2, string3, string4, null, false, null, null, false, 320).show(((MayaDashboardActivity) g8).getSupportFragmentManager(), "error_dialog");
                return;
            }
            return;
        }
        CreditAccount creditAccount3 = creditResponse.getCreditAccount();
        if (creditAccount3 == null || !kotlin.jvm.internal.j.b(creditAccount3.getStatus(), "PAST_DUE") || creditAccount3.getDaysInArrears() <= 0) {
            NewMayaCreditFragment newMayaCreditFragment3 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            newMayaCreditFragment3.getClass();
            Q9.G g10 = newMayaCreditFragment3.D1;
            if (g10 != null) {
                MayaDashboardActivity mayaDashboardActivity = (MayaDashboardActivity) g10;
                mayaDashboardActivity.n1();
                Intent intent = new Intent(mayaDashboardActivity, (Class<?>) NewMayaCreditActivity.class);
                intent.putExtra("feature", "transfer");
                intent.putExtra("credit_response", creditResponse);
                mayaDashboardActivity.startActivity(intent);
                return;
            }
            return;
        }
        CreditAccount creditAccount4 = creditResponse.getCreditAccount();
        if (creditAccount4 != null) {
            int remainingDaystoLock = creditAccount4.getRemainingDaystoLock();
            if (remainingDaystoLock == 1) {
                P9.k kVar = (P9.k) this.c.get();
                double total2 = creditAccount4.getDues().getTotal();
                NewMayaCreditFragment newMayaCreditFragment4 = (NewMayaCreditFragment) kVar;
                String string5 = newMayaCreditFragment4.getString(R.string.maya_label_credit_past_due_locked_tomorrow);
                kotlin.jvm.internal.j.f(string5, "getString(...)");
                A0.y(newMayaCreditFragment4, newMayaCreditFragment4.getString(R.string.maya_label_credit_dpd_error_title), String.format(string5, Arrays.copyOf(new Object[]{Double.valueOf(total2)}, 1)), newMayaCreditFragment4.getString(R.string.maya_label_credit_dpd_error_pay_action), newMayaCreditFragment4.getString(R.string.maya_label_credit_error_got_it), new Q9.E(newMayaCreditFragment4, 6));
                return;
            }
            P9.k kVar2 = (P9.k) this.c.get();
            double total3 = creditAccount4.getDues().getTotal();
            NewMayaCreditFragment newMayaCreditFragment5 = (NewMayaCreditFragment) kVar2;
            String string6 = newMayaCreditFragment5.getString(R.string.maya_label_credit_past_due_locked_days);
            kotlin.jvm.internal.j.f(string6, "getString(...)");
            A0.y(newMayaCreditFragment5, newMayaCreditFragment5.getString(R.string.maya_label_credit_dpd_error_title), String.format(string6, Arrays.copyOf(new Object[]{Integer.valueOf(remainingDaystoLock), Double.valueOf(total3)}, 2)), newMayaCreditFragment5.getString(R.string.maya_label_credit_dpd_error_pay_action), newMayaCreditFragment5.getString(R.string.maya_label_credit_error_got_it), new Q9.E(newMayaCreditFragment5, 7));
        }
    }

    public final void l(Function1 function1) {
        int i = 0;
        ((MayaBaseFragment) ((P9.k) this.c.get())).E1();
        C1264i0 c1264i0 = this.f;
        String lowerCase = EventMetricsAggregator.OS_NAME.toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.j.f(lowerCase, "toLowerCase(...)");
        String string = UUID.randomUUID().toString();
        kotlin.jvm.internal.j.f(string, "toString(...)");
        e(new Lh.d(new Lh.d(new Lh.h(c1264i0.c(lowerCase, string), zh.b.a(), 0), new A7.f(28, this, function1), 2), new A(this, i), i).e());
    }

    public final void m() {
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        TextView textView = newMayaCreditFragment.f13278u1;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewOutstandingBillAmountMasked");
            throw null;
        }
        textView.setVisibility(0);
        TextView textView2 = newMayaCreditFragment.f13268m1;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewRevampOutstandingBalance");
            throw null;
        }
        textView2.setVisibility(8);
        if (this.m != null) {
            NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            TextView textView3 = newMayaCreditFragment2.f13277t1;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewLatestBillAmountMasked");
                throw null;
            }
            textView3.setVisibility(0);
            TextView textView4 = newMayaCreditFragment2.f13269n1;
            if (textView4 != null) {
                textView4.setVisibility(8);
            } else {
                kotlin.jvm.internal.j.n("mTextViewRevampLatestBillAmount");
                throw null;
            }
        }
    }

    public final void n() {
        Ah.p<CreditApplication> creditApplication;
        int i = 0;
        if (this.f2857d.e().isMayaCreditAvailable()) {
            if (!kotlin.jvm.internal.j.b(this.f2857d.l(), "kyc1") || !this.f2857d.e().isMayaCreditsEnabled()) {
                ((NewMayaCreditFragment) ((P9.k) this.c.get())).W1();
                v();
                ((NewMayaCreditFragment) ((P9.k) this.c.get())).s1().g();
                return;
            }
            if (this.j) {
                return;
            }
            this.j = true;
            SpringView springView = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13272p0;
            if (springView == null) {
                kotlin.jvm.internal.j.n("mDashboardSwipeRefreshLayout");
                throw null;
            }
            springView.c();
            CreditResponse creditResponse = new CreditResponse(null, null, null, 7, null);
            C1264i0 c1264i0 = this.f;
            if (c1264i0.i()) {
                creditApplication = c1264i0.c.getCreditApplication(C1264i0.a(c1264i0));
                kotlin.jvm.internal.j.d(creditApplication);
            } else {
                creditApplication = c1264i0.f11449b.getCreditApplication();
                kotlin.jvm.internal.j.d(creditApplication);
            }
            Lh.d dVar = new Lh.d(new Lh.f(new Lh.h(creditApplication, zh.b.a(), 0), new x(this, creditResponse), i), new y(this, i), i);
            G7.t tVar = new G7.t(this, 18);
            Gh.d dVar2 = new Gh.d(1, new z(this, i), Eh.d.f1366d);
            try {
                dVar.f(new Hh.d(dVar2, tVar, 1));
                e(dVar2);
                return;
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th2) {
                throw AbstractC1213b.L(th2, "subscribeActual failed", th2);
            }
        }
        AvailabilityConfig availabilityConfigMMayaCreditAvailability = this.f2857d.e().mMaintenanceConfig().mServiceAvailabilityConfig().mMayaCreditAvailability();
        String strMMessage = availabilityConfigMMayaCreditAvailability != null ? availabilityConfigMMayaCreditAvailability.mMessage() : null;
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        newMayaCreditFragment.m0 = 3;
        FrameLayout frameLayout = newMayaCreditFragment.f10342V;
        if (frameLayout == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutContentContainer");
            throw null;
        }
        frameLayout.setVisibility(8);
        FrameLayout frameLayout2 = newMayaCreditFragment.f10343W;
        if (frameLayout2 == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutLoadingContainer");
            throw null;
        }
        frameLayout2.setVisibility(8);
        FrameLayout frameLayout3 = newMayaCreditFragment.f10344X;
        if (frameLayout3 == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutErrorContainer");
            throw null;
        }
        frameLayout3.setVisibility(8);
        FrameLayout frameLayout4 = newMayaCreditFragment.f10346Z;
        if (frameLayout4 == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutError2Container");
            throw null;
        }
        frameLayout4.setVisibility(8);
        FrameLayout frameLayout5 = newMayaCreditFragment.f10345Y;
        if (frameLayout5 == null) {
            kotlin.jvm.internal.j.n("mFrameLayoutMaintenanceContainer");
            throw null;
        }
        frameLayout5.setVisibility(0);
        TextView textView = newMayaCreditFragment.f10357k0;
        if (textView != null) {
            textView.setText(newMayaCreditFragment.getString(R.string.maya_label_maintenance_title));
        }
        TextView textView2 = newMayaCreditFragment.f10358l0;
        if (textView2 != null) {
            if (strMMessage == null || C2576A.H(strMMessage)) {
                strMMessage = newMayaCreditFragment.getString(R.string.maya_label_maintenance_description);
            }
            textView2.setText(strMMessage);
        }
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).s1().g();
    }

    public final void o() {
        if (S5.c.b(this.e, A5.b.f97c1)) {
            e(new Lh.d(new Lh.h(this.i.f11452b.getMayaXpEntrypointEasyCredit().d(Z.h), zh.b.a(), 0), new Gc.h(this, 9), 2).e());
        }
    }

    public final void p() {
        Ah.p<FileUrl> creditBillingStatementFile;
        String statementId;
        int i = 1;
        int i4 = 0;
        String str = this.f2860l;
        if (str == null || str.length() == 0) {
            return;
        }
        CreditBillingStatement creditBillingStatement = this.m;
        String statementId2 = creditBillingStatement != null ? creditBillingStatement.getStatementId() : null;
        if (statementId2 == null || statementId2.length() == 0) {
            return;
        }
        ((MayaBaseFragment) ((P9.k) this.c.get())).E1();
        C1264i0 c1264i0 = this.f;
        String str2 = this.f2860l;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        CreditBillingStatement creditBillingStatement2 = this.m;
        if (creditBillingStatement2 != null && (statementId = creditBillingStatement2.getStatementId()) != null) {
            str3 = statementId;
        }
        c1264i0.getClass();
        if (c1264i0.i()) {
            creditBillingStatementFile = c1264i0.c.getCreditBillingStatementFile(C1264i0.a(c1264i0), str2, str3);
            kotlin.jvm.internal.j.d(creditBillingStatementFile);
        } else {
            creditBillingStatementFile = c1264i0.f11449b.getCreditBillingStatementFile(str2, str3);
            kotlin.jvm.internal.j.d(creditBillingStatementFile);
        }
        e(new Lh.d(new Lh.d(new Lh.h(creditBillingStatementFile, zh.b.a(), 0), new v(this, i), 2), new w(this, 1), i4).e());
    }

    public final void q(PayMayaError payMayaError, Throwable throwable) {
        kotlin.jvm.internal.j.g(throwable, "throwable");
        if (!payMayaError.isSessionTimeout() && !payMayaError.isNetworkError()) {
            P9.k kVar = (P9.k) this.c.get();
            Map mapC = L.c(new Pair("product", "mec"));
            ((NewMayaCreditFragment) kVar).getClass();
            com.paymaya.common.utility.E.b(throwable, mapC);
        }
        yk.a.e();
    }

    public final void r(String str) {
        int i = 1;
        int i4 = 0;
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        newMayaCreditFragment.getClass();
        TextView textView = newMayaCreditFragment.f13259c1;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewSeeAll");
            throw null;
        }
        textView.setOnClickListener(new Ad.a(23, newMayaCreditFragment, str));
        NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((P9.k) this.c.get());
        TextView textView2 = newMayaCreditFragment2.f13258b1;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView2.setVisibility(8);
        TextView textView3 = newMayaCreditFragment2.f13259c1;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewSeeAll");
            throw null;
        }
        textView3.setVisibility(8);
        G0 g02 = newMayaCreditFragment2.f13263h1;
        if (g02 == null) {
            kotlin.jvm.internal.j.n("mViewLoadingActivityListV2");
            throw null;
        }
        g02.f3627b.setVisibility(0);
        NewMayaCreditFragment newMayaCreditFragment3 = (NewMayaCreditFragment) ((P9.k) this.c.get());
        TextView textView4 = newMayaCreditFragment3.f13258b1;
        if (textView4 == null) {
            kotlin.jvm.internal.j.n("mTextViewTransactionLabel");
            throw null;
        }
        textView4.setVisibility(8);
        RecyclerView recyclerView = newMayaCreditFragment3.f13261e1;
        if (recyclerView == null) {
            kotlin.jvm.internal.j.n("mRecyclerViewActivityList");
            throw null;
        }
        recyclerView.setVisibility(8);
        e(new Lh.d(new Lh.d(new Lh.h(this.f2858g.a(5, str), zh.b.a(), 0), new y(this, i), 2), new z(this, i), i4).e());
    }

    public final void s(CreditAccount creditAccount) {
        kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).L1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).X1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).V1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).T1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).S1();
        ConstraintLayout constraintLayout = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13251U0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mContainerHelpCenter");
            throw null;
        }
        constraintLayout.setVisibility(8);
        N5.Z z4 = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13281w1;
        if (z4 == null) {
            kotlin.jvm.internal.j.n("mViewStatusWriteOff");
            throw null;
        }
        z4.f4041b.setVisibility(8);
        C0449e1 c0449e1 = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13283x1;
        if (c0449e1 == null) {
            kotlin.jvm.internal.j.n("mViewStatusWrittenOff");
            throw null;
        }
        c0449e1.f4085b.setVisibility(8);
        N5.C c = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13280v1;
        if (c == null) {
            kotlin.jvm.internal.j.n("mViewStatusAvailable");
            throw null;
        }
        ((ConstraintLayout) c.f).setVisibility(0);
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).g2();
        P9.k kVar = (P9.k) this.c.get();
        String usedValue = creditAccount.getFormattedUsedBalanceValue();
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) kVar;
        newMayaCreditFragment.getClass();
        kotlin.jvm.internal.j.g(usedValue, "usedValue");
        TextView textView = newMayaCreditFragment.y0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditUsed");
            throw null;
        }
        textView.setText(newMayaCreditFragment.getString(R.string.maya_label_credit_used, usedValue));
        P9.k kVar2 = (P9.k) this.c.get();
        String limitValue = creditAccount.getFormattedLoanAmountValue();
        NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) kVar2;
        newMayaCreditFragment2.getClass();
        kotlin.jvm.internal.j.g(limitValue, "limitValue");
        TextView textView2 = newMayaCreditFragment2.f13226A0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditAvailable");
            throw null;
        }
        textView2.setText(newMayaCreditFragment2.getString(R.string.maya_label_credit_limit, limitValue));
        if (this.f2857d.f11330b.getBoolean("key_is_show_credit_balance", true)) {
            y();
            NewMayaCreditFragment newMayaCreditFragment3 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            ImageView imageView = newMayaCreditFragment3.f13279v0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mImageViewShowHideCreditAmount");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(newMayaCreditFragment3.requireActivity(), R.drawable.maya_ic_eye_show_toggle));
            ((NewMayaCreditFragment) ((P9.k) this.c.get())).f2();
        } else {
            NewMayaCreditFragment newMayaCreditFragment4 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            ImageView imageView2 = newMayaCreditFragment4.f13279v0;
            if (imageView2 == null) {
                kotlin.jvm.internal.j.n("mImageViewShowHideCreditAmount");
                throw null;
            }
            imageView2.setImageDrawable(ContextCompat.getDrawable(newMayaCreditFragment4.requireActivity(), R.drawable.maya_ic_eye_hide_toggle));
            ((NewMayaCreditFragment) ((P9.k) this.c.get())).R1();
            m();
        }
        int usedValue2 = (int) ((creditAccount.getUsedValue() / creditAccount.getLoanAmount()) * ((double) 100));
        NewMayaCreditFragment newMayaCreditFragment5 = (NewMayaCreditFragment) ((P9.k) this.c.get());
        ProgressBar progressBar = newMayaCreditFragment5.f13232D0;
        if (progressBar == null) {
            kotlin.jvm.internal.j.n("mProgressBar");
            throw null;
        }
        progressBar.postDelayed(new G7.p(newMayaCreditFragment5, usedValue2, 1), 100L);
        P9.k kVar3 = (P9.k) this.c.get();
        String amount = creditAccount.getFormattedAvailableBalanceValue();
        String currency = creditAccount.getCurrencyCode();
        NewMayaCreditFragment newMayaCreditFragment6 = (NewMayaCreditFragment) kVar3;
        newMayaCreditFragment6.getClass();
        kotlin.jvm.internal.j.g(amount, "amount");
        kotlin.jvm.internal.j.g(currency, "currency");
        TextView textView3 = newMayaCreditFragment6.f13274r0;
        if (textView3 == null) {
            kotlin.jvm.internal.j.n("mTextViewCurrency");
            throw null;
        }
        textView3.setText(newMayaCreditFragment6.getString(R.string.pma_label_peso));
        TextView textView4 = newMayaCreditFragment6.f13275s0;
        if (textView4 == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditAmount");
            throw null;
        }
        textView4.setText(amount);
        if (S5.c.b(this.e, A5.b.f82V)) {
            BannerAdCarousel bannerAdCarousel = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13238G1;
            if (bannerAdCarousel == null) {
                kotlin.jvm.internal.j.n("mViewGoogleAdCarousel");
                throw null;
            }
            bannerAdCarousel.setVisibility(8);
            NewMayaCreditFragment newMayaCreditFragment7 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            BannerAdCarousel bannerAdCarousel2 = newMayaCreditFragment7.H1;
            if (bannerAdCarousel2 == null) {
                kotlin.jvm.internal.j.n("mViewGoogleAdCarouselCreditAvailable");
                throw null;
            }
            newMayaCreditFragment7.Y1(bannerAdCarousel2);
            BannerAdCarousel bannerAdCarousel3 = newMayaCreditFragment7.H1;
            if (bannerAdCarousel3 != null) {
                bannerAdCarousel3.setVisibility(0);
            } else {
                kotlin.jvm.internal.j.n("mViewGoogleAdCarouselCreditAvailable");
                throw null;
            }
        }
    }

    public final void t(CreditAccount creditAccount) {
        kotlin.jvm.internal.j.g(creditAccount, "creditAccount");
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        newMayaCreditFragment.L1();
        newMayaCreditFragment.X1();
        newMayaCreditFragment.V1();
        newMayaCreditFragment.T1();
        newMayaCreditFragment.S1();
        ConstraintLayout constraintLayout = newMayaCreditFragment.f13251U0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mContainerHelpCenter");
            throw null;
        }
        constraintLayout.setVisibility(8);
        N5.C c = newMayaCreditFragment.f13280v1;
        if (c == null) {
            kotlin.jvm.internal.j.n("mViewStatusAvailable");
            throw null;
        }
        ((ConstraintLayout) c.f).setVisibility(8);
        C0449e1 c0449e1 = newMayaCreditFragment.f13283x1;
        if (c0449e1 == null) {
            kotlin.jvm.internal.j.n("mViewStatusWrittenOff");
            throw null;
        }
        c0449e1.f4085b.setVisibility(8);
        N5.Z z4 = newMayaCreditFragment.f13281w1;
        if (z4 == null) {
            kotlin.jvm.internal.j.n("mViewStatusWriteOff");
            throw null;
        }
        z4.f4041b.setVisibility(0);
        newMayaCreditFragment.g2();
        String amount = creditAccount.getFormattedAvailableBalanceValue();
        String currency = creditAccount.getCurrencyCode();
        kotlin.jvm.internal.j.g(amount, "amount");
        kotlin.jvm.internal.j.g(currency, "currency");
        TextView textView = newMayaCreditFragment.f13237G0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewCurrencyWriteOff");
            throw null;
        }
        textView.setText(newMayaCreditFragment.getString(R.string.pma_label_peso));
        TextView textView2 = newMayaCreditFragment.f13239H0;
        if (textView2 != null) {
            textView2.setText(amount);
        } else {
            kotlin.jvm.internal.j.n("mTextViewCreditAmountWriteOff");
            throw null;
        }
    }

    public final void u() {
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        newMayaCreditFragment.L1();
        newMayaCreditFragment.X1();
        newMayaCreditFragment.V1();
        newMayaCreditFragment.T1();
        newMayaCreditFragment.S1();
        ConstraintLayout constraintLayout = newMayaCreditFragment.f13251U0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mContainerHelpCenter");
            throw null;
        }
        constraintLayout.setVisibility(8);
        N5.C c = newMayaCreditFragment.f13280v1;
        if (c == null) {
            kotlin.jvm.internal.j.n("mViewStatusAvailable");
            throw null;
        }
        ((ConstraintLayout) c.f).setVisibility(8);
        Group group = newMayaCreditFragment.f13264i1;
        if (group == null) {
            kotlin.jvm.internal.j.n("mGroupCreditV1Ui");
            throw null;
        }
        group.setVisibility(8);
        C0449e1 c0449e1 = newMayaCreditFragment.f13283x1;
        if (c0449e1 == null) {
            kotlin.jvm.internal.j.n("mViewStatusWrittenOff");
            throw null;
        }
        c0449e1.f4085b.setVisibility(0);
        N5.Z z4 = newMayaCreditFragment.f13281w1;
        if (z4 == null) {
            kotlin.jvm.internal.j.n("mViewStatusWriteOff");
            throw null;
        }
        z4.f4041b.setVisibility(8);
        newMayaCreditFragment.g2();
        N5.C c10 = newMayaCreditFragment.f13266k1;
        if (c10 == null) {
            kotlin.jvm.internal.j.n("mRevampBillingCycle");
            throw null;
        }
        ((Group) c10.i).setVisibility(8);
        Group group2 = newMayaCreditFragment.f13265j1;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mGroupPayEarlySection");
            throw null;
        }
        group2.setVisibility(8);
        ConstraintLayout constraintLayout2 = newMayaCreditFragment.f13267l1;
        if (constraintLayout2 != null) {
            constraintLayout2.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mConstraintLayoutRevampBillingCycle");
            throw null;
        }
    }

    public final void v() {
        C0489y c0489y = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13250T0;
        if (c0489y == null) {
            kotlin.jvm.internal.j.n("mViewCreditDiscoveryHeader");
            throw null;
        }
        c0489y.f4296b.setVisibility(0);
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).S1();
        ConstraintLayout constraintLayout = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13251U0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mContainerHelpCenter");
            throw null;
        }
        constraintLayout.setVisibility(0);
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).L1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).V1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).U1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).X1();
        if (S5.c.b(this.e, A5.b.f82V)) {
            BannerAdCarousel bannerAdCarousel = ((NewMayaCreditFragment) ((P9.k) this.c.get())).H1;
            if (bannerAdCarousel == null) {
                kotlin.jvm.internal.j.n("mViewGoogleAdCarouselCreditAvailable");
                throw null;
            }
            bannerAdCarousel.setVisibility(8);
            ((NewMayaCreditFragment) ((P9.k) this.c.get())).Z1();
        }
    }

    public final void w() {
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).L1();
        Group group = ((NewMayaCreditFragment) ((P9.k) this.c.get())).R0;
        if (group == null) {
            kotlin.jvm.internal.j.n("mGroupCreditPendingEnhancedInfo");
            throw null;
        }
        group.setVisibility(8);
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).T1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).S1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).U1();
        ((NewMayaCreditFragment) ((P9.k) this.c.get())).X1();
        C0491z c0491z = ((NewMayaCreditFragment) ((P9.k) this.c.get())).N0;
        if (c0491z == null) {
            kotlin.jvm.internal.j.n("mViewCreditPendingHeader");
            throw null;
        }
        ((ConstraintLayout) c0491z.f4303b).setVisibility(0);
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        newMayaCreditFragment.m1().r(EnumC1216e.SUBMITTED_REVIEW);
        ImageView imageView = newMayaCreditFragment.f13246O0;
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewCreditPendingHeader");
            throw null;
        }
        imageView.setImageDrawable(ContextCompat.getDrawable(newMayaCreditFragment.requireActivity(), 2131231316));
        C0491z c0491z2 = newMayaCreditFragment.N0;
        if (c0491z2 == null) {
            kotlin.jvm.internal.j.n("mViewCreditPendingHeader");
            throw null;
        }
        ((ConstraintLayout) c0491z2.f).setBackground(ContextCompat.getDrawable(newMayaCreditFragment.requireActivity(), R.drawable.maya_bg_solid_round_opacity_blue_40));
        TextView textView = newMayaCreditFragment.f13247P0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditPendingTitle");
            throw null;
        }
        textView.setText(newMayaCreditFragment.getString(R.string.maya_label_credit_submitted_header_title));
        TextView textView2 = newMayaCreditFragment.f13248Q0;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewCreditPendingDescription");
            throw null;
        }
        textView2.setText(newMayaCreditFragment.getString(R.string.maya_label_credit_submitted_header_description));
        ConstraintLayout constraintLayout = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13251U0;
        if (constraintLayout == null) {
            kotlin.jvm.internal.j.n("mContainerHelpCenter");
            throw null;
        }
        constraintLayout.setVisibility(0);
        if (S5.c.b(this.e, A5.b.f82V)) {
            ((NewMayaCreditFragment) ((P9.k) this.c.get())).Z1();
        }
    }

    public final void x() {
        C0449e1 c0449e1 = ((NewMayaCreditFragment) ((P9.k) this.c.get())).f13241J0;
        if (c0449e1 == null) {
            kotlin.jvm.internal.j.n("mViewContactReferenceBanner");
            throw null;
        }
        c0449e1.f4085b.setVisibility(0);
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        Button button = newMayaCreditFragment.w0;
        if (button == null) {
            kotlin.jvm.internal.j.n("mButtonTransferToWallet");
            throw null;
        }
        button.setEnabled(false);
        Button button2 = newMayaCreditFragment.w0;
        if (button2 == null) {
            kotlin.jvm.internal.j.n("mButtonTransferToWallet");
            throw null;
        }
        button2.setBackground(ContextCompat.getDrawable(newMayaCreditFragment.requireActivity(), R.drawable.maya_bg_color_neon_green_transparent_rounded));
        Button button3 = newMayaCreditFragment.w0;
        if (button3 != null) {
            button3.setTextColor(ContextCompat.getColor(newMayaCreditFragment.requireContext(), R.color.maya_opacity_green_25));
        } else {
            kotlin.jvm.internal.j.n("mButtonTransferToWallet");
            throw null;
        }
    }

    public final void y() {
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        TextView textView = newMayaCreditFragment.f13278u1;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewOutstandingBillAmountMasked");
            throw null;
        }
        textView.setVisibility(8);
        TextView textView2 = newMayaCreditFragment.f13268m1;
        if (textView2 == null) {
            kotlin.jvm.internal.j.n("mTextViewRevampOutstandingBalance");
            throw null;
        }
        textView2.setVisibility(0);
        if (this.m != null) {
            NewMayaCreditFragment newMayaCreditFragment2 = (NewMayaCreditFragment) ((P9.k) this.c.get());
            TextView textView3 = newMayaCreditFragment2.f13277t1;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mTextViewLatestBillAmountMasked");
                throw null;
            }
            textView3.setVisibility(8);
            TextView textView4 = newMayaCreditFragment2.f13269n1;
            if (textView4 != null) {
                textView4.setVisibility(0);
            } else {
                kotlin.jvm.internal.j.n("mTextViewRevampLatestBillAmount");
                throw null;
            }
        }
    }

    public final void z() {
        NewMayaCreditFragment newMayaCreditFragment = (NewMayaCreditFragment) ((P9.k) this.c.get());
        MayaBaseLoadingFragment.N1(newMayaCreditFragment, 200, newMayaCreditFragment.getString(R.string.maya_label_credit_error_dialog_description), newMayaCreditFragment.getString(R.string.maya_label_credit_error_dialog_title), new Q9.E(newMayaCreditFragment, 4), 24);
    }
}
