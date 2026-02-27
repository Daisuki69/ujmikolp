package Xb;

import N5.C0447e;
import N5.Z0;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import c7.C1079c;
import com.dynatrace.android.agent.Global;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.widget.HtmlTextView;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.FundSource;
import com.paymaya.domain.model.Order;
import com.paymaya.domain.model.PaymentConfirmationSummary;
import com.paymaya.domain.model.ProductProviderDetails;
import com.paymaya.domain.model.ProductV3;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.MayaReviewInfoRecyclerView;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelTwoValuesReviewInfoItem;
import com.paymaya.mayaui.shop.view.fragment.impl.MayaShopReceiptFragment;
import defpackage.AbstractC1414e;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sd.AbstractC2252a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class C extends AbstractC2252a implements y5.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.paymaya.data.preference.a f6553d;
    public M5.e e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6554g;
    public boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(com.paymaya.data.preference.a mPreference, S5.c flagConfigurationService) {
        super(flagConfigurationService, 0);
        kotlin.jvm.internal.j.g(mPreference, "mPreference");
        kotlin.jvm.internal.j.g(flagConfigurationService, "flagConfigurationService");
        this.f6553d = mPreference;
    }

    @Override // y5.AbstractC2509a
    public final void j() {
        String strSubstring;
        String strI;
        super.j();
        Order order = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).N0;
        PaymentConfirmationSummary paymentConfirmationSummary = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14148O0;
        if (paymentConfirmationSummary == null || order == null) {
            return;
        }
        ProductV3 targetProduct = paymentConfirmationSummary.getTargetProduct();
        M5.e eVar = new M5.e();
        String string = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).getString(R.string.maya_shop_account_number_label);
        kotlin.jvm.internal.j.f(string, "getString(...)");
        eVar.c = string;
        String string2 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).getString(R.string.maya_shop_recipient_label);
        kotlin.jvm.internal.j.f(string2, "getString(...)");
        eVar.f3087b = string2;
        this.e = eVar;
        ProductV3 targetProduct2 = paymentConfirmationSummary.getTargetProduct();
        ArrayList arrayList = new ArrayList();
        if (this.e == null) {
            kotlin.jvm.internal.j.n("shopReviewInfoHelper");
            throw null;
        }
        ProductProviderDetails productProviderDetails = targetProduct2.getProductProviderDetails();
        LinkedHashMap linkedHashMapA = M5.e.a(productProviderDetails != null ? productProviderDetails.mProductProviderFields() : null, paymentConfirmationSummary.getDynamicFieldsCodeAndInput());
        if (linkedHashMapA != null) {
            for (Map.Entry entry : linkedHashMapA.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (this.e == null) {
                    kotlin.jvm.internal.j.n("shopReviewInfoHelper");
                    throw null;
                }
                C1079c c1079cB = M5.e.b(str, str2, null);
                if (c1079cB != null) {
                    arrayList.add(c1079cB);
                }
            }
            this.f6554g = true;
            MayaShopReceiptFragment mayaShopReceiptFragment = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            MayaReviewInfoRecyclerView mayaReviewInfoRecyclerView = mayaShopReceiptFragment.w0;
            if (mayaReviewInfoRecyclerView == null) {
                kotlin.jvm.internal.j.n("mDynamicFieldsRecyclerView");
                throw null;
            }
            mayaReviewInfoRecyclerView.setVisibility(0);
            View view = mayaShopReceiptFragment.f14154x0;
            if (view == null) {
                kotlin.jvm.internal.j.n("mDynamicFieldsBottomDividerView");
                throw null;
            }
            view.setVisibility(0);
            MayaShopReceiptFragment mayaShopReceiptFragment2 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            mayaShopReceiptFragment2.getClass();
            mayaShopReceiptFragment2.f14149P0.e(arrayList);
        }
        if (!this.f6553d.e().isMayaShopWithCheckoutFlowEnabled()) {
            if (this.e == null) {
                kotlin.jvm.internal.j.n("shopReviewInfoHelper");
                throw null;
            }
            String string3 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).getString(R.string.maya_shop_payment_method_label);
            kotlin.jvm.internal.j.f(string3, "getString(...)");
            FundSource appliedFundSource = paymentConfirmationSummary.getAppliedFundSource();
            C1079c c1079cB2 = M5.e.b(string3, appliedFundSource != null ? appliedFundSource.mName() : null, com.paymaya.common.utility.C.p(this.f6553d.r()));
            if (c1079cB2 != null) {
                MayaShopReceiptFragment mayaShopReceiptFragment3 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
                mayaShopReceiptFragment3.getClass();
                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem = mayaShopReceiptFragment3.f14136A0;
                if (mayaLabelTwoValuesReviewInfoItem == null) {
                    kotlin.jvm.internal.j.n("mPaymentMethodItem");
                    throw null;
                }
                mayaLabelTwoValuesReviewInfoItem.setVisibility(0);
                MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem2 = mayaShopReceiptFragment3.f14136A0;
                if (mayaLabelTwoValuesReviewInfoItem2 == null) {
                    kotlin.jvm.internal.j.n("mPaymentMethodItem");
                    throw null;
                }
                mayaLabelTwoValuesReviewInfoItem2.setTitle(c1079cB2.f9300a);
                mayaLabelTwoValuesReviewInfoItem2.setValue(c1079cB2.f9301b);
                mayaLabelTwoValuesReviewInfoItem2.setSecondValue(c1079cB2.c);
                View view2 = mayaShopReceiptFragment3.f14155z0;
                if (view2 == null) {
                    kotlin.jvm.internal.j.n("mTargetFieldBottomDividerView");
                    throw null;
                }
                view2.setVisibility(0);
            }
        }
        M5.e eVar2 = this.e;
        if (eVar2 == null) {
            kotlin.jvm.internal.j.n("shopReviewInfoHelper");
            throw null;
        }
        C1079c c1079cE = eVar2.e(targetProduct2, paymentConfirmationSummary.getTargetRecipientName(), paymentConfirmationSummary);
        if (c1079cE != null) {
            this.h = true;
            MayaShopReceiptFragment mayaShopReceiptFragment4 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            mayaShopReceiptFragment4.getClass();
            MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem3 = mayaShopReceiptFragment4.f14137B0;
            if (mayaLabelTwoValuesReviewInfoItem3 == null) {
                kotlin.jvm.internal.j.n("mTargetItem");
                throw null;
            }
            mayaLabelTwoValuesReviewInfoItem3.setVisibility(0);
            MayaLabelTwoValuesReviewInfoItem mayaLabelTwoValuesReviewInfoItem4 = mayaShopReceiptFragment4.f14137B0;
            if (mayaLabelTwoValuesReviewInfoItem4 == null) {
                kotlin.jvm.internal.j.n("mTargetItem");
                throw null;
            }
            mayaLabelTwoValuesReviewInfoItem4.setTitle(c1079cE.f9300a);
            mayaLabelTwoValuesReviewInfoItem4.setValue(c1079cE.f9301b);
            mayaLabelTwoValuesReviewInfoItem4.setSecondValue(c1079cE.c);
        }
        if (this.e == null) {
            kotlin.jvm.internal.j.n("shopReviewInfoHelper");
            throw null;
        }
        String string4 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).getString(R.string.maya_shop_payment_id_label);
        kotlin.jvm.internal.j.f(string4, "getString(...)");
        Order order2 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).N0;
        if (order2 == null || (strSubstring = order2.mPaymentId()) == null) {
            strSubstring = "";
        }
        if (strSubstring.length() >= 12) {
            strSubstring = strSubstring.substring(strSubstring.length() - 12);
            kotlin.jvm.internal.j.f(strSubstring, "substring(...)");
        }
        Locale locale = Locale.getDefault();
        kotlin.jvm.internal.j.f(locale, "getDefault(...)");
        String upperCase = strSubstring.toUpperCase(locale);
        kotlin.jvm.internal.j.f(upperCase, "toUpperCase(...)");
        C1079c c1079cB3 = M5.e.b(string4, upperCase, null);
        if (c1079cB3 != null) {
            if (c1079cB3.f9301b.length() <= 0) {
                c1079cB3 = null;
            }
            if (c1079cB3 != null) {
                MayaShopReceiptFragment mayaShopReceiptFragment5 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
                mayaShopReceiptFragment5.getClass();
                C0447e c0447e = mayaShopReceiptFragment5.f14138C0;
                if (c0447e == null) {
                    kotlin.jvm.internal.j.n("mReferenceIDItem");
                    throw null;
                }
                ConstraintLayout constraintLayout = (ConstraintLayout) c0447e.f4079b;
                kotlin.jvm.internal.j.f(constraintLayout, "getRoot(...)");
                constraintLayout.setVisibility(0);
                C0447e c0447e2 = mayaShopReceiptFragment5.f14138C0;
                if (c0447e2 == null) {
                    kotlin.jvm.internal.j.n("mReferenceIDItem");
                    throw null;
                }
                ((TextView) c0447e2.f).setText(c1079cB3.f9300a);
                ((TextView) c0447e2.e).setText(c1079cB3.f9301b);
                View view3 = mayaShopReceiptFragment5.y0;
                if (view3 == null) {
                    kotlin.jvm.internal.j.n("mReferenceIDBottomDividerView");
                    throw null;
                }
                view3.setVisibility(0);
            }
        }
        if (this.f6554g) {
            Group group = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).I0;
            if (group == null) {
                kotlin.jvm.internal.j.n("mGroupTransactionDetailsLabel");
                throw null;
            }
            group.setVisibility(0);
            ((MayaShopReceiptFragment) ((bc.n) this.c.get())).n2();
        }
        if (this.f6553d.e().isMayaShopWithCheckoutFlowEnabled()) {
            ((MayaShopReceiptFragment) ((bc.n) this.c.get())).o2();
        }
        ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f2(targetProduct.getIconUrl());
        bc.n nVar = (bc.n) this.c.get();
        String name = targetProduct.getName();
        MayaShopReceiptFragment mayaShopReceiptFragment6 = (MayaShopReceiptFragment) nVar;
        mayaShopReceiptFragment6.getClass();
        kotlin.jvm.internal.j.g(name, "name");
        mayaShopReceiptFragment6.d2(name);
        String strMStatus = order.mStatus();
        if ("KYUUBI_PENDING".equalsIgnoreCase(strMStatus) || (this.f6553d.e().isMayaShopWithCheckoutFlowEnabled() && ("PROCESSING".equalsIgnoreCase(strMStatus) || "PAYMENT_SUCCESSFUL".equalsIgnoreCase(strMStatus)))) {
            ((MayaShopReceiptFragment) ((bc.n) this.c.get())).i2();
        } else {
            MayaShopReceiptFragment mayaShopReceiptFragment7 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            mayaShopReceiptFragment7.getClass();
            MayaAbstractBaseReceiptFragmentImpl.h2(mayaShopReceiptFragment7);
        }
        boolean zIsPromo = targetProduct.isPromo();
        Amount amountOriginal = targetProduct.getAmountOriginal();
        Amount amountDiscounted = targetProduct.getAmountDiscounted();
        kotlin.jvm.internal.j.g(amountOriginal, "amountOriginal");
        String paidValueText = (!zIsPromo || amountDiscounted == null) ? AbstractC1414e.h("₱", amountOriginal.getFormattedValue()) : AbstractC1414e.h("₱", amountDiscounted.getFormattedValue());
        MayaShopReceiptFragment mayaShopReceiptFragment8 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
        mayaShopReceiptFragment8.getClass();
        kotlin.jvm.internal.j.g(paidValueText, "paidValueText");
        mayaShopReceiptFragment8.e2(mayaShopReceiptFragment8.getString(R.string.maya_format_negative_amount_value, paidValueText));
        String message = paymentConfirmationSummary.getMessage();
        if (targetProduct.isProductBeepCard()) {
            MayaShopReceiptFragment mayaShopReceiptFragment9 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            TextView textView = mayaShopReceiptFragment9.f14139D0;
            if (textView == null) {
                kotlin.jvm.internal.j.n("mAdditionalMessageTextView");
                throw null;
            }
            textView.setText(mayaShopReceiptFragment9.getString(R.string.maya_label_beep_card_spiel));
        } else if (message == null || C2576A.H(message) || targetProduct.isProductShareTreats()) {
            TextView textView2 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14139D0;
            if (textView2 == null) {
                kotlin.jvm.internal.j.n("mAdditionalMessageTextView");
                throw null;
            }
            textView2.setVisibility(8);
        } else {
            MayaShopReceiptFragment mayaShopReceiptFragment10 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            mayaShopReceiptFragment10.getClass();
            TextView textView3 = mayaShopReceiptFragment10.f14139D0;
            if (textView3 == null) {
                kotlin.jvm.internal.j.n("mAdditionalMessageTextView");
                throw null;
            }
            Matcher matcher = Pattern.compile("(- From .*)").matcher(message);
            int iStart = 0;
            String strGroup = "";
            while (matcher.find()) {
                strGroup = matcher.group();
                iStart = matcher.toMatchResult().start();
            }
            if (strGroup.isEmpty()) {
                strI = Html.fromHtml(message).toString();
            } else {
                String string5 = Html.fromHtml(message.substring(0, iStart)).toString();
                if (!string5.isEmpty()) {
                    string5 = string5.substring(0, string5.length() - 1) + Global.NEWLINE;
                }
                strI = We.s.i(string5, strGroup);
            }
            textView3.setText(strI);
        }
        boolean zIsProductShareTreats = targetProduct.isProductShareTreats();
        String strMCode = order.mCode();
        if (strMCode == null || C2576A.H(strMCode)) {
            Z0 z02 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14140E0;
            if (z02 == null) {
                kotlin.jvm.internal.j.n("mCouponContainerView");
                throw null;
            }
            z02.f4044b.setVisibility(8);
        } else if (!C2576A.H(strMCode)) {
            if (zIsProductShareTreats) {
                StringBuilder sb2 = new StringBuilder();
                String strT = zj.z.t(strMCode, Global.NEWLINE, "");
                for (int i = 0; i < 3; i++) {
                    if (sb2.length() > 0) {
                        sb2.append(Global.NEWLINE);
                    }
                    int i4 = i * 13;
                    int iMin = Math.min(strT.length(), i4 + 13);
                    String strSubstring2 = strT.substring(i4, iMin);
                    kotlin.jvm.internal.j.f(strSubstring2, "substring(...)");
                    sb2.append(strSubstring2);
                    if (strT.length() == iMin) {
                        break;
                    }
                }
                String string6 = sb2.toString();
                kotlin.jvm.internal.j.f(string6, "toString(...)");
                TextView textView4 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14141F0;
                if (textView4 == null) {
                    kotlin.jvm.internal.j.n("mCouponValueTextView");
                    throw null;
                }
                textView4.setText(string6);
                HtmlTextView htmlTextView = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14142G0;
                if (htmlTextView == null) {
                    kotlin.jvm.internal.j.n("mCouponPoweredByTextView");
                    throw null;
                }
                htmlTextView.setVisibility(0);
            } else {
                TextView textView5 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14141F0;
                if (textView5 == null) {
                    kotlin.jvm.internal.j.n("mCouponValueTextView");
                    throw null;
                }
                textView5.setText(strMCode);
                HtmlTextView htmlTextView2 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14142G0;
                if (htmlTextView2 == null) {
                    kotlin.jvm.internal.j.n("mCouponPoweredByTextView");
                    throw null;
                }
                htmlTextView2.setVisibility(8);
            }
            Z0 z03 = ((MayaShopReceiptFragment) ((bc.n) this.c.get())).f14140E0;
            if (z03 == null) {
                kotlin.jvm.internal.j.n("mCouponContainerView");
                throw null;
            }
            z03.f4044b.setVisibility(0);
        }
        if (this.f6553d.e().isInAppReviewShopPurchaseEnabled()) {
            ((MayaBaseFragment) ((bc.n) this.c.get())).B1("shop purchase");
        }
    }

    public final void z() {
        if (this.h) {
            MayaShopReceiptFragment mayaShopReceiptFragment = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            Group group = mayaShopReceiptFragment.f14144J0;
            if (group == null) {
                kotlin.jvm.internal.j.n("mGroupAllTransactionDetails");
                throw null;
            }
            group.setVisibility(0);
            mayaShopReceiptFragment.f14150Q0 = true;
            ImageView imageView = mayaShopReceiptFragment.f14146L0;
            if (imageView == null) {
                kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
                throw null;
            }
            imageView.setImageDrawable(ContextCompat.getDrawable(mayaShopReceiptFragment.requireContext(), R.drawable.maya_ic_chevron_up_primary));
        } else {
            MayaShopReceiptFragment mayaShopReceiptFragment2 = (MayaShopReceiptFragment) ((bc.n) this.c.get());
            Group group2 = mayaShopReceiptFragment2.f14145K0;
            if (group2 == null) {
                kotlin.jvm.internal.j.n("mGroupObligatoryTransactionDetails");
                throw null;
            }
            group2.setVisibility(0);
            mayaShopReceiptFragment2.f14150Q0 = true;
            ImageView imageView2 = mayaShopReceiptFragment2.f14146L0;
            if (imageView2 == null) {
                kotlin.jvm.internal.j.n("mImageViewTransactionDetailsArrow");
                throw null;
            }
            imageView2.setImageDrawable(ContextCompat.getDrawable(mayaShopReceiptFragment2.requireContext(), R.drawable.maya_ic_chevron_up_primary));
        }
        if (this.f6553d.e().isMayaShopWithCheckoutFlowEnabled()) {
            ((MayaShopReceiptFragment) ((bc.n) this.c.get())).o2();
        }
    }
}
