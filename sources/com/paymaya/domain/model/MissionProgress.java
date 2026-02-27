package com.paymaya.domain.model;

import android.os.Parcelable;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_MissionProgress;
import com.paymaya.domain.model.C$AutoValue_MissionProgress;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MissionProgress implements Parcelable {

    public static abstract class Builder {
        public abstract MissionProgress build();

        public abstract Builder mActionsCompleted(int i);

        public abstract Builder mActionsOngoing(int i);

        public abstract Builder mActionsTotal(int i);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_MissionProgress.Builder().mActionsCompleted(0).mActionsTotal(0).mActionsOngoing(0);
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_MissionProgress.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("actions_completed")
    public abstract int mActionsCompleted();

    @InterfaceC1498b("actions_ongoing")
    public abstract int mActionsOngoing();

    @InterfaceC1498b("actions_total")
    public abstract int mActionsTotal();
}
