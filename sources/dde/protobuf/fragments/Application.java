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
import dg.C1377a;
import dg.C1378b;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Application extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<String> features;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String firstInstalled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 5, tag = 6)
    private final Boolean isSystem;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 5)
    private final String lastUpdated;
    public static final C1378b Companion = new C1378b();
    public static final ProtoAdapter<Application> ADAPTER = new C1377a(FieldEncoding.LENGTH_DELIMITED, z.a(Application.class), "type.googleapis.com/dde.protobuf.fragments.Application", Syntax.PROTO_3, null, "dde-protobuf/fragments/Application.proto");

    public Application() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Application copy$default(Application application, String str, String str2, List list, String str3, String str4, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = application.id;
        }
        if ((i & 2) != 0) {
            str2 = application.category;
        }
        if ((i & 4) != 0) {
            list = application.features;
        }
        if ((i & 8) != 0) {
            str3 = application.firstInstalled;
        }
        if ((i & 16) != 0) {
            str4 = application.lastUpdated;
        }
        if ((i & 32) != 0) {
            bool = application.isSystem;
        }
        if ((i & 64) != 0) {
            byteString = application.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        String str5 = str4;
        List list2 = list;
        return application.copy(str, str2, list2, str3, str5, bool2, byteString2);
    }

    public final Application copy(String str, String str2, List<String> features, String str3, String str4, Boolean bool, ByteString unknownFields) {
        j.g(features, "features");
        j.g(unknownFields, "unknownFields");
        return new Application(str, str2, features, str3, str4, bool, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Application)) {
            return false;
        }
        Application application = (Application) obj;
        return j.b(unknownFields(), application.unknownFields()) && j.b(this.id, application.id) && j.b(this.category, application.category) && j.b(this.features, application.features) && j.b(this.firstInstalled, application.firstInstalled) && j.b(this.lastUpdated, application.lastUpdated) && j.b(this.isSystem, application.isSystem);
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<String> getFeatures() {
        return this.features;
    }

    public final String getFirstInstalled() {
        return this.firstInstalled;
    }

    public final String getId() {
        return this.id;
    }

    public final String getLastUpdated() {
        return this.lastUpdated;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.id;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.category;
        int iD = AbstractC1414e.d(this.features, (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37, 37);
        String str3 = this.firstInstalled;
        int iHashCode3 = (iD + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.lastUpdated;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 37;
        Boolean bool = this.isSystem;
        int iHashCode5 = iHashCode4 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    public final Boolean isSystem() {
        return this.isSystem;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m226newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.id != null) {
            AbstractC1414e.p(this.id, new StringBuilder("id="), arrayList);
        }
        if (this.category != null) {
            AbstractC1414e.p(this.category, new StringBuilder("category="), arrayList);
        }
        if (!this.features.isEmpty()) {
            arrayList.add("features=" + Internal.sanitize(this.features));
        }
        if (this.firstInstalled != null) {
            AbstractC1414e.p(this.firstInstalled, new StringBuilder("firstInstalled="), arrayList);
        }
        if (this.lastUpdated != null) {
            AbstractC1414e.p(this.lastUpdated, new StringBuilder("lastUpdated="), arrayList);
        }
        if (this.isSystem != null) {
            AbstractC1414e.q(new StringBuilder("isSystem="), this.isSystem, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Application{", "}", null, 56);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Application(String str, String str2, List<String> features, String str3, String str4, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(features, "features");
        j.g(unknownFields, "unknownFields");
        this.id = str;
        this.category = str2;
        this.firstInstalled = str3;
        this.lastUpdated = str4;
        this.isSystem = bool;
        this.features = Internal.immutableCopyOf("features", features);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m226newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public Application(String str, String str2, List list, String str3, String str4, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? C1112C.f9377a : list, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }
}
