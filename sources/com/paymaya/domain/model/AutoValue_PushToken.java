package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.PushToken;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_PushToken extends C$AutoValue_PushToken {
    public static final Parcelable.Creator<AutoValue_PushToken> CREATOR = new Parcelable.Creator<AutoValue_PushToken>() { // from class: com.paymaya.domain.model.AutoValue_PushToken.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PushToken createFromParcel(Parcel parcel) {
            return new AutoValue_PushToken(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_PushToken[] newArray(int i) {
            return new AutoValue_PushToken[i];
        }
    };

    public AutoValue_PushToken(final String str) {
        new C$$AutoValue_PushToken(str) { // from class: com.paymaya.domain.model.$AutoValue_PushToken

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_PushToken$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(PushToken)";
                }

                @Override // com.google.gson.y
                public PushToken read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    PushToken.Builder builderSBuilder = PushToken.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("push_token")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mToken((String) yVarH.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, PushToken pushToken) throws IOException {
                    if (pushToken == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("push_token");
                    if (pushToken.mToken() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, pushToken.mToken());
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
        parcel.writeString(mToken());
    }
}
