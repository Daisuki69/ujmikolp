package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import com.paymaya.common.utility.AbstractC1213b;
import defpackage.AbstractC1414e;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class AddMoneyViaCardSettings implements Parcelable {
    public static final Parcelable.Creator<AddMoneyViaCardSettings> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b("allowed_denominations")
    private final List<Integer> mAllowedDenominations;

    @InterfaceC1497a
    @InterfaceC1498b("currency")
    private final String mCurrency;

    @InterfaceC1497a
    @InterfaceC1498b("max_linked_cards")
    private final int mMaxLinkedCards;

    @InterfaceC1497a
    @InterfaceC1498b("note")
    private final String mNote;

    @InterfaceC1497a
    @InterfaceC1498b("supported_schemes")
    private final List<String> mSupportedSchemes;

    public static final class Creator implements Parcelable.Creator<AddMoneyViaCardSettings> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddMoneyViaCardSettings createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i4 = 0; i4 != i; i4++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new AddMoneyViaCardSettings(string, string2, arrayList, parcel.createStringArrayList(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AddMoneyViaCardSettings[] newArray(int i) {
            return new AddMoneyViaCardSettings[i];
        }
    }

    public AddMoneyViaCardSettings(String mNote, String mCurrency, List<Integer> mAllowedDenominations, List<String> mSupportedSchemes, int i) {
        j.g(mNote, "mNote");
        j.g(mCurrency, "mCurrency");
        j.g(mAllowedDenominations, "mAllowedDenominations");
        j.g(mSupportedSchemes, "mSupportedSchemes");
        this.mNote = mNote;
        this.mCurrency = mCurrency;
        this.mAllowedDenominations = mAllowedDenominations;
        this.mSupportedSchemes = mSupportedSchemes;
        this.mMaxLinkedCards = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AddMoneyViaCardSettings copy$default(AddMoneyViaCardSettings addMoneyViaCardSettings, String str, String str2, List list, List list2, int i, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = addMoneyViaCardSettings.mNote;
        }
        if ((i4 & 2) != 0) {
            str2 = addMoneyViaCardSettings.mCurrency;
        }
        if ((i4 & 4) != 0) {
            list = addMoneyViaCardSettings.mAllowedDenominations;
        }
        if ((i4 & 8) != 0) {
            list2 = addMoneyViaCardSettings.mSupportedSchemes;
        }
        if ((i4 & 16) != 0) {
            i = addMoneyViaCardSettings.mMaxLinkedCards;
        }
        int i6 = i;
        List list3 = list;
        return addMoneyViaCardSettings.copy(str, str2, list3, list2, i6);
    }

    public final String component1() {
        return this.mNote;
    }

    public final String component2() {
        return this.mCurrency;
    }

    public final List<Integer> component3() {
        return this.mAllowedDenominations;
    }

    public final List<String> component4() {
        return this.mSupportedSchemes;
    }

    public final int component5() {
        return this.mMaxLinkedCards;
    }

    public final AddMoneyViaCardSettings copy(String mNote, String mCurrency, List<Integer> mAllowedDenominations, List<String> mSupportedSchemes, int i) {
        j.g(mNote, "mNote");
        j.g(mCurrency, "mCurrency");
        j.g(mAllowedDenominations, "mAllowedDenominations");
        j.g(mSupportedSchemes, "mSupportedSchemes");
        return new AddMoneyViaCardSettings(mNote, mCurrency, mAllowedDenominations, mSupportedSchemes, i);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddMoneyViaCardSettings)) {
            return false;
        }
        AddMoneyViaCardSettings addMoneyViaCardSettings = (AddMoneyViaCardSettings) obj;
        return j.b(this.mNote, addMoneyViaCardSettings.mNote) && j.b(this.mCurrency, addMoneyViaCardSettings.mCurrency) && j.b(this.mAllowedDenominations, addMoneyViaCardSettings.mAllowedDenominations) && j.b(this.mSupportedSchemes, addMoneyViaCardSettings.mSupportedSchemes) && this.mMaxLinkedCards == addMoneyViaCardSettings.mMaxLinkedCards;
    }

    public final List<Integer> getMAllowedDenominations() {
        return this.mAllowedDenominations;
    }

    public final String getMCurrency() {
        return this.mCurrency;
    }

    public final int getMMaxLinkedCards() {
        return this.mMaxLinkedCards;
    }

    public final String getMNote() {
        return this.mNote;
    }

    public final List<String> getMSupportedSchemes() {
        return this.mSupportedSchemes;
    }

    public int hashCode() {
        return AbstractC1414e.d(this.mSupportedSchemes, AbstractC1414e.d(this.mAllowedDenominations, AbstractC1414e.c(this.mNote.hashCode() * 31, 31, this.mCurrency), 31), 31) + this.mMaxLinkedCards;
    }

    public String toString() {
        String str = this.mNote;
        String str2 = this.mCurrency;
        List<Integer> list = this.mAllowedDenominations;
        List<String> list2 = this.mSupportedSchemes;
        int i = this.mMaxLinkedCards;
        StringBuilder sbX = s.x("AddMoneyViaCardSettings(mNote=", str, ", mCurrency=", str2, ", mAllowedDenominations=");
        sbX.append(list);
        sbX.append(", mSupportedSchemes=");
        sbX.append(list2);
        sbX.append(", mMaxLinkedCards=");
        return s.o(sbX, ")", i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.mNote);
        dest.writeString(this.mCurrency);
        Iterator itQ = AbstractC1213b.Q(this.mAllowedDenominations, dest);
        while (itQ.hasNext()) {
            dest.writeInt(((Number) itQ.next()).intValue());
        }
        dest.writeStringList(this.mSupportedSchemes);
        dest.writeInt(this.mMaxLinkedCards);
    }
}
