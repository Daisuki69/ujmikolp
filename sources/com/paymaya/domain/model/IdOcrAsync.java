package com.paymaya.domain.model;

import We.s;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import g3.InterfaceC1497a;
import g3.InterfaceC1498b;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes4.dex */
public final class IdOcrAsync implements Parcelable {
    public static final Parcelable.Creator<IdOcrAsync> CREATOR = new Creator();

    @InterfaceC1497a
    @InterfaceC1498b(TtmlNode.ATTR_ID)
    private final String id;

    public static final class Creator implements Parcelable.Creator<IdOcrAsync> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdOcrAsync createFromParcel(Parcel parcel) {
            j.g(parcel, "parcel");
            return new IdOcrAsync(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IdOcrAsync[] newArray(int i) {
            return new IdOcrAsync[i];
        }
    }

    public IdOcrAsync(String id) {
        j.g(id, "id");
        this.id = id;
    }

    public static /* synthetic */ IdOcrAsync copy$default(IdOcrAsync idOcrAsync, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = idOcrAsync.id;
        }
        return idOcrAsync.copy(str);
    }

    public final String component1() {
        return this.id;
    }

    public final IdOcrAsync copy(String id) {
        j.g(id, "id");
        return new IdOcrAsync(id);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof IdOcrAsync) && j.b(this.id, ((IdOcrAsync) obj).id);
    }

    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public String toString() {
        return s.j("IdOcrAsync(id=", this.id, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        j.g(dest, "dest");
        dest.writeString(this.id);
    }
}
