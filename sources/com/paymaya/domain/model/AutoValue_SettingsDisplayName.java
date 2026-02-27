package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.SettingsDisplayName;
import io.flutter.plugins.firebase.crashlytics.Constants;
import j3.a;
import j3.b;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_SettingsDisplayName extends C$AutoValue_SettingsDisplayName {
    public static final Parcelable.Creator<AutoValue_SettingsDisplayName> CREATOR = new Parcelable.Creator<AutoValue_SettingsDisplayName>() { // from class: com.paymaya.domain.model.AutoValue_SettingsDisplayName.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SettingsDisplayName createFromParcel(Parcel parcel) {
            return new AutoValue_SettingsDisplayName((DisplayName) parcel.readParcelable(SettingsDisplayName.class.getClassLoader()), parcel.readInt() == 1, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_SettingsDisplayName[] newArray(int i) {
            return new AutoValue_SettingsDisplayName[i];
        }
    };

    public AutoValue_SettingsDisplayName(final DisplayName displayName, final boolean z4, final String str) {
        new C$$AutoValue_SettingsDisplayName(displayName, z4, str) { // from class: com.paymaya.domain.model.$AutoValue_SettingsDisplayName

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_SettingsDisplayName$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private volatile y displayName_adapter;
                private final j gson;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(SettingsDisplayName)";
                }

                @Override // com.google.gson.y
                public SettingsDisplayName read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    SettingsDisplayName.Builder builderSBuilder = SettingsDisplayName.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "enabled":
                                    y yVarH = this.boolean__adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH;
                                    }
                                    builderSBuilder.mIsEnabled(((Boolean) yVarH.read(aVar)).booleanValue());
                                    break;
                                case "updated_date":
                                    y yVarH2 = this.string_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(String.class);
                                        this.string_adapter = yVarH2;
                                    }
                                    builderSBuilder.mUpdatedDate((String) yVarH2.read(aVar));
                                    break;
                                case "display_name":
                                    y yVarH3 = this.displayName_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(DisplayName.class);
                                        this.displayName_adapter = yVarH3;
                                    }
                                    builderSBuilder.mDisplayName((DisplayName) yVarH3.read(aVar));
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
                public void write(b bVar, SettingsDisplayName settingsDisplayName) throws IOException {
                    if (settingsDisplayName == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m("display_name");
                    if (settingsDisplayName.mDisplayName() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.displayName_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(DisplayName.class);
                            this.displayName_adapter = yVarH;
                        }
                        yVarH.write(bVar, settingsDisplayName.mDisplayName());
                    }
                    bVar.m(Constants.ENABLED);
                    y yVarH2 = this.boolean__adapter;
                    if (yVarH2 == null) {
                        yVarH2 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH2;
                    }
                    yVarH2.write(bVar, Boolean.valueOf(settingsDisplayName.mIsEnabled()));
                    bVar.m("updated_date");
                    if (settingsDisplayName.mUpdatedDate() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, settingsDisplayName.mUpdatedDate());
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
        parcel.writeParcelable(mDisplayName(), i);
        parcel.writeInt(mIsEnabled() ? 1 : 0);
        parcel.writeString(mUpdatedDate());
    }
}
