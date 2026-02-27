package io.split.android.client.dtos;

import Hi.a;
import com.google.gson.annotations.JsonAdapter;
import g3.InterfaceC1498b;
import io.split.android.client.utils.deserializer.EventDeserializer;

/* JADX INFO: loaded from: classes4.dex */
@JsonAdapter(EventDeserializer.class)
public class Event extends SerializableEvent implements a, Identifiable {
    public static final String SIZE_IN_BYTES_FIELD = "sizeInBytes";

    @InterfaceC1498b(SIZE_IN_BYTES_FIELD)
    private int sizeInBytes = 0;
    public transient long storageId;

    @Override // io.split.android.client.dtos.Identifiable
    public long getId() {
        return this.storageId;
    }

    @Override // Hi.a
    public long getSizeInBytes() {
        return this.sizeInBytes;
    }

    public void setSizeInBytes(int i) {
        this.sizeInBytes = i;
    }
}
