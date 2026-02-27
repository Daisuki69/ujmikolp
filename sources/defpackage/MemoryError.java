package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class MemoryError extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "HeapObject#ADAPTER", oneofName = "location", schemaIndex = 2, tag = 3)
    private final HeapObject heap;

    @WireField(adapter = "MemoryError$Tool#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EnumC1491g0 tool;

    @WireField(adapter = "MemoryError$Type#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EnumC1580i0 type;
    public static final C1415e0 Companion = new C1415e0();
    public static final ProtoAdapter<MemoryError> ADAPTER = new C1324d0(FieldEncoding.LENGTH_DELIMITED, z.a(MemoryError.class), "type.googleapis.com/MemoryError", Syntax.PROTO_3, null, "tombstone.proto");

    public MemoryError() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MemoryError copy$default(MemoryError memoryError, EnumC1491g0 enumC1491g0, EnumC1580i0 enumC1580i0, HeapObject heapObject, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC1491g0 = memoryError.tool;
        }
        if ((i & 2) != 0) {
            enumC1580i0 = memoryError.type;
        }
        if ((i & 4) != 0) {
            heapObject = memoryError.heap;
        }
        if ((i & 8) != 0) {
            byteString = memoryError.unknownFields();
        }
        return memoryError.copy(enumC1491g0, enumC1580i0, heapObject, byteString);
    }

    public final MemoryError copy(EnumC1491g0 tool, EnumC1580i0 type, HeapObject heapObject, ByteString unknownFields) {
        j.g(tool, "tool");
        j.g(type, "type");
        j.g(unknownFields, "unknownFields");
        return new MemoryError(tool, type, heapObject, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MemoryError)) {
            return false;
        }
        MemoryError memoryError = (MemoryError) obj;
        return j.b(unknownFields(), memoryError.unknownFields()) && this.tool == memoryError.tool && this.type == memoryError.type && j.b(this.heap, memoryError.heap);
    }

    public final HeapObject getHeap() {
        return this.heap;
    }

    public final EnumC1491g0 getTool() {
        return this.tool;
    }

    public final EnumC1580i0 getType() {
        return this.type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (this.type.hashCode() + ((this.tool.hashCode() + (unknownFields().hashCode() * 37)) * 37)) * 37;
        HeapObject heapObject = this.heap;
        int iHashCode2 = iHashCode + (heapObject != null ? heapObject.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m25newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("tool=" + this.tool);
        arrayList.add("type=" + this.type);
        if (this.heap != null) {
            arrayList.add("heap=" + this.heap);
        }
        return C1110A.F(arrayList, ", ", "MemoryError{", "}", null, 56);
    }

    public /* synthetic */ MemoryError(EnumC1491g0 enumC1491g0, EnumC1580i0 enumC1580i0, HeapObject heapObject, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EnumC1491g0.f16767d : enumC1491g0, (i & 2) != 0 ? EnumC1580i0.f17062d : enumC1580i0, (i & 4) != 0 ? null : heapObject, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m25newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryError(EnumC1491g0 tool, EnumC1580i0 type, HeapObject heapObject, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(tool, "tool");
        j.g(type, "type");
        j.g(unknownFields, "unknownFields");
        this.tool = tool;
        this.type = type;
        this.heap = heapObject;
    }
}
