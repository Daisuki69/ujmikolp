package ba;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.camera.video.AudioStats;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.content.ContextCompat;
import androidx.viewbinding.ViewBindings;
import c7.C1081e;
import cj.C1110A;
import cj.M;
import com.paymaya.R;
import com.paymaya.common.base.MayaAbstractBaseReceiptFragmentImpl;
import com.paymaya.common.base.MayaBaseFragment;
import com.paymaya.common.utility.EnumC1212a;
import com.paymaya.domain.model.Amount;
import com.paymaya.domain.model.BillerDetails;
import com.paymaya.domain.model.BillerDynamicField;
import com.paymaya.domain.model.BillerMetadata;
import com.paymaya.domain.model.BillerTransaction;
import com.paymaya.domain.model.BillerTransactionPayment;
import com.paymaya.domain.model.FavoriteDetails;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import com.paymaya.domain.model.MerchantPayment;
import com.paymaya.domain.model.ProcessingFee;
import com.paymaya.domain.model.ProcessingFees;
import com.paymaya.domain.store.Q;
import com.paymaya.mayaui.common.view.widget.inforeviewlist.item.MayaLabelValueReviewInfoItem;
import com.paymaya.mayaui.merchant.view.fragment.impl.MayaV2MerchantPaymentReceiptFragment;
import com.paymaya.mayaui.paybills.view.fragment.impl.MayaPayBillsReceiptFragment;
import dOYHB6.tiZVw8.numX49;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import p9.InterfaceC2016a;
import p9.InterfaceC2030o;
import sd.AbstractC2252a;
import zj.C2576A;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends AbstractC2252a implements y5.u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8562d = 1;
    public final com.paymaya.data.preference.a e;
    public final Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.paymaya.data.preference.a aVar, S5.c cVar) {
        super(cVar, 0);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bucLK"));
        kotlin.jvm.internal.j.g(cVar, numX49.tnTj78("bucLw"));
        this.e = aVar;
        this.f = cVar;
    }

    public static String C(String str, double d10) {
        boolean zB = kotlin.jvm.internal.j.b(str, numX49.tnTj78("bucLD"));
        String strTnTj78 = numX49.tnTj78("bucLh");
        if (zB || str == null) {
            str = strTnTj78;
        }
        return We.s.i(str, com.paymaya.common.utility.C.u(Double.valueOf(d10)));
    }

    private final void E() {
        String strMValue;
        Double dE;
        Double dE2;
        BillerMetadata billerMetadataMMetadata;
        String strMAccountNumberPlaceHolder;
        Double dE3;
        String strMId;
        String strMId2;
        Double dE4;
        String strMAmountPlaceHolder;
        String strMValue2;
        Double dE5;
        String value;
        Double dE6;
        String value2;
        Double dE7;
        String strMValue3;
        Double dE8;
        ProcessingFees processingFees;
        List<ProcessingFee> taxes;
        ProcessingFees processingFees2;
        List<ProcessingFee> fees;
        String strMValue4;
        Double dE9;
        super.j();
        BillerTransaction billerTransactionM2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).m2();
        if (billerTransactionM2 != null) {
            ImageUrlUnfiltered imageUrlUnfilteredMIconUrl = billerTransactionM2.mBiller().mIconUrl();
            ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f2(com.paymaya.common.utility.C.O(imageUrlUnfilteredMIconUrl != null ? imageUrlUnfilteredMIconUrl.mAndroidImageUrl() : null));
            String billerName = billerTransactionM2.getBillerName();
            boolean zIsBillsPayClientAPICheckoutFlowV3Enabled = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
            String strTnTj78 = numX49.tnTj78("bucLM");
            if (zIsBillsPayClientAPICheckoutFlowV3Enabled) {
                ga.f fVar = (ga.f) this.c.get();
                if (billerName == null) {
                    billerName = strTnTj78;
                }
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment = (MayaPayBillsReceiptFragment) fVar;
                mayaPayBillsReceiptFragment.getClass();
                mayaPayBillsReceiptFragment.d2(billerName);
            } else {
                ga.f fVar2 = (ga.f) this.c.get();
                if (billerName == null) {
                    billerName = strTnTj78;
                }
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment2 = (MayaPayBillsReceiptFragment) fVar2;
                mayaPayBillsReceiptFragment2.getClass();
                mayaPayBillsReceiptFragment2.c2(billerName);
            }
            Amount amountMAmount = billerTransactionM2.mAmount();
            String strTnTj782 = numX49.tnTj78("bucLN");
            kotlin.jvm.internal.j.f(amountMAmount, strTnTj782);
            Amount amountMFee = billerTransactionM2.mFee();
            Amount amountMTotalAmount = billerTransactionM2.mTotalAmount();
            boolean zIsBillsPayClientAPICheckoutFlowV3Enabled2 = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
            String strTnTj783 = numX49.tnTj78("bucL6");
            if (zIsBillsPayClientAPICheckoutFlowV3Enabled2) {
                String strC = C(amountMTotalAmount != null ? amountMTotalAmount.mCurrency() : null, (amountMTotalAmount == null || (strMValue4 = amountMTotalAmount.mValue()) == null || (dE9 = zj.x.e(strMValue4)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE9.doubleValue());
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment3 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment3.getClass();
                kotlin.jvm.internal.j.g(strC, strTnTj783);
                mayaPayBillsReceiptFragment3.e2(mayaPayBillsReceiptFragment3.getString(R.string.maya_format_negative_amount_value, strC));
            } else {
                String strMValue5 = amountMAmount.mValue();
                String strC2 = C(amountMAmount.mCurrency(), ((strMValue5 == null || (dE2 = zj.x.e(strMValue5)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE2.doubleValue()) + ((amountMFee == null || (strMValue = amountMFee.mValue()) == null || (dE = zj.x.e(strMValue)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE.doubleValue()));
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment4 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment4.getClass();
                kotlin.jvm.internal.j.g(strC2, strTnTj783);
                mayaPayBillsReceiptFragment4.e2(mayaPayBillsReceiptFragment4.getString(R.string.maya_format_negative_amount_value, strC2));
            }
            String strMStatus = billerTransactionM2.mStatus();
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                if (numX49.tnTj78("bucLa").equalsIgnoreCase(strMStatus)) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment5 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment5.getClass();
                    MayaAbstractBaseReceiptFragmentImpl.h2(mayaPayBillsReceiptFragment5);
                } else if (numX49.tnTj78("bucLX").equalsIgnoreCase(strMStatus) || numX49.tnTj78("bucLG").equalsIgnoreCase(strMStatus)) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment6 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    ImageView imageView = mayaPayBillsReceiptFragment6.f10285g0;
                    if (imageView == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucL3"));
                        throw null;
                    }
                    imageView.setImageDrawable(ContextCompat.getDrawable(mayaPayBillsReceiptFragment6.R1().getContext(), R.drawable.maya_ic_transaction_receipt_status_failed));
                    mayaPayBillsReceiptFragment6.S1().setText(mayaPayBillsReceiptFragment6.getString(R.string.maya_label_receipt_status_declined));
                } else {
                    ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).i2();
                }
            } else if (numX49.tnTj78("bucLy").equalsIgnoreCase(strMStatus)) {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment7 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment7.getClass();
                MayaAbstractBaseReceiptFragmentImpl.h2(mayaPayBillsReceiptFragment7);
            } else {
                ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).i2();
            }
            String formattedCreatedDate = billerTransactionM2.getFormattedCreatedDate();
            String strTnTj784 = numX49.tnTj78("bucLv");
            kotlin.jvm.internal.j.f(formattedCreatedDate, strTnTj784);
            boolean zIsBillsPayClientAPICheckoutFlowV3Enabled3 = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
            String strTnTj785 = numX49.tnTj78("bucL7");
            if (zIsBillsPayClientAPICheckoutFlowV3Enabled3 && !C2576A.H(formattedCreatedDate)) {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment8 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment8.getClass();
                TextView textView = mayaPayBillsReceiptFragment8.f10287i0;
                if (textView == null) {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
                textView.setText(formattedCreatedDate);
            }
            String formattedCreatedDate2 = billerTransactionM2.getFormattedCreatedDate();
            kotlin.jvm.internal.j.f(formattedCreatedDate2, strTnTj784);
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled() && !C2576A.H(formattedCreatedDate2)) {
                TextView textView2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f10287i0;
                if (textView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj785);
                    throw null;
                }
                textView2.setVisibility(0);
            }
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment9 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                TextView textView3 = mayaPayBillsReceiptFragment9.w0;
                if (textView3 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLA"));
                    throw null;
                }
                textView3.setText(mayaPayBillsReceiptFragment9.getString(R.string.maya_label_travel_paid_using));
            }
            BillerTransactionPayment billerTransactionPaymentMBillerTransactionPayment = billerTransactionM2.mBillerTransactionPayment();
            String paymentOption = billerTransactionPaymentMBillerTransactionPayment != null ? billerTransactionPaymentMBillerTransactionPayment.getPaymentOption() : null;
            if (paymentOption == null) {
                paymentOption = strTnTj78;
            }
            boolean zIsBillsPayClientAPICheckoutFlowV3Enabled4 = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
            String strTnTj786 = numX49.tnTj78("bucLY");
            String strTnTj787 = numX49.tnTj78("bucLT");
            if (zIsBillsPayClientAPICheckoutFlowV3Enabled4) {
                Z9.a[] aVarArr = Z9.a.f6919a;
                if (paymentOption.equalsIgnoreCase(strTnTj787)) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment10 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    TextView textView4 = mayaPayBillsReceiptFragment10.f13470x0;
                    if (textView4 == null) {
                        kotlin.jvm.internal.j.n(strTnTj786);
                        throw null;
                    }
                    textView4.setText(mayaPayBillsReceiptFragment10.getString(R.string.maya_label_payment_method_maya_credit));
                    TextView textView5 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13470x0;
                    if (textView5 == null) {
                        kotlin.jvm.internal.j.n(strTnTj786);
                        throw null;
                    }
                    textView5.setTextAlignment(6);
                } else {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment11 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    TextView textView6 = mayaPayBillsReceiptFragment11.f13470x0;
                    if (textView6 == null) {
                        kotlin.jvm.internal.j.n(strTnTj786);
                        throw null;
                    }
                    textView6.setText(mayaPayBillsReceiptFragment11.getString(R.string.maya_label_payment_method_my_wallet));
                }
            } else {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment12 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                TextView textView7 = mayaPayBillsReceiptFragment12.f13470x0;
                if (textView7 == null) {
                    kotlin.jvm.internal.j.n(strTnTj786);
                    throw null;
                }
                textView7.setText(mayaPayBillsReceiptFragment12.getString(R.string.maya_label_payment_method_my_wallet));
            }
            boolean zIsBillsPayClientAPICheckoutFlowV3Enabled5 = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
            String strTnTj788 = numX49.tnTj78("bucLR");
            if (!zIsBillsPayClientAPICheckoutFlowV3Enabled5) {
                ga.f fVar3 = (ga.f) this.c.get();
                String strR = this.e.r();
                kotlin.jvm.internal.j.f(strR, numX49.tnTj78("bucLp"));
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment13 = (MayaPayBillsReceiptFragment) fVar3;
                mayaPayBillsReceiptFragment13.getClass();
                TextView textView8 = mayaPayBillsReceiptFragment13.y0;
                if (textView8 == null) {
                    kotlin.jvm.internal.j.n(strTnTj788);
                    throw null;
                }
                textView8.setText(com.paymaya.common.utility.C.p(strR));
            }
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                TextView textView9 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).y0;
                if (textView9 == null) {
                    kotlin.jvm.internal.j.n(strTnTj788);
                    throw null;
                }
                textView9.setVisibility(8);
            } else {
                TextView textView10 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).y0;
                if (textView10 == null) {
                    kotlin.jvm.internal.j.n(strTnTj788);
                    throw null;
                }
                textView10.setVisibility(0);
            }
            Amount amountMAmount2 = billerTransactionM2.mAmount();
            kotlin.jvm.internal.j.f(amountMAmount2, strTnTj782);
            Amount amountMFee2 = billerTransactionM2.mFee();
            BillerTransactionPayment billerTransactionPaymentMBillerTransactionPayment2 = billerTransactionM2.mBillerTransactionPayment();
            ProcessingFee processingFee = (billerTransactionPaymentMBillerTransactionPayment2 == null || (processingFees2 = billerTransactionPaymentMBillerTransactionPayment2.getProcessingFees()) == null || (fees = processingFees2.getFees()) == null) ? null : (ProcessingFee) C1110A.B(fees);
            BillerTransactionPayment billerTransactionPaymentMBillerTransactionPayment3 = billerTransactionM2.mBillerTransactionPayment();
            ProcessingFee processingFee2 = (billerTransactionPaymentMBillerTransactionPayment3 == null || (processingFees = billerTransactionPaymentMBillerTransactionPayment3.getProcessingFees()) == null || (taxes = processingFees.getTaxes()) == null) ? null : (ProcessingFee) C1110A.B(taxes);
            Amount amountMTotalAmount2 = billerTransactionM2.mTotalAmount();
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                String strC3 = C(amountMAmount2.mCurrency(), amountMAmount2.getValueAsDouble().doubleValue() + ((amountMFee2 == null || (strMValue3 = amountMFee2.mValue()) == null || (dE8 = zj.x.e(strMValue3)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE8.doubleValue()));
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment14 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment14.getClass();
                kotlin.jvm.internal.j.g(strC3, numX49.tnTj78("bucL0"));
                TextView textView11 = mayaPayBillsReceiptFragment14.f13471z0;
                if (textView11 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLs"));
                    throw null;
                }
                textView11.setText(strC3);
                String strC4 = C(processingFee != null ? processingFee.getCurrency() : null, (processingFee == null || (value2 = processingFee.getValue()) == null || (dE7 = zj.x.e(value2)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE7.doubleValue());
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment15 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment15.getClass();
                String strTnTj789 = numX49.tnTj78("bucLg");
                kotlin.jvm.internal.j.g(strC4, strTnTj789);
                TextView textView12 = mayaPayBillsReceiptFragment15.f13440A0;
                if (textView12 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLx"));
                    throw null;
                }
                textView12.setText(strC4);
                String strC5 = C(processingFee2 != null ? processingFee2.getCurrency() : null, (processingFee2 == null || (value = processingFee2.getValue()) == null || (dE6 = zj.x.e(value)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE6.doubleValue());
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment16 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment16.getClass();
                kotlin.jvm.internal.j.g(strC5, strTnTj789);
                TextView textView13 = mayaPayBillsReceiptFragment16.f13441B0;
                if (textView13 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucLn"));
                    throw null;
                }
                textView13.setText(strC5);
                String strC6 = C(amountMTotalAmount2 != null ? amountMTotalAmount2.mCurrency() : null, (amountMTotalAmount2 == null || (strMValue2 = amountMTotalAmount2.mValue()) == null || (dE5 = zj.x.e(strMValue2)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE5.doubleValue());
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment17 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment17.getClass();
                kotlin.jvm.internal.j.g(strC6, numX49.tnTj78("bucLf"));
                TextView textView14 = mayaPayBillsReceiptFragment17.f13442C0;
                if (textView14 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucL1"));
                    throw null;
                }
                textView14.setText(strC6);
            }
            BillerTransactionPayment billerTransactionPaymentMBillerTransactionPayment4 = billerTransactionM2.mBillerTransactionPayment();
            String paymentOption2 = billerTransactionPaymentMBillerTransactionPayment4 != null ? billerTransactionPaymentMBillerTransactionPayment4.getPaymentOption() : null;
            if (paymentOption2 == null) {
                paymentOption2 = strTnTj78;
            }
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                Z9.a[] aVarArr2 = Z9.a.f6919a;
                if (paymentOption2.equals(strTnTj787)) {
                    Group group = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13457U0;
                    if (group == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLl"));
                        throw null;
                    }
                    group.setVisibility(0);
                    Group group2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13458V0;
                    if (group2 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLz"));
                        throw null;
                    }
                    group2.setVisibility(0);
                    Group group3 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13459W0;
                    if (group3 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLq"));
                        throw null;
                    }
                    group3.setVisibility(0);
                    Group group4 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13460X0;
                    if (group4 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLI"));
                        throw null;
                    }
                    group4.setVisibility(0);
                    Group group5 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13461Y0;
                    if (group5 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucLJ"));
                        throw null;
                    }
                    group5.setVisibility(0);
                    Group group6 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13462Z0;
                    if (group6 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucL5"));
                        throw null;
                    }
                    group6.setVisibility(0);
                }
            }
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                String billerAccountNumber = billerTransactionM2.getBillerAccountNumber();
                if (billerAccountNumber != null && !C2576A.H(billerAccountNumber)) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment18 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment18.getClass();
                    mayaPayBillsReceiptFragment18.c2(billerAccountNumber);
                }
            } else {
                String billerAccountNumber2 = billerTransactionM2.getBillerAccountNumber();
                if (billerAccountNumber2 != null && !C2576A.H(billerAccountNumber2)) {
                    boolean zB = kotlin.jvm.internal.j.b(billerTransactionM2.getBillerSlug(), numX49.tnTj78("bucLW"));
                    String strTnTj7810 = numX49.tnTj78("bucr9");
                    if (zB) {
                        TextView textView15 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13444E0;
                        if (textView15 == null) {
                            kotlin.jvm.internal.j.n(strTnTj7810);
                            throw null;
                        }
                        textView15.setText(numX49.tnTj78("bucrP"));
                    } else if (this.e.e().isBillerPlaceHolderEnabled() && (billerMetadataMMetadata = billerTransactionM2.mBiller().mMetadata()) != null && (strMAccountNumberPlaceHolder = billerMetadataMMetadata.mAccountNumberPlaceHolder()) != null) {
                        ga.f fVar4 = (ga.f) this.c.get();
                        String strN = C2576A.N(strMAccountNumberPlaceHolder, numX49.tnTj78("bucrb"));
                        TextView textView16 = ((MayaPayBillsReceiptFragment) fVar4).f13444E0;
                        if (textView16 == null) {
                            kotlin.jvm.internal.j.n(strTnTj7810);
                            throw null;
                        }
                        textView16.setText(strN);
                    }
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment19 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment19.getClass();
                    TextView textView17 = mayaPayBillsReceiptFragment19.f13443D0;
                    if (textView17 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucrL"));
                        throw null;
                    }
                    textView17.setText(billerAccountNumber2);
                    Group group7 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13445F0;
                    if (group7 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucr2"));
                        throw null;
                    }
                    group7.setVisibility(0);
                }
            }
            BillerMetadata billerMetadataMMetadata2 = billerTransactionM2.mBiller().mMetadata();
            if (this.e.e().isBillerPlaceHolderEnabled() && billerMetadataMMetadata2 != null && (strMAmountPlaceHolder = billerMetadataMMetadata2.mAmountPlaceHolder()) != null) {
                if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment20 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment20.getClass();
                    TextView textView18 = mayaPayBillsReceiptFragment20.N0;
                    if (textView18 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucrr"));
                        throw null;
                    }
                    textView18.setText(strMAmountPlaceHolder);
                } else {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment21 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment21.getClass();
                    TextView textView19 = mayaPayBillsReceiptFragment21.f13446G0;
                    if (textView19 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucrZ"));
                        throw null;
                    }
                    textView19.setText(strMAmountPlaceHolder);
                }
            }
            Amount amountMAmount3 = billerTransactionM2.mAmount();
            kotlin.jvm.internal.j.f(amountMAmount3, strTnTj782);
            String strMCurrency = amountMAmount3.mCurrency();
            String strMValue6 = amountMAmount3.mValue();
            String strC7 = C(strMCurrency, (strMValue6 == null || (dE4 = zj.x.e(strMValue6)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE4.doubleValue());
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment22 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment22.getClass();
                kotlin.jvm.internal.j.g(strC7, numX49.tnTj78("bucrk"));
                TextView textView20 = mayaPayBillsReceiptFragment22.f13452O0;
                if (textView20 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucrB"));
                    throw null;
                }
                textView20.setText(strC7);
            } else {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment23 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment23.getClass();
                kotlin.jvm.internal.j.g(strC7, numX49.tnTj78("bucru"));
                TextView textView21 = mayaPayBillsReceiptFragment23.f13447H0;
                if (textView21 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucrw"));
                    throw null;
                }
                textView21.setText(strC7);
            }
            Amount amountMFee3 = billerTransactionM2.mFee();
            String strTnTj7811 = numX49.tnTj78("bucrV");
            String strTnTj7812 = numX49.tnTj78("bucrS");
            if (amountMFee3 != null) {
                String strMCurrency2 = amountMFee3.mCurrency();
                String strMValue7 = amountMFee3.mValue();
                String strC8 = C(strMCurrency2, (strMValue7 == null || (dE3 = zj.x.e(strMValue7)) == null) ? AudioStats.AUDIO_AMPLITUDE_NONE : dE3.doubleValue());
                if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment24 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment24.getClass();
                    kotlin.jvm.internal.j.g(strC8, numX49.tnTj78("bucrj"));
                    TextView textView22 = mayaPayBillsReceiptFragment24.f13453P0;
                    if (textView22 == null) {
                        kotlin.jvm.internal.j.n(strTnTj7812);
                        throw null;
                    }
                    textView22.setText(strC8);
                } else {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment25 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    mayaPayBillsReceiptFragment25.getClass();
                    kotlin.jvm.internal.j.g(strC8, numX49.tnTj78("bucrd"));
                    TextView textView23 = mayaPayBillsReceiptFragment25.f13448J0;
                    if (textView23 == null) {
                        kotlin.jvm.internal.j.n(strTnTj7811);
                        throw null;
                    }
                    textView23.setText(strC8);
                }
            } else if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment26 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                TextView textView24 = mayaPayBillsReceiptFragment26.f13453P0;
                if (textView24 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7812);
                    throw null;
                }
                textView24.setText(mayaPayBillsReceiptFragment26.getString(R.string.maya_label_receipt_amount_default));
            } else {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment27 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                TextView textView25 = mayaPayBillsReceiptFragment27.f13448J0;
                if (textView25 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7811);
                    throw null;
                }
                textView25.setText(mayaPayBillsReceiptFragment27.getString(R.string.maya_label_receipt_amount_default));
            }
            boolean zIsBillsPayClientAPICheckoutFlowV3Enabled6 = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
            String strTnTj7813 = numX49.tnTj78("bucri");
            String strTnTj7814 = numX49.tnTj78("bucrE");
            String strTnTj7815 = numX49.tnTj78("bucrF");
            if (zIsBillsPayClientAPICheckoutFlowV3Enabled6) {
                CardView cardView = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13454Q0;
                if (cardView == null) {
                    kotlin.jvm.internal.j.n(strTnTj7815);
                    throw null;
                }
                cardView.setVisibility(0);
                Group group8 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).I0;
                if (group8 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7814);
                    throw null;
                }
                group8.setVisibility(8);
                Group group9 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13449K0;
                if (group9 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7813);
                    throw null;
                }
                group9.setVisibility(8);
            } else {
                Group group10 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).I0;
                if (group10 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7814);
                    throw null;
                }
                group10.setVisibility(0);
                Group group11 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13449K0;
                if (group11 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7813);
                    throw null;
                }
                group11.setVisibility(0);
                CardView cardView2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13454Q0;
                if (cardView2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7815);
                    throw null;
                }
                cardView2.setVisibility(8);
            }
            boolean zIsBillsPayReceiptExpandableTransactionDetailsEnabled = this.e.e().isBillsPayReceiptExpandableTransactionDetailsEnabled();
            String strTnTj7816 = numX49.tnTj78("bucrH");
            if (zIsBillsPayReceiptExpandableTransactionDetailsEnabled) {
                CardView cardView3 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13455S0;
                if (cardView3 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7816);
                    throw null;
                }
                cardView3.setVisibility(0);
                CardView cardView4 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13455S0;
                if (cardView4 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7816);
                    throw null;
                }
                cardView4.setVisibility(8);
            } else {
                CardView cardView5 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13455S0;
                if (cardView5 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7816);
                    throw null;
                }
                cardView5.setVisibility(8);
                CardView cardView6 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13455S0;
                if (cardView6 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7816);
                    throw null;
                }
                cardView6.setVisibility(0);
                boolean zIsBillsPayClientAPICheckoutFlowV3Enabled7 = this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled();
                String strTnTj7817 = numX49.tnTj78("bucrO");
                if (zIsBillsPayClientAPICheckoutFlowV3Enabled7) {
                    Group group12 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).R0;
                    if (group12 == null) {
                        kotlin.jvm.internal.j.n(strTnTj7817);
                        throw null;
                    }
                    group12.setVisibility(0);
                } else {
                    Group group13 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).R0;
                    if (group13 == null) {
                        kotlin.jvm.internal.j.n(strTnTj7817);
                        throw null;
                    }
                    group13.setVisibility(8);
                }
            }
            if (this.e.e().isBillsPayReceiptExpandableTransactionDetailsEnabled()) {
                List<BillerDynamicField> billerDynamicFields = billerTransactionM2.getBillerDynamicFields();
                if (billerDynamicFields != null) {
                    if (billerDynamicFields.isEmpty()) {
                        billerDynamicFields = null;
                    }
                    if (billerDynamicFields != null) {
                        List<BillerDynamicField> list = billerDynamicFields;
                        ArrayList arrayList = new ArrayList(cj.t.l(list, 10));
                        for (BillerDynamicField billerDynamicField : list) {
                            String strMLabel = billerDynamicField.mLabel();
                            if (strMLabel == null) {
                                strMLabel = strTnTj78;
                            }
                            String strMValue8 = billerDynamicField.mValue();
                            if (strMValue8 == null) {
                                strMValue8 = strTnTj78;
                            }
                            arrayList.add(new C1081e(strMLabel, strMValue8));
                        }
                        View view = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).f13463a1;
                        if (view == null) {
                            kotlin.jvm.internal.j.n(numX49.tnTj78("bucrQ"));
                            throw null;
                        }
                        view.setVisibility(0);
                        MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment28 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                        mayaPayBillsReceiptFragment28.getClass();
                        mayaPayBillsReceiptFragment28.f13466d1.e(arrayList);
                    }
                }
            } else {
                List<BillerDynamicField> billerDynamicFields2 = billerTransactionM2.getBillerDynamicFields();
                if (billerDynamicFields2 != null) {
                    for (BillerDynamicField billerDynamicField2 : billerDynamicFields2) {
                        ga.f fVar5 = (ga.f) this.c.get();
                        String strMLabel2 = billerDynamicField2.mLabel();
                        if (strMLabel2 == null) {
                            strMLabel2 = strTnTj78;
                        }
                        String strMValue9 = billerDynamicField2.mValue();
                        if (strMValue9 == null) {
                            strMValue9 = strTnTj78;
                        }
                        MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment29 = (MayaPayBillsReceiptFragment) fVar5;
                        mayaPayBillsReceiptFragment29.getClass();
                        LayoutInflater layoutInflater = mayaPayBillsReceiptFragment29.getLayoutInflater();
                        LinearLayout linearLayout = mayaPayBillsReceiptFragment29.f13456T0;
                        String strTnTj7818 = numX49.tnTj78("bucrt");
                        if (linearLayout == null) {
                            kotlin.jvm.internal.j.n(strTnTj7818);
                            throw null;
                        }
                        View viewInflate = layoutInflater.inflate(R.layout.maya_view_pay_bills_receipt_dynamic_field, (ViewGroup) linearLayout, false);
                        int i = R.id.account_number_divider_bottom_space;
                        if (((Space) ViewBindings.findChildViewById(viewInflate, R.id.account_number_divider_bottom_space)) != null) {
                            i = R.id.dynamic_field_contents_linear_layout;
                            if (((LinearLayout) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_field_contents_linear_layout)) != null) {
                                i = R.id.dynamic_field_divider_view;
                                if (ViewBindings.findChildViewById(viewInflate, R.id.dynamic_field_divider_view) != null) {
                                    i = R.id.dynamic_field_label_text_view;
                                    TextView textView26 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_field_label_text_view);
                                    if (textView26 != null) {
                                        i = R.id.dynamic_field_value_text_view;
                                        TextView textView27 = (TextView) ViewBindings.findChildViewById(viewInflate, R.id.dynamic_field_value_text_view);
                                        if (textView27 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                            textView26.setText(strMLabel2);
                                            textView27.setText(strMValue9);
                                            LinearLayout linearLayout2 = mayaPayBillsReceiptFragment29.f13456T0;
                                            if (linearLayout2 == null) {
                                                kotlin.jvm.internal.j.n(strTnTj7818);
                                                throw null;
                                            }
                                            linearLayout2.addView(constraintLayout);
                                        }
                                    }
                                }
                            }
                        }
                        throw new NullPointerException(numX49.tnTj78("bucrU").concat(viewInflate.getResources().getResourceName(i)));
                    }
                }
            }
            String formattedPaymentId = billerTransactionM2.getFormattedPaymentId();
            kotlin.jvm.internal.j.f(formattedPaymentId, numX49.tnTj78("bucre"));
            if (this.e.e().isBillsPayReceiptExpandableTransactionDetailsEnabled()) {
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment30 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                MayaLabelValueReviewInfoItem mayaLabelValueReviewInfoItem = mayaPayBillsReceiptFragment30.f13464b1;
                String strTnTj7819 = numX49.tnTj78("bucr8");
                if (mayaLabelValueReviewInfoItem == null) {
                    kotlin.jvm.internal.j.n(strTnTj7819);
                    throw null;
                }
                String string = mayaPayBillsReceiptFragment30.getString(R.string.maya_label_receipt_bill_reference_number);
                kotlin.jvm.internal.j.f(string, numX49.tnTj78("bucrC"));
                mayaLabelValueReviewInfoItem.setTitle(string);
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment31 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment31.getClass();
                MayaLabelValueReviewInfoItem mayaLabelValueReviewInfoItem2 = mayaPayBillsReceiptFragment31.f13464b1;
                if (mayaLabelValueReviewInfoItem2 == null) {
                    kotlin.jvm.internal.j.n(strTnTj7819);
                    throw null;
                }
                mayaLabelValueReviewInfoItem2.setValue(formattedPaymentId);
            } else {
                if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled()) {
                    MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment32 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                    TextView textView28 = mayaPayBillsReceiptFragment32.f13450L0;
                    if (textView28 == null) {
                        kotlin.jvm.internal.j.n(numX49.tnTj78("bucr4"));
                        throw null;
                    }
                    textView28.setText(mayaPayBillsReceiptFragment32.getString(R.string.maya_label_receipt_bill_reference_number));
                }
                MayaPayBillsReceiptFragment mayaPayBillsReceiptFragment33 = (MayaPayBillsReceiptFragment) ((ga.f) this.c.get());
                mayaPayBillsReceiptFragment33.getClass();
                TextView textView29 = mayaPayBillsReceiptFragment33.f13451M0;
                if (textView29 == null) {
                    kotlin.jvm.internal.j.n(numX49.tnTj78("bucrK"));
                    throw null;
                }
                textView29.setText(formattedPaymentId);
            }
            FavoriteDetails favoriteDetailsN2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).n2();
            if (this.e.e().isBillsPayClientAPICheckoutFlowV3Enabled() && this.e.e().isFavoritesServiceAvailable() && favoriteDetailsN2 != null && (strMId2 = favoriteDetailsN2.mId()) != null && strMId2.length() != 0) {
                e(new Hh.f(((Q) this.f).d(favoriteDetailsN2), zh.b.a(), 0).a(new androidx.work.impl.e(this, 4)).b(new T3.l(this, 23)).c());
            }
            FavoriteDetails favoriteDetailsN22 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).n2();
            if (this.e.e().isFavoritesServiceAvailable() && favoriteDetailsN22 != null && ((strMId = favoriteDetailsN22.mId()) == null || C2576A.H(strMId))) {
                ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).k2();
            } else {
                ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).T1();
            }
            if (this.e.e().isInAppReviewBillsPayEnabled()) {
                ((MayaBaseFragment) ((ga.f) this.c.get())).B1(numX49.tnTj78("bucro"));
            }
        }
    }

    public Map A() {
        BillerTransaction billerTransactionM2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).m2();
        if (billerTransactionM2 == null) {
            return M.e();
        }
        Pair pair = new Pair(EnumC1212a.BILL_AMOUNT, billerTransactionM2.mAmount().getCurrencyFormattedValue());
        EnumC1212a enumC1212a = EnumC1212a.CONVENIENCE_FEE;
        Amount amountMFee = billerTransactionM2.mFee();
        Pair pair2 = new Pair(enumC1212a, amountMFee != null ? amountMFee.getCurrencyFormattedValue() : null);
        EnumC1212a enumC1212a2 = EnumC1212a.TOTAL_AMOUNT;
        Amount amountMTotalAmount = billerTransactionM2.mTotalAmount();
        return M.h(pair, pair2, new Pair(enumC1212a2, amountMTotalAmount != null ? amountMTotalAmount.getCurrencyFormattedValue() : null));
    }

    public Map B() {
        BillerDetails billerDetailsMBiller;
        BillerTransaction billerTransactionM2 = ((MayaPayBillsReceiptFragment) ((ga.f) this.c.get())).m2();
        return (billerTransactionM2 == null || (billerDetailsMBiller = billerTransactionM2.mBiller()) == null) ? M.e() : M.h(new Pair(EnumC1212a.BILLER_SLUG, billerDetailsMBiller.mSlug()), new Pair(EnumC1212a.BILLER_NAME, billerDetailsMBiller.mName()), new Pair(EnumC1212a.CATEGORY_SLUG, billerDetailsMBiller.mCategorySlug()), new Pair(EnumC1212a.CATEGORY_NAME, billerDetailsMBiller.mCategory()));
    }

    public void D() {
        Bundle arguments = ((MayaV2MerchantPaymentReceiptFragment) ((InterfaceC2016a) this.c.get())).getArguments();
        MerchantPayment merchantPayment = arguments != null ? (MerchantPayment) arguments.getParcelable(numX49.tnTj78("bucrc")) : null;
        String strNormalizeRedirectUrl = merchantPayment != null ? merchantPayment.normalizeRedirectUrl() : null;
        if (strNormalizeRedirectUrl == null) {
            InterfaceC2030o interfaceC2030o = ((MayaV2MerchantPaymentReceiptFragment) ((InterfaceC2016a) this.c.get())).f12924x0;
            if (interfaceC2030o != null) {
                interfaceC2030o.finish();
                return;
            }
            return;
        }
        InterfaceC2030o interfaceC2030o2 = ((MayaV2MerchantPaymentReceiptFragment) ((InterfaceC2016a) this.c.get())).f12924x0;
        if (interfaceC2030o2 != null) {
            interfaceC2030o2.c(strNormalizeRedirectUrl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0339  */
    @Override // y5.AbstractC2509a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instruction units count: 1246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ba.D.j():void");
    }

    public void z() {
        if (this.e.e().isInAppReviewQrPaymentEnabled()) {
            ((MayaBaseFragment) ((InterfaceC2016a) this.c.get())).B1(numX49.tnTj78("bucrI"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(com.paymaya.data.preference.a aVar, Q q9, S5.c cVar) {
        super(cVar, 0);
        kotlin.jvm.internal.j.g(aVar, numX49.tnTj78("bucLc"));
        kotlin.jvm.internal.j.g(cVar, numX49.tnTj78("bucLm"));
        this.e = aVar;
        this.f = q9;
    }
}
