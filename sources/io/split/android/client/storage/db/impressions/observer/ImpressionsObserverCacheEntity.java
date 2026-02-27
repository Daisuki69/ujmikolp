package io.split.android.client.storage.db.impressions.observer;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "impressions_observer_cache")
public class ImpressionsObserverCacheEntity {

    @ColumnInfo(name = MPDbAdapter.KEY_CREATED_AT)
    private long createdAt;

    @PrimaryKey
    @ColumnInfo(name = "hash")
    private long hash;

    @ColumnInfo(name = "time")
    private long time;

    public ImpressionsObserverCacheEntity() {
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public long getHash() {
        return this.hash;
    }

    public long getTime() {
        return this.time;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setHash(long j) {
        this.hash = j;
    }

    public void setTime(long j) {
        this.time = j;
    }

    @Ignore
    public ImpressionsObserverCacheEntity(long j, long j6, long j7) {
        this.hash = j;
        this.time = j6;
        this.createdAt = j7;
    }
}
