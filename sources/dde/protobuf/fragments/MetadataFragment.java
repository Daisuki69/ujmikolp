package dde.protobuf.fragments;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.AbstractC1414e;
import dg.M;
import dg.N;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class MetadataFragment extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> allowedPermissions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 9, tag = 10)
    private final String appInstallId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 12, tag = 13)
    private final String applicationId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String customerId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 8, tag = 9)
    private final String dateTimeExtracted;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String deviceSessionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 7, tag = 8)
    private final String eventTrigger;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String extractionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 6, tag = 7)
    private final String platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String schemaVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String sdkVersion;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 10, tag = 11)
    private final String transactionId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 11, tag = 12)
    private final String triggeredBy;
    public static final N Companion = new N();
    public static final ProtoAdapter<MetadataFragment> ADAPTER = new M(FieldEncoding.LENGTH_DELIMITED, z.a(MetadataFragment.class), "type.googleapis.com/dde.protobuf.fragments.MetadataFragment", Syntax.PROTO_3, null, "dde-protobuf/fragments/MetadataFragment.proto");

    public MetadataFragment() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public final MetadataFragment copy(List<String> allowedPermissions, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ByteString unknownFields) {
        j.g(allowedPermissions, "allowedPermissions");
        j.g(unknownFields, "unknownFields");
        return new MetadataFragment(allowedPermissions, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MetadataFragment)) {
            return false;
        }
        MetadataFragment metadataFragment = (MetadataFragment) obj;
        return j.b(unknownFields(), metadataFragment.unknownFields()) && j.b(this.allowedPermissions, metadataFragment.allowedPermissions) && j.b(this.deviceSessionId, metadataFragment.deviceSessionId) && j.b(this.extractionId, metadataFragment.extractionId) && j.b(this.customerId, metadataFragment.customerId) && j.b(this.sdkVersion, metadataFragment.sdkVersion) && j.b(this.schemaVersion, metadataFragment.schemaVersion) && j.b(this.platform, metadataFragment.platform) && j.b(this.eventTrigger, metadataFragment.eventTrigger) && j.b(this.dateTimeExtracted, metadataFragment.dateTimeExtracted) && j.b(this.appInstallId, metadataFragment.appInstallId) && j.b(this.transactionId, metadataFragment.transactionId) && j.b(this.triggeredBy, metadataFragment.triggeredBy) && j.b(this.applicationId, metadataFragment.applicationId);
    }

    public final List<String> getAllowedPermissions() {
        return this.allowedPermissions;
    }

    public final String getAppInstallId() {
        return this.appInstallId;
    }

    public final String getApplicationId() {
        return this.applicationId;
    }

    public final String getCustomerId() {
        return this.customerId;
    }

    public final String getDateTimeExtracted() {
        return this.dateTimeExtracted;
    }

    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }

    public final String getEventTrigger() {
        return this.eventTrigger;
    }

    public final String getExtractionId() {
        return this.extractionId;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getSchemaVersion() {
        return this.schemaVersion;
    }

    public final String getSdkVersion() {
        return this.sdkVersion;
    }

    public final String getTransactionId() {
        return this.transactionId;
    }

    public final String getTriggeredBy() {
        return this.triggeredBy;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iD = AbstractC1414e.d(this.allowedPermissions, unknownFields().hashCode() * 37, 37);
        String str = this.deviceSessionId;
        int iHashCode = (iD + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.extractionId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.customerId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.sdkVersion;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.schemaVersion;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.platform;
        int iHashCode6 = (iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 37;
        String str7 = this.eventTrigger;
        int iHashCode7 = (iHashCode6 + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.dateTimeExtracted;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.appInstallId;
        int iHashCode9 = (iHashCode8 + (str9 != null ? str9.hashCode() : 0)) * 37;
        String str10 = this.transactionId;
        int iHashCode10 = (iHashCode9 + (str10 != null ? str10.hashCode() : 0)) * 37;
        String str11 = this.triggeredBy;
        int iHashCode11 = (iHashCode10 + (str11 != null ? str11.hashCode() : 0)) * 37;
        String str12 = this.applicationId;
        int iHashCode12 = iHashCode11 + (str12 != null ? str12.hashCode() : 0);
        this.hashCode = iHashCode12;
        return iHashCode12;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m245newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.allowedPermissions.isEmpty()) {
            arrayList.add("allowedPermissions=" + Internal.sanitize(this.allowedPermissions));
        }
        if (this.deviceSessionId != null) {
            AbstractC1414e.p(this.deviceSessionId, new StringBuilder("deviceSessionId="), arrayList);
        }
        if (this.extractionId != null) {
            AbstractC1414e.p(this.extractionId, new StringBuilder("extractionId="), arrayList);
        }
        if (this.customerId != null) {
            AbstractC1414e.p(this.customerId, new StringBuilder("customerId="), arrayList);
        }
        if (this.sdkVersion != null) {
            AbstractC1414e.p(this.sdkVersion, new StringBuilder("sdkVersion="), arrayList);
        }
        if (this.schemaVersion != null) {
            AbstractC1414e.p(this.schemaVersion, new StringBuilder("schemaVersion="), arrayList);
        }
        if (this.platform != null) {
            AbstractC1414e.p(this.platform, new StringBuilder("platform="), arrayList);
        }
        if (this.eventTrigger != null) {
            AbstractC1414e.p(this.eventTrigger, new StringBuilder("eventTrigger="), arrayList);
        }
        if (this.dateTimeExtracted != null) {
            AbstractC1414e.p(this.dateTimeExtracted, new StringBuilder("dateTimeExtracted="), arrayList);
        }
        if (this.appInstallId != null) {
            AbstractC1414e.p(this.appInstallId, new StringBuilder("appInstallId="), arrayList);
        }
        if (this.transactionId != null) {
            AbstractC1414e.p(this.transactionId, new StringBuilder("transactionId="), arrayList);
        }
        if (this.triggeredBy != null) {
            AbstractC1414e.p(this.triggeredBy, new StringBuilder("triggeredBy="), arrayList);
        }
        if (this.applicationId != null) {
            AbstractC1414e.p(this.applicationId, new StringBuilder("applicationId="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "MetadataFragment{", "}", null, 56);
    }

    public MetadataFragment(List list, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C1112C.f9377a : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? null : str11, (i & 4096) == 0 ? str12 : null, (i & 8192) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m245newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MetadataFragment(List<String> allowedPermissions, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(allowedPermissions, "allowedPermissions");
        j.g(unknownFields, "unknownFields");
        this.deviceSessionId = str;
        this.extractionId = str2;
        this.customerId = str3;
        this.sdkVersion = str4;
        this.schemaVersion = str5;
        this.platform = str6;
        this.eventTrigger = str7;
        this.dateTimeExtracted = str8;
        this.appInstallId = str9;
        this.transactionId = str10;
        this.triggeredBy = str11;
        this.applicationId = str12;
        this.allowedPermissions = Internal.immutableCopyOf("allowedPermissions", allowedPermissions);
    }
}
