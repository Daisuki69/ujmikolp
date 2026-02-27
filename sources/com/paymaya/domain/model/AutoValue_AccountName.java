package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.AccountName;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_AccountName extends C$AutoValue_AccountName {
    public static final Parcelable.Creator<AutoValue_AccountName> CREATOR = new Parcelable.Creator<AutoValue_AccountName>() { // from class: com.paymaya.domain.model.AutoValue_AccountName.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AccountName createFromParcel(Parcel parcel) {
            return new AutoValue_AccountName(parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_AccountName[] newArray(int i) {
            return new AutoValue_AccountName[i];
        }
    };

    public AutoValue_AccountName(final String str, @Nullable final String str2, final String str3) {
        new C$$AutoValue_AccountName(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_AccountName

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_AccountName$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(AccountName)";
                }

                @Override // com.google.gson.y
                public AccountName read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    AccountName.Builder builderSBuilder = AccountName.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "middle":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mMiddleName((String) yVarH.read(aVar));
                                    break;
                                case "last":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mLastName((String) yVarH2.read(aVar));
                                    break;
                                case "firstName":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mFirstName((String) yVarH3.read(aVar));
                                    break;
                                default:
                                    aVar.Q();
                                    break;
                            }
                        } else {
                            aVar.G();
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, AccountName accountName) throws IOException {
                    if (accountName == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("firstName");
                    if (accountName.mFirstName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, accountName.mFirstName());
                    }
                    bVar.m("middle");
                    if (accountName.mMiddleName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, accountName.mMiddleName());
                    }
                    bVar.m("last");
                    if (accountName.mLastName() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, accountName.mLastName());
                    }
                    bVar.k();
                }
            }
        };
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(mFirstName());
        if (mMiddleName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMiddleName());
        }
        parcel.writeString(mLastName());
    }
}
