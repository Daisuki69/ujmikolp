package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.FundSource;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_FundSource extends C$AutoValue_FundSource {
    public static final Parcelable.Creator<AutoValue_FundSource> CREATOR = new Parcelable.Creator<AutoValue_FundSource>() { // from class: com.paymaya.domain.model.AutoValue_FundSource.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FundSource createFromParcel(Parcel parcel) {
            Boolean boolValueOf = null;
            String string = parcel.readInt() == 0 ? parcel.readString() : null;
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            }
            return new AutoValue_FundSource(string, string2, string3, string4, boolValueOf, (CardProfile) parcel.readParcelable(FundSource.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_FundSource[] newArray(int i) {
            return new AutoValue_FundSource[i];
        }
    };

    public AutoValue_FundSource(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable CardProfile cardProfile) {
        new C$$AutoValue_FundSource(str, str2, str3, str4, bool, cardProfile) { // from class: com.paymaya.domain.model.$AutoValue_FundSource

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_FundSource$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private volatile y cardProfile_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(FundSource)";
                }

                @Override // com.google.gson.y
                public FundSource read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    FundSource.Builder builderSBuilder = FundSource.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "card_profile":
                                    y yVarH = this.cardProfile_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(CardProfile.class);
                                        this.cardProfile_adapter = yVarH;
                                    }
                                    builderSBuilder.mCardProfile((CardProfile) yVarH.read(aVar));
                                    break;
                                case "transaction_enabled":
                                    y yVarH2 = this.boolean__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH2;
                                    }
                                    builderSBuilder.mTransactionEnabled((Boolean) yVarH2.read(aVar));
                                    break;
                                case "status":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mStatus((String) yVarH3.read(aVar));
                                    break;
                                case "id":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mId((String) yVarH4.read(aVar));
                                    break;
                                case "name":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mName((String) yVarH5.read(aVar));
                                    break;
                                case "type":
                                    y yVarH6 = this.string_adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(String.class);
                                        this.string_adapter = yVarH6;
                                    }
                                    builderSBuilder.mType((String) yVarH6.read(aVar));
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
                public void write(b bVar, FundSource fundSource) throws IOException {
                    if (fundSource == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (fundSource.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, fundSource.mName());
                    }
                    bVar.m("status");
                    if (fundSource.mStatus() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, fundSource.mStatus());
                    }
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (fundSource.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, fundSource.mType());
                    }
                    bVar.m(TtmlNode.ATTR_ID);
                    if (fundSource.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, fundSource.mId());
                    }
                    bVar.m("transaction_enabled");
                    if (fundSource.mTransactionEnabled() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.boolean__adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH5;
                        }
                        yVarH5.write(bVar, fundSource.mTransactionEnabled());
                    }
                    bVar.m("card_profile");
                    if (fundSource.mCardProfile() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.cardProfile_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(CardProfile.class);
                            this.cardProfile_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, fundSource.mCardProfile());
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
        if (mName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mName());
        }
        if (mStatus() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mStatus());
        }
        if (mType() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mType());
        }
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        if (mTransactionEnabled() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mTransactionEnabled().booleanValue() ? 1 : 0);
        }
        parcel.writeParcelable(mCardProfile(), i);
    }
}
