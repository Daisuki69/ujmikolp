package com.paymaya.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import com.google.gson.y;
import com.paymaya.domain.model.Route;
import j3.a;
import j3.b;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class AutoValue_Route extends C$AutoValue_Route {
    public static final Parcelable.Creator<AutoValue_Route> CREATOR = new Parcelable.Creator<AutoValue_Route>() { // from class: com.paymaya.domain.model.AutoValue_Route.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Route createFromParcel(Parcel parcel) {
            String string;
            String string2;
            if (parcel.readInt() == 0) {
                string = parcel.readString();
                string2 = null;
            } else {
                string = null;
                string2 = null;
            }
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                string2 = parcel.readString();
            }
            return new AutoValue_Route(string, string3, string2, (Stop) parcel.readParcelable(Route.class.getClassLoader()), (Stop) parcel.readParcelable(Route.class.getClassLoader()), parcel.readArrayList(Route.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AutoValue_Route[] newArray(int i) {
            return new AutoValue_Route[i];
        }
    };

    public AutoValue_Route(@Nullable String str, String str2, @Nullable String str3, Stop stop, Stop stop2, @Nullable List<Stop> list) {
        new C$$AutoValue_Route(str, str2, str3, stop, stop2, list) { // from class: com.paymaya.domain.model.$AutoValue_Route

            /* JADX INFO: renamed from: com.paymaya.domain.model.$AutoValue_Route$GsonTypeAdapter */
            public static final class GsonTypeAdapter extends y {
                private final j gson;
                private volatile y list__stop_adapter;
                private volatile y stop_adapter;
                private volatile y string_adapter;

                public GsonTypeAdapter(j jVar) {
                    this.gson = jVar;
                }

                public String toString() {
                    return "TypeAdapter(Route)";
                }

                @Override // com.google.gson.y
                public Route read(a aVar) throws IOException {
                    if (aVar.peek() == 9) {
                        aVar.G();
                        return null;
                    }
                    aVar.c();
                    Route.Builder builderSBuilder = Route.sBuilder();
                    while (aVar.t()) {
                        String strE = aVar.E();
                        if (aVar.peek() != 9) {
                            strE.getClass();
                            switch (strE) {
                                case "destination":
                                    y yVarH = this.stop_adapter;
                                    if (yVarH == null) {
                                        yVarH = this.gson.h(Stop.class);
                                        this.stop_adapter = yVarH;
                                    }
                                    builderSBuilder.mDestination((Stop) yVarH.read(aVar));
                                    break;
                                case "origin":
                                    y yVarH2 = this.stop_adapter;
                                    if (yVarH2 == null) {
                                        yVarH2 = this.gson.h(Stop.class);
                                        this.stop_adapter = yVarH2;
                                    }
                                    builderSBuilder.mOrigin((Stop) yVarH2.read(aVar));
                                    break;
                                case "operator":
                                    y yVarH3 = this.string_adapter;
                                    if (yVarH3 == null) {
                                        yVarH3 = this.gson.h(String.class);
                                        this.string_adapter = yVarH3;
                                    }
                                    builderSBuilder.mOperator((String) yVarH3.read(aVar));
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
                                case "stops":
                                    y yVarG = this.list__stop_adapter;
                                    if (yVarG == null) {
                                        yVarG = this.gson.g(TypeToken.getParameterized(List.class, Stop.class));
                                        this.list__stop_adapter = yVarG;
                                    }
                                    builderSBuilder.mStops((List) yVarG.read(aVar));
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
                public void write(b bVar, Route route) throws IOException {
                    if (route == null) {
                        bVar.r();
                        return;
                    }
                    bVar.f();
                    bVar.m(TtmlNode.ATTR_ID);
                    if (route.mId() == null) {
                        bVar.r();
                    } else {
                        y yVarH = this.string_adapter;
                        if (yVarH == null) {
                            yVarH = this.gson.h(String.class);
                            this.string_adapter = yVarH;
                        }
                        yVarH.write(bVar, route.mId());
                    }
                    bVar.m(AppMeasurementSdk.ConditionalUserProperty.NAME);
                    if (route.mName() == null) {
                        bVar.r();
                    } else {
                        y yVarH2 = this.string_adapter;
                        if (yVarH2 == null) {
                            yVarH2 = this.gson.h(String.class);
                            this.string_adapter = yVarH2;
                        }
                        yVarH2.write(bVar, route.mName());
                    }
                    bVar.m("operator");
                    if (route.mOperator() == null) {
                        bVar.r();
                    } else {
                        y yVarH3 = this.string_adapter;
                        if (yVarH3 == null) {
                            yVarH3 = this.gson.h(String.class);
                            this.string_adapter = yVarH3;
                        }
                        yVarH3.write(bVar, route.mOperator());
                    }
                    bVar.m("origin");
                    if (route.mOrigin() == null) {
                        bVar.r();
                    } else {
                        y yVarH4 = this.stop_adapter;
                        if (yVarH4 == null) {
                            yVarH4 = this.gson.h(Stop.class);
                            this.stop_adapter = yVarH4;
                        }
                        yVarH4.write(bVar, route.mOrigin());
                    }
                    bVar.m("destination");
                    if (route.mDestination() == null) {
                        bVar.r();
                    } else {
                        y yVarH5 = this.stop_adapter;
                        if (yVarH5 == null) {
                            yVarH5 = this.gson.h(Stop.class);
                            this.stop_adapter = yVarH5;
                        }
                        yVarH5.write(bVar, route.mDestination());
                    }
                    bVar.m("stops");
                    if (route.mStops() == null) {
                        bVar.r();
                    } else {
                        y yVarG = this.list__stop_adapter;
                        if (yVarG == null) {
                            yVarG = this.gson.g(TypeToken.getParameterized(List.class, Stop.class));
                            this.list__stop_adapter = yVarG;
                        }
                        yVarG.write(bVar, route.mStops());
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
        if (mId() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mId());
        }
        parcel.writeString(mName());
        if (mOperator() == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(mOperator());
        }
        parcel.writeParcelable(mOrigin(), i);
        parcel.writeParcelable(mDestination(), i);
        parcel.writeList(mStops());
    }
}
