package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.TransferAppLink;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_TransferAppLink extends C$AutoValue_TransferAppLink {
    public static final Parcelable.Creator<AutoValue_TransferAppLink> CREATOR = new Parcelable.Creator<AutoValue_TransferAppLink>() { // from class: com.paymaya.domain.model.AutoValue_TransferAppLink.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferAppLink createFromParcel(Parcel parcel) {
            return new AutoValue_TransferAppLink(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_TransferAppLink[] newArray(int i) {
            return new AutoValue_TransferAppLink[i];
        }
    };

    public AutoValue_TransferAppLink(final String str, final String str2, final String str3, final String str4, @Nullable final String str5) {
        new C$$AutoValue_TransferAppLink(str, str2, str3, str4, str5) { // from class: com.paymaya.domain.model.$AutoValue_TransferAppLink

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_TransferAppLink$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(TransferAppLink)";
                }

                @Override // com.google.gson.y
                public TransferAppLink read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    TransferAppLink.Builder builderSBuilder = TransferAppLink.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "a":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mAmount((String) yVarH.read(aVar));
                                    break;
                                case "c":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCurrency((String) yVarH2.read(aVar));
                                    break;
                                case "m":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mMessage((String) yVarH3.read(aVar));
                                    break;
                                case "r":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.mRecipient((String) yVarH4.read(aVar));
                                    break;
                                case "t":
                                    y yVarH5 = this.string_adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(String.class);
                                        this.string_adapter = yVarH5;
                                    }
                                    builderSBuilder.mAccountType((String) yVarH5.read(aVar));
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
                public void write(b bVar, TransferAppLink transferAppLink) throws IOException {
                    if (transferAppLink == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("r");
                    if (transferAppLink.mRecipient() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, transferAppLink.mRecipient());
                    }
                    bVar.m("t");
                    if (transferAppLink.mAccountType() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, transferAppLink.mAccountType());
                    }
                    bVar.m("c");
                    if (transferAppLink.mCurrency() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, transferAppLink.mCurrency());
                    }
                    bVar.m(CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY);
                    if (transferAppLink.mAmount() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, transferAppLink.mAmount());
                    }
                    bVar.m("m");
                    if (transferAppLink.mMessage() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, transferAppLink.mMessage());
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
        parcel.writeString(mRecipient());
        parcel.writeString(mAccountType());
        parcel.writeString(mCurrency());
        parcel.writeString(mAmount());
        if (mMessage() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mMessage());
        }
    }
}
