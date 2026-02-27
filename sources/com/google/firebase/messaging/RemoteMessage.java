package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
@SafeParcelable.Class(creator = "RemoteMessageCreator")
@SafeParcelable.Reserved({1})
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RemoteMessage> CREATOR = new A1.a(22);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f9764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayMap f9765b;
    public i c;

    public RemoteMessage(Bundle bundle) {
        this.f9764a = bundle;
    }

    public final i c() {
        if (this.c == null) {
            Bundle bundle = this.f9764a;
            if (p.q(bundle)) {
                this.c = new i(new p(bundle));
            }
        }
        return this.c;
    }

    public final Map getData() {
        if (this.f9765b == null) {
            ArrayMap arrayMap = new ArrayMap();
            Bundle bundle = this.f9764a;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals(TypedValues.TransitionType.S_FROM) && !str.equals("message_type") && !str.equals("collapse_key")) {
                        arrayMap.put(str, str2);
                    }
                }
            }
            this.f9765b = arrayMap;
        }
        return this.f9765b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 2, this.f9764a, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
