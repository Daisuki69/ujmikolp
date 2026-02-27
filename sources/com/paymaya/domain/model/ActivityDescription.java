package com.paymaya.domain.model;

import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.j;
import com.google.gson.y;
import com.paymaya.domain.model.C$$AutoValue_ActivityDescription;
import com.paymaya.domain.model.C$AutoValue_ActivityDescription;
import g3.InterfaceC1498b;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivityDescription implements Parcelable {

    public static abstract class Builder {
        public abstract ActivityDescription build();

        public abstract Builder mAction(String str);

        public abstract Builder mTarget(String str);
    }

    public static Builder sBuilder() {
        return new C$$AutoValue_ActivityDescription.Builder();
    }

    public static y typeAdapter(j jVar) {
        return new C$AutoValue_ActivityDescription.GsonTypeAdapter(jVar);
    }

    @InterfaceC1498b("action")
    public abstract String mAction();

    @InterfaceC1498b(TypedValues.AttributesType.S_TARGET)
    public abstract String mTarget();
}
