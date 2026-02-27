package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TransferEntity;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TransferEntity extends C$AutoValue_TransferEntity {
    public static final Parcelable.Creator<AutoValue_TransferEntity> CREATOR = new Parcelable.Creator<AutoValue_TransferEntity>() { // from class: com.paymaya.domain.model.AutoValue_TransferEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferEntity createFromParcel(Parcel parcel) {
            return new AutoValue_TransferEntity(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferEntity[] newArray(int i) {
            return new AutoValue_TransferEntity[i];
        }
    };

    public AutoValue_TransferEntity(final String str, final String str2, final String str3) {
        new C$$AutoValue_TransferEntity(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_TransferEntity

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TransferEntity$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TransferEntity)";
                }

                @Override // com.google.gson.y
                public TransferEntity read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TransferEntity.Builder builderSBuilder = TransferEntity.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "msisdn":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mMobileNumber((String) yVarH.read(aVar));
                                    break;
                                case "first_name":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mFirstName((String) yVarH2.read(aVar));
                                    break;
                                case "last_name":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mLastName((String) yVarH3.read(aVar));
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
                public void write(b bVar, TransferEntity transferEntity) throws IOException {
                    if (transferEntity == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("first_name");
                    if (transferEntity.mFirstName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, transferEntity.mFirstName());
                    }
                    bVar.m("last_name");
                    if (transferEntity.mLastName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, transferEntity.mLastName());
                    }
                    bVar.m("msisdn");
                    if (transferEntity.mMobileNumber() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, transferEntity.mMobileNumber());
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
        parcel.writeString(mLastName());
        parcel.writeString(mMobileNumber());
    }
}
