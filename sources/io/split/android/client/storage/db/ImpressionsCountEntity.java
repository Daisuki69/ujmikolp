package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import io.split.android.client.dtos.Identifiable;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "impressions_count")
public class ImpressionsCountEntity implements Identifiable {

    @NonNull
    private String body;

    @ColumnInfo(name = MPDbAdapter.KEY_CREATED_AT)
    private long createdAt;

    @PrimaryKey(autoGenerate = true)
    private long id;
    private int status;

    @NonNull
    public String getBody() {
        return this.body;
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    @Override // io.split.android.client.dtos.Identifiable
    public long getId() {
        return this.id;
    }

    public int getStatus() {
        return this.status;
    }

    public void setBody(@NonNull String str) {
        this.body = str;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
