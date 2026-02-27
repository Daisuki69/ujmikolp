package com.paymaya.mayaui.newmayacredit.model;

import A1.a;
import J9.d;
import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.datasource.cache.c;
import com.paymaya.domain.model.CreditTerm;
import com.paymaya.domain.model.MothersMaidenName;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class CreditReviewUiModel implements Parcelable {
    public static final Parcelable.Creator<CreditReviewUiModel> CREATOR = new a(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f13055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13056b;
    public String c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f13057d;
    public String e;
    public final d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f13058g;
    public String h;
    public String i;
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public J9.a f13060l;
    public CreditTerm m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f13062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f13063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MothersMaidenName f13065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f13066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13067t;

    public /* synthetic */ CreditReviewUiModel(String str, String str2, String str3, String str4, String str5, d dVar, String str6, String str7, String str8, String str9, int i, J9.a aVar, CreditTerm creditTerm, MothersMaidenName mothersMaidenName, int i4) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : str4, (i4 & 16) != 0 ? null : str5, dVar, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : str7, (i4 & 256) != 0 ? null : str8, (i4 & 512) != 0 ? null : str9, (i4 & 1024) != 0 ? 0 : i, (i4 & 2048) != 0 ? null : aVar, (i4 & 4096) != 0 ? null : creditTerm, (i4 & 8192) == 0, null, false, false, (i4 & 131072) != 0 ? null : mothersMaidenName, null, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreditReviewUiModel)) {
            return false;
        }
        CreditReviewUiModel creditReviewUiModel = (CreditReviewUiModel) obj;
        return j.b(this.f13055a, creditReviewUiModel.f13055a) && j.b(this.f13056b, creditReviewUiModel.f13056b) && j.b(this.c, creditReviewUiModel.c) && j.b(this.f13057d, creditReviewUiModel.f13057d) && j.b(this.e, creditReviewUiModel.e) && this.f == creditReviewUiModel.f && j.b(this.f13058g, creditReviewUiModel.f13058g) && j.b(this.h, creditReviewUiModel.h) && j.b(this.i, creditReviewUiModel.i) && j.b(this.j, creditReviewUiModel.j) && this.f13059k == creditReviewUiModel.f13059k && j.b(this.f13060l, creditReviewUiModel.f13060l) && j.b(this.m, creditReviewUiModel.m) && this.f13061n == creditReviewUiModel.f13061n && j.b(this.f13062o, creditReviewUiModel.f13062o) && this.f13063p == creditReviewUiModel.f13063p && this.f13064q == creditReviewUiModel.f13064q && j.b(this.f13065r, creditReviewUiModel.f13065r) && j.b(this.f13066s, creditReviewUiModel.f13066s) && this.f13067t == creditReviewUiModel.f13067t;
    }

    public final int hashCode() {
        String str = this.f13055a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13056b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13057d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        int iHashCode5 = (this.f.hashCode() + ((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31;
        String str6 = this.f13058g;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.j;
        int iHashCode9 = (((iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31) + this.f13059k) * 31;
        J9.a aVar = this.f13060l;
        int iHashCode10 = (iHashCode9 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        CreditTerm creditTerm = this.m;
        int iHashCode11 = (((iHashCode10 + (creditTerm == null ? 0 : creditTerm.hashCode())) * 31) + (this.f13061n ? 1231 : 1237)) * 31;
        String str10 = this.f13062o;
        int iHashCode12 = (((((iHashCode11 + (str10 == null ? 0 : str10.hashCode())) * 31) + (this.f13063p ? 1231 : 1237)) * 31) + (this.f13064q ? 1231 : 1237)) * 31;
        MothersMaidenName mothersMaidenName = this.f13065r;
        int iHashCode13 = (iHashCode12 + (mothersMaidenName == null ? 0 : mothersMaidenName.hashCode())) * 31;
        String str11 = this.f13066s;
        return ((iHashCode13 + (str11 != null ? str11.hashCode() : 0)) * 31) + (this.f13067t ? 1231 : 1237);
    }

    public final String toString() {
        String str = this.f13055a;
        String str2 = this.c;
        String str3 = this.f13057d;
        String str4 = this.e;
        String str5 = this.h;
        String str6 = this.i;
        String str7 = this.j;
        int i = this.f13059k;
        J9.a aVar = this.f13060l;
        CreditTerm creditTerm = this.m;
        String str8 = this.f13062o;
        boolean z4 = this.f13063p;
        boolean z5 = this.f13064q;
        MothersMaidenName mothersMaidenName = this.f13065r;
        String str9 = this.f13066s;
        boolean z8 = this.f13067t;
        StringBuilder sbW = s.w("CreditReviewUiModel(loanAmount=", str, ", termExpiration=");
        c.A(sbW, this.f13056b, ", billingEndDate=", str2, ", feeRate=");
        c.A(sbW, str3, ", email=", str4, ", emailStatus=");
        sbW.append(this.f);
        sbW.append(", accountNumber=");
        c.A(sbW, this.f13058g, ", gender=", str5, ", maritalStatus=");
        c.A(sbW, str6, ", alternativeMobile=", str7, ", billingEndDayValue=");
        sbW.append(i);
        sbW.append(", contactReference=");
        sbW.append(aVar);
        sbW.append(", creditTerm=");
        sbW.append(creditTerm);
        sbW.append(", isExistingUser=");
        sbW.append(this.f13061n);
        sbW.append(", riskLevel=");
        sbW.append(str8);
        sbW.append(", isCreditScoringDataValid=");
        sbW.append(z4);
        sbW.append(", isDeviceDataSent=");
        sbW.append(z5);
        sbW.append(", mothersMaidenName=");
        sbW.append(mothersMaidenName);
        sbW.append(", dataReferenceId=");
        sbW.append(str9);
        sbW.append(", permission=");
        return s.s(sbW, z8, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.f13055a);
        dest.writeString(this.f13056b);
        dest.writeString(this.c);
        dest.writeString(this.f13057d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f13058g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
        dest.writeInt(this.f13059k);
        dest.writeSerializable(this.f13060l);
        CreditTerm creditTerm = this.m;
        if (creditTerm == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditTerm.writeToParcel(dest, i);
        }
        dest.writeInt(this.f13061n ? 1 : 0);
        dest.writeString(this.f13062o);
        dest.writeInt(this.f13063p ? 1 : 0);
        dest.writeInt(this.f13064q ? 1 : 0);
        MothersMaidenName mothersMaidenName = this.f13065r;
        if (mothersMaidenName == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            mothersMaidenName.writeToParcel(dest, i);
        }
        dest.writeString(this.f13066s);
        dest.writeInt(this.f13067t ? 1 : 0);
    }

    public CreditReviewUiModel(String str, String str2, String str3, String str4, String str5, d emailStatus, String str6, String str7, String str8, String str9, int i, J9.a aVar, CreditTerm creditTerm, boolean z4, String str10, boolean z5, boolean z8, MothersMaidenName mothersMaidenName, String str11, boolean z9) {
        j.g(emailStatus, "emailStatus");
        this.f13055a = str;
        this.f13056b = str2;
        this.c = str3;
        this.f13057d = str4;
        this.e = str5;
        this.f = emailStatus;
        this.f13058g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.f13059k = i;
        this.f13060l = aVar;
        this.m = creditTerm;
        this.f13061n = z4;
        this.f13062o = str10;
        this.f13063p = z5;
        this.f13064q = z8;
        this.f13065r = mothersMaidenName;
        this.f13066s = str11;
        this.f13067t = z9;
    }
}
