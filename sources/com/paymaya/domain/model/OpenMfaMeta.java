package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import com.dynatrace.agent.events.enrichment.EventKeys;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OpenMfaMeta implements Parcelable {
    public static final Parcelable.Creator<OpenMfaMeta> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(EventKeys.CLIENT)
    private final String client;

    @InterfaceC1497a
    @InterfaceC1498b("fallback_source_screen")
    private String fallbackSourceScreen;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.METHOD)
    private final String method;

    @InterfaceC1497a
    @InterfaceC1498b("mobile_number")
    private final String mobileNumber;

    @InterfaceC1497a
    @InterfaceC1498b("source_screen")
    private String sourceScreen;

    @InterfaceC1497a
    @InterfaceC1498b("success_screen")
    private String successScreen;

    @InterfaceC1497a
    @InterfaceC1498b("transaction_type")
    private final String transactionType;

    public static final class Creator implements Parcelable.Creator<OpenMfaMeta> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaMeta createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new OpenMfaMeta(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OpenMfaMeta[] newArray(int i) {
            return new OpenMfaMeta[i];
        }
    }

    public OpenMfaMeta(String mobileNumber, String method, String transactionType, String str, String str2, String str3, String str4) {
        j.g(mobileNumber, "mobileNumber");
        j.g(method, "method");
        j.g(transactionType, "transactionType");
        this.mobileNumber = mobileNumber;
        this.method = method;
        this.transactionType = transactionType;
        this.client = str;
        this.sourceScreen = str2;
        this.successScreen = str3;
        this.fallbackSourceScreen = str4;
    }

    public static /* synthetic */ OpenMfaMeta copy$default(OpenMfaMeta openMfaMeta, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openMfaMeta.mobileNumber;
        }
        if ((i & 2) != 0) {
            str2 = openMfaMeta.method;
        }
        if ((i & 4) != 0) {
            str3 = openMfaMeta.transactionType;
        }
        if ((i & 8) != 0) {
            str4 = openMfaMeta.client;
        }
        if ((i & 16) != 0) {
            str5 = openMfaMeta.sourceScreen;
        }
        if ((i & 32) != 0) {
            str6 = openMfaMeta.successScreen;
        }
        if ((i & 64) != 0) {
            str7 = openMfaMeta.fallbackSourceScreen;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        String str11 = str3;
        return openMfaMeta.copy(str, str2, str11, str4, str10, str8, str9);
    }

    public final String component1() {
        return this.mobileNumber;
    }

    public final String component2() {
        return this.method;
    }

    public final String component3() {
        return this.transactionType;
    }

    public final String component4() {
        return this.client;
    }

    public final String component5() {
        return this.sourceScreen;
    }

    public final String component6() {
        return this.successScreen;
    }

    public final String component7() {
        return this.fallbackSourceScreen;
    }

    public final OpenMfaMeta copy(String mobileNumber, String method, String transactionType, String str, String str2, String str3, String str4) {
        j.g(mobileNumber, "mobileNumber");
        j.g(method, "method");
        j.g(transactionType, "transactionType");
        return new OpenMfaMeta(mobileNumber, method, transactionType, str, str2, str3, str4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OpenMfaMeta)) {
            return false;
        }
        OpenMfaMeta openMfaMeta = (OpenMfaMeta) obj;
        return j.b(this.mobileNumber, openMfaMeta.mobileNumber) && j.b(this.method, openMfaMeta.method) && j.b(this.transactionType, openMfaMeta.transactionType) && j.b(this.client, openMfaMeta.client) && j.b(this.sourceScreen, openMfaMeta.sourceScreen) && j.b(this.successScreen, openMfaMeta.successScreen) && j.b(this.fallbackSourceScreen, openMfaMeta.fallbackSourceScreen);
    }

    public final String getClient() {
        return this.client;
    }

    public final String getFallbackSourceScreen() {
        return this.fallbackSourceScreen;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    public final String getSourceScreen() {
        return this.sourceScreen;
    }

    public final String getSuccessScreen() {
        return this.successScreen;
    }

    public final String getTransactionType() {
        return this.transactionType;
    }

    public int hashCode() {
        int iC = AbstractC1414e.c(AbstractC1414e.c(this.mobileNumber.hashCode() * 31, 31, this.method), 31, this.transactionType);
        String str = this.client;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.sourceScreen;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.successScreen;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.fallbackSourceScreen;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setFallbackSourceScreen(String str) {
        this.fallbackSourceScreen = str;
    }

    public final void setSourceScreen(String str) {
        this.sourceScreen = str;
    }

    public final void setSuccessScreen(String str) {
        this.successScreen = str;
    }

    public String toString() {
        String str = this.mobileNumber;
        String str2 = this.method;
        String str3 = this.transactionType;
        String str4 = this.client;
        String str5 = this.sourceScreen;
        String str6 = this.successScreen;
        String str7 = this.fallbackSourceScreen;
        StringBuilder sbX = s.x("OpenMfaMeta(mobileNumber=", str, ", method=", str2, ", transactionType=");
        c.A(sbX, str3, ", client=", str4, ", sourceScreen=");
        c.A(sbX, str5, ", successScreen=", str6, ", fallbackSourceScreen=");
        return s.p(sbX, str7, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mobileNumber);
        dest.writeString(this.method);
        dest.writeString(this.transactionType);
        dest.writeString(this.client);
        dest.writeString(this.sourceScreen);
        dest.writeString(this.successScreen);
        dest.writeString(this.fallbackSourceScreen);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ OpenMfaMeta(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r0 = r16 & 8
            if (r0 == 0) goto L6
            java.lang.String r12 = "android"
        L6:
            r4 = r12
            r12 = r16 & 16
            r0 = 0
            if (r12 == 0) goto Le
            r5 = r0
            goto Lf
        Le:
            r5 = r13
        Lf:
            r12 = r16 & 32
            if (r12 == 0) goto L15
            r6 = r0
            goto L16
        L15:
            r6 = r14
        L16:
            r12 = r16 & 64
            if (r12 == 0) goto L20
            r7 = r0
            r1 = r9
            r2 = r10
            r3 = r11
            r0 = r8
            goto L25
        L20:
            r7 = r15
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
        L25:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.paymaya.domain.model.OpenMfaMeta.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
