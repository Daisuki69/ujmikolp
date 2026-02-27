package io.split.android.client.storage.db;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "general_info")
public class GeneralInfoEntity {
    public static final String CHANGE_NUMBER_INFO = "splitChangesChangeNumber";
    public static final String DATABASE_ENCRYPTION_MODE = "databaseEncryptionMode";
    public static final String FLAGS_SPEC = "flagsSpec";
    public static final String FLAG_SETS_MAP = "flagSetsMap";
    public static final String SPLITS_FILTER_QUERY_STRING = "splitsFilterQueryString";
    public static final String SPLITS_UPDATE_TIMESTAMP = "splitsUpdateTimestamp";
    public static final String TRAFFIC_TYPES_MAP = "trafficTypesMap";
    private long longValue;

    @NonNull
    @PrimaryKey
    private String name;
    private String stringValue;

    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    public GeneralInfoEntity() {
    }

    public long getLongValue() {
        return this.longValue;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public String getStringValue() {
        return this.stringValue;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setLongValue(long j) {
        this.longValue = j;
    }

    public void setName(@NonNull String str) {
        this.name = str;
    }

    public void setStringValue(String str) {
        this.stringValue = str;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    @Ignore
    public GeneralInfoEntity(@NonNull String str, String str2) {
        this.name = str;
        this.stringValue = str2;
    }

    @Ignore
    public GeneralInfoEntity(@NonNull String str, long j) {
        this.name = str;
        this.longValue = j;
    }
}
