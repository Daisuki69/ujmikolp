package defpackage;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class MemoryMapping extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "beginAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final long begin_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = Constants.BUILD_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String build_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "endAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final long end_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final boolean execute;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "loadBias", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final long load_bias;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mappingName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String mapping_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long offset;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final boolean read;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final boolean write;
    public static final C1688k0 Companion = new C1688k0();
    public static final ProtoAdapter<MemoryMapping> ADAPTER = new C1651j0(FieldEncoding.LENGTH_DELIMITED, z.a(MemoryMapping.class), "type.googleapis.com/MemoryMapping", Syntax.PROTO_3, null, "tombstone.proto");

    public MemoryMapping() {
        this(0L, 0L, 0L, false, false, false, null, null, 0L, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final MemoryMapping copy(long j, long j6, long j7, boolean z4, boolean z5, boolean z8, String mapping_name, String build_id, long j9, ByteString unknownFields) {
        j.g(mapping_name, "mapping_name");
        j.g(build_id, "build_id");
        j.g(unknownFields, "unknownFields");
        return new MemoryMapping(j, j6, j7, z4, z5, z8, mapping_name, build_id, j9, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryMapping)) {
            return false;
        }
        MemoryMapping memoryMapping = (MemoryMapping) obj;
        return j.b(unknownFields(), memoryMapping.unknownFields()) && this.begin_address == memoryMapping.begin_address && this.end_address == memoryMapping.end_address && this.offset == memoryMapping.offset && this.read == memoryMapping.read && this.write == memoryMapping.write && this.execute == memoryMapping.execute && j.b(this.mapping_name, memoryMapping.mapping_name) && j.b(this.build_id, memoryMapping.build_id) && this.load_bias == memoryMapping.load_bias;
    }

    public final long getBegin_address() {
        return this.begin_address;
    }

    public final String getBuild_id() {
        return this.build_id;
    }

    public final long getEnd_address() {
        return this.end_address;
    }

    public final boolean getExecute() {
        return this.execute;
    }

    public final long getLoad_bias() {
        return this.load_bias;
    }

    public final String getMapping_name() {
        return this.mapping_name;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final boolean getRead() {
        return this.read;
    }

    public final boolean getWrite() {
        return this.write;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        long j = this.begin_address;
        int i4 = (iHashCode + ((int) (j ^ (j >>> 32)))) * 37;
        long j6 = this.end_address;
        int i6 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 37;
        long j7 = this.offset;
        int iC = AbstractC1414e.c(AbstractC1414e.c((((((((i6 + ((int) (j7 ^ (j7 >>> 32)))) * 37) + (this.read ? 1231 : 1237)) * 37) + (this.write ? 1231 : 1237)) * 37) + (this.execute ? 1231 : 1237)) * 37, 37, this.mapping_name), 37, this.build_id);
        long j9 = this.load_bias;
        int i10 = iC + ((int) (j9 ^ (j9 >>> 32)));
        this.hashCode = i10;
        return i10;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m26newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("begin_address=" + this.begin_address);
        arrayList.add("end_address=" + this.end_address);
        arrayList.add("offset=" + this.offset);
        arrayList.add("read=" + this.read);
        arrayList.add("write=" + this.write);
        arrayList.add("execute=" + this.execute);
        arrayList.add("mapping_name=" + Internal.sanitize(this.mapping_name));
        arrayList.add("build_id=" + Internal.sanitize(this.build_id));
        arrayList.add("load_bias=" + this.load_bias);
        return C1110A.F(arrayList, ", ", "MemoryMapping{", "}", null, 56);
    }

    public /* synthetic */ MemoryMapping(long j, long j6, long j7, boolean z4, boolean z5, boolean z8, String str, String str2, long j9, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? 0L : j6, (i & 4) != 0 ? 0L : j7, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) == 0 ? z8 : false, (i & 64) != 0 ? "" : str, (i & 128) == 0 ? str2 : "", (i & 256) == 0 ? j9 : 0L, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m26newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryMapping(long j, long j6, long j7, boolean z4, boolean z5, boolean z8, String mapping_name, String build_id, long j9, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(mapping_name, "mapping_name");
        j.g(build_id, "build_id");
        j.g(unknownFields, "unknownFields");
        this.begin_address = j;
        this.end_address = j6;
        this.offset = j7;
        this.read = z4;
        this.write = z5;
        this.execute = z8;
        this.mapping_name = mapping_name;
        this.build_id = build_id;
        this.load_bias = j9;
    }
}
