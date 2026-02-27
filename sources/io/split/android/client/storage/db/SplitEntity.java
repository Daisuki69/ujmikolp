package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "splits")
public class SplitEntity {

    @NonNull
    private String body;

    @NonNull
    @PrimaryKey
    private String name;

    @Ignore
    private long rowId;

    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    @NonNull
    public String getBody() {
        return this.body;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public long getRowId() {
        return this.rowId;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setBody(@NonNull String str) {
        this.body = str;
    }

    public void setName(@NonNull String str) {
        this.name = str;
    }

    public void setRowId(long j) {
        this.rowId = j;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }
}
