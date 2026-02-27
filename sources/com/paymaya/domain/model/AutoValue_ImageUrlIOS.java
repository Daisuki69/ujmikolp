package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ImageUrlIOS;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ImageUrlIOS extends C$AutoValue_ImageUrlIOS {
    public static final Parcelable.Creator<AutoValue_ImageUrlIOS> CREATOR = new Parcelable.Creator<AutoValue_ImageUrlIOS>() { // from class: com.paymaya.domain.model.AutoValue_ImageUrlIOS.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageUrlIOS createFromParcel(Parcel parcel) {
            return new AutoValue_ImageUrlIOS(parcel.readInt() == 0 ? parcel.readString() : null, parcel.readInt() == 0 ? parcel.readString() : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageUrlIOS[] newArray(int i) {
            return new AutoValue_ImageUrlIOS[i];
        }
    };

    public AutoValue_ImageUrlIOS(@Nullable final String str, @Nullable final String str2) {
        new C$$AutoValue_ImageUrlIOS(str, str2) { // from class: com.paymaya.domain.model.$AutoValue_ImageUrlIOS

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ImageUrlIOS$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ImageUrlIOS)";
                }

                @Override // com.google.gson.y
                public ImageUrlIOS read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ImageUrlIOS.Builder builderSBuilder = ImageUrlIOS.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("retina")) {
                                y yVarH = this.string_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(String.class);
                                    this.string_adapter = yVarH;
                                }
                                builderSBuilder.mRetina((String) yVarH.read(aVar));
                            } else if (strE.equals("3x")) {
                                y yVarH2 = this.string_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(String.class);
                                    this.string_adapter = yVarH2;
                                }
                                builderSBuilder.m3x((String) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, ImageUrlIOS imageUrlIOS) throws IOException {
                    if (imageUrlIOS == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("retina");
                    if (imageUrlIOS.mRetina() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, imageUrlIOS.mRetina());
                    }
                    bVar.m("3x");
                    if (imageUrlIOS.m3x() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, imageUrlIOS.m3x());
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
        if (mRetina() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mRetina());
        }
        if (m3x() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(m3x());
        }
    }
}
