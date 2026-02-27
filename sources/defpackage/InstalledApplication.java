package defpackage;

import androidx.core.app.FrameMetricsAggregator;
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

/* JADX INFO: loaded from: classes5.dex */
public final class InstalledApplication extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", schemaIndex = 0, tag = 1)
    private final String application_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 2, tag = 3)
    private final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 6, tag = 7)
    private final List<String> features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "firstInstalled", schemaIndex = 3, tag = 4)
    private final String first_installed;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 7, tag = 8)
    private final Boolean isSystem;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "lastUpdated", schemaIndex = 4, tag = 5)
    private final String last_updated;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 5, tag = 6)
    private final List<String> permissions;
    public static final O Companion = new O();
    public static final ProtoAdapter<InstalledApplication> ADAPTER = new N(FieldEncoding.LENGTH_DELIMITED, z.a(InstalledApplication.class), "type.googleapis.com/InstalledApplication", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public InstalledApplication() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InstalledApplication copy$default(InstalledApplication installedApplication, String str, String str2, String str3, String str4, String str5, List list, List list2, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = installedApplication.application_id;
        }
        if ((i & 2) != 0) {
            str2 = installedApplication.description;
        }
        if ((i & 4) != 0) {
            str3 = installedApplication.category;
        }
        if ((i & 8) != 0) {
            str4 = installedApplication.first_installed;
        }
        if ((i & 16) != 0) {
            str5 = installedApplication.last_updated;
        }
        if ((i & 32) != 0) {
            list = installedApplication.permissions;
        }
        if ((i & 64) != 0) {
            list2 = installedApplication.features;
        }
        if ((i & 128) != 0) {
            bool = installedApplication.isSystem;
        }
        if ((i & 256) != 0) {
            byteString = installedApplication.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        List list3 = list;
        List list4 = list2;
        String str6 = str5;
        String str7 = str3;
        return installedApplication.copy(str, str2, str7, str4, str6, list3, list4, bool2, byteString2);
    }

    public final InstalledApplication copy(String str, String str2, String str3, String str4, String str5, List<String> permissions, List<String> features, Boolean bool, ByteString unknownFields) {
        j.g(permissions, "permissions");
        j.g(features, "features");
        j.g(unknownFields, "unknownFields");
        return new InstalledApplication(str, str2, str3, str4, str5, permissions, features, bool, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof InstalledApplication)) {
            return false;
        }
        InstalledApplication installedApplication = (InstalledApplication) obj;
        return j.b(unknownFields(), installedApplication.unknownFields()) && j.b(this.application_id, installedApplication.application_id) && j.b(this.description, installedApplication.description) && j.b(this.category, installedApplication.category) && j.b(this.first_installed, installedApplication.first_installed) && j.b(this.last_updated, installedApplication.last_updated) && j.b(this.permissions, installedApplication.permissions) && j.b(this.features, installedApplication.features) && j.b(this.isSystem, installedApplication.isSystem);
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final String getFirst_installed() {
        return this.first_installed;
    }

    public final String getLast_updated() {
        return this.last_updated;
    }

    public final List<String> getPermissions() {
        return this.permissions;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.application_id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.description;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.category;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.first_installed;
        int iHashCode5 = (iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 37;
        String str5 = this.last_updated;
        int iD = AbstractC1414e.d(this.features, AbstractC1414e.d(this.permissions, (iHashCode5 + (str5 != null ? str5.hashCode() : 0)) * 37, 37), 37);
        Boolean bool = this.isSystem;
        int iHashCode6 = iD + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode6;
        return iHashCode6;
    }

    public final Boolean isSystem() {
        return this.isSystem;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m18newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.application_id != null) {
            AbstractC1414e.p(this.application_id, new StringBuilder("application_id="), arrayList);
        }
        if (this.description != null) {
            AbstractC1414e.p(this.description, new StringBuilder("description="), arrayList);
        }
        if (this.category != null) {
            AbstractC1414e.p(this.category, new StringBuilder("category="), arrayList);
        }
        if (this.first_installed != null) {
            AbstractC1414e.p(this.first_installed, new StringBuilder("first_installed="), arrayList);
        }
        if (this.last_updated != null) {
            AbstractC1414e.p(this.last_updated, new StringBuilder("last_updated="), arrayList);
        }
        if (!this.permissions.isEmpty()) {
            arrayList.add("permissions=" + Internal.sanitize(this.permissions));
        }
        if (!this.features.isEmpty()) {
            arrayList.add("features=" + Internal.sanitize(this.features));
        }
        if (this.isSystem != null) {
            AbstractC1414e.q(new StringBuilder("isSystem="), this.isSystem, arrayList);
        }
        return C1110A.F(arrayList, ", ", "InstalledApplication{", "}", null, 56);
    }

    public InstalledApplication(String str, String str2, String str3, String str4, String str5, List list, List list2, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? C1112C.f9377a : list, (i & 64) != 0 ? C1112C.f9377a : list2, (i & 128) != 0 ? null : bool, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m18newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledApplication(String str, String str2, String str3, String str4, String str5, List<String> permissions, List<String> features, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(permissions, "permissions");
        j.g(features, "features");
        j.g(unknownFields, "unknownFields");
        this.application_id = str;
        this.description = str2;
        this.category = str3;
        this.first_installed = str4;
        this.last_updated = str5;
        this.isSystem = bool;
        this.permissions = Internal.immutableCopyOf("permissions", permissions);
        this.features = Internal.immutableCopyOf("features", features);
    }
}
