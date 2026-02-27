package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SegmentEntity {

    @NonNull
    @ColumnInfo(name = "segment_list")
    private String segmentList;

    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "user_key")
    private String userKey;

    public interface Creator<T extends SegmentEntity> {
        T createEntity(String str, String str2, long j);
    }

    public static Creator<?> creator() {
        return null;
    }

    @NonNull
    public String getSegmentList() {
        return this.segmentList;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    @NonNull
    public String getUserKey() {
        return this.userKey;
    }

    public void setSegmentList(@NonNull String str) {
        this.segmentList = str;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public void setUserKey(String str) {
        this.userKey = str;
    }
}
