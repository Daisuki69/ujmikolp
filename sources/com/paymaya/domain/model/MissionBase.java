package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MissionBase;
import com.paymaya.domain.model.C$AutoValue_MissionBase;
import g3.InterfaceC1498b;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionBase implements Parcelable {

    public static abstract class Builder {
        public abstract MissionBase build();

        public abstract Builder mMissions(List<Mission> list);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MissionBase.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MissionBase.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("missions")
    public abstract List<Mission> mMissions();
}
