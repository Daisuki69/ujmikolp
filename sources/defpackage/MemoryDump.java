package defpackage;

import androidx.media3.extractor.text.ttml.TtmlNode;
import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class MemoryDump extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ArmMTEMetadata#ADAPTER", jsonName = "armMteMetadata", oneofName = TtmlNode.TAG_METADATA, schemaIndex = 4, tag = 6)
    private final ArmMTEMetadata arm_mte_metadata;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#UINT64", jsonName = "beginAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final long begin_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mappingName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String mapping_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BYTES", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final ByteString memory;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "registerName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String register_name;
    public static final C1052c0 Companion = new C1052c0();
    public static final ProtoAdapter<MemoryDump> ADAPTER = new C0844b0(FieldEncoding.LENGTH_DELIMITED, z.a(MemoryDump.class), "type.googleapis.com/MemoryDump", Syntax.PROTO_3, null, "tombstone.proto");

    public MemoryDump() {
        this(null, null, 0L, null, null, null, 63, null);
    }

    public static /* synthetic */ MemoryDump copy$default(MemoryDump memoryDump, String str, String str2, long j, ByteString byteString, ArmMTEMetadata armMTEMetadata, ByteString byteString2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = memoryDump.register_name;
        }
        if ((i & 2) != 0) {
            str2 = memoryDump.mapping_name;
        }
        if ((i & 4) != 0) {
            j = memoryDump.begin_address;
        }
        if ((i & 8) != 0) {
            byteString = memoryDump.memory;
        }
        if ((i & 16) != 0) {
            armMTEMetadata = memoryDump.arm_mte_metadata;
        }
        if ((i & 32) != 0) {
            byteString2 = memoryDump.unknownFields();
        }
        ByteString byteString3 = byteString2;
        ByteString byteString4 = byteString;
        long j6 = j;
        return memoryDump.copy(str, str2, j6, byteString4, armMTEMetadata, byteString3);
    }

    public final MemoryDump copy(String register_name, String mapping_name, long j, ByteString memory, ArmMTEMetadata armMTEMetadata, ByteString unknownFields) {
        j.g(register_name, "register_name");
        j.g(mapping_name, "mapping_name");
        j.g(memory, "memory");
        j.g(unknownFields, "unknownFields");
        return new MemoryDump(register_name, mapping_name, j, memory, armMTEMetadata, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryDump)) {
            return false;
        }
        MemoryDump memoryDump = (MemoryDump) obj;
        return j.b(unknownFields(), memoryDump.unknownFields()) && j.b(this.register_name, memoryDump.register_name) && j.b(this.mapping_name, memoryDump.mapping_name) && this.begin_address == memoryDump.begin_address && j.b(this.memory, memoryDump.memory) && j.b(this.arm_mte_metadata, memoryDump.arm_mte_metadata);
    }

    public final ArmMTEMetadata getArm_mte_metadata() {
        return this.arm_mte_metadata;
    }

    public final long getBegin_address() {
        return this.begin_address;
    }

    public final String getMapping_name() {
        return this.mapping_name;
    }

    public final ByteString getMemory() {
        return this.memory;
    }

    public final String getRegister_name() {
        return this.register_name;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iC = AbstractC1414e.c(AbstractC1414e.c(unknownFields().hashCode() * 37, 37, this.register_name), 37, this.mapping_name);
        long j = this.begin_address;
        int iHashCode = (this.memory.hashCode() + ((iC + ((int) (j ^ (j >>> 32)))) * 37)) * 37;
        ArmMTEMetadata armMTEMetadata = this.arm_mte_metadata;
        int iHashCode2 = iHashCode + (armMTEMetadata != null ? armMTEMetadata.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("register_name=" + Internal.sanitize(this.register_name));
        arrayList.add("mapping_name=" + Internal.sanitize(this.mapping_name));
        arrayList.add("begin_address=" + this.begin_address);
        arrayList.add("memory=" + this.memory);
        if (this.arm_mte_metadata != null) {
            arrayList.add("arm_mte_metadata=" + this.arm_mte_metadata);
        }
        return C1110A.F(arrayList, ", ", "MemoryDump{", "}", null, 56);
    }

    public /* synthetic */ MemoryDump(String str, String str2, long j, ByteString byteString, ArmMTEMetadata armMTEMetadata, ByteString byteString2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? 0L : j, (i & 8) != 0 ? ByteString.EMPTY : byteString, (i & 16) != 0 ? null : armMTEMetadata, (i & 32) != 0 ? ByteString.EMPTY : byteString2);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryDump(String register_name, String mapping_name, long j, ByteString memory, ArmMTEMetadata armMTEMetadata, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(register_name, "register_name");
        j.g(mapping_name, "mapping_name");
        j.g(memory, "memory");
        j.g(unknownFields, "unknownFields");
        this.register_name = register_name;
        this.mapping_name = mapping_name;
        this.begin_address = j;
        this.memory = memory;
        this.arm_mte_metadata = armMTEMetadata;
    }
}
