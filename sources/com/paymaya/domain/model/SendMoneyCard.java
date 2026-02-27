package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.datasource.cache.c;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.paymaya.common.utility.C;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class SendMoneyCard implements Parcelable {
    public static final Parcelable.Creator<SendMoneyCard> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("amount")
    private final String amount;

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String currency;

    @InterfaceC1497a
    @InterfaceC1498b("decoration")
    private final String decorationId;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b("message")
    private final String message;

    @InterfaceC1497a
    @InterfaceC1498b("recipient")
    private final String recipient;

    @InterfaceC1497a
    @InterfaceC1498b("sender")
    private final String sender;

    @InterfaceC1497a
    @InterfaceC1498b("transaction_id")
    private final String transaction_id;

    public static final class Creator implements Parcelable.Creator<SendMoneyCard> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SendMoneyCard createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new SendMoneyCard(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SendMoneyCard[] newArray(int i) {
            return new SendMoneyCard[i];
        }
    }

    public SendMoneyCard(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.sender = str;
        this.recipient = str2;
        this.message = str3;
        this.amount = str4;
        this.currency = str5;
        this.decorationId = str6;
        this.id = str7;
        this.transaction_id = str8;
    }

    public static /* synthetic */ SendMoneyCard copy$default(SendMoneyCard sendMoneyCard, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sendMoneyCard.sender;
        }
        if ((i & 2) != 0) {
            str2 = sendMoneyCard.recipient;
        }
        if ((i & 4) != 0) {
            str3 = sendMoneyCard.message;
        }
        if ((i & 8) != 0) {
            str4 = sendMoneyCard.amount;
        }
        if ((i & 16) != 0) {
            str5 = sendMoneyCard.currency;
        }
        if ((i & 32) != 0) {
            str6 = sendMoneyCard.decorationId;
        }
        if ((i & 64) != 0) {
            str7 = sendMoneyCard.id;
        }
        if ((i & 128) != 0) {
            str8 = sendMoneyCard.transaction_id;
        }
        String str9 = str7;
        String str10 = str8;
        String str11 = str5;
        String str12 = str6;
        return sendMoneyCard.copy(str, str2, str3, str4, str11, str12, str9, str10);
    }

    public final String component1() {
        return this.sender;
    }

    public final String component2() {
        return this.recipient;
    }

    public final String component3() {
        return this.message;
    }

    public final String component4() {
        return this.amount;
    }

    public final String component5() {
        return this.currency;
    }

    public final String component6() {
        return this.decorationId;
    }

    public final String component7() {
        return this.id;
    }

    public final String component8() {
        return this.transaction_id;
    }

    public final SendMoneyCard copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        return new SendMoneyCard(str, str2, str3, str4, str5, str6, str7, str8);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMoneyCard)) {
            return false;
        }
        SendMoneyCard sendMoneyCard = (SendMoneyCard) obj;
        return j.b(this.sender, sendMoneyCard.sender) && j.b(this.recipient, sendMoneyCard.recipient) && j.b(this.message, sendMoneyCard.message) && j.b(this.amount, sendMoneyCard.amount) && j.b(this.currency, sendMoneyCard.currency) && j.b(this.decorationId, sendMoneyCard.decorationId) && j.b(this.id, sendMoneyCard.id) && j.b(this.transaction_id, sendMoneyCard.transaction_id);
    }

    public final String formattedAmount() {
        return a.j(this.currency, Global.BLANK, C.v(this.amount));
    }

    public final String getAmount() {
        return this.amount;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDecorationId() {
        return this.decorationId;
    }

    public final String getId() {
        return this.id;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getRecipient() {
        return this.recipient;
    }

    public final String getSender() {
        return this.sender;
    }

    public final String getTransaction_id() {
        return this.transaction_id;
    }

    public int hashCode() {
        String str = this.sender;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.recipient;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.message;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.amount;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.currency;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.decorationId;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.id;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.transaction_id;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public String toString() {
        String str = this.sender;
        String str2 = this.recipient;
        String str3 = this.message;
        String str4 = this.amount;
        String str5 = this.currency;
        String str6 = this.decorationId;
        String str7 = this.id;
        String str8 = this.transaction_id;
        StringBuilder sbX = s.x("SendMoneyCard(sender=", str, ", recipient=", str2, ", message=");
        c.A(sbX, str3, ", amount=", str4, ", currency=");
        c.A(sbX, str5, ", decorationId=", str6, ", id=");
        return a.p(sbX, str7, ", transaction_id=", str8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.sender);
        dest.writeString(this.recipient);
        dest.writeString(this.message);
        dest.writeString(this.amount);
        dest.writeString(this.currency);
        dest.writeString(this.decorationId);
        dest.writeString(this.id);
        dest.writeString(this.transaction_id);
    }
}
