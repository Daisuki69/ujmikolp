package io.split.android.client.dtos;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ChunkHeader {
    public static final Type CHUNK_HEADER_TYPE = new TypeToken<List<ChunkHeader>>() { // from class: io.split.android.client.dtos.ChunkHeader.1
    }.getType();
    private int attempt;
    private String id;
    private long timestamp;

    public ChunkHeader(String str, int i, long j) {
        this.id = str;
        this.attempt = i;
        this.timestamp = j;
    }

    public int getAttempt() {
        return this.attempt;
    }

    public String getId() {
        return this.id;
    }

    public int getTimestamp() {
        return this.attempt;
    }

    public ChunkHeader(String str, int i) {
        this(str, i, 0L);
    }
}
