package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class PaymentConfirmationSummary implements Parcelable {
    public static final Parcelable.Creator<PaymentConfirmationSummary> CREATOR = new Creator();
    private final AccountBalance appliedAccountBalance;
    private final FundSource appliedFundSource;
    private final String displayedRecipient;
    private final Map<String, String> dynamicFieldsCodeAndInput;
    private final boolean isGifted;
    private final String message;
    private final String targetNumber;
    private final ProductV3 targetProduct;
    private final String targetRecipientName;
    private final String unformattedTargetNumber;

    public static final class Creator implements Parcelable.Creator<PaymentConfirmationSummary> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentConfirmationSummary createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            j.g(parcel, "parcel");
            ProductV3 productV3CreateFromParcel = ProductV3.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i4 = 0; i4 != i; i4++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new PaymentConfirmationSummary(productV3CreateFromParcel, string, string2, string3, string4, string5, linkedHashMap, (FundSource) parcel.readParcelable(PaymentConfirmationSummary.class.getClassLoader()), (AccountBalance) parcel.readParcelable(PaymentConfirmationSummary.class.getClassLoader()), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PaymentConfirmationSummary[] newArray(int i) {
            return new PaymentConfirmationSummary[i];
        }
    }

    public PaymentConfirmationSummary(ProductV3 targetProduct, String str, String str2, String str3, String str4, String str5, Map<String, String> map, FundSource fundSource, AccountBalance accountBalance, boolean z4) {
        j.g(targetProduct, "targetProduct");
        this.targetProduct = targetProduct;
        this.displayedRecipient = str;
        this.targetNumber = str2;
        this.targetRecipientName = str3;
        this.unformattedTargetNumber = str4;
        this.message = str5;
        this.dynamicFieldsCodeAndInput = map;
        this.appliedFundSource = fundSource;
        this.appliedAccountBalance = accountBalance;
        this.isGifted = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PaymentConfirmationSummary copy$default(PaymentConfirmationSummary paymentConfirmationSummary, ProductV3 productV3, String str, String str2, String str3, String str4, String str5, Map map, FundSource fundSource, AccountBalance accountBalance, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            productV3 = paymentConfirmationSummary.targetProduct;
        }
        if ((i & 2) != 0) {
            str = paymentConfirmationSummary.displayedRecipient;
        }
        if ((i & 4) != 0) {
            str2 = paymentConfirmationSummary.targetNumber;
        }
        if ((i & 8) != 0) {
            str3 = paymentConfirmationSummary.targetRecipientName;
        }
        if ((i & 16) != 0) {
            str4 = paymentConfirmationSummary.unformattedTargetNumber;
        }
        if ((i & 32) != 0) {
            str5 = paymentConfirmationSummary.message;
        }
        if ((i & 64) != 0) {
            map = paymentConfirmationSummary.dynamicFieldsCodeAndInput;
        }
        if ((i & 128) != 0) {
            fundSource = paymentConfirmationSummary.appliedFundSource;
        }
        if ((i & 256) != 0) {
            accountBalance = paymentConfirmationSummary.appliedAccountBalance;
        }
        if ((i & 512) != 0) {
            z4 = paymentConfirmationSummary.isGifted;
        }
        AccountBalance accountBalance2 = accountBalance;
        boolean z5 = z4;
        Map map2 = map;
        FundSource fundSource2 = fundSource;
        String str6 = str4;
        String str7 = str5;
        return paymentConfirmationSummary.copy(productV3, str, str2, str3, str6, str7, map2, fundSource2, accountBalance2, z5);
    }

    public final ProductV3 component1() {
        return this.targetProduct;
    }

    public final boolean component10() {
        return this.isGifted;
    }

    public final String component2() {
        return this.displayedRecipient;
    }

    public final String component3() {
        return this.targetNumber;
    }

    public final String component4() {
        return this.targetRecipientName;
    }

    public final String component5() {
        return this.unformattedTargetNumber;
    }

    public final String component6() {
        return this.message;
    }

    public final Map<String, String> component7() {
        return this.dynamicFieldsCodeAndInput;
    }

    public final FundSource component8() {
        return this.appliedFundSource;
    }

    public final AccountBalance component9() {
        return this.appliedAccountBalance;
    }

    public final PaymentConfirmationSummary copy(ProductV3 targetProduct, String str, String str2, String str3, String str4, String str5, Map<String, String> map, FundSource fundSource, AccountBalance accountBalance, boolean z4) {
        j.g(targetProduct, "targetProduct");
        return new PaymentConfirmationSummary(targetProduct, str, str2, str3, str4, str5, map, fundSource, accountBalance, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfirmationSummary)) {
            return false;
        }
        PaymentConfirmationSummary paymentConfirmationSummary = (PaymentConfirmationSummary) obj;
        return j.b(this.targetProduct, paymentConfirmationSummary.targetProduct) && j.b(this.displayedRecipient, paymentConfirmationSummary.displayedRecipient) && j.b(this.targetNumber, paymentConfirmationSummary.targetNumber) && j.b(this.targetRecipientName, paymentConfirmationSummary.targetRecipientName) && j.b(this.unformattedTargetNumber, paymentConfirmationSummary.unformattedTargetNumber) && j.b(this.message, paymentConfirmationSummary.message) && j.b(this.dynamicFieldsCodeAndInput, paymentConfirmationSummary.dynamicFieldsCodeAndInput) && j.b(this.appliedFundSource, paymentConfirmationSummary.appliedFundSource) && j.b(this.appliedAccountBalance, paymentConfirmationSummary.appliedAccountBalance) && this.isGifted == paymentConfirmationSummary.isGifted;
    }

    public final AccountBalance getAppliedAccountBalance() {
        return this.appliedAccountBalance;
    }

    public final FundSource getAppliedFundSource() {
        return this.appliedFundSource;
    }

    public final String getDisplayedRecipient() {
        return this.displayedRecipient;
    }

    public final Map<String, String> getDynamicFieldsCodeAndInput() {
        return this.dynamicFieldsCodeAndInput;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTargetNumber() {
        return this.targetNumber;
    }

    public final ProductV3 getTargetProduct() {
        return this.targetProduct;
    }

    public final String getTargetRecipientName() {
        return this.targetRecipientName;
    }

    public final String getUnformattedTargetNumber() {
        return this.unformattedTargetNumber;
    }

    public int hashCode() {
        int iHashCode = this.targetProduct.hashCode() * 31;
        String str = this.displayedRecipient;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.targetNumber;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.targetRecipientName;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.unformattedTargetNumber;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.message;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Map<String, String> map = this.dynamicFieldsCodeAndInput;
        int iHashCode7 = (iHashCode6 + (map == null ? 0 : map.hashCode())) * 31;
        FundSource fundSource = this.appliedFundSource;
        int iHashCode8 = (iHashCode7 + (fundSource == null ? 0 : fundSource.hashCode())) * 31;
        AccountBalance accountBalance = this.appliedAccountBalance;
        return ((iHashCode8 + (accountBalance != null ? accountBalance.hashCode() : 0)) * 31) + (this.isGifted ? 1231 : 1237);
    }

    public final boolean isGifted() {
        return this.isGifted;
    }

    public String toString() {
        ProductV3 productV3 = this.targetProduct;
        String str = this.displayedRecipient;
        String str2 = this.targetNumber;
        String str3 = this.targetRecipientName;
        String str4 = this.unformattedTargetNumber;
        String str5 = this.message;
        Map<String, String> map = this.dynamicFieldsCodeAndInput;
        FundSource fundSource = this.appliedFundSource;
        AccountBalance accountBalance = this.appliedAccountBalance;
        boolean z4 = this.isGifted;
        StringBuilder sb2 = new StringBuilder("PaymentConfirmationSummary(targetProduct=");
        sb2.append(productV3);
        sb2.append(", displayedRecipient=");
        sb2.append(str);
        sb2.append(", targetNumber=");
        c.A(sb2, str2, ", targetRecipientName=", str3, ", unformattedTargetNumber=");
        c.A(sb2, str4, ", message=", str5, ", dynamicFieldsCodeAndInput=");
        sb2.append(map);
        sb2.append(", appliedFundSource=");
        sb2.append(fundSource);
        sb2.append(", appliedAccountBalance=");
        sb2.append(accountBalance);
        sb2.append(", isGifted=");
        sb2.append(z4);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        this.targetProduct.writeToParcel(dest, i);
        dest.writeString(this.displayedRecipient);
        dest.writeString(this.targetNumber);
        dest.writeString(this.targetRecipientName);
        dest.writeString(this.unformattedTargetNumber);
        dest.writeString(this.message);
        Map<String, String> map = this.dynamicFieldsCodeAndInput;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        dest.writeParcelable(this.appliedFundSource, i);
        dest.writeParcelable(this.appliedAccountBalance, i);
        dest.writeInt(this.isGifted ? 1 : 0);
    }

    public /* synthetic */ PaymentConfirmationSummary(ProductV3 productV3, String str, String str2, String str3, String str4, String str5, Map map, FundSource fundSource, AccountBalance accountBalance, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(productV3, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : map, (i & 128) != 0 ? null : fundSource, (i & 256) != 0 ? null : accountBalance, (i & 512) != 0 ? false : z4);
    }
}
