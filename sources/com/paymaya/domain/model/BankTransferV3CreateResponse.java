package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BankTransferV3CreateResponse implements Parcelable {
    public static final Parcelable.Creator<BankTransferV3CreateResponse> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("auth_challenge_id")
    private final String authChallengeId;
    private BankTransferV3 bankTransfer;

    @InterfaceC1497a
    @InterfaceC1498b("fees")
    private final Amount fees;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("status")
    private final String status;

    public static final class Creator implements Parcelable.Creator<BankTransferV3CreateResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankTransferV3CreateResponse createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new BankTransferV3CreateResponse(parcel.readString(), parcel.readString(), (Amount) parcel.readParcelable(BankTransferV3CreateResponse.class.getClassLoader()), parcel.readString(), BankTransferV3.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankTransferV3CreateResponse[] newArray(int i) {
            return new BankTransferV3CreateResponse[i];
        }
    }

    public BankTransferV3CreateResponse(String str, String str2, Amount amount, String str3, BankTransferV3 bankTransfer) {
        j.g(bankTransfer, "bankTransfer");
        this.id = str;
        this.authChallengeId = str2;
        this.fees = amount;
        this.status = str3;
        this.bankTransfer = bankTransfer;
    }

    public static /* synthetic */ BankTransferV3CreateResponse copy$default(BankTransferV3CreateResponse bankTransferV3CreateResponse, String str, String str2, Amount amount, String str3, BankTransferV3 bankTransferV3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bankTransferV3CreateResponse.id;
        }
        if ((i & 2) != 0) {
            str2 = bankTransferV3CreateResponse.authChallengeId;
        }
        if ((i & 4) != 0) {
            amount = bankTransferV3CreateResponse.fees;
        }
        if ((i & 8) != 0) {
            str3 = bankTransferV3CreateResponse.status;
        }
        if ((i & 16) != 0) {
            bankTransferV3 = bankTransferV3CreateResponse.bankTransfer;
        }
        BankTransferV3 bankTransferV32 = bankTransferV3;
        Amount amount2 = amount;
        return bankTransferV3CreateResponse.copy(str, str2, amount2, str3, bankTransferV32);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.authChallengeId;
    }

    public final Amount component3() {
        return this.fees;
    }

    public final String component4() {
        return this.status;
    }

    public final BankTransferV3 component5() {
        return this.bankTransfer;
    }

    public final BankTransferV3CreateResponse copy(String str, String str2, Amount amount, String str3, BankTransferV3 bankTransfer) {
        j.g(bankTransfer, "bankTransfer");
        return new BankTransferV3CreateResponse(str, str2, amount, str3, bankTransfer);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankTransferV3CreateResponse)) {
            return false;
        }
        BankTransferV3CreateResponse bankTransferV3CreateResponse = (BankTransferV3CreateResponse) obj;
        return j.b(this.id, bankTransferV3CreateResponse.id) && j.b(this.authChallengeId, bankTransferV3CreateResponse.authChallengeId) && j.b(this.fees, bankTransferV3CreateResponse.fees) && j.b(this.status, bankTransferV3CreateResponse.status) && j.b(this.bankTransfer, bankTransferV3CreateResponse.bankTransfer);
    }

    public final String getAuthChallengeId() {
        return this.authChallengeId;
    }

    public final BankTransferV3 getBankTransfer() {
        return this.bankTransfer;
    }

    public final Amount getFees() {
        return this.fees;
    }

    public final String getId() {
        return this.id;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authChallengeId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Amount amount = this.fees;
        int iHashCode3 = (iHashCode2 + (amount == null ? 0 : amount.hashCode())) * 31;
        String str3 = this.status;
        return this.bankTransfer.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final void setBankTransfer(BankTransferV3 bankTransferV3) {
        j.g(bankTransferV3, "<set-?>");
        this.bankTransfer = bankTransferV3;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.authChallengeId;
        Amount amount = this.fees;
        String str3 = this.status;
        BankTransferV3 bankTransferV3 = this.bankTransfer;
        StringBuilder sbX = s.x("BankTransferV3CreateResponse(id=", str, ", authChallengeId=", str2, ", fees=");
        sbX.append(amount);
        sbX.append(", status=");
        sbX.append(str3);
        sbX.append(", bankTransfer=");
        sbX.append(bankTransferV3);
        sbX.append(")");
        return sbX.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.authChallengeId);
        dest.writeParcelable(this.fees, i);
        dest.writeString(this.status);
        this.bankTransfer.writeToParcel(dest, i);
    }
}
