package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import cj.C1112C;
import com.paymaya.common.utility.AbstractC1213b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class OngoingRegistration implements Parcelable {
    public static final Parcelable.Creator<OngoingRegistration> CREATOR = new Creator();
    private List<? extends Consent> consentsList;
    private Identity registeringEmailIdentity;
    private Identity registeringLoginIdentity;
    private User registeringUser;

    public static final class Creator implements Parcelable.Creator<OngoingRegistration> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OngoingRegistration createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            User user = (User) parcel.readParcelable(OngoingRegistration.class.getClassLoader());
            Identity identity = (Identity) parcel.readParcelable(OngoingRegistration.class.getClassLoader());
            Identity identity2 = (Identity) parcel.readParcelable(OngoingRegistration.class.getClassLoader());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i4 = 0; i4 != i; i4++) {
                arrayList.add(parcel.readParcelable(OngoingRegistration.class.getClassLoader()));
            }
            return new OngoingRegistration(user, identity, identity2, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OngoingRegistration[] newArray(int i) {
            return new OngoingRegistration[i];
        }
    }

    public OngoingRegistration() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OngoingRegistration copy$default(OngoingRegistration ongoingRegistration, User user, Identity identity, Identity identity2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            user = ongoingRegistration.registeringUser;
        }
        if ((i & 2) != 0) {
            identity = ongoingRegistration.registeringLoginIdentity;
        }
        if ((i & 4) != 0) {
            identity2 = ongoingRegistration.registeringEmailIdentity;
        }
        if ((i & 8) != 0) {
            list = ongoingRegistration.consentsList;
        }
        return ongoingRegistration.copy(user, identity, identity2, list);
    }

    public final User component1() {
        return this.registeringUser;
    }

    public final Identity component2() {
        return this.registeringLoginIdentity;
    }

    public final Identity component3() {
        return this.registeringEmailIdentity;
    }

    public final List<Consent> component4() {
        return this.consentsList;
    }

    public final OngoingRegistration copy(User user, Identity identity, Identity identity2, List<? extends Consent> consentsList) {
        j.g(consentsList, "consentsList");
        return new OngoingRegistration(user, identity, identity2, consentsList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OngoingRegistration)) {
            return false;
        }
        OngoingRegistration ongoingRegistration = (OngoingRegistration) obj;
        return j.b(this.registeringUser, ongoingRegistration.registeringUser) && j.b(this.registeringLoginIdentity, ongoingRegistration.registeringLoginIdentity) && j.b(this.registeringEmailIdentity, ongoingRegistration.registeringEmailIdentity) && j.b(this.consentsList, ongoingRegistration.consentsList);
    }

    public final List<Consent> getConsentsList() {
        return this.consentsList;
    }

    public final Identity getRegisteringEmailIdentity() {
        return this.registeringEmailIdentity;
    }

    public final Identity getRegisteringLoginIdentity() {
        return this.registeringLoginIdentity;
    }

    public final User getRegisteringUser() {
        return this.registeringUser;
    }

    public int hashCode() {
        User user = this.registeringUser;
        int iHashCode = (user == null ? 0 : user.hashCode()) * 31;
        Identity identity = this.registeringLoginIdentity;
        int iHashCode2 = (iHashCode + (identity == null ? 0 : identity.hashCode())) * 31;
        Identity identity2 = this.registeringEmailIdentity;
        return this.consentsList.hashCode() + ((iHashCode2 + (identity2 != null ? identity2.hashCode() : 0)) * 31);
    }

    public final void setConsentsList(List<? extends Consent> list) {
        j.g(list, "<set-?>");
        this.consentsList = list;
    }

    public final void setRegisteringEmailIdentity(Identity identity) {
        this.registeringEmailIdentity = identity;
    }

    public final void setRegisteringLoginIdentity(Identity identity) {
        this.registeringLoginIdentity = identity;
    }

    public final void setRegisteringUser(User user) {
        this.registeringUser = user;
    }

    public String toString() {
        return "OngoingRegistration(registeringUser=" + this.registeringUser + ", registeringLoginIdentity=" + this.registeringLoginIdentity + ", registeringEmailIdentity=" + this.registeringEmailIdentity + ", consentsList=" + this.consentsList + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeParcelable(this.registeringUser, i);
        dest.writeParcelable(this.registeringLoginIdentity, i);
        dest.writeParcelable(this.registeringEmailIdentity, i);
        Iterator itQ = AbstractC1213b.Q(this.consentsList, dest);
        while (itQ.hasNext()) {
            dest.writeParcelable((Parcelable) itQ.next(), i);
        }
    }

    public OngoingRegistration(User user, Identity identity, Identity identity2, List<? extends Consent> consentsList) {
        j.g(consentsList, "consentsList");
        this.registeringUser = user;
        this.registeringLoginIdentity = identity;
        this.registeringEmailIdentity = identity2;
        this.consentsList = consentsList;
    }

    public OngoingRegistration(User user, Identity identity, Identity identity2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : user, (i & 2) != 0 ? null : identity, (i & 4) != 0 ? null : identity2, (i & 8) != 0 ? C1112C.f9377a : list);
    }
}
