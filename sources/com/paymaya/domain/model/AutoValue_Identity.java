package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.Identity;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Identity extends C$AutoValue_Identity {
    public static final Parcelable.Creator<AutoValue_Identity> CREATOR = new Parcelable.Creator<AutoValue_Identity>() { // from class: com.paymaya.domain.model.AutoValue_Identity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Identity createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = Boolean.valueOf(parcel.readInt() == 1);
            } else {
                boolValueOf = null;
            }
            return new AutoValue_Identity(string, string2, boolValueOf, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Identity[] newArray(int i) {
            return new AutoValue_Identity[i];
        }
    };

    public AutoValue_Identity(final String str, final String str2, @Nullable final Boolean bool, @Nullable final String str3) {
        new C$$AutoValue_Identity(str, str2, bool, str3) { // from class: com.paymaya.domain.model.$AutoValue_Identity

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Identity$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Identity)";
                }

                @Override // com.google.gson.y
                public Identity read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Identity.Builder builderSBuilder = Identity.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "verified":
                                    y yVarH = this.boolean__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH;
                                    }
                                    builderSBuilder.mVerified((Boolean) yVarH.read(aVar));
                                    break;
                                case "registration_id":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mRegistrationId((String) yVarH2.read(aVar));
                                    break;
                                case "type":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mType((String) yVarH3.read(aVar));
                                    break;
                                case "value":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mValue((String) yVarH4.read(aVar));
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
                public void write(b bVar, Identity identity) throws IOException {
                    if (identity == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (identity.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, identity.mType());
                    }
                    bVar.m("value");
                    if (identity.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, identity.mValue());
                    }
                    bVar.m("verified");
                    if (identity.mVerified() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.boolean__adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(Boolean.class);
                            this.boolean__adapter = yVarH3;
                        }
                        yVarH3.write(bVar, identity.mVerified());
                    }
                    bVar.m("registration_id");
                    if (identity.mRegistrationId() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, identity.mRegistrationId());
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
        parcel.writeString(mType());
        parcel.writeString(mValue());
        if (mVerified() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeInt(mVerified().booleanValue() ? 1 : 0);
        }
        if (mRegistrationId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRegistrationId());
        }
    }
}
