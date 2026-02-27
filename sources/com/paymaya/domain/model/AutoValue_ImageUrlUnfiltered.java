package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.ImageUrlUnfiltered;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_ImageUrlUnfiltered extends C$AutoValue_ImageUrlUnfiltered {
    public static final Parcelable.Creator<AutoValue_ImageUrlUnfiltered> CREATOR = new Parcelable.Creator<AutoValue_ImageUrlUnfiltered>() { // from class: com.paymaya.domain.model.AutoValue_ImageUrlUnfiltered.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageUrlUnfiltered createFromParcel(Parcel parcel) {
            return new AutoValue_ImageUrlUnfiltered((ImageUrl) parcel.readParcelable(ImageUrlUnfiltered.class.getClassLoader()), (ImageUrlIOS) parcel.readParcelable(ImageUrlUnfiltered.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_ImageUrlUnfiltered[] newArray(int i) {
            return new AutoValue_ImageUrlUnfiltered[i];
        }
    };

    public AutoValue_ImageUrlUnfiltered(@Nullable ImageUrl imageUrl, @Nullable ImageUrlIOS imageUrlIOS) {
        new C$$AutoValue_ImageUrlUnfiltered(imageUrl, imageUrlIOS) { // from class: com.paymaya.domain.model.$AutoValue_ImageUrlUnfiltered

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_ImageUrlUnfiltered$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y imageUrlIOS_adapter;
                private volatile y imageUrl_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(ImageUrlUnfiltered)";
                }

                @Override // com.google.gson.y
                public ImageUrlUnfiltered read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    ImageUrlUnfiltered.Builder builderSBuilder = ImageUrlUnfiltered.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() == 9) {
                            aVar.G();
                        } else {
                            strE.getClass();
                            if (strE.equals("android")) {
                                y yVarH = this.imageUrl_adapter;
                                if (yVarH == null) {
                                    yVarH = this.gson.h(ImageUrl.class);
                                    this.imageUrl_adapter = yVarH;
                                }
                                builderSBuilder.mAndroidImageUrl((ImageUrl) yVarH.read(aVar));
                            } else if (strE.equals(DeviceInformation.PLATFORM_IOS)) {
                                y yVarH2 = this.imageUrlIOS_adapter;
                                if (yVarH2 == null) {
                                    yVarH2 = this.gson.h(ImageUrlIOS.class);
                                    this.imageUrlIOS_adapter = yVarH2;
                                }
                                builderSBuilder.mIOSImageUrl((ImageUrlIOS) yVarH2.read(aVar));
                            } else {
                                aVar.Q();
                            }
                        }
                    }
                    aVar.k();
                    return builderSBuilder.build();
                }

                @Override // com.google.gson.y
                public void write(b bVar, ImageUrlUnfiltered imageUrlUnfiltered) throws IOException {
                    if (imageUrlUnfiltered == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("android");
                    if (imageUrlUnfiltered.mAndroidImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.imageUrl_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(ImageUrl.class);
                            this.imageUrl_adapter = yVarH;
                        }
                        yVarH.write(bVar, imageUrlUnfiltered.mAndroidImageUrl());
                    }
                    bVar.m(DeviceInformation.PLATFORM_IOS);
                    if (imageUrlUnfiltered.mIOSImageUrl() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.imageUrlIOS_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(ImageUrlIOS.class);
                            this.imageUrlIOS_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, imageUrlUnfiltered.mIOSImageUrl());
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
        parcel.writeParcelable(mAndroidImageUrl(), i);
        parcel.writeParcelable(mIOSImageUrl(), i);
    }
}
