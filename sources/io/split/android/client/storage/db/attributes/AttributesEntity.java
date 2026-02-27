package io.split.android.client.storage.db.attributes;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "attributes")
public class AttributesEntity {

    @ColumnInfo(name = "attributes")
    private String attributes;

    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = "user_key")
    private String userKey;

    public AttributesEntity() {
    }

    public String getAttributes() {
        return this.attributes;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    @NonNull
    public String getUserKey() {
        return this.userKey;
    }

    public void setAttributes(String str) {
        this.attributes = str;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    public void setUserKey(String str) {
        this.userKey = str;
    }

    @Ignore
    public AttributesEntity(String str, String str2, long j) {
        this.userKey = str;
        this.attributes = str2;
        this.updatedAt = j;
    }
}
