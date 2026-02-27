package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.RedirectUrls;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_RedirectUrls extends C$AutoValue_RedirectUrls {
    public static final Parcelable.Creator<AutoValue_RedirectUrls> CREATOR = new Parcelable.Creator<AutoValue_RedirectUrls>() { // from class: com.paymaya.domain.model.AutoValue_RedirectUrls.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RedirectUrls createFromParcel(Parcel parcel) {
            return new AutoValue_RedirectUrls(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_RedirectUrls[] newArray(int i) {
            return new AutoValue_RedirectUrls[i];
        }
    };

    public AutoValue_RedirectUrls(final String str, final String str2, final String str3) {
        new C$$AutoValue_RedirectUrls(str, str2, str3) { // from class: com.paymaya.domain.model.$AutoValue_RedirectUrls

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_RedirectUrls$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(RedirectUrls)";
                }

                @Override // com.google.gson.y
                public RedirectUrls read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    RedirectUrls.Builder builderSBuilder = RedirectUrls.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "success":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.mSuccess((String) yVarH.read(aVar));
                                    break;
                                case "cancel":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mCancel((String) yVarH2.read(aVar));
                                    break;
                                case "failure":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mFailure((String) yVarH3.read(aVar));
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
                public void write(b bVar, RedirectUrls redirectUrls) throws IOException {
                    if (redirectUrls == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("success");
                    if (redirectUrls.mSuccess() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, redirectUrls.mSuccess());
                    }
                    bVar.m("failure");
                    if (redirectUrls.mFailure() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, redirectUrls.mFailure());
                    }
                    bVar.m("cancel");
                    if (redirectUrls.mCancel() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, redirectUrls.mCancel());
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
        parcel.writeString(mSuccess());
        parcel.writeString(mFailure());
        parcel.writeString(mCancel());
    }
}
