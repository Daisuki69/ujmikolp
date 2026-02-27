package defpackage;

import cj.C1110A;
import cj.C1112C;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
public final class CollectorDetails extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "allowedPermissions", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> allowed_permissions;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appInstallId", schemaIndex = 10, tag = 11)
    private final String app_install_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", schemaIndex = 9, tag = 10)
    private final String application_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 5, tag = 6)
    private final String configurations;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "customerId", schemaIndex = 0, tag = 1)
    private final String customer_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateTimeCollected", schemaIndex = 4, tag = 5)
    private final String date_time_collected;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deviceSessionId", schemaIndex = 8, tag = 9)
    private final String device_session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventTrigger", schemaIndex = 3, tag = 4)
    private final String event_trigger;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "transactionId", schemaIndex = 1, tag = 2)
    private final String transaction_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "triggeredBy", schemaIndex = 2, tag = 3)
    private final String triggered_by;
    public static final C2289u Companion = new C2289u();
    public static final ProtoAdapter<CollectorDetails> ADAPTER = new C2263t(FieldEncoding.LENGTH_DELIMITED, z.a(CollectorDetails.class), "type.googleapis.com/CollectorDetails", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public CollectorDetails() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CollectorDetails copy$default(CollectorDetails collectorDetails, String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collectorDetails.customer_id;
        }
        if ((i & 2) != 0) {
            str2 = collectorDetails.transaction_id;
        }
        if ((i & 4) != 0) {
            str3 = collectorDetails.triggered_by;
        }
        if ((i & 8) != 0) {
            str4 = collectorDetails.event_trigger;
        }
        if ((i & 16) != 0) {
            str5 = collectorDetails.date_time_collected;
        }
        if ((i & 32) != 0) {
            str6 = collectorDetails.configurations;
        }
        if ((i & 64) != 0) {
            list = collectorDetails.allowed_permissions;
        }
        if ((i & 128) != 0) {
            str7 = collectorDetails.platform;
        }
        if ((i & 256) != 0) {
            str8 = collectorDetails.device_session_id;
        }
        if ((i & 512) != 0) {
            str9 = collectorDetails.application_id;
        }
        if ((i & 1024) != 0) {
            str10 = collectorDetails.app_install_id;
        }
        if ((i & 2048) != 0) {
            byteString = collectorDetails.unknownFields();
        }
        String str11 = str10;
        ByteString byteString2 = byteString;
        String str12 = str8;
        String str13 = str9;
        List list2 = list;
        String str14 = str7;
        String str15 = str5;
        String str16 = str6;
        return collectorDetails.copy(str, str2, str3, str4, str15, str16, list2, str14, str12, str13, str11, byteString2);
    }

    public final CollectorDetails copy(String str, String str2, String str3, String str4, String str5, String str6, List<String> allowed_permissions, String platform, String str7, String str8, String str9, ByteString unknownFields) {
        j.g(allowed_permissions, "allowed_permissions");
        j.g(platform, "platform");
        j.g(unknownFields, "unknownFields");
        return new CollectorDetails(str, str2, str3, str4, str5, str6, allowed_permissions, platform, str7, str8, str9, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CollectorDetails)) {
            return false;
        }
        CollectorDetails collectorDetails = (CollectorDetails) obj;
        return j.b(unknownFields(), collectorDetails.unknownFields()) && j.b(this.customer_id, collectorDetails.customer_id) && j.b(this.transaction_id, collectorDetails.transaction_id) && j.b(this.triggered_by, collectorDetails.triggered_by) && j.b(this.event_trigger, collectorDetails.event_trigger) && j.b(this.date_time_collected, collectorDetails.date_time_collected) && j.b(this.configurations, collectorDetails.configurations) && j.b(this.allowed_permissions, collectorDetails.allowed_permissions) && j.b(this.platform, collectorDetails.platform) && j.b(this.device_session_id, collectorDetails.device_session_id) && j.b(this.application_id, collectorDetails.application_id) && j.b(this.app_install_id, collectorDetails.app_install_id);
    }

    public final List<String> getAllowed_permissions() {
        return this.allowed_permissions;
    }

    public final String getApp_install_id() {
        return this.app_install_id;
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    public final String getConfigurations() {
        return this.configurations;
    }

    public final String getCustomer_id() {
        return this.customer_id;
    }

    public final String getDate_time_collected() {
        return this.date_time_collected;
    }

    public final String getDevice_session_id() {
        return this.device_session_id;
    }

    public final String getEvent_trigger() {
        return this.event_trigger;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getTransaction_id() {
        return this.transaction_id;
    }

    public final String getTriggered_by() {
        return this.triggered_by;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.customer_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.transaction_id;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.triggered_by;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.event_trigger;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.date_time_collected;
        int iHashCode6 = (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37;
        String str6 = this.configurations;
        int iC = AbstractC1414e.c(AbstractC1414e.d(this.allowed_permissions, (iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 37, 37), 37, this.platform);
        String str7 = this.device_session_id;
        int iHashCode7 = (iC + (str7 != null ? str7.hashCode() : 0)) * 37;
        String str8 = this.application_id;
        int iHashCode8 = (iHashCode7 + (str8 != null ? str8.hashCode() : 0)) * 37;
        String str9 = this.app_install_id;
        int iHashCode9 = iHashCode8 + (str9 != null ? str9.hashCode() : 0);
        this.hashCode = iHashCode9;
        return iHashCode9;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.customer_id != null) {
            AbstractC1414e.p(this.customer_id, new StringBuilder("customer_id="), arrayList);
        }
        if (this.transaction_id != null) {
            AbstractC1414e.p(this.transaction_id, new StringBuilder("transaction_id="), arrayList);
        }
        if (this.triggered_by != null) {
            AbstractC1414e.p(this.triggered_by, new StringBuilder("triggered_by="), arrayList);
        }
        if (this.event_trigger != null) {
            AbstractC1414e.p(this.event_trigger, new StringBuilder("event_trigger="), arrayList);
        }
        if (this.date_time_collected != null) {
            AbstractC1414e.p(this.date_time_collected, new StringBuilder("date_time_collected="), arrayList);
        }
        if (this.configurations != null) {
            AbstractC1414e.p(this.configurations, new StringBuilder("configurations="), arrayList);
        }
        if (!this.allowed_permissions.isEmpty()) {
            arrayList.add("allowed_permissions=" + Internal.sanitize(this.allowed_permissions));
        }
        AbstractC1414e.p(this.platform, new StringBuilder("platform="), arrayList);
        if (this.device_session_id != null) {
            AbstractC1414e.p(this.device_session_id, new StringBuilder("device_session_id="), arrayList);
        }
        if (this.application_id != null) {
            AbstractC1414e.p(this.application_id, new StringBuilder("application_id="), arrayList);
        }
        if (this.app_install_id != null) {
            AbstractC1414e.p(this.app_install_id, new StringBuilder("app_install_id="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "CollectorDetails{", "}", null, 56);
    }

    public CollectorDetails(String str, String str2, String str3, String str4, String str5, String str6, List list, String str7, String str8, String str9, String str10, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? C1112C.f9377a : list, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, (i & 1024) != 0 ? null : str10, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectorDetails(String str, String str2, String str3, String str4, String str5, String str6, List<String> allowed_permissions, String platform, String str7, String str8, String str9, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(allowed_permissions, "allowed_permissions");
        j.g(platform, "platform");
        j.g(unknownFields, "unknownFields");
        this.customer_id = str;
        this.transaction_id = str2;
        this.triggered_by = str3;
        this.event_trigger = str4;
        this.date_time_collected = str5;
        this.configurations = str6;
        this.platform = platform;
        this.device_session_id = str7;
        this.application_id = str8;
        this.app_install_id = str9;
        this.allowed_permissions = Internal.immutableCopyOf("allowed_permissions", allowed_permissions);
    }
}
