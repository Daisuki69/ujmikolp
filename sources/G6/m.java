package G6;

import Kh.T;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.zxing.WriterException;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.AbstractC1234x;
import com.paymaya.common.utility.AbstractC1236z;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.C1220i;
import com.paymaya.common.utility.E;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.CreditConsent;
import com.paymaya.domain.model.CreditResponse;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.LoadUpPartner;
import com.paymaya.domain.model.MoneyInTopUpCode;
import com.paymaya.domain.model.SevenElevenPushNotification;
import com.paymaya.domain.store.C;
import com.paymaya.domain.store.C1274n0;
import com.paymaya.domain.store.K;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInCodeFragment;
import com.paymaya.mayaui.newmayacredit.model.CreditReviewUiModel;
import com.paymaya.mayaui.newmayacredit.view.activity.impl.NewMayaCreditActivity;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.MayaCreditTransferFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditEnhancedActivationFragment;
import com.paymaya.mayaui.newmayacredit.view.fragment.impl.NewMayaCreditUpdatePersonalDetailsContactReferenceFragment;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditConsentFragment;
import com.paymaya.ui.mayacredit.view.fragment.impl.MayaCreditSettingsFragment;
import d4.AbstractC1331a;
import defpackage.AbstractC1414e;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import kotlin.Pair;
import org.joda.time.DateTime;
import y5.AbstractC2509a;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1800d;
    public final com.paymaya.data.preference.a e;
    public final Object f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1801g;
    public Object h;
    public Object i;
    public Parcelable j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f1802k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.paymaya.data.preference.a aVar, C1274n0 c1274n0, Uh.d dVar, Uh.d dVar2) {
        super(dVar);
        this.f1800d = 0;
        this.e = aVar;
        this.f = c1274n0;
        this.f1801g = dVar2;
    }

    @Override // y5.AbstractC2509a
    public void j() {
        switch (this.f1800d) {
            case 1:
                super.j();
                String stringExtra = ((NewMayaCreditActivity) ((M9.d) this.c.get())).getIntent().getStringExtra("feature");
                CreditTerm creditTerm = (CreditTerm) ((NewMayaCreditActivity) ((M9.d) this.c.get())).getIntent().getParcelableExtra("credit");
                String stringExtra2 = ((NewMayaCreditActivity) ((M9.d) this.c.get())).getIntent().getStringExtra("risk_level");
                boolean booleanExtra = ((NewMayaCreditActivity) ((M9.d) this.c.get())).getIntent().getBooleanExtra("is_credit_scoring_data_valid", false);
                CreditConsent creditConsent = (CreditConsent) ((NewMayaCreditActivity) ((M9.d) this.c.get())).getIntent().getParcelableExtra("consent");
                if (creditConsent != null) {
                    NewMayaCreditActivity newMayaCreditActivity = (NewMayaCreditActivity) ((M9.d) this.c.get());
                    newMayaCreditActivity.getClass();
                    E.a("NewMayaCreditActivity", "showConsent");
                    MayaCreditConsentFragment mayaCreditConsentFragment = new MayaCreditConsentFragment();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("credit_consent", creditConsent);
                    mayaCreditConsentFragment.setArguments(bundle);
                    AbstractC1236z.g(newMayaCreditActivity, R.id.fragment_container, mayaCreditConsentFragment);
                    break;
                } else if (creditTerm != null) {
                    NewMayaCreditActivity newMayaCreditActivity2 = (NewMayaCreditActivity) ((M9.d) this.c.get());
                    newMayaCreditActivity2.getClass();
                    E.a("NewMayaCreditActivity", "showEnhancedActivation");
                    newMayaCreditActivity2.getWindow().setSoftInputMode(48);
                    NewMayaCreditEnhancedActivationFragment newMayaCreditEnhancedActivationFragment = new NewMayaCreditEnhancedActivationFragment();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("credit_term", creditTerm);
                    bundle2.putString("credit_risk_revel", stringExtra2);
                    bundle2.putBoolean("is_credit_scoring_data_valid", booleanExtra);
                    newMayaCreditEnhancedActivationFragment.setArguments(bundle2);
                    AbstractC1236z.g(newMayaCreditActivity2, R.id.fragment_container, newMayaCreditEnhancedActivationFragment);
                    break;
                } else if (stringExtra != null && stringExtra.length() != 0 && ((CreditResponse) this.j) != null) {
                    int iHashCode = stringExtra.hashCode();
                    if (iHashCode != -1857640538) {
                        if (iHashCode != 1280882667) {
                            if (iHashCode == 1434631203 && stringExtra.equals("settings")) {
                                NewMayaCreditActivity newMayaCreditActivity3 = (NewMayaCreditActivity) ((M9.d) this.c.get());
                                newMayaCreditActivity3.getClass();
                                E.a("NewMayaCreditActivity", "showSettings");
                                newMayaCreditActivity3.h2();
                                AbstractC1236z.h(newMayaCreditActivity3, R.id.fragment_container, new MayaCreditSettingsFragment());
                            }
                            break;
                        } else if (stringExtra.equals("transfer")) {
                            NewMayaCreditActivity newMayaCreditActivity4 = (NewMayaCreditActivity) ((M9.d) this.c.get());
                            newMayaCreditActivity4.getClass();
                            E.a("NewMayaCreditActivity", "showTransferEnhanceFromDashboard");
                            newMayaCreditActivity4.h2();
                            AbstractC1236z.g(newMayaCreditActivity4, R.id.fragment_container, new MayaCreditTransferFragment());
                            break;
                        }
                    } else if (stringExtra.equals("summary")) {
                        ((NewMayaCreditActivity) ((M9.d) this.c.get())).h2();
                        break;
                    }
                } else if (stringExtra != null && stringExtra.length() != 0 && stringExtra.equals("contact_reference")) {
                    NewMayaCreditActivity newMayaCreditActivity5 = (NewMayaCreditActivity) ((M9.d) this.c.get());
                    newMayaCreditActivity5.getClass();
                    E.a("NewMayaCreditActivity", "showUpdatePersonalDetailsContactReferenceScreen");
                    newMayaCreditActivity5.getWindow().setSoftInputMode(48);
                    AbstractC1236z.g(newMayaCreditActivity5, R.id.fragment_container, new NewMayaCreditUpdatePersonalDetailsContactReferenceFragment());
                    break;
                }
                break;
            default:
                super.j();
                break;
        }
    }

    public void k() {
        ((MayaBaseFragment) ((K6.g) this.c.get())).E1();
        C1274n0 c1274n0 = (C1274n0) this.f;
        String str = (String) this.i;
        Amount amount = (Amount) this.j;
        Ah.p pVarA = c1274n0.a(str, "PHP", amount != null ? amount.mValue() : null);
        new T(5, new Lh.d(new Lh.d(AbstractC1331a.l(pVarA, pVarA, zh.b.a()), new J5.c(this, 27), 2), new V2.c(this, 26), 0), new A7.c(this, 22)).e();
    }

    public void l(String str, Map map) {
        C1219h c1219hE = C1219h.e(str);
        for (Map.Entry entry : map.entrySet()) {
            c1219hE.h((String) entry.getKey(), (String) entry.getValue());
        }
        ((C1220i) this.i).b(c1219hE);
    }

    public void m(SevenElevenPushNotification sevenElevenPushNotification) {
        if (new DateTime(((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11682r0).isAfterNow()) {
            Timer timer = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11681q0;
            if (timer != null) {
                timer.cancel();
            }
            if (sevenElevenPushNotification == null || !sevenElevenPushNotification.isSuccess()) {
                L6.n nVar = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11680p0;
                if (nVar != null) {
                    MayaCashInActivity mayaCashInActivity = (MayaCashInActivity) nVar;
                    String string = mayaCashInActivity.getString(R.string.maya_label_cash_in_failed_title);
                    kotlin.jvm.internal.j.f(string, "getString(...)");
                    z2.d.n(R.drawable.maya_ic_failed, string, mayaCashInActivity.getString(R.string.maya_label_something_went_wrong), new Pair(mayaCashInActivity.getString(R.string.maya_label_got_it), new I6.c(mayaCashInActivity, 2)), null, null, 96).show(mayaCashInActivity.getSupportFragmentManager(), "failed_dialog");
                    return;
                }
                return;
            }
            K6.g gVar = (K6.g) this.c.get();
            Bundle arguments = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).getArguments();
            MoneyInTopUpCode moneyInTopUpCode = arguments != null ? (MoneyInTopUpCode) arguments.getParcelable("moneyIn") : null;
            String formattedAmount = moneyInTopUpCode != null ? moneyInTopUpCode.getFormattedAmount() : null;
            L6.n nVar2 = ((MayaCashInCodeFragment) gVar).f11680p0;
            if (nVar2 != null) {
                MayaCashInActivity mayaCashInActivity2 = (MayaCashInActivity) nVar2;
                String string2 = mayaCashInActivity2.getString(R.string.maya_format_cash_in_success_title, AbstractC1414e.h("₱", formattedAmount));
                kotlin.jvm.internal.j.f(string2, "getString(...)");
                z2.d.n(R.drawable.maya_ic_success, string2, mayaCashInActivity2.getString(R.string.maya_label_cash_in_success_description), new Pair(mayaCashInActivity2.getString(R.string.maya_label_done), new I6.c(mayaCashInActivity2, 3)), null, null, 96).show(mayaCashInActivity2.getSupportFragmentManager(), "success_dialog");
            }
        }
    }

    public void n(String str) {
        if (this.e.e().isAppEventsV2CashInEnabled()) {
            K6.g gVar = (K6.g) this.c.get();
            LoadUpPartner loadUpPartner = (LoadUpPartner) this.h;
            String str2 = loadUpPartner != null ? ("moneyin_barcode".equalsIgnoreCase(loadUpPartner.mType()) || "seven".equalsIgnoreCase(loadUpPartner.mType())) ? "barcode" : "7 digit code" : null;
            MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) gVar;
            mayaCashInCodeFragment.getClass();
            C1219h c1219hE = C1219h.e(AbstractC1213b.j(4));
            EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
            c1219hE.j.put("button", str);
            EnumC1212a enumC1212a2 = EnumC1212a.ACCOUNT_NUMBER;
            if (str2 != null) {
                c1219hE.j.put("code_type", str2);
            }
            mayaCashInCodeFragment.o1().b(c1219hE);
        }
    }

    public void o(String str) {
        String str2;
        Bitmap bitmapCreateBitmap;
        ImageView imageView;
        Group group = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11664Y;
        if (group == null) {
            kotlin.jvm.internal.j.n("mGroupCode");
            throw null;
        }
        group.setVisibility(8);
        Group group2 = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11667b0;
        if (group2 == null) {
            kotlin.jvm.internal.j.n("mGroupBarCode");
            throw null;
        }
        group2.setVisibility(0);
        MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) ((K6.g) this.c.get());
        mayaCashInCodeFragment.getClass();
        try {
            str2 = str;
            try {
                K3.b bVarE = new mg.c(1).e(str2, C3.a.e, mayaCashInCodeFragment.getResources().getDimensionPixelSize(R.dimen.maya_cash_in_barcode_width), mayaCashInCodeFragment.getResources().getDimensionPixelSize(R.dimen.maya_cash_in_barcode_height), null);
                int i = bVarE.f2589a;
                int i4 = bVarE.f2590b;
                int[] iArr = new int[i * i4];
                for (int i6 = 0; i6 < i4; i6++) {
                    int i10 = i6 * i;
                    for (int i11 = 0; i11 < i; i11++) {
                        iArr[i10 + i11] = bVarE.b(i11, i6) ? -16777216 : -1;
                    }
                }
                bitmapCreateBitmap = Bitmap.createBitmap(i, i4, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.setPixels(iArr, 0, i, 0, 0, i, i4);
                imageView = mayaCashInCodeFragment.f11665Z;
            } catch (WriterException unused) {
                yk.a.b();
            }
        } catch (WriterException unused2) {
            str2 = str;
        }
        if (imageView == null) {
            kotlin.jvm.internal.j.n("mImageViewCashInBarCode");
            throw null;
        }
        imageView.setImageBitmap(bitmapCreateBitmap);
        TextView textView = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11666a0;
        if (textView == null) {
            kotlin.jvm.internal.j.n("mTextViewCashInBarCode");
            throw null;
        }
        textView.setText(str2);
    }

    public void p(MoneyInTopUpCode moneyInTopUpCode, LoadUpPartner loadUpPartner) {
        if (moneyInTopUpCode != null) {
            boolean z4 = loadUpPartner != null && loadUpPartner.mNoFeeDisplay();
            String string = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).getString(R.string.pma_label_peso);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            Amount amountMFee = moneyInTopUpCode.mFee();
            String formattedValue = amountMFee != null ? amountMFee.getFormattedValue() : null;
            if (z4) {
                Group group = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11674i0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mGroupServiceFee");
                    throw null;
                }
                group.setVisibility(8);
            } else {
                Group group2 = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11674i0;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n("mGroupServiceFee");
                    throw null;
                }
                group2.setVisibility(0);
                K6.g gVar = (K6.g) this.c.get();
                String strI = We.s.i(string, formattedValue);
                TextView textView = ((MayaCashInCodeFragment) gVar).f11672g0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n("mTextViewServiceFee");
                    throw null;
                }
                textView.setText(strI);
            }
            String strMSlug = loadUpPartner != null ? loadUpPartner.mSlug() : null;
            String string2 = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).getString(R.string.pma_label_peso);
            kotlin.jvm.internal.j.f(string2, "getString(...)");
            if ("smart-padala-code".equalsIgnoreCase(strMSlug)) {
                MayaCashInCodeFragment mayaCashInCodeFragment = (MayaCashInCodeFragment) ((K6.g) this.c.get());
                TextView textView2 = mayaCashInCodeFragment.f11670e0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mAmountLabelTextView");
                    throw null;
                }
                textView2.setText(mayaCashInCodeFragment.getString(R.string.maya_label_amount));
                Group group3 = mayaCashInCodeFragment.f11669d0;
                if (group3 == null) {
                    kotlin.jvm.internal.j.n("mAmountDueGroup");
                    throw null;
                }
                group3.setVisibility(8);
                K6.g gVar2 = (K6.g) this.c.get();
                String strI2 = We.s.i(string2, moneyInTopUpCode.getFormattedAmount());
                TextView textView3 = ((MayaCashInCodeFragment) gVar2).f11671f0;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mAmountValueTextView");
                    throw null;
                }
                textView3.setText(strI2);
            } else {
                MayaCashInCodeFragment mayaCashInCodeFragment2 = (MayaCashInCodeFragment) ((K6.g) this.c.get());
                TextView textView4 = mayaCashInCodeFragment2.f11670e0;
                if (textView4 == null) {
                    kotlin.jvm.internal.j.n("mAmountLabelTextView");
                    throw null;
                }
                textView4.setText(mayaCashInCodeFragment2.getString(R.string.maya_label_cash_in_amount));
                Group group4 = mayaCashInCodeFragment2.f11669d0;
                if (group4 == null) {
                    kotlin.jvm.internal.j.n("mAmountDueGroup");
                    throw null;
                }
                group4.setVisibility(0);
                K6.g gVar3 = (K6.g) this.c.get();
                String strI3 = We.s.i(string2, moneyInTopUpCode.getFormattedTotalAmount());
                TextView textView5 = ((MayaCashInCodeFragment) gVar3).f11668c0;
                if (textView5 == null) {
                    kotlin.jvm.internal.j.n("mAmountDueTextView");
                    throw null;
                }
                textView5.setText(strI3);
                K6.g gVar4 = (K6.g) this.c.get();
                String strI4 = We.s.i(string2, moneyInTopUpCode.getFormattedAmount());
                TextView textView6 = ((MayaCashInCodeFragment) gVar4).f11671f0;
                if (textView6 == null) {
                    kotlin.jvm.internal.j.n("mAmountValueTextView");
                    throw null;
                }
                textView6.setText(strI4);
            }
            String strMType = loadUpPartner != null ? loadUpPartner.mType() : null;
            if ("moneyin_barcode".equalsIgnoreCase(strMType)) {
                o(moneyInTopUpCode.mCode() + String.format(Locale.ENGLISH, "%08.0f", Double.valueOf(moneyInTopUpCode.getFormattedTotalAmountAsDouble().doubleValue() * 100.0d)));
            } else if ("seven".equalsIgnoreCase(strMType)) {
                o(moneyInTopUpCode.mCode());
            } else {
                String strMCode = moneyInTopUpCode.mCode();
                Group group5 = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11664Y;
                if (group5 == null) {
                    kotlin.jvm.internal.j.n("mGroupCode");
                    throw null;
                }
                group5.setVisibility(0);
                Group group6 = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11667b0;
                if (group6 == null) {
                    kotlin.jvm.internal.j.n("mGroupBarCode");
                    throw null;
                }
                group6.setVisibility(8);
                TextView textView7 = ((MayaCashInCodeFragment) ((K6.g) this.c.get())).f11663X;
                if (textView7 == null) {
                    kotlin.jvm.internal.j.n("mTextViewCashInCode");
                    throw null;
                }
                textView7.setText(strMCode);
            }
            DateTime dateTimeB = AbstractC1234x.b(moneyInTopUpCode.mExpiryDate());
            K6.g gVar5 = (K6.g) this.c.get();
            Date date = dateTimeB.toDate();
            kotlin.jvm.internal.j.f(date, "toDate(...)");
            MayaCashInCodeFragment mayaCashInCodeFragment3 = (MayaCashInCodeFragment) gVar5;
            mayaCashInCodeFragment3.getClass();
            Object objClone = date.clone();
            kotlin.jvm.internal.j.e(objClone, "null cannot be cast to non-null type java.util.Date");
            mayaCashInCodeFragment3.f11682r0 = (Date) objClone;
            mayaCashInCodeFragment3.f11681q0 = new Timer();
            L6.o oVar = new L6.o(mayaCashInCodeFragment3);
            Timer timer = mayaCashInCodeFragment3.f11681q0;
            if (timer != null) {
                timer.schedule(oVar, date);
            }
            K6.g gVar6 = (K6.g) this.c.get();
            String strPrint = AbstractC1234x.e.withLocale(AbstractC1234x.l()).print(new DateTime(dateTimeB));
            TextView textView8 = ((MayaCashInCodeFragment) gVar6).f11673h0;
            if (textView8 != null) {
                textView8.setText(strPrint);
            } else {
                kotlin.jvm.internal.j.n("mTextViewValidUntil");
                throw null;
            }
        }
    }

    public m(com.paymaya.data.preference.a aVar, S5.c cVar, K k8, C c, C1220i c1220i) {
        this.f1800d = 1;
        this.e = aVar;
        this.f = cVar;
        this.f1801g = k8;
        this.h = c;
        this.i = c1220i;
        this.f1802k = new CreditReviewUiModel(null, null, null, null, null, J9.d.c, null, null, null, null, 0, null, null, null, 1048543);
    }
}
