package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.a;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.dynatrace.android.agent.Global;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.paymaya.common.utility.AbstractC1213b;
import com.paymaya.common.utility.C;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class BankPullPaymentOption implements Parcelable {
    public static final Parcelable.Creator<BankPullPaymentOption> CREATOR = new Creator();
    private String currency;

    @InterfaceC1497a
    @InterfaceC1498b("icon_url")
    private final ImageUrlUnfiltered iconUrl;

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    @InterfaceC1497a
    @InterfaceC1498b(Constants.ENABLED)
    private final boolean isEnabled;

    @InterfaceC1497a
    @InterfaceC1498b("link_token_to_customer")
    private final Boolean linkTokenToCustomer;

    @InterfaceC1497a
    @InterfaceC1498b("maintenance")
    private final MaintenanceDate maintenanceDate;

    @InterfaceC1497a
    @InterfaceC1498b("max_linked_accounts")
    private final int maxLinkedAccounts;

    @InterfaceC1497a
    @InterfaceC1498b("max_txn_count_per_day")
    private final int maxTransactionCountPerDay;

    @InterfaceC1497a
    @InterfaceC1498b("maximum_amount")
    private final int maximumAmount;

    @InterfaceC1497a
    @InterfaceC1498b("minimum_amount")
    private final int minimumAmount;

    @InterfaceC1497a
    @InterfaceC1498b(AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @InterfaceC1497a
    @InterfaceC1498b("payment_methods")
    private final List<String> paymentMethods;
    private LinkedPaymentOption paymentOption;

    @InterfaceC1497a
    @InterfaceC1498b("priority")
    private final int priority;

    @InterfaceC1497a
    @InterfaceC1498b("spiels")
    private final BankPullPaymentOptionSpiels spiels;

    @InterfaceC1497a
    @InterfaceC1498b("steps")
    private final String steps;

    @InterfaceC1497a
    @InterfaceC1498b("supported_version")
    private final String supportedVersion;

    public static final class Creator implements Parcelable.Creator<BankPullPaymentOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankPullPaymentOption createFromParcel(Parcel parcel) {
            boolean z4;
            boolean z5;
            Boolean boolValueOf;
            LinkedPaymentOption linkedPaymentOption;
            ImageUrlUnfiltered imageUrlUnfiltered;
            LinkedPaymentOption linkedPaymentOptionCreateFromParcel;
            j.g(parcel, "parcel");
            MaintenanceDate maintenanceDate = (MaintenanceDate) parcel.readParcelable(BankPullPaymentOption.class.getClassLoader());
            if (parcel.readInt() != 0) {
                z5 = false;
                z4 = true;
            } else {
                z4 = false;
                z5 = false;
            }
            int i = parcel.readInt();
            String string = parcel.readString();
            boolean z8 = z5;
            int i4 = parcel.readInt();
            int i6 = parcel.readInt();
            int i10 = parcel.readInt();
            int i11 = parcel.readInt();
            String string2 = parcel.readString();
            ImageUrlUnfiltered imageUrlUnfiltered2 = (ImageUrlUnfiltered) parcel.readParcelable(BankPullPaymentOption.class.getClassLoader());
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            boolean z9 = z8;
            String string4 = parcel.readString();
            BankPullPaymentOptionSpiels bankPullPaymentOptionSpielsCreateFromParcel = parcel.readInt() == 0 ? null : BankPullPaymentOptionSpiels.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedPaymentOption = null;
                boolValueOf = null;
            } else {
                if (parcel.readInt() != 0) {
                    z9 = true;
                }
                boolValueOf = Boolean.valueOf(z9);
                linkedPaymentOption = null;
            }
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedPaymentOptionCreateFromParcel = linkedPaymentOption;
                imageUrlUnfiltered = imageUrlUnfiltered2;
            } else {
                imageUrlUnfiltered = imageUrlUnfiltered2;
                linkedPaymentOptionCreateFromParcel = LinkedPaymentOption.CREATOR.createFromParcel(parcel);
            }
            return new BankPullPaymentOption(maintenanceDate, z4, i, string, i4, i6, i10, i11, string2, imageUrlUnfiltered, string3, arrayListCreateStringArrayList, string4, bankPullPaymentOptionSpielsCreateFromParcel, boolValueOf, string5, linkedPaymentOptionCreateFromParcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BankPullPaymentOption[] newArray(int i) {
            return new BankPullPaymentOption[i];
        }
    }

    public BankPullPaymentOption(MaintenanceDate maintenanceDate, boolean z4, int i, String str, int i4, int i6, int i10, int i11, String str2, ImageUrlUnfiltered imageUrlUnfiltered, String name, List<String> list, String id, BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels, Boolean bool, String str3, LinkedPaymentOption linkedPaymentOption) {
        j.g(name, "name");
        j.g(id, "id");
        this.maintenanceDate = maintenanceDate;
        this.isEnabled = z4;
        this.priority = i;
        this.steps = str;
        this.minimumAmount = i4;
        this.maximumAmount = i6;
        this.maxTransactionCountPerDay = i10;
        this.maxLinkedAccounts = i11;
        this.supportedVersion = str2;
        this.iconUrl = imageUrlUnfiltered;
        this.name = name;
        this.paymentMethods = list;
        this.id = id;
        this.spiels = bankPullPaymentOptionSpiels;
        this.linkTokenToCustomer = bool;
        this.currency = str3;
        this.paymentOption = linkedPaymentOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BankPullPaymentOption copy$default(BankPullPaymentOption bankPullPaymentOption, MaintenanceDate maintenanceDate, boolean z4, int i, String str, int i4, int i6, int i10, int i11, String str2, ImageUrlUnfiltered imageUrlUnfiltered, String str3, List list, String str4, BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels, Boolean bool, String str5, LinkedPaymentOption linkedPaymentOption, int i12, Object obj) {
        LinkedPaymentOption linkedPaymentOption2;
        String str6;
        MaintenanceDate maintenanceDate2;
        BankPullPaymentOption bankPullPaymentOption2;
        Boolean bool2;
        boolean z5;
        int i13;
        String str7;
        int i14;
        int i15;
        int i16;
        int i17;
        String str8;
        ImageUrlUnfiltered imageUrlUnfiltered2;
        String str9;
        List list2;
        String str10;
        BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels2;
        MaintenanceDate maintenanceDate3 = (i12 & 1) != 0 ? bankPullPaymentOption.maintenanceDate : maintenanceDate;
        boolean z8 = (i12 & 2) != 0 ? bankPullPaymentOption.isEnabled : z4;
        int i18 = (i12 & 4) != 0 ? bankPullPaymentOption.priority : i;
        String str11 = (i12 & 8) != 0 ? bankPullPaymentOption.steps : str;
        int i19 = (i12 & 16) != 0 ? bankPullPaymentOption.minimumAmount : i4;
        int i20 = (i12 & 32) != 0 ? bankPullPaymentOption.maximumAmount : i6;
        int i21 = (i12 & 64) != 0 ? bankPullPaymentOption.maxTransactionCountPerDay : i10;
        int i22 = (i12 & 128) != 0 ? bankPullPaymentOption.maxLinkedAccounts : i11;
        String str12 = (i12 & 256) != 0 ? bankPullPaymentOption.supportedVersion : str2;
        ImageUrlUnfiltered imageUrlUnfiltered3 = (i12 & 512) != 0 ? bankPullPaymentOption.iconUrl : imageUrlUnfiltered;
        String str13 = (i12 & 1024) != 0 ? bankPullPaymentOption.name : str3;
        List list3 = (i12 & 2048) != 0 ? bankPullPaymentOption.paymentMethods : list;
        String str14 = (i12 & 4096) != 0 ? bankPullPaymentOption.id : str4;
        BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels3 = (i12 & 8192) != 0 ? bankPullPaymentOption.spiels : bankPullPaymentOptionSpiels;
        MaintenanceDate maintenanceDate4 = maintenanceDate3;
        Boolean bool3 = (i12 & 16384) != 0 ? bankPullPaymentOption.linkTokenToCustomer : bool;
        String str15 = (i12 & 32768) != 0 ? bankPullPaymentOption.currency : str5;
        if ((i12 & 65536) != 0) {
            str6 = str15;
            linkedPaymentOption2 = bankPullPaymentOption.paymentOption;
            bool2 = bool3;
            z5 = z8;
            i13 = i18;
            str7 = str11;
            i14 = i19;
            i15 = i20;
            i16 = i21;
            i17 = i22;
            str8 = str12;
            imageUrlUnfiltered2 = imageUrlUnfiltered3;
            str9 = str13;
            list2 = list3;
            str10 = str14;
            bankPullPaymentOptionSpiels2 = bankPullPaymentOptionSpiels3;
            maintenanceDate2 = maintenanceDate4;
            bankPullPaymentOption2 = bankPullPaymentOption;
        } else {
            linkedPaymentOption2 = linkedPaymentOption;
            str6 = str15;
            maintenanceDate2 = maintenanceDate4;
            bankPullPaymentOption2 = bankPullPaymentOption;
            bool2 = bool3;
            z5 = z8;
            i13 = i18;
            str7 = str11;
            i14 = i19;
            i15 = i20;
            i16 = i21;
            i17 = i22;
            str8 = str12;
            imageUrlUnfiltered2 = imageUrlUnfiltered3;
            str9 = str13;
            list2 = list3;
            str10 = str14;
            bankPullPaymentOptionSpiels2 = bankPullPaymentOptionSpiels3;
        }
        return bankPullPaymentOption2.copy(maintenanceDate2, z5, i13, str7, i14, i15, i16, i17, str8, imageUrlUnfiltered2, str9, list2, str10, bankPullPaymentOptionSpiels2, bool2, str6, linkedPaymentOption2);
    }

    public final MaintenanceDate component1() {
        return this.maintenanceDate;
    }

    public final ImageUrlUnfiltered component10() {
        return this.iconUrl;
    }

    public final String component11() {
        return this.name;
    }

    public final List<String> component12() {
        return this.paymentMethods;
    }

    public final String component13() {
        return this.id;
    }

    public final BankPullPaymentOptionSpiels component14() {
        return this.spiels;
    }

    public final Boolean component15() {
        return this.linkTokenToCustomer;
    }

    public final String component16() {
        return this.currency;
    }

    public final LinkedPaymentOption component17() {
        return this.paymentOption;
    }

    public final boolean component2() {
        return this.isEnabled;
    }

    public final int component3() {
        return this.priority;
    }

    public final String component4() {
        return this.steps;
    }

    public final int component5() {
        return this.minimumAmount;
    }

    public final int component6() {
        return this.maximumAmount;
    }

    public final int component7() {
        return this.maxTransactionCountPerDay;
    }

    public final int component8() {
        return this.maxLinkedAccounts;
    }

    public final String component9() {
        return this.supportedVersion;
    }

    public final BankPullPaymentOption copy(MaintenanceDate maintenanceDate, boolean z4, int i, String str, int i4, int i6, int i10, int i11, String str2, ImageUrlUnfiltered imageUrlUnfiltered, String name, List<String> list, String id, BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels, Boolean bool, String str3, LinkedPaymentOption linkedPaymentOption) {
        j.g(name, "name");
        j.g(id, "id");
        return new BankPullPaymentOption(maintenanceDate, z4, i, str, i4, i6, i10, i11, str2, imageUrlUnfiltered, name, list, id, bankPullPaymentOptionSpiels, bool, str3, linkedPaymentOption);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BankPullPaymentOption)) {
            return false;
        }
        BankPullPaymentOption bankPullPaymentOption = (BankPullPaymentOption) obj;
        return j.b(this.maintenanceDate, bankPullPaymentOption.maintenanceDate) && this.isEnabled == bankPullPaymentOption.isEnabled && this.priority == bankPullPaymentOption.priority && j.b(this.steps, bankPullPaymentOption.steps) && this.minimumAmount == bankPullPaymentOption.minimumAmount && this.maximumAmount == bankPullPaymentOption.maximumAmount && this.maxTransactionCountPerDay == bankPullPaymentOption.maxTransactionCountPerDay && this.maxLinkedAccounts == bankPullPaymentOption.maxLinkedAccounts && j.b(this.supportedVersion, bankPullPaymentOption.supportedVersion) && j.b(this.iconUrl, bankPullPaymentOption.iconUrl) && j.b(this.name, bankPullPaymentOption.name) && j.b(this.paymentMethods, bankPullPaymentOption.paymentMethods) && j.b(this.id, bankPullPaymentOption.id) && j.b(this.spiels, bankPullPaymentOption.spiels) && j.b(this.linkTokenToCustomer, bankPullPaymentOption.linkTokenToCustomer) && j.b(this.currency, bankPullPaymentOption.currency) && j.b(this.paymentOption, bankPullPaymentOption.paymentOption);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getFormattedMaxValue() {
        return a.j(this.currency, Global.BLANK, C.v(String.valueOf(this.maximumAmount)));
    }

    public final String getFormattedMinValue() {
        return a.j(this.currency, Global.BLANK, C.v(String.valueOf(this.minimumAmount)));
    }

    public final ImageUrlUnfiltered getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.id;
    }

    public final Boolean getLinkTokenToCustomer() {
        return this.linkTokenToCustomer;
    }

    public final MaintenanceDate getMaintenanceDate() {
        return this.maintenanceDate;
    }

    public final int getMaxLinkedAccounts() {
        return this.maxLinkedAccounts;
    }

    public final int getMaxTransactionCountPerDay() {
        return this.maxTransactionCountPerDay;
    }

    public final int getMaximumAmount() {
        return this.maximumAmount;
    }

    public final int getMinimumAmount() {
        return this.minimumAmount;
    }

    public final String getName() {
        return this.name;
    }

    public final List<String> getPaymentMethods() {
        return this.paymentMethods;
    }

    public final LinkedPaymentOption getPaymentOption() {
        return this.paymentOption;
    }

    public final int getPriority() {
        return this.priority;
    }

    public final String getSpielAmount() {
        BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels = this.spiels;
        if (bankPullPaymentOptionSpiels != null) {
            return bankPullPaymentOptionSpiels.getAmount();
        }
        return null;
    }

    public final BankPullPaymentOptionSpiels getSpiels() {
        return this.spiels;
    }

    public final String getSteps() {
        return this.steps;
    }

    public final String getSupportedVersion() {
        return this.supportedVersion;
    }

    public int hashCode() {
        MaintenanceDate maintenanceDate = this.maintenanceDate;
        int iHashCode = (((((maintenanceDate == null ? 0 : maintenanceDate.hashCode()) * 31) + (this.isEnabled ? 1231 : 1237)) * 31) + this.priority) * 31;
        String str = this.steps;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.minimumAmount) * 31) + this.maximumAmount) * 31) + this.maxTransactionCountPerDay) * 31) + this.maxLinkedAccounts) * 31;
        String str2 = this.supportedVersion;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageUrlUnfiltered imageUrlUnfiltered = this.iconUrl;
        int iC = AbstractC1414e.c((iHashCode3 + (imageUrlUnfiltered == null ? 0 : imageUrlUnfiltered.hashCode())) * 31, 31, this.name);
        List<String> list = this.paymentMethods;
        int iC2 = AbstractC1414e.c((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.id);
        BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels = this.spiels;
        int iHashCode4 = (iC2 + (bankPullPaymentOptionSpiels == null ? 0 : bankPullPaymentOptionSpiels.hashCode())) * 31;
        Boolean bool = this.linkTokenToCustomer;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.currency;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        LinkedPaymentOption linkedPaymentOption = this.paymentOption;
        return iHashCode6 + (linkedPaymentOption != null ? linkedPaymentOption.hashCode() : 0);
    }

    public final boolean isEnabled() {
        return this.isEnabled;
    }

    public final void setCurrency(String str) {
        this.currency = str;
    }

    public final void setPaymentOption(LinkedPaymentOption linkedPaymentOption) {
        this.paymentOption = linkedPaymentOption;
    }

    public String toString() {
        return "BankPullPaymentOption(maintenanceDate=" + this.maintenanceDate + ", isEnabled=" + this.isEnabled + ", priority=" + this.priority + ", steps=" + this.steps + ", minimumAmount=" + this.minimumAmount + ", maximumAmount=" + this.maximumAmount + ", maxTransactionCountPerDay=" + this.maxTransactionCountPerDay + ", maxLinkedAccounts=" + this.maxLinkedAccounts + ", supportedVersion=" + this.supportedVersion + ", iconUrl=" + this.iconUrl + ", name=" + this.name + ", paymentMethods=" + this.paymentMethods + ", id=" + this.id + ", spiels=" + this.spiels + ", linkTokenToCustomer=" + this.linkTokenToCustomer + ", currency=" + this.currency + ", paymentOption=" + this.paymentOption + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeParcelable(this.maintenanceDate, i);
        dest.writeInt(this.isEnabled ? 1 : 0);
        dest.writeInt(this.priority);
        dest.writeString(this.steps);
        dest.writeInt(this.minimumAmount);
        dest.writeInt(this.maximumAmount);
        dest.writeInt(this.maxTransactionCountPerDay);
        dest.writeInt(this.maxLinkedAccounts);
        dest.writeString(this.supportedVersion);
        dest.writeParcelable(this.iconUrl, i);
        dest.writeString(this.name);
        dest.writeStringList(this.paymentMethods);
        dest.writeString(this.id);
        BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels = this.spiels;
        if (bankPullPaymentOptionSpiels == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            bankPullPaymentOptionSpiels.writeToParcel(dest, i);
        }
        Boolean bool = this.linkTokenToCustomer;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC1213b.S(dest, 1, bool);
        }
        dest.writeString(this.currency);
        LinkedPaymentOption linkedPaymentOption = this.paymentOption;
        if (linkedPaymentOption == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            linkedPaymentOption.writeToParcel(dest, i);
        }
    }

    public /* synthetic */ BankPullPaymentOption(MaintenanceDate maintenanceDate, boolean z4, int i, String str, int i4, int i6, int i10, int i11, String str2, ImageUrlUnfiltered imageUrlUnfiltered, String str3, List list, String str4, BankPullPaymentOptionSpiels bankPullPaymentOptionSpiels, Boolean bool, String str5, LinkedPaymentOption linkedPaymentOption, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(maintenanceDate, z4, i, str, i4, i6, i10, i11, str2, imageUrlUnfiltered, str3, list, str4, bankPullPaymentOptionSpiels, bool, (i12 & 32768) != 0 ? null : str5, (i12 & 65536) != 0 ? null : linkedPaymentOption);
    }
}
