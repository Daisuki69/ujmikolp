package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.rtsp.SessionDescription;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.UIComponent;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_UIComponent extends C$AutoValue_UIComponent {
    public static final Parcelable.Creator<AutoValue_UIComponent> CREATOR = new Parcelable.Creator<AutoValue_UIComponent>() { // from class: com.paymaya.domain.model.AutoValue_UIComponent.1
        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UIComponent createFromParcel(Parcel parcel) {
            boolean z4;
            int i;
            String str;
            String str2;
            boolean z5;
            String string = parcel.readString();
            ArrayList arrayList = parcel.readArrayList(UIComponent.class.getClassLoader());
            String string2 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string3 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string4 = parcel.readInt() == 0 ? parcel.readString() : null;
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            boolean z8 = false;
            boolean z9 = true;
            boolean z10 = parcel.readInt() == 1;
            if (parcel.readInt() == 1) {
                z4 = false;
                z8 = true;
            } else {
                z4 = false;
            }
            if (parcel.readInt() == 1) {
                i = 1;
            } else {
                i = 1;
                z9 = z4 ? 1 : 0;
            }
            if (parcel.readInt() == i) {
                String str3 = string3;
                str = string4;
                str2 = str3;
                z5 = i;
            } else {
                String str4 = string3;
                str = string4;
                str2 = str4;
                z5 = z4;
            }
            return new AutoValue_UIComponent(string, arrayList, string2, str2, str, string5, string6, z10, z8, z9, z5);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_UIComponent[] newArray(int i) {
            return new AutoValue_UIComponent[i];
        }
    };

    public AutoValue_UIComponent(final String str, @Nullable final List<UIValue> list, @Nullable final String str2, @Nullable final String str3, @Nullable final String str4, final String str5, final String str6, final boolean z4, final boolean z5, final boolean z8, final boolean z9) {
        new C$$AutoValue_UIComponent(str, list, str2, str3, str4, str5, str6, z4, z5, z8, z9) { // from class: com.paymaya.domain.model.$AutoValue_UIComponent

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_UIComponent$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private volatile y boolean__adapter;
                private final j gson;
                private volatile y list__uIValue_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(UIComponent)";
                }

                @Override // com.google.gson.y
                public UIComponent read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    UIComponent.Builder builderSBuilder = UIComponent.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "values":
                                    y yVarG = this.list__uIValue_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, UIValue.class));
                                        this.list__uIValue_adapter = yVarG;
                                    }
                                    builderSBuilder.values((List) yVarG.read(aVar));
                                    break;
                                case "defaultValue":
                                    y yVarH = this.string_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(String.class);
                                        this.string_adapter = yVarH;
                                    }
                                    builderSBuilder.defaultValue((String) yVarH.read(aVar));
                                    break;
                                case "required":
                                    y yVarH2 = this.boolean__adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH2;
                                    }
                                    builderSBuilder.required(((Boolean) yVarH2.read(aVar)).booleanValue());
                                    break;
                                case "day":
                                    y yVarH3 = this.boolean__adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH3;
                                    }
                                    builderSBuilder.day(((Boolean) yVarH3.read(aVar)).booleanValue());
                                    break;
                                case "type":
                                    y yVarH4 = this.string_adapter;
                                    if (yVarH4 == null) {
                                        yVarH4 = this.gson.h(String.class);
                                        this.string_adapter = yVarH4;
                                    }
                                    builderSBuilder.type((String) yVarH4.read(aVar));
                                    break;
                                case "year":
                                    y yVarH5 = this.boolean__adapter;
                                    if (yVarH5 == null) {
                                        yVarH5 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH5;
                                    }
                                    builderSBuilder.year(((Boolean) yVarH5.read(aVar)).booleanValue());
                                    break;
                                case "month":
                                    y yVarH6 = this.boolean__adapter;
                                    if (yVarH6 == null) {
                                        yVarH6 = this.gson.h(Boolean.class);
                                        this.boolean__adapter = yVarH6;
                                    }
                                    builderSBuilder.month(((Boolean) yVarH6.read(aVar)).booleanValue());
                                    break;
                                case "regex":
                                    y yVarH7 = this.string_adapter;
                                    if (yVarH7 == null) {
                                        yVarH7 = this.gson.h(String.class);
                                        this.string_adapter = yVarH7;
                                    }
                                    builderSBuilder.regex((String) yVarH7.read(aVar));
                                    break;
                                case "dateFormat":
                                    y yVarH8 = this.string_adapter;
                                    if (yVarH8 == null) {
                                        yVarH8 = this.gson.h(String.class);
                                        this.string_adapter = yVarH8;
                                    }
                                    builderSBuilder.dateFormat((String) yVarH8.read(aVar));
                                    break;
                                case "placeholder":
                                    y yVarH9 = this.string_adapter;
                                    if (yVarH9 == null) {
                                        yVarH9 = this.gson.h(String.class);
                                        this.string_adapter = yVarH9;
                                    }
                                    builderSBuilder.placeholder((String) yVarH9.read(aVar));
                                    break;
                                case "parameter":
                                    y yVarH10 = this.string_adapter;
                                    if (yVarH10 == null) {
                                        yVarH10 = this.gson.h(String.class);
                                        this.string_adapter = yVarH10;
                                    }
                                    builderSBuilder.parameter((String) yVarH10.read(aVar));
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
                public void write(b bVar, UIComponent uIComponent) throws IOException {
                    if (uIComponent == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(SessionDescription.ATTR_TYPE);
                    if (uIComponent.type() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, uIComponent.type());
                    }
                    bVar.m("values");
                    if (uIComponent.values() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__uIValue_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, UIValue.class));
                            this.list__uIValue_adapter = yVarG;
                        }
                        yVarG.write(bVar, uIComponent.values());
                    }
                    bVar.m("regex");
                    if (uIComponent.regex() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, uIComponent.regex());
                    }
                    bVar.m("dateFormat");
                    if (uIComponent.dateFormat() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, uIComponent.dateFormat());
                    }
                    bVar.m("defaultValue");
                    if (uIComponent.defaultValue() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.string_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(String.class);
                            this.string_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, uIComponent.defaultValue());
                    }
                    bVar.m(MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                    if (uIComponent.parameter() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.string_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(String.class);
                            this.string_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, uIComponent.parameter());
                    }
                    bVar.m("placeholder");
                    if (uIComponent.placeholder() == null) {
                        bVar.r();
                    } else {
                        y yVarH6 = this.string_adapter;
                        if (yVarH6 == null) {
                            yVarH6 = this.gson.h(String.class);
                            this.string_adapter = yVarH6;
                        }
                        yVarH6.write(bVar, uIComponent.placeholder());
                    }
                    bVar.m("required");
                    y yVarH7 = this.boolean__adapter;
                    if (yVarH7 == null) {
                        yVarH7 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH7;
                    }
                    yVarH7.write(bVar, Boolean.valueOf(uIComponent.required()));
                    bVar.m("day");
                    y yVarH8 = this.boolean__adapter;
                    if (yVarH8 == null) {
                        yVarH8 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH8;
                    }
                    yVarH8.write(bVar, Boolean.valueOf(uIComponent.day()));
                    bVar.m("month");
                    y yVarH9 = this.boolean__adapter;
                    if (yVarH9 == null) {
                        yVarH9 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH9;
                    }
                    yVarH9.write(bVar, Boolean.valueOf(uIComponent.month()));
                    bVar.m("year");
                    y yVarH10 = this.boolean__adapter;
                    if (yVarH10 == null) {
                        yVarH10 = this.gson.h(Boolean.class);
                        this.boolean__adapter = yVarH10;
                    }
                    yVarH10.write(bVar, Boolean.valueOf(uIComponent.year()));
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
        parcel.writeString(type());
        parcel.writeList(values());
        if (regex() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(regex());
        }
        if (dateFormat() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(dateFormat());
        }
        if (defaultValue() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(defaultValue());
        }
        parcel.writeString(parameter());
        parcel.writeString(placeholder());
        parcel.writeInt(required() ? 1 : 0);
        parcel.writeInt(day() ? 1 : 0);
        parcel.writeInt(month() ? 1 : 0);
        parcel.writeInt(year() ? 1 : 0);
    }
}
