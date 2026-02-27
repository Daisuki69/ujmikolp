package io.split.android.client.storage.db.rbs;

import androidx.annotation.NonNull;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;
import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: loaded from: classes4.dex */
@Entity(tableName = "rule_based_segments")
public class RuleBasedSegmentEntity {

    @ColumnInfo(name = TtmlNode.TAG_BODY)
    private String body;

    @NonNull
    @PrimaryKey
    @ColumnInfo(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    private String name;

    @ColumnInfo(name = "updated_at")
    private long updatedAt;

    public RuleBasedSegmentEntity() {
    }

    public String getBody() {
        return this.body;
    }

    public String getName() {
        return this.name;
    }

    public long getUpdatedAt() {
        return this.updatedAt;
    }

    public void setBody(String str) {
        this.body = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setUpdatedAt(long j) {
        this.updatedAt = j;
    }

    @Ignore
    public RuleBasedSegmentEntity(String str, String str2, long j) {
        this.name = str;
        this.body = str2;
        this.updatedAt = j;
    }
}
