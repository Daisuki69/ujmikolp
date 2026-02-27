package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import com.appsflyer.AppsFlyerProperties;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class RiskChallenge implements Parcelable {
    public static final Parcelable.Creator<RiskChallenge> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(AppsFlyerProperties.CHANNEL)
    private final String channel;

    @InterfaceC1497a
    @InterfaceC1498b("decision")
    private final String decision;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("requestId")
    private final String requestId;

    @InterfaceC1497a
    @InterfaceC1498b("transactionType")
    private final String transactionType;

    public static final class Creator implements Parcelable.Creator<RiskChallenge> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskChallenge createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new RiskChallenge(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RiskChallenge[] newArray(int i) {
            return new RiskChallenge[i];
        }
    }

    public RiskChallenge(String requestId, String decision, String transactionType, String channel, String method) {
        j.g(requestId, "requestId");
        j.g(decision, "decision");
        j.g(transactionType, "transactionType");
        j.g(channel, "channel");
        j.g(method, "method");
        this.requestId = requestId;
        this.decision = decision;
        this.transactionType = transactionType;
        this.channel = channel;
        this.method = method;
    }

    public static /* synthetic */ RiskChallenge copy$default(RiskChallenge riskChallenge, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = riskChallenge.requestId;
        }
        if ((i & 2) != 0) {
            str2 = riskChallenge.decision;
        }
        if ((i & 4) != 0) {
            str3 = riskChallenge.transactionType;
        }
        if ((i & 8) != 0) {
            str4 = riskChallenge.channel;
        }
        if ((i & 16) != 0) {
            str5 = riskChallenge.method;
        }
        String str6 = str5;
        String str7 = str3;
        return riskChallenge.copy(str, str2, str7, str4, str6);
    }

    public final String component1() {
        return this.requestId;
    }

    public final String component2() {
        return this.decision;
    }

    public final String component3() {
        return this.transactionType;
    }

    public final String component4() {
        return this.channel;
    }

    public final String component5() {
        return this.method;
    }

    public final RiskChallenge copy(String requestId, String decision, String transactionType, String channel, String method) {
        j.g(requestId, "requestId");
        j.g(decision, "decision");
        j.g(transactionType, "transactionType");
        j.g(channel, "channel");
        j.g(method, "method");
        return new RiskChallenge(requestId, decision, transactionType, channel, method);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RiskChallenge)) {
            return false;
        }
        RiskChallenge riskChallenge = (RiskChallenge) obj;
        return j.b(this.requestId, riskChallenge.requestId) && j.b(this.decision, riskChallenge.decision) && j.b(this.transactionType, riskChallenge.transactionType) && j.b(this.channel, riskChallenge.channel) && j.b(this.method, riskChallenge.method);
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getDecision() {
        return this.decision;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        return this.method.hashCode() + AbstractC1414e.c(AbstractC1414e.c(AbstractC1414e.c(this.requestId.hashCode() * 31, 31, this.decision), 31, this.transactionType), 31, this.channel);
    }

    public String toString() {
        String str = this.requestId;
        String str2 = this.decision;
        String str3 = this.transactionType;
        String str4 = this.channel;
        String str5 = this.method;
        StringBuilder sbX = s.x("RiskChallenge(requestId=", str, ", decision=", str2, ", transactionType=");
        c.A(sbX, str3, ", channel=", str4, ", method=");
        return s.p(sbX, str5, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.requestId);
        dest.writeString(this.decision);
        dest.writeString(this.transactionType);
        dest.writeString(this.channel);
        dest.writeString(this.method);
    }
}
