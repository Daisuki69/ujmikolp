package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TransferRecipient;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TransferRecipient extends C$AutoValue_TransferRecipient {
    public static final Parcelable.Creator<AutoValue_TransferRecipient> CREATOR = new Parcelable.Creator<AutoValue_TransferRecipient>() { // from class: com.paymaya.domain.model.AutoValue_TransferRecipient.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferRecipient createFromParcel(Parcel parcel) {
            return new AutoValue_TransferRecipient(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferRecipient[] newArray(int i) {
            return new AutoValue_TransferRecipient[i];
        }
    };

    public AutoValue_TransferRecipient(final String str, final String str2, @Nullable final String str3, @Nullable final String str4) {
        new C$$AutoValue_TransferRecipient(str, str2, str3, str4) { // from class: com.paymaya.domain.model.$AutoValue_TransferRecipient

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TransferRecipient$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TransferRecipient)";
                }

                @Override // com.google.gson.y
                public TransferRecipient read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TransferRecipient.Builder builderSBuilder = TransferRecipient.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals(SessionDescription.ATTR_TYPE)) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mType((String) yVarH.read(aVar));
                            } else if (strE.equals("value")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.mValue((String) yVarH2.read(aVar));
                            } else if ("mUnformattedValue".equals(strE)) {
                                y yVarH3 = this.string_adapter;
                                if (yVarH3 == null) {
                                    yVarH3 = this.gson.h(String.class);
                                    this.string_adapter = yVarH3;
                                }
                                builderSBuilder.mUnformattedValue((String) yVarH3.read(aVar));
                            } else if ("mRecipientName".equals(strE)) {
                                y yVarH4 = this.string_adapter;
                                if (yVarH4 == null) {
                                    yVarH4 = this.gson.h(String.class);
                                    this.string_adapter = yVarH4;
                                }
                                builderSBuilder.mRecipientName((String) yVarH4.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, TransferRecipient transferRecipient) throws IOException {
                    if (transferRecipient == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (transferRecipient.mType() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, transferRecipient.mType());
                    }
                    bVar.m("value");
                    if (transferRecipient.mValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, transferRecipient.mValue());
                    }
                    bVar.m("mUnformattedValue");
                    if (transferRecipient.mUnformattedValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, transferRecipient.mUnformattedValue());
                    }
                    bVar.m("mRecipientName");
                    if (transferRecipient.mRecipientName() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, transferRecipient.mRecipientName());
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
        if (mUnformattedValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mUnformattedValue());
        }
        if (mRecipientName() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRecipientName());
        }
    }
}
