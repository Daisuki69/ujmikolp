package androidx.work.impl.model;

import androidx.annotation.RestrictTo;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = WorkSpec.class, onDelete = 5, onUpdate = 5, parentColumns = {TtmlNode.ATTR_ID})}, indices = {@Index({"work_spec_id"})}, primaryKeys = {AppMeasurementSdk.ConditionalUserProperty.NAME, "work_spec_id"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class WorkName {

    @ColumnInfo(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @ColumnInfo(name = "work_spec_id")
    private final String workSpecId;

    public WorkName(String name, String workSpecId) {
        j.g(name, "name");
        j.g(workSpecId, "workSpecId");
        this.name = name;
        this.workSpecId = workSpecId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getWorkSpecId() {
        return this.workSpecId;
    }
}
