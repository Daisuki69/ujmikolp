package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BillerTransactionPayment implements Parcelable {
    public static final Parcelable.Creator<BillerTransactionPayment> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("payment_id")
    private final String paymentId;

    @InterfaceC1497a
    @InterfaceC1498b("payment_method_redirect_url")
    private final String paymentMethodRedirectUrl;

    @InterfaceC1497a
    @InterfaceC1498b("payment_option")
    private final String paymentOption;

    @InterfaceC1497a
    @InterfaceC1498b("payment_reference_no")
    private final String paymentReferenceNumber;

    @InterfaceC1497a
    @InterfaceC1498b("payment_status")
    private final String paymentStatus;

    @InterfaceC1497a
    @InterfaceC1498b("processing_fees")
    private final ProcessingFees processingFees;

    @InterfaceC1497a
    @InterfaceC1498b("processor_reference_no")
    private final String processorReferenceNumber;

    public static final class Creator implements Parcelable.Creator<BillerTransactionPayment> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillerTransactionPayment createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new BillerTransactionPayment(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ProcessingFees.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BillerTransactionPayment[] newArray(int i) {
            return new BillerTransactionPayment[i];
        }
    }

    public BillerTransactionPayment(String paymentId, String paymentStatus, String paymentMethodRedirectUrl, String paymentOption, String paymentReferenceNumber, String processorReferenceNumber, ProcessingFees processingFees) {
        j.g(paymentId, "paymentId");
        j.g(paymentStatus, "paymentStatus");
        j.g(paymentMethodRedirectUrl, "paymentMethodRedirectUrl");
        j.g(paymentOption, "paymentOption");
        j.g(paymentReferenceNumber, "paymentReferenceNumber");
        j.g(processorReferenceNumber, "processorReferenceNumber");
        this.paymentId = paymentId;
        this.paymentStatus = paymentStatus;
        this.paymentMethodRedirectUrl = paymentMethodRedirectUrl;
        this.paymentOption = paymentOption;
        this.paymentReferenceNumber = paymentReferenceNumber;
        this.processorReferenceNumber = processorReferenceNumber;
        this.processingFees = processingFees;
    }

    public static /* synthetic */ BillerTransactionPayment copy$default(BillerTransactionPayment billerTransactionPayment, String str, String str2, String str3, String str4, String str5, String str6, ProcessingFees processingFees, int i, Object obj) {
        if ((i & 1) != 0) {
            str = billerTransactionPayment.paymentId;
        }
        if ((i & 2) != 0) {
            str2 = billerTransactionPayment.paymentStatus;
        }
        if ((i & 4) != 0) {
            str3 = billerTransactionPayment.paymentMethodRedirectUrl;
        }
        if ((i & 8) != 0) {
            str4 = billerTransactionPayment.paymentOption;
        }
        if ((i & 16) != 0) {
            str5 = billerTransactionPayment.paymentReferenceNumber;
        }
        if ((i & 32) != 0) {
            str6 = billerTransactionPayment.processorReferenceNumber;
        }
        if ((i & 64) != 0) {
            processingFees = billerTransactionPayment.processingFees;
        }
        String str7 = str6;
        ProcessingFees processingFees2 = processingFees;
        String str8 = str5;
        String str9 = str3;
        return billerTransactionPayment.copy(str, str2, str9, str4, str8, str7, processingFees2);
    }

    public final String component1() {
        return this.paymentId;
    }

    public final String component2() {
        return this.paymentStatus;
    }

    public final String component3() {
        return this.paymentMethodRedirectUrl;
    }

    public final String component4() {
        return this.paymentOption;
    }

    public final String component5() {
        return this.paymentReferenceNumber;
    }

    public final String component6() {
        return this.processorReferenceNumber;
    }

    public final ProcessingFees component7() {
        return this.processingFees;
    }

    public final BillerTransactionPayment copy(String paymentId, String paymentStatus, String paymentMethodRedirectUrl, String paymentOption, String paymentReferenceNumber, String processorReferenceNumber, ProcessingFees processingFees) {
        j.g(paymentId, "paymentId");
        j.g(paymentStatus, "paymentStatus");
        j.g(paymentMethodRedirectUrl, "paymentMethodRedirectUrl");
        j.g(paymentOption, "paymentOption");
        j.g(paymentReferenceNumber, "paymentReferenceNumber");
        j.g(processorReferenceNumber, "processorReferenceNumber");
        return new BillerTransactionPayment(paymentId, paymentStatus, paymentMethodRedirectUrl, paymentOption, paymentReferenceNumber, processorReferenceNumber, processingFees);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BillerTransactionPayment)) {
            return false;
        }
        BillerTransactionPayment billerTransactionPayment = (BillerTransactionPayment) obj;
        return j.b(this.paymentId, billerTransactionPayment.paymentId) && j.b(this.paymentStatus, billerTransactionPayment.paymentStatus) && j.b(this.paymentMethodRedirectUrl, billerTransactionPayment.paymentMethodRedirectUrl) && j.b(this.paymentOption, billerTransactionPayment.paymentOption) && j.b(this.paymentReferenceNumber, billerTransactionPayment.paymentReferenceNumber) && j.b(this.processorReferenceNumber, billerTransactionPayment.processorReferenceNumber) && j.b(this.processingFees, billerTransactionPayment.processingFees);
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentMethodRedirectUrl() {
        return this.paymentMethodRedirectUrl;
    }

    public final String getPaymentOption() {
        return this.paymentOption;
    }

    public final String getPaymentReferenceNumber() {
        return this.paymentReferenceNumber;
    }

    public final String getPaymentStatus() {
        return this.paymentStatus;
    }

    public final ProcessingFees getProcessingFees() {
        return this.processingFees;
    }

    public final String getProcessorReferenceNumber() {
        return this.processorReferenceNumber;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.paymentId.hashCode() * 31, 31, this.paymentStatus), 31, this.paymentMethodRedirectUrl), 31, this.paymentOption), 31, this.paymentReferenceNumber), 31, this.processorReferenceNumber);
        ProcessingFees processingFees = this.processingFees;
        return iC + (processingFees == null ? 0 : processingFees.hashCode());
    }

    public String toString() {
        String str = this.paymentId;
        String str2 = this.paymentStatus;
        String str3 = this.paymentMethodRedirectUrl;
        String str4 = this.paymentOption;
        String str5 = this.paymentReferenceNumber;
        String str6 = this.processorReferenceNumber;
        ProcessingFees processingFees = this.processingFees;
        StringBuilder sbX = s.x("BillerTransactionPayment(paymentId=", str, ", paymentStatus=", str2, ", paymentMethodRedirectUrl=");
        c.A(sbX, str3, ", paymentOption=", str4, ", paymentReferenceNumber=");
        c.A(sbX, str5, ", processorReferenceNumber=", str6, ", processingFees=");
        sbX.append(processingFees);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.paymentId);
        dest.writeString(this.paymentStatus);
        dest.writeString(this.paymentMethodRedirectUrl);
        dest.writeString(this.paymentOption);
        dest.writeString(this.paymentReferenceNumber);
        dest.writeString(this.processorReferenceNumber);
        ProcessingFees processingFees = this.processingFees;
        if (processingFees == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            processingFees.writeToParcel(dest, i);
        }
    }
}
