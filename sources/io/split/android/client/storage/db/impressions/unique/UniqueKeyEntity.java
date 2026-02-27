package io.split.android.client.storage.db.impressions.unique;

import androidx.annotation.NonNull;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import io.split.android.client.dtos.Identifiable;
import mx_com.mixpanel.android.mpmetrics.MPDbAdapter;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "unique_keys")
public class UniqueKeyEntity implements Identifiable {

    @ColumnInfo(name = MPDbAdapter.KEY_CREATED_AT)
    private long createdAt;

    @ColumnInfo(name = "feature_list")
    private String featureList;

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = TtmlNode.ATTR_ID)
    private long id;

    @ColumnInfo(name = "status")
    private int status;

    @NonNull
    @ColumnInfo(name = "user_key")
    private String userKey;

    public UniqueKeyEntity() {
    }

    public long getCreatedAt() {
        return this.createdAt;
    }

    public String getFeatureList() {
        return this.featureList;
    }

    @Override // io.split.android.client.dtos.Identifiable
    public long getId() {
        return this.id;
    }

    public int getStatus() {
        return this.status;
    }

    @NonNull
    public String getUserKey() {
        return this.userKey;
    }

    public void setCreatedAt(long j) {
        this.createdAt = j;
    }

    public void setFeatureList(String str) {
        this.featureList = str;
    }

    public void setId(long j) {
        this.id = j;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUserKey(@NonNull String str) {
        this.userKey = str;
    }

    @Ignore
    public UniqueKeyEntity(@NonNull String str, String str2, long j, int i) {
        this.userKey = str;
        this.featureList = str2;
        this.createdAt = j;
        this.status = i;
    }
}
