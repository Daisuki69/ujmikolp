package G6;

import L6.y;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.paymaya.R;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.C;
import com.paymaya.common.utility.C1219h;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.common.utility.EnumC1217f;
import com.paymaya.domain.model.AddMoneyViaCardSettings;
import com.paymaya.domain.model.PayMayaError;
import com.paymaya.domain.model.VaultedCard;
import com.paymaya.domain.store.C1295y0;
import com.paymaya.mayaui.cashin.view.activity.impl.MayaCashInActivity;
import com.paymaya.mayaui.cashin.view.fragment.impl.MayaCashInViaCardFormFragment;
import com.paymaya.mayaui.common.view.widget.MayaInputLayout;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.List;
import y5.AbstractC2509a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class s extends AbstractC2509a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f1813d;
    public final C1295y0 e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1814g;

    public s(com.paymaya.data.preference.a aVar, C1295y0 c1295y0, Uh.d dVar) {
        super(dVar);
        this.f1813d = aVar;
        this.e = c1295y0;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        boolean z4;
        super.j();
        Bundle arguments = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).getArguments();
        AddMoneyViaCardSettings addMoneyViaCardSettings = arguments != null ? (AddMoneyViaCardSettings) arguments.getParcelable("settings") : null;
        if (addMoneyViaCardSettings != null) {
            String currency = addMoneyViaCardSettings.getMCurrency();
            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = (MayaCashInViaCardFormFragment) ((K6.l) this.c.get());
            mayaCashInViaCardFormFragment.getClass();
            kotlin.jvm.internal.j.g(currency, "currency");
            TextView textView = mayaCashInViaCardFormFragment.f11739c0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mAmountTitleTextView");
                throw null;
            }
            textView.setText(mayaCashInViaCardFormFragment.getString(R.string.pma_label_choose_from_the_amounts_below, currency));
            String mNote = addMoneyViaCardSettings.getMNote();
            if (C2576A.H(mNote)) {
                MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment2 = (MayaCashInViaCardFormFragment) ((K6.l) this.c.get());
                TextView textView2 = mayaCashInViaCardFormFragment2.f11741e0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n("mConvenienceFeeNoteTextView");
                    throw null;
                }
                textView2.setText(mayaCashInViaCardFormFragment2.getString(R.string.pma_label_convenience_fee_may_apply));
            } else {
                MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment3 = (MayaCashInViaCardFormFragment) ((K6.l) this.c.get());
                mayaCashInViaCardFormFragment3.getClass();
                TextView textView3 = mayaCashInViaCardFormFragment3.f11741e0;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n("mConvenienceFeeNoteTextView");
                    throw null;
                }
                textView3.setText(mNote);
            }
            List<String> mSupportedSchemes = addMoneyViaCardSettings.getMSupportedSchemes();
            if (mSupportedSchemes.contains("JCB")) {
                ImageView imageView = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11746j0;
                if (imageView == null) {
                    kotlin.jvm.internal.j.n("mJCBLogoImageView");
                    throw null;
                }
                imageView.setVisibility(0);
                z4 = true;
            } else {
                ImageView imageView2 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11746j0;
                if (imageView2 == null) {
                    kotlin.jvm.internal.j.n("mJCBLogoImageView");
                    throw null;
                }
                imageView2.setVisibility(8);
                z4 = false;
            }
            if (mSupportedSchemes.contains("MASTERCARD")) {
                ImageView imageView3 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11745i0;
                if (imageView3 == null) {
                    kotlin.jvm.internal.j.n("mMastercardLogoImageView");
                    throw null;
                }
                imageView3.setVisibility(0);
                z4 = true;
            } else {
                ImageView imageView4 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11745i0;
                if (imageView4 == null) {
                    kotlin.jvm.internal.j.n("mMastercardLogoImageView");
                    throw null;
                }
                imageView4.setVisibility(8);
            }
            if (mSupportedSchemes.contains("VISA")) {
                ImageView imageView5 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11744h0;
                if (imageView5 == null) {
                    kotlin.jvm.internal.j.n("mVisaLogoImageView");
                    throw null;
                }
                imageView5.setVisibility(0);
                z4 = true;
            } else {
                ImageView imageView6 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11744h0;
                if (imageView6 == null) {
                    kotlin.jvm.internal.j.n("mVisaLogoImageView");
                    throw null;
                }
                imageView6.setVisibility(8);
            }
            if (z4) {
                Group group = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11743g0;
                if (group == null) {
                    kotlin.jvm.internal.j.n("mAcceptedCardSchemesGroup");
                    throw null;
                }
                group.setVisibility(0);
            } else {
                Group group2 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11743g0;
                if (group2 == null) {
                    kotlin.jvm.internal.j.n("mAcceptedCardSchemesGroup");
                    throw null;
                }
                group2.setVisibility(8);
            }
        }
        Bundle arguments2 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).getArguments();
        VaultedCard vaultedCard = arguments2 != null ? (VaultedCard) arguments2.getParcelable("vaultedCard") : null;
        this.f = vaultedCard != null;
        if (vaultedCard == null) {
            Group group3 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11738b0;
            if (group3 == null) {
                kotlin.jvm.internal.j.n("mVaultedCardGroup");
                throw null;
            }
            group3.setVisibility(8);
            MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment4 = (MayaCashInViaCardFormFragment) ((K6.l) this.c.get());
            String string = mayaCashInViaCardFormFragment4.getString(R.string.maya_label_cash_in_via_card_form_title);
            kotlin.jvm.internal.j.f(string, "getString(...)");
            TextView textView4 = mayaCashInViaCardFormFragment4.f11733W;
            if (textView4 == null) {
                kotlin.jvm.internal.j.n("mTitleHeaderTextView");
                throw null;
            }
            textView4.setText(string);
            y yVar = mayaCashInViaCardFormFragment4.f11753r0;
            if (yVar != null) {
                ((MayaCashInActivity) yVar).K1(string);
            }
            Group group4 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11750o0;
            if (group4 != null) {
                group4.setVisibility(0);
                return;
            } else {
                kotlin.jvm.internal.j.n("mNewCardFormGroup");
                throw null;
            }
        }
        Group group5 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11750o0;
        if (group5 == null) {
            kotlin.jvm.internal.j.n("mNewCardFormGroup");
            throw null;
        }
        group5.setVisibility(8);
        Group group6 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11738b0;
        if (group6 == null) {
            kotlin.jvm.internal.j.n("mVaultedCardGroup");
            throw null;
        }
        group6.setVisibility(0);
        K6.l lVar = (K6.l) this.c.get();
        String cardSchemeName = vaultedCard.getCardSchemeName();
        kotlin.jvm.internal.j.f(cardSchemeName, "getCardSchemeName(...)");
        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment5 = (MayaCashInViaCardFormFragment) lVar;
        mayaCashInViaCardFormFragment5.getClass();
        String string2 = mayaCashInViaCardFormFragment5.getString(R.string.maya_label_cash_in_via_format, cardSchemeName);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        TextView textView5 = mayaCashInViaCardFormFragment5.f11733W;
        if (textView5 == null) {
            kotlin.jvm.internal.j.n("mTitleHeaderTextView");
            throw null;
        }
        textView5.setText(string2);
        y yVar2 = mayaCashInViaCardFormFragment5.f11753r0;
        if (yVar2 != null) {
            ((MayaCashInActivity) yVar2).K1(string2);
        }
        K6.l lVar2 = (K6.l) this.c.get();
        String cardName = vaultedCard.getCardName(" - ");
        kotlin.jvm.internal.j.f(cardName, "getCardName(...)");
        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment6 = (MayaCashInViaCardFormFragment) lVar2;
        mayaCashInViaCardFormFragment6.getClass();
        TextView textView6 = mayaCashInViaCardFormFragment6.f11735Y;
        if (textView6 == null) {
            kotlin.jvm.internal.j.n("mCardNameTextView");
            throw null;
        }
        textView6.setText(cardName);
        ImageView imageView7 = mayaCashInViaCardFormFragment6.f11737a0;
        if (imageView7 == null) {
            kotlin.jvm.internal.j.n("mCardCheckImageView");
            throw null;
        }
        imageView7.setVisibility(0);
        ImageView imageView8 = mayaCashInViaCardFormFragment6.f11737a0;
        if (imageView8 == null) {
            kotlin.jvm.internal.j.n("mCardCheckImageView");
            throw null;
        }
        imageView8.setImageResource(R.drawable.maya_ic_check_green);
        K6.l lVar3 = (K6.l) this.c.get();
        String strK0 = C.k0(vaultedCard.mLastFourDigits());
        kotlin.jvm.internal.j.f(strK0, "maskCardNumber(...)");
        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment7 = (MayaCashInViaCardFormFragment) lVar3;
        mayaCashInViaCardFormFragment7.getClass();
        TextView textView7 = mayaCashInViaCardFormFragment7.f11736Z;
        if (textView7 == null) {
            kotlin.jvm.internal.j.n("mCardNumberTextView");
            throw null;
        }
        textView7.setText(strK0);
        if ("VISA".equalsIgnoreCase(vaultedCard.mCardScheme())) {
            ImageView imageView9 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11734X;
            if (imageView9 == null) {
                kotlin.jvm.internal.j.n("mCardLogoImageView");
                throw null;
            }
            imageView9.setImageResource(R.drawable.maya_ic_card_scheme_visa);
        } else if ("MASTERCARD".equalsIgnoreCase(vaultedCard.mCardScheme())) {
            ImageView imageView10 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11734X;
            if (imageView10 == null) {
                kotlin.jvm.internal.j.n("mCardLogoImageView");
                throw null;
            }
            imageView10.setImageResource(R.drawable.maya_ic_card_scheme_mastercard);
        } else if ("JCB".equalsIgnoreCase(vaultedCard.mCardScheme())) {
            ImageView imageView11 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11734X;
            if (imageView11 == null) {
                kotlin.jvm.internal.j.n("mCardLogoImageView");
                throw null;
            }
            imageView11.setImageResource(R.drawable.maya_ic_card_scheme_jcb);
        }
        Group group7 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11743g0;
        if (group7 != null) {
            group7.setVisibility(8);
        } else {
            kotlin.jvm.internal.j.n("mAcceptedCardSchemesGroup");
            throw null;
        }
    }

    public final void k() {
        boolean z4 = false;
        boolean z5 = this.f1814g > 0;
        if (this.f) {
            z4 = z5;
        } else if (z5 && !C2576A.H(((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).G1())) {
            MayaInputLayout mayaInputLayout = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11747k0;
            if (mayaInputLayout == null) {
                kotlin.jvm.internal.j.n("mMonthMayaInputLayout");
                throw null;
            }
            if (!C2576A.H(String.valueOf(mayaInputLayout.getInputEditText().getText()))) {
                MayaInputLayout mayaInputLayout2 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11748l0;
                if (mayaInputLayout2 == null) {
                    kotlin.jvm.internal.j.n("mYearMayaInputLayout");
                    throw null;
                }
                if (!C2576A.H(String.valueOf(mayaInputLayout2.getInputEditText().getText()))) {
                    MayaInputLayout mayaInputLayout3 = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).m0;
                    if (mayaInputLayout3 == null) {
                        kotlin.jvm.internal.j.n("mCvvCodeMayaInput");
                        throw null;
                    }
                    if (!C2576A.H(String.valueOf(mayaInputLayout3.getInputEditText().getText()))) {
                        z4 = true;
                    }
                }
            }
        }
        Button button = ((MayaCashInViaCardFormFragment) ((K6.l) this.c.get())).f11751p0;
        if (button != null) {
            button.setEnabled(z4);
        } else {
            kotlin.jvm.internal.j.n("mContinueButton");
            throw null;
        }
    }

    public final void l(PayMayaError payMayaError) {
        ((MayaBaseFragment) ((K6.l) this.c.get())).w1();
        if (payMayaError.isSessionTimeout()) {
            return;
        }
        MayaCashInViaCardFormFragment mayaCashInViaCardFormFragment = (MayaCashInViaCardFormFragment) ((K6.l) this.c.get());
        mayaCashInViaCardFormFragment.getClass();
        C1219h c1219h = new C1219h();
        c1219h.n(12);
        c1219h.t(EnumC1217f.CREATE);
        EnumC1212a enumC1212a = EnumC1212a.ACCOUNT_NUMBER;
        c1219h.j.put(Constants.REASON, payMayaError.mSpiel());
        mayaCashInViaCardFormFragment.A1(c1219h);
        y yVar = mayaCashInViaCardFormFragment.f11753r0;
        if (yVar != null) {
            ((MayaCashInActivity) yVar).a(payMayaError, mayaCashInViaCardFormFragment.getString(R.string.pma_toast_error_title_add_money_error));
        }
    }
}
